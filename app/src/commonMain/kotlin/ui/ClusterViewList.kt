/*
 * ONI Seed Browser - Column infinite scroll (no placeholders)
 * Improved: IO dispatcher, debug logging, retries, stable index advancement
 */

package ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlin.math.min
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import model.Asteroid
import model.Cluster
import service.DefaultWebClient
import ui.theme.doubleSpacing
import ui.theme.lightGray

private const val PAGE_SIZE = 3
private const val SCROLL_THRESHOLD_PX = 250
private const val PER_ITEM_RETRY = 1

@Composable
fun ClusterViewList(
    clusters: List<String>,
    useCompactLayout: Boolean,
    favoriteCoordinates: MutableState<List<String>>,
    likeCounts: MutableState<Map<String, Int>?>?,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
    showMniUrl: Boolean = false,
    showFavoriteIcon: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    val displayed = remember { mutableStateListOf<Cluster>() }
    var nextCoordinateIndex by remember { mutableStateOf(0) }
    var isLoading by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

    LaunchedEffect(clusters) {

        displayed.clear()
        nextCoordinateIndex = 0
        isLoading = false

        if (clusters.isNotEmpty()) {

            isLoading = true

            val newIndex = fetchPageWithRetries(clusters, 0, PAGE_SIZE, displayed)

            if (newIndex != null)
                nextCoordinateIndex = newIndex

            isLoading = false
        }
    }

    LaunchedEffect(scrollState, nextCoordinateIndex, clusters) {

        snapshotFlow { scrollState.value to scrollState.maxValue }
            .map { (value, max) -> max - value }
            .distinctUntilChanged()
            .filter { remaining -> remaining <= SCROLL_THRESHOLD_PX }
            .collect { _ ->

                if (!isLoading && nextCoordinateIndex < clusters.size) {

                    isLoading = true

                    try {

                        val newIndex = fetchPageWithRetries(clusters, nextCoordinateIndex, PAGE_SIZE, displayed)

                        if (newIndex != null)
                            nextCoordinateIndex = newIndex

                    } finally {
                        isLoading = false
                    }
                }
            }
    }

    Box {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
                .padding(doubleSpacing),
            verticalArrangement = Arrangement.spacedBy(doubleSpacing)
        ) {

            displayed.forEachIndexed { idx, cluster ->

                ClusterView(
                    cluster = cluster,
                    index = idx + 1,
                    totalCount = clusters.size,
                    useCompactLayout = useCompactLayout,
                    favoriteCoordinates = favoriteCoordinates,
                    likeCount = likeCounts?.value?.get(cluster.coordinate),
                    showStarMap = showStarMap,
                    showAsteroidMap = showAsteroidMap,
                    showMniUrl = showMniUrl,
                    showFavoriteIcon = showFavoriteIcon,
                    steamIdToUsernameMap = steamIdToUsernameMap,
                    writeToClipboard = writeToClipboard
                )
            }

            if (isLoading && nextCoordinateIndex < clusters.size)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = doubleSpacing),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
        }

        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(scrollState),
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
            style = defaultScrollbarStyle().copy(
                unhoverColor = lightGray.copy(alpha = 0.4f),
                hoverColor = lightGray
            )
        )
    }
}

private suspend fun fetchPageWithRetries(
    clusters: List<String>,
    startIndex: Int,
    pageSize: Int,
    displayed: MutableList<Cluster>
): Int? {

    if (startIndex >= clusters.size)
        return null

    /*
     * A short delay to avoid overloading the server, which might respond
     * with Too Many Requests (429) if we request too quickly.
     */
    delay(300)

    val end = min(startIndex + pageSize, clusters.size)

    for (index in startIndex until end) {

        val coordinate = clusters[index]
        var attempt = 0
        var succeeded = false

        while (attempt <= PER_ITEM_RETRY && !succeeded) {

            attempt++

            try {

                val cluster = withContext(Dispatchers.Default) {
                    DefaultWebClient.find(coordinate)
                }

                if (cluster != null) {

                    displayed.add(cluster)

                    succeeded = true
                }

            } catch (ex: CancellationException) {
                throw ex
            } catch (ex: Throwable) {
                ex.printStackTrace()
            }
        }
    }

    return end
}
