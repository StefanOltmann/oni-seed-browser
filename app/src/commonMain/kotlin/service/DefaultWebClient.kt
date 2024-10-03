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

import SearchRequest
import SearchResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import model.World

const val BASE_API_URL = "https://oni-seed-uploader-stefan-oltmann.koyeb.app"
const val SEARCH_URL = "$BASE_API_URL/all"

object DefaultWebClient : WebClient {

    private val httpClient = HttpClient {

        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    override suspend fun search(searchRequest: SearchRequest): SearchResponse {

//        val response: SearchResponse = httpClient.post(SEARCH_URL) {
//            contentType(ContentType.Application.Json)
//            setBody(
//                SearchRequest(
//                    selectedWorld = "null",
//                    worldTraits = emptyList(),
//                    page = 0,
//                    vanilla = true
//                )
//            )
//        }.body()

        val worlds: List<World> = httpClient.get(SEARCH_URL) {
            contentType(ContentType.Application.Json)
        }.body()

        return SearchResponse(
            page = 1,
            pageSize = 50,
            totalPages = 1,
            totalResults = worlds.size,
            worlds = worlds
        )
    }
}
