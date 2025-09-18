package service

import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.search.SearchIndex
import io.ktor.client.HttpClient
import io.ktor.client.request.head
import io.ktor.http.HttpStatusCode

expect suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex
