package service

import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.search.SearchIndex
import io.ktor.client.HttpClient
import io.ktor.client.request.head
import io.ktor.http.HttpStatusCode

expect suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex

internal suspend fun getLastModifiedMillisServer(
    httpClient: HttpClient,
    url: String
): Long? {

    try {

        val responseHead = httpClient.head(url)

        if (responseHead.status != HttpStatusCode.OK)
            return null

        return responseHead.headers.lastModifiedMillis()

    } catch (ex: Throwable) {

        println("[SEARCH] Cannot get last modified date from server.")

        ex.printStackTrace()

        return null
    }
}
