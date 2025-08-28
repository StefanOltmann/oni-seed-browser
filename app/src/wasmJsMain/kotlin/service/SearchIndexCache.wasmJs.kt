package service

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.head
import io.ktor.client.statement.bodyAsBytes
import io.ktor.http.isSuccess
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import model.ClusterType
import model.search2.SearchIndex

private val httpClient = HttpClient()

actual suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex {

    val searchIndexUrl = SEARCH_INDEX_URL_MAIN + "/" + clusterType.prefix

    val responseHead = httpClient.head(searchIndexUrl)

    val lastModifiedMillis = responseHead.headers.lastModifiedMillis() ?:
        error("[SEARCH] No last modified date found for $searchIndexUrl")

    val response = httpClient.get(searchIndexUrl)

    if (!response.status.isSuccess())
        error("Search index for $clusterType not found.")

    val bytes = response.bodyAsBytes()

    println("Downloaded ${bytes.size} bytes from $searchIndexUrl")

    val searchIndex: SearchIndex = ProtoBuf.decodeFromByteArray(bytes)

    // TODO Implement caching

    return searchIndex
}
