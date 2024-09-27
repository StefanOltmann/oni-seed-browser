package service

import SearchRequest
import SearchResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

const val BASE_API_URL = "https://api.mapsnotincluded.org"
const val SEARCH_URL = "$BASE_API_URL/saves/search"

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

        return response
    }
}
