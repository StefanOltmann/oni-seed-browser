package service

import model.ClusterType
import model.search2.SearchIndex

expect suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex
