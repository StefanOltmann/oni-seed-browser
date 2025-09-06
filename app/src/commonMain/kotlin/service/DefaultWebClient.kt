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
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.accept
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import model.Cluster
import model.Contributor
import model.filter.FilterQuery
import model.search.SearchIndex

const val FIND_URL = "https://oni-worlds.stefanoltmann.de"

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

private val strictAllFieldsJson = Json {
    ignoreUnknownKeys = false
    encodeDefaults = true
}

object DefaultWebClient : WebClient {

    @OptIn(ExperimentalSerializationApi::class)
    private val httpClient = HttpClient {

        install(ContentNegotiation) {
            json(strictAllFieldsJson)
        }

        install(ContentEncoding) {
            gzip(1.0f)
        }
    }

    private val clusterCache = LruCache<String, Cluster?>(100)

    private var currentSearchIndex: SearchIndex? = null

    override suspend fun countSeeds(): Long? {

        val response = httpClient.get(COUNT_URL) {
            accept(ContentType.Text.Plain)
        }

        if (response.status != HttpStatusCode.OK)
            return null

        return response.body()
    }

    override suspend fun findLatestClusters(): List<String> {

        val response = httpClient.get("$INGEST_SERVER_URL/latest/v2") {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Requesting latest clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun find(coordinate: String): Cluster? {

        val cachedCluster = clusterCache.get(coordinate)

        /* Respond from cache when possible. */
        if (cachedCluster != null)
            return cachedCluster

        /*
         * First, ask the mirror for data.
         */
        val response = httpClient.get("$FIND_URL/$coordinate") {
            accept(ContentType.Application.Json)
        }

//        /*
//         * If it's not available on the mirror, ask the main repo.
//         */
//        if (response.status != HttpStatusCode.OK) {
//
//            println("$coordinate not found on S3, trying fallback URL.")
//
//            response = httpClient.get("$FIND_URL_MAIN/$coordinate") {
//                accept(ContentType.Application.Json)
//            }
//
//        } else {
//            println("$coordinate found on S3.")
//        }

        if (response.status != HttpStatusCode.OK)
            return null

        val cluster: Cluster? = response.body()

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

        return response.body()
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

    override suspend fun getUsernameMap(): Map<String, String> {

        val response = httpClient.get(ALL_USER_NAMES_URL) {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Username registry returned status ${response.status}: ${response.bodyAsText()}")

        return response.body()
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

        return response.body()
    }
}
