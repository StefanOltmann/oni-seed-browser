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
import kotlin.time.measureTimedValue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf

/* Read from GitHub pages; Cloudflare pages can't be read due to CORS rules. */
const val LATEST_APP_VERSION_URL = "https://stefan-oltmann.de/oni-seed-browser/version.txt"

const val FIND_URL = "https://oni-data.stefanoltmann.de"

const val SEARCH_INDEX_URL = "https://oni-search.stefanoltmann.de"
const val COUNT_URL = "$SEARCH_INDEX_URL/count"
const val CONTRIBUTORS_URL = "$SEARCH_INDEX_URL/contributors"

const val INGEST_SERVER_URL = "https://ingest.mapsnotincluded.org"
const val REQUEST_URL = "$INGEST_SERVER_URL/request-coordinate"

/**
 * Cloudflare-based service.
 * See https://github.com/StefanOltmann/cloudflare-oni-user-name-service
 */
const val USER_NAMES_URL = "https://stefanoltmann.de/oni-user-names"

/**
 * Cloudflare-based service.
 * See https://github.com/StefanOltmann/cloudflare-oni-user-coordinate-like-service
 */
const val COORDINATE_FAVORITES_ENDPOINT = "https://stefanoltmann.de/oni-user-coordinate-likes"

/**
 * Cloudflare-based service.
 * See https://github.com/StefanOltmann/cloudflare-oni-user-filter-queries-service
 */
const val SAVED_FILTER_QUERIES_ENDPOINT = "https://stefanoltmann.de/oni-user-filter-queries"

const val TOKEN_HEADER = "token"

/**
 * A short delay to avoid overloading the server, which might respond
 * with HTTP 429 (Too Many Requests) if we request too quickly.
 */
private const val FETCH_DELAY_MS: Long = 100

private val json = Json {
    ignoreUnknownKeys = false
    encodeDefaults = true
}

private val backgroundScope = CoroutineScope(Dispatchers.Default)

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

    /* Simple version for doing HEAD calls. */
    private val simpleHttpClient = HttpClient()

    private val clusterCache = LruCache<String, Cluster?>(100)

    private var currentSearchIndex: SearchIndex? = null

    override suspend fun getLatestAppVersion(): String? {

        try {

            val response = httpClient.get(LATEST_APP_VERSION_URL) {
                accept(ContentType.Text.Plain)
            }

            if (response.status != HttpStatusCode.OK)
                return null

            val latestAppVersion: String? = response.body()

            println("[WEBCLIENT] Latest app version: $latestAppVersion")

            return latestAppVersion

        } catch (ex: Throwable) {
            println("[WEBCLIENT] Error getting latest app version: ${ex.message}")
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

            val seedCount: String? = response.body()

            println("[WEBCLIENT] Seed count: $seedCount")

            return seedCount?.toLongOrNull()

        } catch (ex: Throwable) {
            println("Did not receive counts: ${ex.message}")
        }

        return null
    }

    override suspend fun findLatestClusters(): List<String> {

        val response = httpClient.get("$INGEST_SERVER_URL/latest") {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("[WEBCLIENT] Requesting latest clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun find(coordinate: String): Cluster? {

        val cachedCluster = clusterCache.get(coordinate)

        /* Respond from cache when possible. */
        if (cachedCluster != null)
            return cachedCluster

        val cacheEntry = clusterDiskCache.load(coordinate)

        if (cacheEntry != null) {

            val cluster = ProtoBuf.decodeFromByteArray<Cluster>(cacheEntry.first)

            clusterCache.put(coordinate, cluster)

            println("[WEBCLIENT] find(): $coordinate | Cache HIT")

            return cluster
        }

        delay(FETCH_DELAY_MS)

        val (cluster, time) = measureTimedValue {

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

            /*
             * Async store in disk cache
             */
            backgroundScope.launch {
                clusterDiskCache.save(
                    key = cluster.coordinate,
                    data = bytes,
                    modifiedTime = cluster.uploadDate
                )
            }

            clusterCache.put(coordinate, cluster)

            cluster
        }

        println("[WEBCLIENT] find(): $coordinate | DOWNLOAD in $time")

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
            error("[WEBCLIENT] Requesting favored coordinates failed with HTTP ${response.status}: ${response.bodyAsText()}")

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
            println("[WEBCLIENT] Request failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return success
    }

    override suspend fun findSavedFilterQueries(): List<FilterQuery> {

        val response = httpClient.get(SAVED_FILTER_QUERIES_ENDPOINT) {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("[WEBCLIENT] Requesting saved filter queries failed with HTTP ${response.status}: ${response.bodyAsText()}")

        try {

            return response.body()

        } catch (ex: Exception) {

            throw Exception("Finding saved filter queries failed.", ex)
        }
    }

    override suspend fun saveFilterQuery(filterQuery: FilterQuery): Boolean {

        val response = httpClient.put(SAVED_FILTER_QUERIES_ENDPOINT) {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            contentType(ContentType.Application.Json)
            setBody(filterQuery)
        }

        val success = response.status.isSuccess()

        if (!success)
            println("[WEBCLIENT] Request failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return success
    }

    override suspend fun deleteFilterQuery(filterQuery: FilterQuery): Boolean {

        val response = httpClient.delete(SAVED_FILTER_QUERIES_ENDPOINT) {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            contentType(ContentType.Application.Json)
            setBody(filterQuery)
        }

        val success = response.status.isSuccess()

        if (!success)
            println("[WEBCLIENT] Request failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return success
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun search(filterQuery: FilterQuery): List<String> =
        withContext(Dispatchers.Default) {

            val cluster = filterQuery.cluster ?: return@withContext emptyList()

            val (results, time) = measureTimedValue {

                if (currentSearchIndex?.clusterType == cluster)
                    return@measureTimedValue currentSearchIndex!!.match(filterQuery)

                val searchIndex = findSearchIndex(cluster)

                currentSearchIndex = searchIndex

                return@measureTimedValue searchIndex.match(filterQuery)
            }

            println("[WEBCLIENT] Search took $time")

            return@withContext results
        }

    override suspend fun getUsernameMap(): Map<String, String> {

        val response = httpClient.get(USER_NAMES_URL) {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("[WEBCLIENT] Username registry returned status ${response.status}: ${response.bodyAsText()}")

        try {

            val usernameMap: Map<String, String> = response.body()

            println("[WEBCLIENT] Found ${usernameMap.size} usernames.")

            return usernameMap

        } catch (ex: Exception) {

            throw Exception("Finding username map failed.", ex)
        }
    }

    override suspend fun setUsername(username: String): Boolean {

        val response = if (username.isBlank()) {

            httpClient.delete(USER_NAMES_URL) {

                /* Auth */
                AppStorage.getToken()?.let { token ->
                    header(TOKEN_HEADER, token)
                }
            }

        } else {

            httpClient.put(USER_NAMES_URL) {

                /* Auth */
                AppStorage.getToken()?.let { token ->
                    header(TOKEN_HEADER, token)
                }

                contentType(ContentType.Text.Plain)
                setBody(username)
            }
        }

        val success = response.status.isSuccess()

        if (!success)
            println("[WEBCLIENT] Request failed with HTTP ${response.status}: ${response.bodyAsText()}")
        else
            println("[WEBCLIENT] Username set to '$username'")

        return success
    }

    override suspend fun findContributors(): Map<String, Long> {

        val response = httpClient.get(CONTRIBUTORS_URL) {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("[WEBCLIENT] Requesting contributors failed with HTTP ${response.status}: ${response.bodyAsText()}")

        try {

            val contributors: Map<String, Long> = response.body()

            println("[WEBCLIENT] Found ${contributors.size} contributors.")

            return contributors

        } catch (ex: Exception) {

            throw Exception("Finding contributors failed.", ex)
        }
    }

    override suspend fun getLastModifiedMillis(url: String): Long? {

        try {

            val responseHead = simpleHttpClient.head(url)

            if (responseHead.status != HttpStatusCode.OK)
                return null

            val lastModified = responseHead.headers.lastModifiedMillis()

            println("[WEBCLIENT] Last modified date from $url is $lastModified")

            return lastModified

        } catch (ex: Throwable) {

            println("[WEBCLIENT] Cannot get last modified date from $url")

            ex.printStackTrace()

            return null
        }
    }
}
