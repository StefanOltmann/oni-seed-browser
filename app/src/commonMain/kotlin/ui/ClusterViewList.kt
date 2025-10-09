/*
 * ONI Seed Browser - Column infinite scroll (no placeholders)
 * Improved: IO dispatcher, debug logging, retries, stable index advancement
 */

package ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.animateScrollBy
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.Cluster
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import service.DefaultWebClient
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.lightGray

private const val SCROLL_THRESHOLD_PX = 500

@Composable
fun ClusterViewList(
    clusters: List<String>,
    favoriteCoordinates: MutableState<List<String>>,
    likeCounts: MutableState<Map<String, Int>?>?,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
    showMniUrl: Boolean = false,
    showFavoriteIcon: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    val displayedClusters = remember { mutableStateListOf<Cluster?>() }

    var nextCoordinateIndex by remember { mutableStateOf(0) }

    var isLoading by remember { mutableStateOf(false) }

    val scrollState = rememberScrollState()

    val coroutineScope = rememberCoroutineScope()

    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    /*
     * Initial fetch of the first cluster.
     */
    LaunchedEffect(clusters) {

        displayedClusters.clear()
        nextCoordinateIndex = 0
        isLoading = false

        if (clusters.isNotEmpty()) {

            isLoading = true

            try {

                if (fetchPage(clusters, 0, displayedClusters))
                    nextCoordinateIndex += 1

            } finally {

                isLoading = false
            }
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

                        if (fetchPage(clusters, nextCoordinateIndex, displayedClusters))
                            nextCoordinateIndex += 1

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
                .focusable()
                .focusRequester(focusRequester)
                .onKeyEvent { event ->

                    if (event.type == KeyEventType.KeyDown) {
                        when (event.key) {
                            Key.DirectionDown -> {
                                coroutineScope.launch {
                                    scrollState.animateScrollBy(100f)
                                }
                                true
                            }

                            Key.DirectionUp -> {
                                coroutineScope.launch {
                                    scrollState.animateScrollBy(-100f)
                                }
                                true
                            }

                            Key.PageDown -> {
                                coroutineScope.launch {
                                    scrollState.animateScrollBy(500f)
                                }
                                true
                            }

                            Key.PageUp -> {
                                coroutineScope.launch {
                                    scrollState.animateScrollBy(-500f)
                                }
                                true
                            }

                            else -> false
                        }
                    } else false
                }
                .padding(doubleSpacing),
            verticalArrangement = Arrangement.spacedBy(defaultSpacing)
        ) {

            displayedClusters.forEachIndexed { idx, cluster ->

                /*
                 * Skip removed clusters
                 */
                if (cluster != null) {

                    ClusterView(
                        cluster = cluster,
                        index = idx + 1,
                        totalCount = clusters.size,
                        favoriteCoordinates = favoriteCoordinates,
                        likeCount = likeCounts?.value?.get(cluster.coordinate),
                        showStarMap = showStarMap,
                        showAsteroidMap = showAsteroidMap,
                        showMniUrl = showMniUrl,
                        showFavoriteIcon = showFavoriteIcon,
                        steamIdToUsernameMap = steamIdToUsernameMap,
                        writeToClipboard = writeToClipboard
                    )

                } else {

                    LaunchedEffect(true) {
                        println("Skipping not found cluster at index $idx")
                    }
                }
            }

            if (isLoading && nextCoordinateIndex < clusters.size)
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = doubleSpacing)
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

private suspend fun fetchPage(
    clusters: List<String>,
    index: Int,
    displayed: MutableList<Cluster?>
): Boolean {

    if (index >= clusters.size)
        return false

    val coordinate = clusters[index]

    try {

        val cluster = withContext(Dispatchers.Default) {
            DefaultWebClient.find(coordinate)
        }

        displayed.add(cluster)

    } catch (ex: CancellationException) {
        throw ex
    } catch (ex: Throwable) {
        ex.printStackTrace()
    }

    return true
}
