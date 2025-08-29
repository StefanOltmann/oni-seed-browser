package service

import io.ktor.client.HttpClient
import io.ktor.client.request.head
import js.date.Date
import js.typedarrays.toByteArray
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import model.ClusterType
import model.search2.SearchIndex
import web.cache.add
import web.cache.caches
import web.cache.match
import web.cache.open
import web.http.bytes

private val httpClient = HttpClient()

private const val CACHE_NAME = "search-index-cache-v1"

@OptIn(ExperimentalSerializationApi::class)
actual suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex {

    val cache = caches.open(CACHE_NAME)

    val searchIndexUrl = SEARCH_INDEX_URL_MAIN + "/" + clusterType.prefix

    val responseHead = httpClient.head(searchIndexUrl)

    val lastModifiedMillis =
        responseHead.headers.lastModifiedMillis() ?: error("[SEARCH] No last modified date found for $searchIndexUrl")

    println("[SEARCH] Index for ${clusterType.prefix} was last modified on $lastModifiedMillis")

    val cacheResponse = cache.match(searchIndexUrl)

    if (cacheResponse != null) {

        /*
         * Check if the cache is still valid
         */

        val cachedLastModifiedMillis = cacheResponse.headers.get("Last-Modified")?.let { Date.parse(it).toLong() }
            ?: error("[SEARCH] No last modified date found for $searchIndexUrl")

        if (cachedLastModifiedMillis == lastModifiedMillis) {

            println("[SEARCH] Cache HIT: $searchIndexUrl")

            val bytes = cacheResponse.bytes().toByteArray()

            return ProtoBuf.decodeFromByteArray(bytes)
        }
    }

    println("[SEARCH] Cache MISS: $searchIndexUrl")

    /*
     * Download the file
     */
    cache.add(searchIndexUrl)

    val response = cache.match(searchIndexUrl) ?: error("[SEARCH] No cache entry found at $searchIndexUrl")

    val bytes = response.bytes().toByteArray()

    return ProtoBuf.decodeFromByteArray(bytes)
}
