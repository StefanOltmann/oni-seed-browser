package service

import SearchRequest
import SearchResponse

interface WebClient {

    suspend fun search(searchRequest: SearchRequest): SearchResponse

}
