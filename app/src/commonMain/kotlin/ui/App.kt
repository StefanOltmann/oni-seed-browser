/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import model.Asteroid
import model.Cluster
import model.filter.FilterQuery
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.background_space
import oni_seed_browser.app.generated.resources.uiNoResults
import oni_seed_browser.app.generated.resources.uiSearching
import oni_seed_browser.app.generated.resources.uiTitle
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
import service.sampleWorldsJson
import ui.filter.FilterPanel
import ui.theme.AppTypography
import ui.theme.DoubleSpacer
import ui.theme.HalfSpacer
import ui.theme.appColorScheme
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape

const val ORIGINAL_URL = "https://stefan-oltmann.de/oni-seed-browser/#"
const val MNI_URL = "https://mapsnotincluded.org/map-explorer/"

val logoIconHeight = 80.dp

data class Tooltip(
    val position: DpOffset,
    val content: @Composable BoxScope.() -> Unit
)

@Composable
fun App(
    urlHash: State<String?>,
    isMniEmbedded: State<Boolean>
) {

    MaterialTheme(
        colorScheme = appColorScheme,
        typography = AppTypography()
    ) {

        val screenIsToSmall = remember { mutableStateOf(false) }

        val density = LocalDensity.current.density

        val errorMessage = remember { mutableStateOf<String?>(null) }

        Box(
            modifier = Modifier.onSizeChanged {
                screenIsToSmall.value = it.width / density < 800 || it.height / density < 300
            }
        ) {

            /*
             * Prevent people from seeing a broken layout.
             */
            if (screenIsToSmall.value) {

                SmallScreenWarning()

                return@MaterialTheme
            }

            val worldCount = produceState<Long?>(null) {

                try {

                    value = DefaultWebClient.countSeeds()

                } catch (ex: Exception) {

                    /* We MUST catch here to prevent UI freezes. */

                    ex.printStackTrace()

                    errorMessage.value = ex.stackTraceToString()
                }
            }

            val coroutineScope = rememberCoroutineScope()

            val filterQueryState = remember { mutableStateOf(FilterQuery.ALL) }

            val lazyListState = rememberLazyListState()

            val showStarMap = remember { mutableStateOf<Cluster?>(null) }

            val showAsteroidMap = remember { mutableStateOf<Asteroid?>(null) }

            val showAsteroidDetails = remember { mutableStateOf<Asteroid?>(null) }

            val showTooltip = remember { mutableStateOf<Tooltip?>(null) }

            val isGettingNewResults = remember { mutableStateOf(false) }

            LaunchedEffect(filterQueryState.value) {
                /* Reset the details on each search. */
                showAsteroidDetails.value = null
            }

            val clusters = remember { mutableStateOf(emptyList<Cluster>()) }

            LaunchedEffect(urlHash.value) {

                val urlHashValue = urlHash.value

                if (urlHashValue != null) {

                    println("Load specific coordinate: $urlHashValue")

                    try {

                        isGettingNewResults.value = true

                        val world = DefaultWebClient.find(urlHashValue)

                        if (world != null)
                            clusters.value = listOf(world)
                        else
                            clusters.value = emptyList()

                    } catch (ex: Exception) {

                        /* We MUST catch here to prevent UI freezes. */

                        ex.printStackTrace()

                        errorMessage.value = ex.stackTraceToString()

                    } finally {
                        isGettingNewResults.value = false
                    }

                } else {

                    println("Load demo data...")

                    val parsedClusters = Json.decodeFromString<List<Cluster>>(sampleWorldsJson)

                    /* DLCs first */
                    clusters.value = parsedClusters.sortedWith(compareBy({ it.cluster.isBaseGame() }, { it.cluster }))
                }
            }

            val worldForStarMapView = showStarMap.value

            if (worldForStarMapView != null) {

                StarMapView(
                    cluster = worldForStarMapView,
                    onCloseClicked = { showStarMap.value = null }
                )

                return@MaterialTheme
            }

            val asteroidForMapView = showAsteroidMap.value

            if (asteroidForMapView != null) {

                AsteroidMapPopup(
                    asteroid = asteroidForMapView,
                    onCloseClicked = { showAsteroidMap.value = null }
                )

                return@MaterialTheme
            }

            Box {

                /* Background */
                Image(
                    painter = painterResource(Res.drawable.background_space),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        /* Avoid white background while the image loads. */
                        .background(Color(0xFF181828))
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.background(MaterialTheme.colorScheme.background)
                ) {

                    if (!isMniEmbedded.value) {

                        Text(
                            text = stringResource(Res.string.uiTitle),
                            style = MaterialTheme.typography.displayMedium,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.defaultPadding()
                        )

                    } else {

                        DoubleSpacer()
                    }

                    errorMessage.value?.let {

                        Column(
                            modifier = Modifier
                                .defaultPadding()
                                .height(128.dp)
                                .verticalScroll(rememberScrollState())
                                .background(
                                    MaterialTheme.colorScheme.errorContainer,
                                    defaultRoundedCornerShape
                                )
                        ) {

                            Text(
                                text = it,
                                style = MaterialTheme.typography.headlineSmall,
                                color = MaterialTheme.colorScheme.onErrorContainer,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }

                    val search: suspend () -> Unit = {

                        println("Searching...")

                        try {

                            isGettingNewResults.value = true

                            errorMessage.value = null

                            /* Reset the data */
                            clusters.value = emptyList()

                            val searchResultWorlds = DefaultWebClient.search(
                                filterQueryState.value
                            )

                            val sortedWorlds = searchResultWorlds.sortedByDescending { it.getRating() }

                            clusters.value = sortedWorlds

                        } catch (ex: Exception) {

                            ex.printStackTrace()

                            errorMessage.value = ex.stackTraceToString()

                        } finally {
                            isGettingNewResults.value = false
                        }
                    }

                    HalfSpacer()

                    FilterPanel(
                        worldCount = worldCount.value,
                        filterQueryState = filterQueryState,
                        onSearchButtonPressed = {
                            coroutineScope.launch { search() }
                        }
                    )

                    if (isGettingNewResults.value) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.weight(1F)
                        ) {

                            Text(
                                text = stringResource(Res.string.uiSearching),
                                style = MaterialTheme.typography.headlineSmall,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }

                    } else if (clusters.value.isEmpty()) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.weight(1F)
                        ) {

                            if (urlHash.value == null) {

                                Text(
                                    text = stringResource(Res.string.uiNoResults),
                                    style = MaterialTheme.typography.headlineSmall,
                                    color = MaterialTheme.colorScheme.onBackground
                                )

                            } else {

                                Text(
                                    text = "Coordinate ${urlHash.value} was not found in database.",
                                    style = MaterialTheme.typography.headlineSmall,
                                    color = MaterialTheme.colorScheme.onBackground
                                )
                            }
                        }

                    } else {

                        Row(
                            modifier = Modifier.weight(1F)
                        ) {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1F)
                            ) {

                                Box(
                                    modifier = Modifier.weight(1F)
                                ) {

                                    ClusterViewList(
                                        lazyListState,
                                        clusters.value,
                                        showStarMap,
                                        showAsteroidMap,
                                        showAsteroidDetails,
                                        showTooltip,
                                        showScrollbar = showAsteroidDetails.value == null,
                                        showMniUrl = isMniEmbedded.value
                                    )
                                }
                            }

                            val asteroidForDetails = showAsteroidDetails.value

                            AnimatedVisibility(
                                visible = asteroidForDetails != null
                            ) {

                                /* Will be NULL on closing. */
                                if (asteroidForDetails != null) {

                                    AsteroidDetails(
                                        asteroid = asteroidForDetails,
                                        showAsteroidMap = {
                                            showAsteroidMap.value = asteroidForDetails
                                        }
                                    )

                                } else {

                                    /*
                                     * Placeholder box to ensure smooth animation.
                                     */
                                    Box(
                                        modifier = Modifier
                                            .width(300.dp)
                                            .fillMaxHeight()
                                    )
                                }
                            }
                        }

                        Footer()
                    }
                }

                val toolTip = showTooltip.value

                if (toolTip != null) {

                    Box(
                        modifier = Modifier.offset(toolTip.position.x, toolTip.position.y),
                        content = toolTip.content
                    )
                }
            }
        }
    }
}

@Composable
private fun SmallScreenWarning() {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        /* Background */
        Image(
            painter = painterResource(Res.drawable.background_space),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                /* Avoid white background while the image loads. */
                .background(Color(0xFF181828))
        )

        Text(
            text = "Sorry, this app is not yet optimized for small screens.",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.defaultPadding()
        )
    }
}
