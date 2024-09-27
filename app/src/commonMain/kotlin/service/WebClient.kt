package service

import SearchRequest
import SearchResponse

interface WebClient {

    fun search(searchRequest: SearchRequest): SearchResponse

}
