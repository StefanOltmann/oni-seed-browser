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
import io.ktor.http.isSuccess
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf

private val httpClient = HttpClient()

@OptIn(ExperimentalSerializationApi::class)
suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex {

    val searchIndexUrl = SEARCH_INDEX_URL + "/" + clusterType.prefix

    val lastModifiedMillis = DefaultWebClient.getLastModifiedMillis(searchIndexUrl)

    val cacheEntry = searchIndexCache.load(clusterType.prefix)

    if (lastModifiedMillis == null) {

        if (cacheEntry != null) {

            println("[SEARCH] Use cached file for ${clusterType.prefix} as we are offline.")

            return ProtoBuf.decodeFromByteArray(cacheEntry.first)
        }

        println("[SEARCH] No cache file for ${clusterType.prefix} and we are offline.")

        /*
         * Return an empty search index as we are offline.
         */
        return SearchIndex(
            clusterType = clusterType,
            timestamp = 0
        )
    }

    if (lastModifiedMillis == cacheEntry?.second) {

        println("[SEARCH] Search index cache hit for ${clusterType.prefix} at $lastModifiedMillis")

        return ProtoBuf.decodeFromByteArray(cacheEntry.first)
    }

    val response = httpClient.get(searchIndexUrl)

    if (!response.status.isSuccess())
        error("[SEARCH] Search index for $clusterType not found.")

    val bytes = response.bodyAsBytes()

    println("[SEARCH] Downloaded ${bytes.size} bytes from $searchIndexUrl")

    val searchIndex: SearchIndex = ProtoBuf.decodeFromByteArray(bytes)

    /*
     * Cache the search index in the local app data directory.
     */

    searchIndexCache.save(
        key = clusterType.prefix,
        data = bytes,
        modifiedTime = lastModifiedMillis
    )

    /*
     * Return the cached search index.
     */

    return searchIndex
}
