package service

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.head
import io.ktor.client.statement.bodyAsBytes
import io.ktor.http.isSuccess
import java.io.File
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import model.ClusterType
import model.search2.SearchIndex

private val httpClient = HttpClient()

/* cross-platform local app data directory for ONI Seed Browser */
private val localAppData: File by lazy {

    val os = System.getProperty("os.name").lowercase()
    val userHome = System.getProperty("user.home")

    val path = when {

        os.contains("win") ->
            System.getenv("LOCALAPPDATA") ?: "$userHome/AppData/Local"

        os.contains("mac") ->
            "$userHome/Library/Application Support"

        else -> // Linux & others
            System.getenv("XDG_DATA_HOME") ?: "$userHome/.local/share"

    } + "/ONI Seed Browser/search-index"

    File(path).apply {
        mkdirs()
    }
}

actual suspend fun findSearchIndex(clusterType: ClusterType): SearchIndex {

    val searchIndexUrl = SEARCH_INDEX_URL_MAIN + "/" + clusterType.prefix

    val cacheFile = File(localAppData, clusterType.prefix)

    val responseHead = httpClient.head(searchIndexUrl)

    val lastModifiedMillis = responseHead.headers.lastModifiedMillis() ?:
        error("[SEARCH] No last modified date found for $searchIndexUrl")

    if (lastModifiedMillis == cacheFile.lastModified()) {

        println("[SEARCH] Search index cache hit for ${clusterType.prefix} at $lastModifiedMillis")

        return ProtoBuf.decodeFromByteArray(cacheFile.readBytes())
    }

    val response = httpClient.get(searchIndexUrl)

    if (!response.status.isSuccess())
        error("[SEARCH] Search index for $clusterType not found.")

    val bytes = response.bodyAsBytes()

    println("[SEARCH] Downloaded ${bytes.size} bytes from $searchIndexUrl")

    val searchIndex: SearchIndex = ProtoBuf.decodeFromByteArray(bytes)

    /*
     * Cache the search index in the local app data directory.
     */

    withContext(Dispatchers.IO) {

        cacheFile.writeBytes(bytes)
        cacheFile.setLastModified(lastModifiedMillis)
    }

    /*
     * Return the cached search index.
     */

    return searchIndex
}

