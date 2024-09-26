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

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

const val BASE_API_URL = "https://api.mapsnotincluded.org"
const val SEARCH_URL = "$BASE_API_URL/saves/search"

@Composable
fun App() {
    MaterialTheme {

        val string = produceState<SearchResponse?>(null) {

            val httpClient = HttpClient {

                install(ContentNegotiation) {
                    json(
                        Json {
                            ignoreUnknownKeys = true
                        }
                    )
                }
            }

            val response: SearchResponse = httpClient.post(SEARCH_URL) {
                contentType(ContentType.Application.Json)
                setBody(
                    SearchRequest(
                        selectedWorld = "null",
                        worldTraits = emptyList(),
                        page = 0,
                        vanilla = true
                    )
                )
            }.body()

            println(response)

            value = response
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
        ) {

            Text("The ONI Seed Browser is a work in progress!")

            val response = string.value

            if (response != null) {

                for (save in response.saves) {

                    Text(save.toString())

                    Spacer(Modifier.height(8.dp))
                }
            }
        }
    }
}
