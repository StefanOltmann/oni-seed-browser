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
import java.io.File
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf

private val httpClient = HttpClient()

/* cross-platform local app data directory for ONI Seed Browser */
private val localAppData: File by lazy {

    val os = System.getProperty("os.name").lowercase()
    val userHome = System.getProperty("user.home")

    val path = when {

        os.contains("win") ->
            System.getenv("LOCALAPPDATA") ?: "$userHome/AppData/Local"

        os.contains("mac") ->
            "$userHome/Library/Application Support"

        else -> // Linux & others
            System.getenv("XDG_DATA_HOME") ?: "$userHome/.local/share"

    } + "/ONI Seed Browser/search-index"

    File(path).apply {
        mkdirs()
    }
}

@OptIn(ExperimentalSerializationApi::class)
actual suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex {

    val searchIndexUrl = SEARCH_INDEX_URL + "/" + clusterType.prefix

    val cacheFile = File(localAppData, clusterType.prefix)

    val lastModifiedMillis = DefaultWebClient.getLastModifiedMillis(searchIndexUrl)

    if (lastModifiedMillis == null) {

        if (cacheFile.exists()) {

            println("[SEARCH] Use cached file for ${clusterType.prefix} as we are offline.")

            return ProtoBuf.decodeFromByteArray(cacheFile.readBytes())
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

    if (lastModifiedMillis == cacheFile.lastModified()) {

        println("[SEARCH] Search index cache hit for ${clusterType.prefix} at $lastModifiedMillis")

        return ProtoBuf.decodeFromByteArray(cacheFile.readBytes())
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

    withContext(Dispatchers.IO) {

        cacheFile.writeBytes(bytes)
        cacheFile.setLastModified(lastModifiedMillis)
    }

    /*
     * Return the cached search index.
     */

    return searchIndex
}

