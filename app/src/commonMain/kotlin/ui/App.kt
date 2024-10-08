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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import kotlinx.serialization.json.Json
import model.Asteroid
import model.World
import model.filter.FilterQuery
import service.DefaultWebClient
import service.sampleWorldsJson
import ui.filter.FilterPanel
import ui.theme.AppTypography
import ui.theme.DefaultSpacer
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

        /* Changes to this state will trigger a call to the API */
        val submitFilterQueryState = remember { mutableStateOf(FilterQuery.ALL) }

        val lazyListState = rememberLazyListState()

        val showMapAsteroid = remember { mutableStateOf<Asteroid?>(null) }

        val showTooltip = remember { mutableStateOf<Tooltip?>(null) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val errorMessage = remember { mutableStateOf<String?>(null) }

        val searchResponse = produceState(emptyList<World>(), submitFilterQueryState.value) {

            if (submitFilterQueryState.value == FilterQuery.ALL) {

                println("Load demo data...")

                val worlds = Json.decodeFromString<List<World>>(sampleWorldsJson)

                value = worlds.sortedBy { it.cluster }

                return@produceState
            }

            println("Searching...")

            isGettingNewResults.value = true

            try {

                errorMessage.value = null

                /* Reset the data */
                value = emptyList()

                value = DefaultWebClient.search(
                    submitFilterQueryState.value
                )

            } catch (ex: Exception) {

                ex.printStackTrace()

                errorMessage.value = ex.stackTraceToString()

            } finally {
                isGettingNewResults.value = false
            }
        }

        val asteroid = showMapAsteroid.value

        if (asteroid != null) {

            Box(
                modifier = Modifier
                    .background(Color.Black)
                    .noRippleClickable {
                        /* Ignore clicks */
                    }
            ) {

                CloseButton(
                    onClick = { showMapAsteroid.value = null }
                )

                Column {

                    CoordinateBox(asteroid.id.displayName)

                    MapView(asteroid)
                }
            }

            return@MaterialTheme
        }

        Box {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
            ) {

                Text(
                    text = "ONI Seed Browser",
                    style = MaterialTheme.typography.displayLarge,
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

                Text(
                    text = "This is a non-functional work-in-progress prototype.",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.error,
                    fontWeight = FontWeight.Bold
                )

                DefaultSpacer()

                FilterPanel(submitFilterQueryState)

                if (isGettingNewResults.value) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.weight(1F)
                    ) {

                        Text(
                            text = "Calling webservice...",
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }

                } else {

                    val worlds = searchResponse.value

                    val worldCount = worlds.size

                    Text(
                        text = "Showing $worldCount worlds",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onBackground
                    )

                    Box(
                        modifier = Modifier.weight(1F)
                    ) {

                        WorldViewList(
                            lazyListState,
                            worlds,
                            showMapAsteroid,
                            showTooltip
                        )
                    }
                }

                Footer()
            }
        }

        val toolTip = showTooltip.value

        if (toolTip != null) {

            Box(
                modifier = Modifier
                    .offset(toolTip.position.x, toolTip.position.y),
                content = toolTip.content
            )
        }
    }
}

