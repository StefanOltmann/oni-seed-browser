package service

import SearchRequest
import SearchResponse
import kotlinx.serialization.json.Json

object DummyWebClient : WebClient {

    override suspend fun search(searchRequest: SearchRequest): SearchResponse {
        return Json.decodeFromString<SearchResponse>(fakeJsonSearchResponse)
    }
}
