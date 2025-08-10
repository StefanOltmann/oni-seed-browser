/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de/oni-seed-browser
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
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import model.Cluster
import model.Contributor
import model.RateCoordinateRequest
import model.filter.FilterQuery

const val BASE_API_URL = "https://ingest.mapsnotincluded.org"
const val FIND_URL = "$BASE_API_URL/coordinate"
const val REQUEST_URL = "$BASE_API_URL/request-coordinate"
const val SEARCH_URL = "$BASE_API_URL/search/v2"
const val COUNT_URL = "$BASE_API_URL/count"

const val USERNAME_REGISTRY_URL = "https://steam.name.stefanoltmann.de/registry"

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

    override suspend fun countSeeds(): Long? {

        val response = httpClient.get(COUNT_URL)

        if (response.status != HttpStatusCode.OK)
            return null

        return response.body()
    }

    override suspend fun findLatestClusters(): List<String> {

        val response = httpClient.get("$BASE_API_URL/latest/v2")

        if (!response.status.isSuccess())
            error("Requesting latest clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun find(coordinate: String): Cluster? {

        val cachedCluster = clusterCache.get(coordinate)

        /* Respond from cache when possible. */
        if (cachedCluster != null)
            return cachedCluster

        val response = httpClient.get("$FIND_URL/$coordinate") {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            accept(ContentType.Application.Json)
        }

        if (response.status != HttpStatusCode.OK)
            return null

        val cluster: Cluster? = response.body()

        clusterCache.put(coordinate, cluster)

        return cluster
    }

    override suspend fun request(coordinate: String): Boolean {

        println("Request: $coordinate")

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

        val response = httpClient.get("$BASE_API_URL/favored") {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }
        }

        if (!response.status.isSuccess())
            error("Requesting favored coordinates failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun rate(coordinate: String, like: Boolean): Boolean {

        println((if (like) "Like" else "Unlike") + " " + coordinate)

        val response = httpClient.post("$BASE_API_URL/rate-coordinate") {

            /* Auth */
            AppStorage.getToken()?.let { token ->
                header(TOKEN_HEADER, token)
            }

            contentType(ContentType.Application.Json)
            setBody(
                RateCoordinateRequest(
                    coordinate = coordinate,
                    like = like
                )
            )
        }

        val success = response.status.isSuccess()

        if (!success)
            println("Request failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return success
    }

    override suspend fun search(filterQuery: FilterQuery): List<String> {

        val response = httpClient.post(SEARCH_URL) {

            contentType(ContentType.Application.Json)
            accept(ContentType.Application.Json)
            setBody(filterQuery)
        }

        if (!response.status.isSuccess())
            error("Search returned status code ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun getUsernameMap(): Map<String, String> {

        val response = httpClient.get(USERNAME_REGISTRY_URL) {

            contentType(ContentType.Application.Json)
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Username registry returned status ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun setUsername(username: String): Boolean {

        val response = httpClient.post(USERNAME_REGISTRY_URL) {

            contentType(ContentType.Text.Plain)
            setBody(username.ifBlank { "" })
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

        val response = httpClient.get("$BASE_API_URL/contributors") {
            accept(ContentType.Application.Json)
        }

        if (!response.status.isSuccess())
            error("Requesting contributors failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }
}
