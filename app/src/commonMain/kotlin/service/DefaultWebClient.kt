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

import AppStorage
import de.stefan_oltmann.oni.model.Cluster
import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.Contributor
import de.stefan_oltmann.oni.model.filter.FilterQuery
import de.stefan_oltmann.oni.model.search.SearchIndex
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.accept
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.head
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsBytes
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import io.ktor.serialization.kotlinx.json.json
import io.ktor.serialization.kotlinx.protobuf.protobuf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf

/* Read from GitHub pages; Cloudflare pages can't be read due to CORS rules. */
const val LATEST_APP_VERSION_URL = "https://stefan-oltmann.de/oni-seed-browser/version.txt"

const val FIND_URL = "https://oni-data.stefanoltmann.de"

const val SEARCH_INDEX_URL = "https://oni-search.stefanoltmann.de"

const val INGEST_SERVER_URL = "https://ingest.mapsnotincluded.org"
const val REQUEST_URL = "$INGEST_SERVER_URL/request-coordinate"
const val COUNT_URL = "$INGEST_SERVER_URL/count"

/**
 * Cloudflare-based service.
 * See https://github.com/StefanOltmann/cloudflare-steam-name-update-service
 */
const val ALL_USER_NAMES_URL = "https://oni-users.stefanoltmann.de/names.json"
const val CHANGE_NAME_ENDPOINT = "https://stefanoltmann.de/steam-names"

/**
 * Cloudflare-based service.
 * See https://github.com/StefanOltmann/cloudflare-oni-user-coordinate-like-service
 */
const val COORDINATE_FAVORITES_ENDPOINT = "https://stefanoltmann.de/oni-user-coordinate-likes"

const val TOKEN_HEADER = "token"

private val json = Json {

    // We drop some old fields
    // FIXME should not happen long-term
    ignoreUnknownKeys = true

    encodeDefaults = true
}

object DefaultWebClient : WebClient {

    @OptIn(ExperimentalSerializationApi::class)
    private val httpClient = HttpClient {

        install(ContentNegotiation) {
            json(json)
            protobuf()
        }

        install(ContentEncoding) {
            gzip(1.0f)
        }
    }

    private val clusterCache = LruCache<String, Cluster?>(100)

    private var currentSearchIndex: SearchIndex? = null
    private var currentSearchIndexSize: Long = 0L

    override suspend fun getLatestAppVersion(): String? {

        try {

            val response = httpClient.get(LATEST_APP_VERSION_URL) {
                accept(ContentType.Text.Plain)
            }

            if (response.status != HttpStatusCode.OK)
                return null

            return response.body()

        } catch (ex: Throwable) {
            println("Error getting latest app version: ${ex.message}")
        }

        return null
    }

    override suspend fun countSeeds(): Long? {

        try {

            val response = httpClient.get(COUNT_URL) {
                accept(ContentType.Text.Plain)
            }

            if (response.status != HttpStatusCode.OK)
                return null

            return response.body()

        } catch (ex: Throwable) {
            println("Did not receive counts: ${ex.message}")
        }

        return null
    }

    override suspend fun findLatestClusters(): List<String> {

        val response = httpClient.get("$INGEST_SERVER_URL/latest/v2") {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Requesting latest clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun find(coordinate: String): Cluster? {

        val cachedCluster = clusterCache.get(coordinate)

        /* Respond from cache when possible. */
        if (cachedCluster != null)
            return cachedCluster

        val response = httpClient.get("$FIND_URL/$coordinate") {
            accept(ContentType.Application.ProtoBuf)
        }

        if (response.status != HttpStatusCode.OK)
            return null

        val bytes = response.bodyAsBytes()

        /*
         * We need to receive the bytes first and then decode them.
         * The body<Cluster> function does not work for Protobuf.
         */
        val cluster = ProtoBuf.decodeFromByteArray<Cluster>(bytes)

        clusterCache.put(coordinate, cluster)

        return cluster
    }

    override suspend fun request(coordinate: String): Boolean {

        val response = httpClient.post(REQUEST_URL) {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            contentType(ContentType.Text.Plain)
            setBody(coordinate)
        }

        return response.status.isSuccess()
    }

    override suspend fun findFavoredCoordinates(): List<String> {

        val response = httpClient.get(COORDINATE_FAVORITES_ENDPOINT) {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Requesting favored coordinates failed with HTTP ${response.status}: ${response.bodyAsText()}")

        try {

            return response.body()

        } catch (ex: Exception) {

            throw Exception("Finding favored coordinates failed.", ex)
        }
    }

    override suspend fun rate(coordinate: String, like: Boolean): Boolean {

        println((if (like) "Like" else "Unlike") + " " + coordinate)

        val response = if (like) {

            httpClient.put(COORDINATE_FAVORITES_ENDPOINT) {

                /* Auth */
                AppStorage.getToken()?.let { token ->
                    header(TOKEN_HEADER, token)
                }

                contentType(ContentType.Text.Plain)
                setBody(coordinate)
            }

        } else {

            httpClient.delete(COORDINATE_FAVORITES_ENDPOINT) {

                /* Auth */
                AppStorage.getToken()?.let { token ->
                    header(TOKEN_HEADER, token)
                }

                contentType(ContentType.Text.Plain)
                setBody(coordinate)
            }
        }

        val success = response.status.isSuccess()

        if (!success)
            println("Request failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return success
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun search(filterQuery: FilterQuery): List<String> =
        withContext(Dispatchers.Default) {

            val cluster = filterQuery.cluster ?: return@withContext emptyList()

            if (currentSearchIndex?.clusterType == cluster)
                return@withContext currentSearchIndex!!.match(filterQuery)

            val searchIndex = findSearchIndex(cluster)

            currentSearchIndex = searchIndex

            return@withContext searchIndex.match(filterQuery)
        }

    override suspend fun getCurrentSearchIndex(): SearchIndex? {
        return currentSearchIndex
    }

    override suspend fun getCurrentSearchIndexSize(): Long {
        val currentIndex = currentSearchIndex ?: return 0L

        // Get size from the server
        try {
            val searchIndexUrl = SEARCH_INDEX_URL + "/" + currentIndex.clusterType.prefix
            val response = httpClient.head(searchIndexUrl)
            return response.headers["Content-Length"]?.toLongOrNull() ?: 0L
        } catch (ex: Throwable) {
            return 0L
        }
    }

    override suspend fun getAllSearchIndexInfo(): List<SearchIndexInfo> =
        withContext(Dispatchers.Default) {
            val allClusterTypes = ClusterType.entries
            val searchIndexInfoList = mutableListOf<SearchIndexInfo>()

            for (clusterType in allClusterTypes) {
                try {
                    val searchIndexUrl = SEARCH_INDEX_URL + "/" + clusterType.prefix
                    val lastModifiedMillis = getLastModifiedMillisServer(httpClient, searchIndexUrl)
                        ?: continue // Skip if we can't get modification time

                    // Get the content-length header to determine size
                    val response = httpClient.head(searchIndexUrl)
                    val size = response.headers["Content-Length"]?.toLongOrNull() ?: 0L

                    searchIndexInfoList.add(
                        SearchIndexInfo(
                            clusterType = clusterType,
                            size = size,
                            timestamp = lastModifiedMillis
                        )
                    )

                } catch (ex: Throwable) {
                    println("[SEARCH] Could not get info for ${clusterType.prefix}: ${ex.message}")
                    // Continue with other cluster types
                }
            }

            return@withContext searchIndexInfoList.sortedBy { it.clusterType.name }
        }

    override suspend fun downloadSearchIndex(clusterType: ClusterType): String {
        return SEARCH_INDEX_URL + "/" + clusterType.prefix
    }

    override suspend fun getUsernameMap(): Map<String, String> {

        val response = httpClient.get(ALL_USER_NAMES_URL) {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Username registry returned status ${response.status}: ${response.bodyAsText()}")

        try {

            return response.body()

        } catch (ex: Exception) {

            throw Exception("Finding username map failed.", ex)
        }
    }

    override suspend fun setUsername(username: String): Boolean {

        val response = httpClient.post(CHANGE_NAME_ENDPOINT) {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            contentType(ContentType.Text.Plain)
            setBody(username.ifBlank { "null" })
        }

        val success = response.status.isSuccess()

        if (!success)
            println("Request failed with HTTP ${response.status}: ${response.bodyAsText()}")
        else
            println("Username set to $username")

        return success
    }

    override suspend fun findContributors(): List<Contributor> {

        println("WebClient: findContributors()")

        val response = httpClient.get("$INGEST_SERVER_URL/contributors") {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Requesting contributors failed with HTTP ${response.status}: ${response.bodyAsText()}")

        try {

            return response.body()

        } catch (ex: Exception) {

            throw Exception("Finding contributors failed.", ex)
        }
    }
}
