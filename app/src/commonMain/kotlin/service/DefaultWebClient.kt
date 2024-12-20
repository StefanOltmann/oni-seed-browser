/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.cbor.cbor
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.Cluster
import model.filter.FilterQuery

const val BASE_API_URL = "https://ingest.mapsnotincluded.org"
const val FIND_URL = "$BASE_API_URL/coordinate"
const val SEARCH_URL = "$BASE_API_URL/search"
const val COUNT_URL = "$BASE_API_URL/count"

private val jsonPretty = Json {
    prettyPrint = true
    ignoreUnknownKeys = false
    encodeDefaults = true
}

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
            /* For CORS */
            header(HttpHeaders.AccessControlAllowOrigin, "*")
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

    override suspend fun search(filterQuery: FilterQuery): List<Cluster> {

        println("Search: " + jsonPretty.encodeToString(filterQuery))

        return httpClient.post(SEARCH_URL) {

            /* Filter MUST be sent as JSON, because CBOR causes issues here. */
            contentType(ContentType.Application.Json)

            /* Response can be in CBOR */
            accept(ContentType.Application.Cbor)

            /* Always zip */
            header(HttpHeaders.AcceptEncoding, "gzip")

            setBody(filterQuery)

        }.body()
    }
}
