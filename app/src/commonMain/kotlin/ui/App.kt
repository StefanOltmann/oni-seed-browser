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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import model.Asteroid
import model.World
import model.filter.FilterQuery
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.background_space
import org.jetbrains.compose.resources.painterResource
import service.DefaultWebClient
import service.sampleWorldsJson
import ui.filter.FilterPanel
import ui.theme.AppTypography
import ui.theme.HalfSpacer
import ui.theme.appColorScheme
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape

val logoIconHeight = 80.dp

data class Tooltip(
    val position: DpOffset,
    val content: @Composable BoxScope.() -> Unit
)

@Composable
fun App() {

    MaterialTheme(
        colorScheme = appColorScheme,
        typography = AppTypography()
    ) {

        val coroutineScope = rememberCoroutineScope()

        val filterQueryState = remember { mutableStateOf(FilterQuery.ALL) }

        val lazyListState = rememberLazyListState()

        val showStarMap = remember { mutableStateOf<World?>(null) }

        val showAsteroidMap = remember { mutableStateOf<Asteroid?>(null) }

        val showAsteroidDetails = remember { mutableStateOf<Asteroid?>(null) }

        val showTooltip = remember { mutableStateOf<Tooltip?>(null) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val errorMessage = remember { mutableStateOf<String?>(null) }

        LaunchedEffect(filterQueryState.value) {
            /* Reset the details on each search. */
            showAsteroidDetails.value = null
        }

        val worlds = remember { mutableStateOf(emptyList<World>()) }

        LaunchedEffect(true) {

            println("Load demo data...")

            val parsedWorlds = Json.decodeFromString<List<World>>(sampleWorldsJson)

            /* DLCs first */
            worlds.value = parsedWorlds.sortedWith(compareBy({ it.cluster.isBaseGame() }, { it.cluster }))
        }

        val worldForStarMapView = showStarMap.value

        if (worldForStarMapView != null) {

            StarMapView(
                world = worldForStarMapView,
                onCloseClicked = { showStarMap.value = null }
            )

            return@MaterialTheme
        }

        val asteroidForMapView = showAsteroidMap.value

        if (asteroidForMapView != null) {

            AsteroidMapView(
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
                modifier = Modifier.fillMaxSize()
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.background(MaterialTheme.colorScheme.background)
            ) {

                Text(
                    text = "Oxygen Not Included Seed Browser",
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.defaultPadding()
                )

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

                    isGettingNewResults.value = true

                    try {

                        errorMessage.value = null

                        /* Reset the data */
                        worlds.value = emptyList()

                        worlds.value = DefaultWebClient.search(
                            filterQueryState.value
                        )

                    } catch (ex: Exception) {

                        ex.printStackTrace()

                        errorMessage.value = ex.stackTraceToString()

                    } finally {
                        isGettingNewResults.value = false
                    }
                }

                HalfSpacer()

                FilterPanel(
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
                            text = "Searching...",
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onBackground
                        )
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

                                WorldViewList(
                                    lazyListState,
                                    worlds.value,
                                    showStarMap,
                                    showAsteroidMap,
                                    showAsteroidDetails,
                                    showTooltip,
                                    showScrollbar = showAsteroidDetails.value == null
                                )
                            }
                        }

                        showAsteroidDetails.value?.let {
                            AsteroidDetails(it)
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

