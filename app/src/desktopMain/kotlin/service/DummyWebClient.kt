package service

import SearchRequest
import SearchResponse
import kotlinx.serialization.json.Json

class DummyWebClient : WebClient {

    override fun search(searchRequest: SearchRequest): SearchResponse {

        val testBytes = this::class.java.getResourceAsStream("fake.json")?.readAllBytes()

        checkNotNull(testBytes)

        val jsonString = testBytes.decodeToString()

        return Json.decodeFromString<SearchResponse>(jsonString)
    }
}

fun main() {

    val response = DummyWebClient().search(
        SearchRequest(
            selectedWorld = "null",
            worldTraits = emptyList(),
            page = 0,
            vanilla = true
        )
    )

    println(response)
}
