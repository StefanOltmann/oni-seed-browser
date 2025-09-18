package service

import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.search.SearchIndex
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsBytes
import js.date.Date
import js.typedarrays.toByteArray
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import web.cache.add
import web.cache.caches
import web.cache.match
import web.cache.open
import web.http.bytes

private val httpClient = HttpClient()

private const val CACHE_NAME = "search-index-cache-v1"

@OptIn(ExperimentalSerializationApi::class, ExperimentalTime::class)
actual suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex {

    val cache = caches.open(CACHE_NAME)

    val searchIndexUrl = SEARCH_INDEX_URL + "/" + clusterType.prefix

    val lastModifiedMillis = getLastModifiedMillisServer(httpClient, searchIndexUrl)

    if (lastModifiedMillis != null)
        println("[SEARCH] Index for ${clusterType.prefix} was last modified on $lastModifiedMillis")

    val cacheResponse = cache.match(searchIndexUrl)

    if (lastModifiedMillis == null) {

        if (cacheResponse != null) {

            println("[SEARCH] Use cached file for ${clusterType.prefix} as we are offline.")

            val bytes = cacheResponse.bytes().toByteArray()

            return ProtoBuf.decodeFromByteArray(bytes)
        }

        println("[SEARCH] No cache file for ${clusterType.prefix} and we are offline.")

        /*
         * Return an empty search index as we are offline.
         */
        return SearchIndex(clusterType, Clock.System.now().toEpochMilliseconds())
    }

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
     * Download the file via caches of fall back to Ktor should that not work.
     * We had reports of Cache API failing here.
     */

    val bytes = try {

        cache.add(searchIndexUrl)

        val response = cache.match(searchIndexUrl)
            ?: error("[SEARCH] No cache entry found at $searchIndexUrl")

        println("[CACHE] Downloaded search index via Cache API.")

        response.bytes().toByteArray()

    } catch (ex: Throwable) {

        /*
         * Need to catch for Throwable, because cache.add() throws Errors.
         */

        ex.printStackTrace()

        println("[CACHE] Error downloading search index via cache.add(): ${ex.message}.")

        /*
         * Falling back to Ktor
         */

        val response = httpClient.get(searchIndexUrl)

        if (response.status.value != 200)
            error("[SEARCH] Error downloading search index: ${response.status.value}.")

        println("[CACHE] Downloaded search index via Ktor as fallback.")

        response.bodyAsBytes()
    }

    return ProtoBuf.decodeFromByteArray(bytes)
}

actual suspend fun downloadSearchIndex(clusterType: ClusterType) {
    val cache = caches.open(CACHE_NAME)
    val searchIndexUrl = SEARCH_INDEX_URL + "/" + clusterType.prefix

    println("[SEARCH] User requested download of search index for ${clusterType.prefix}")

    try {
        // Force download by clearing any existing cache entry
        // Note: There's no standard way to delete specific cache entries in the Cache API
        // So we just re-download and overwrite

        cache.add(searchIndexUrl)

        val response = cache.match(searchIndexUrl)
            ?: error("[SEARCH] No cache entry found at $searchIndexUrl")

        val bytes = response.bytes().toByteArray()
        println("[SEARCH] Downloaded ${bytes.size} bytes from $searchIndexUrl for user request")

    } catch (ex: Throwable) {
        ex.printStackTrace()

        println("[CACHE] Error downloading search index via cache.add(): ${ex.message}.")

        // Fallback to Ktor
        val response = httpClient.get(searchIndexUrl)

        if (response.status.value != 200)
            error("[SEARCH] Error downloading search index: ${response.status.value}.")

        println("[CACHE] Downloaded search index via Ktor as fallback for user request.")
    }
}

actual suspend fun getLocalSearchIndexInfo(clusterType: ClusterType): LocalSearchIndexInfo? {
    val cache = caches.open(CACHE_NAME)
    val searchIndexUrl = SEARCH_INDEX_URL + "/" + clusterType.prefix

    return try {
        val cacheResponse = cache.match(searchIndexUrl)

        if (cacheResponse != null) {
            val lastModifiedMillis = cacheResponse.headers.get("Last-Modified")?.let { Date.parse(it).toLong() }
                ?: return null

            val bytes = cacheResponse.bytes().toByteArray()

            LocalSearchIndexInfo(
                clusterType = clusterType,
                timestamp = lastModifiedMillis,
                size = bytes.size.toLong()
            )
        } else {
            null
        }
    } catch (ex: Throwable) {
        println("[SEARCH] Error checking local cache for ${clusterType.prefix}: ${ex.message}")
        null
    }
}
