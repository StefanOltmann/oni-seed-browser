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

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.VerticalScrollbar
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.coroutines.cancellation.CancellationException
import model.Asteroid
import model.Cluster
import service.DefaultWebClient
import ui.theme.doubleSpacing
import ui.theme.lightGray

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

    Box {

        LazyColumn(
            state = lazyListState,
            verticalArrangement = Arrangement.spacedBy(doubleSpacing),
            modifier = Modifier.padding(doubleSpacing)
        ) {

            itemsIndexed(clusters) { index, coordinate ->

                val clusterState = produceState<Cluster?>(initialValue = null) {

                    try {

                        value = DefaultWebClient.find(coordinate)

                    } catch (ignore: CancellationException) {

                        /* User scrolled fast. That's fine. */

                    } catch (ex: Throwable) {

                        /* We MUST catch Throwable here to prevent UI freezes. */

                        ex.printStackTrace()
                    }
                }

                val cluster = clusterState.value

                Box(
                    /* This makes the transition from placeholder to content smoother. */
                    modifier = Modifier.animateContentSize()
                ) {

                    if (cluster == null) {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(1000.dp)
                        )

                    } else {

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
