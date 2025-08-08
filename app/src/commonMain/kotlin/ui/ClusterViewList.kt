/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de/oni-seed-browser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.coroutines.cancellation.CancellationException
import model.Asteroid
import model.Cluster
import service.DefaultWebClient
import ui.theme.doubleSpacing
import ui.theme.lightGray

private const val PAGE_SIZE = 2

@Composable
fun ClusterViewList(
    lazyListState: LazyListState,
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
    var displayedCoordinates by remember { mutableStateOf<List<String>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }

    // This is the cache that will store fetched cluster data.
    var clusterCache by remember { mutableStateOf<Map<String, Cluster>>(emptyMap()) }

    LaunchedEffect(clusters) {
        // When the source list changes, clear the cache and load the first page.
        clusterCache = emptyMap()
        displayedCoordinates = clusters.take(PAGE_SIZE)
    }

    val shouldLoadMore by remember {
        derivedStateOf {
            val lastVisibleItem = lazyListState.layoutInfo.visibleItemsInfo.lastOrNull()
            lastVisibleItem != null && lastVisibleItem.index >= displayedCoordinates.size - 2 && !isLoading && displayedCoordinates.size < clusters.size
        }
    }

    LaunchedEffect(shouldLoadMore) {
        if (shouldLoadMore) {
            isLoading = true
            val currentSize = displayedCoordinates.size
            val nextItems = clusters.subList(currentSize, (currentSize + PAGE_SIZE).coerceAtMost(clusters.size))
            displayedCoordinates += nextItems
            isLoading = false
        }
    }

    Box {
        LazyColumn(
            state = lazyListState,
            verticalArrangement = Arrangement.spacedBy(doubleSpacing),
            modifier = Modifier.padding(doubleSpacing)
        ) {
            itemsIndexed(displayedCoordinates, key = { _, coordinate -> coordinate }) { index, coordinate ->

                // Try to get the cluster from the cache first.
                val cluster = clusterCache[coordinate]

                if (cluster != null) {
                    // If the cluster is in the cache, display it immediately.
                    ClusterView(
                        cluster = cluster,
                        index = index + 1,
                        totalCount = clusters.size,
                        useCompactLayout = useCompactLayout,
                        favoriteCoordinates = favoriteCoordinates,
                        likeCount = likeCounts?.value?.get(coordinate),
                        showStarMap = showStarMap,
                        showAsteroidMap = showAsteroidMap,
                        showMniUrl = showMniUrl,
                        showFavoriteIcon = showFavoriteIcon,
                        steamIdToUsernameMap = steamIdToUsernameMap,
                        writeToClipboard = writeToClipboard
                    )

                } else {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp) // A minimal height to hold the space
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.DarkGray.copy(alpha = 0.2f))
                    )

                    LaunchedEffect(coordinate) {
                        try {
                            val newCluster = DefaultWebClient.find(coordinate)
                            // Once fetched, add the cluster to the cache. This will trigger
                            // recomposition for this item, replacing the placeholder.
                            clusterCache = (clusterCache + (coordinate to newCluster)) as Map<String, Cluster>
                        } catch (ignore: CancellationException) {
                        } catch (ex: Throwable) {
                            ex.printStackTrace()
                        }
                    }
                }
            }

            if (isLoading && displayedCoordinates.size < clusters.size) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = doubleSpacing),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
            }
        }

        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(lazyListState),
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
            style = defaultScrollbarStyle().copy(
                unhoverColor = lightGray.copy(alpha = 0.4f),
                hoverColor = lightGray
            )
        )
    }
}
