/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

package ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import kotlinx.coroutines.launch
import model.Asteroid
import model.Cluster
import ui.theme.doubleSpacing
import ui.theme.lightGray
import web.registerOrUpdateClusterViewList

@Composable
fun ClusterViewList(
    lazyListState: LazyListState,
    clusters: List<Cluster>,
    useCompactLayout: Boolean,
    favoriteCoordinates: MutableState<List<String>>,
    likeCounts: MutableState<Map<String, Int>?>?,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Asteroid?>,
    showMniUrl: Boolean = false,
    showFavoriteIcon: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    Box {
        val scrollState = rememberLazyListState()
        val coroutineScope = rememberCoroutineScope()

        LazyColumn(
            state = lazyListState,
            verticalArrangement = Arrangement.spacedBy(doubleSpacing),
            modifier = Modifier.padding(doubleSpacing)
                .onGloballyPositioned { coordinates ->
                    val pos = coordinates.positionInWindow()
                    val size = coordinates.size

                    val bounds = Rect(
                        pos.x,
                        pos.y,
                        pos.x + size.width,
                        pos.y + size.height
                    )
                    registerOrUpdateClusterViewList(0, bounds)
                }.draggable(
                    // https://stackoverflow.com/a/70780175
                    orientation = Orientation.Vertical,
                    state = rememberDraggableState { delta ->
                        coroutineScope.launch {
                            scrollState.scrollBy(-delta)
                        }
                    },
                )
        ) {

            itemsIndexed(clusters) { index, cluster ->

                ClusterView(
                    cluster = cluster,
                    index = index + 1,
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
