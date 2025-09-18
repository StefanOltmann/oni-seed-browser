/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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

    val lastModifiedMillis = DefaultWebClient.getLastModifiedMillis(searchIndexUrl)

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
