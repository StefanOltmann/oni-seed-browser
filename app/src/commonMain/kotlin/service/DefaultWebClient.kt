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
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.*
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.World
import model.filter.FilterQuery

const val BASE_API_URL = "https://oni-seed-uploader-stefan-oltmann.koyeb.app"
const val FIND_URL = "$BASE_API_URL/coordinate"
const val SEARCH_URL = "$BASE_API_URL/search"

private val jsonPretty = Json { this.prettyPrint = true }

object DefaultWebClient : WebClient {

    private val httpClient = HttpClient {

        defaultRequest {
            /* For CORS */
            header(HttpHeaders.AccessControlAllowOrigin, "*")
        }

        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    override suspend fun find(coordinate: String): World? {

        println("Find: $coordinate")

        val world: World? = httpClient.get("$FIND_URL/$coordinate") {
            contentType(ContentType.Application.Json)
        }.body()

        return world
    }

    override suspend fun search(filterQuery: FilterQuery): List<World> {

        println("Search: " + jsonPretty.encodeToString(filterQuery))

        val worlds: List<World> = httpClient.post(SEARCH_URL) {
            contentType(ContentType.Application.Json)
            setBody(filterQuery)
        }.body()

        return worlds
    }
}
