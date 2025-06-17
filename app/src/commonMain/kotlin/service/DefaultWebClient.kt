/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

package service

import AppStorage
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import io.ktor.serialization.kotlinx.cbor.cbor
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.json.Json
import model.Cluster
import model.Contributor
import model.RateCoordinateRequest
import model.RatedCluster
import model.filter.FilterQuery

const val BASE_API_URL = "https://ingest.mapsnotincluded.org"
const val FIND_URL = "$BASE_API_URL/coordinate"
const val REQUEST_URL = "$BASE_API_URL/request-coordinate"
const val SEARCH_URL = "$BASE_API_URL/search"
const val COUNT_URL = "$BASE_API_URL/count"

private val strictAllFieldsJson = Json {
    ignoreUnknownKeys = false
    encodeDefaults = true
}

@OptIn(ExperimentalSerializationApi::class)
private val strictAllFieldsCbor = Cbor {
    ignoreUnknownKeys = false
    encodeDefaults = true
}

object DefaultWebClient : WebClient {

    @OptIn(ExperimentalSerializationApi::class)
    private val httpClient = HttpClient {

        defaultRequest {
            headers {
                /* For CORS */
                append(HttpHeaders.AccessControlAllowOrigin, BASE_API_URL)

                // Allow credentials if needed
                // append(HttpHeaders.AccessControlAllowCredentials, "true")

                /* Auth */
                AppStorage.getToken()?.let { token ->
                    append("token", token)
                }
            }
        }

        install(ContentNegotiation) {
            json(strictAllFieldsJson)
            cbor(strictAllFieldsCbor)
        }

        install(ContentEncoding) {
            gzip(1.0f)
        }
    }

    override suspend fun countSeeds(): Long? {

        val response = httpClient.get(COUNT_URL)

        if (response.status != HttpStatusCode.OK)
            return null

        return response.body()
    }

    override suspend fun findLatestClusters(): List<Cluster> {

        val response = httpClient.get("$BASE_API_URL/latest")

        if (!response.status.isSuccess())
            error("Requesting latest clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun findTopRatedClusters(): List<RatedCluster> {

        val response = httpClient.get("$BASE_API_URL/top")

        if (!response.status.isSuccess())
            error("Requesting latest clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun find(coordinate: String): Cluster? {

        println("Find: $coordinate")

        val response = httpClient.get("$FIND_URL/$coordinate") {
            contentType(ContentType.Application.Cbor)
            accept(ContentType.Application.Cbor)
            header(HttpHeaders.AcceptEncoding, "gzip")
        }

        if (response.status != HttpStatusCode.OK)
            return null

        return response.body()
    }

    override suspend fun request(coordinate: String): Boolean {

        println("Request: $coordinate")

        val response = httpClient.post(REQUEST_URL) {
            contentType(ContentType.Text.Plain)
            setBody(coordinate)
        }

        return response.status.isSuccess()
    }

    override suspend fun findFavoredClusters(): List<Cluster> {

        val response = httpClient.get("$BASE_API_URL/favored-clusters")

        if (!response.status.isSuccess())
            error("Requesting favored clusters failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun findFavoredCoordinates(): List<String> {

        val response = httpClient.get("$BASE_API_URL/favored-coordinates")

        if (!response.status.isSuccess())
            error("Requesting favored coordinates failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun rate(coordinate: String, like: Boolean): Boolean {

        println((if (like) "Like" else "Unlike") + " " + coordinate)

        val response = httpClient.post("$BASE_API_URL/rate-coordinate") {
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

    override suspend fun search(filterQuery: FilterQuery): List<Cluster> {

        val response = httpClient.post(SEARCH_URL) {

            /* Filter MUST be sent as JSON, because CBOR causes issues here. */
            contentType(ContentType.Application.Json)

            /* Response can be in CBOR */
            accept(ContentType.Application.Cbor)

            /* Always zip */
            header(HttpHeaders.AcceptEncoding, "gzip")

            setBody(filterQuery)

        }

        if (!response.status.isSuccess())
            error("Search returned status code ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }

    override suspend fun getUsername(): String? {

        val response = httpClient.get("$BASE_API_URL/username")

        if (response.status != HttpStatusCode.OK)
            return null

        return response.bodyAsText()
    }

    override suspend fun setUsername(username: String): Boolean {

        val response = httpClient.post("$BASE_API_URL/username") {
            contentType(ContentType.Application.Json)
            setBody(username)
        }

        val success = response.status.isSuccess()

        if (!success)
            println("Request failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return success
    }

    override suspend fun findContributors(): List<Contributor> {

        println("WebClient: findContributors()")

        val response = httpClient.get("$BASE_API_URL/contributors")

        if (!response.status.isSuccess())
            error("Requesting contributors failed with HTTP ${response.status}: ${response.bodyAsText()}")

        return response.body()
    }
}
