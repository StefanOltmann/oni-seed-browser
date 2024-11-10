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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.max
import kotlinx.coroutines.delay
import model.Asteroid
import model.Cluster
import ui.icons.ContentCopy
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.anthraticeTransparentBackgroundColor
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfSpacing
import ui.theme.hoverColor
import ui.theme.lightGrayTransparentBorderColor

val widthPerWorld: Dp = 380.dp

@Composable
fun ClusterView(
    cluster: Cluster,
    index: Int,
    totalCount: Int,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Asteroid?>,
    showAsteroidDetails: MutableState<Asteroid?>,
    showMniUrl: Boolean,
    writeToClipboard: (String) -> Unit
) {

    Column(
        modifier = Modifier
            .background(anthraticeTransparentBackgroundColor, defaultRoundedCornerShape)
            .border(0.dp, lightGrayTransparentBorderColor, defaultRoundedCornerShape)
    ) {

        CoordinateBox(
            index = index,
            totalCount = totalCount,
            coordinate = cluster.coordinate,
            showMapClicked = { showStarMap.value = cluster },
            writeToClipboard = writeToClipboard
        )

        HalfSpacer()

        val asteroid = showAsteroidMap.value

        if (asteroid == null) {

            AsteroidsGrid(
                cluster,
                showAsteroidMap,
                showAsteroidDetails
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.offset(y = -4.dp)
        ) {

            val urlWasCopied = remember { mutableStateOf(false) }

            /*
             * Set notice back after 3 seconds.
             */
            LaunchedEffect(urlWasCopied.value) {

                if (!urlWasCopied.value)
                    return@LaunchedEffect

                delay(1000)

                urlWasCopied.value = false
            }

            val clipboardManager = LocalClipboardManager.current

            val url = if (showMniUrl)
                MNI_URL + cluster.coordinate
            else
                ORIGINAL_URL + cluster.coordinate

            Spacer(modifier = Modifier.width(defaultSpacing + halfSpacing))

            SelectionContainer {

                Text(
                    text = url,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            DefaultSpacer()

            val hovered = remember { mutableStateOf(false) }

            Icon(
                imageVector = ContentCopy,
                contentDescription = null,
                tint = if (hovered.value)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .onHover(hovered)
                    .size(16.dp)
                    .noRippleClickable {

                        clipboardManager.setText(AnnotatedString(url))

                        urlWasCopied.value = true
                    }
            )

            if (urlWasCopied.value) {

                DefaultSpacer()

                Text(
                    text = "Copied to clipboard!",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

        HalfSpacer()
    }
}

@Composable
private fun AsteroidsGrid(
    cluster: Cluster,
    showAsteroidMap: MutableState<Asteroid?>,
    showAsteroidDetails: MutableState<Asteroid?>
) {

    BoxWithConstraints(
        modifier = Modifier.padding(
            start = defaultSpacing,
            end = defaultSpacing,
            bottom = defaultSpacing
        )
    ) {

        val gridLayoutColumnCount = max(
            maxWidth.div(widthPerWorld).toInt(),
            1
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(defaultSpacing)
        ) {

            val firstAsteroid = cluster.asteroids.first()

            /* First Asteroid should span the whole column. */
            AsteroidView(
                asteroid = firstAsteroid,
                isStarterAstroid = true,
                isSelected = showAsteroidDetails.value == firstAsteroid,
                showDetails = {

                    if (showAsteroidDetails.value == firstAsteroid)
                        showAsteroidDetails.value = null
                    else
                        showAsteroidDetails.value = firstAsteroid
                },
                showMap = {
                    showAsteroidMap.value = firstAsteroid
                }
            )

            val remainingAsteroids = cluster.asteroids.drop(1)

            val asteroidsPerColumn = remainingAsteroids.chunked(gridLayoutColumnCount)

            for (asteroidsInColumn in asteroidsPerColumn) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(defaultSpacing)
                ) {

                    for (asteroid in asteroidsInColumn) {

                        Box(
                            modifier = Modifier.weight(1F)
                        ) {

                            AsteroidView(
                                asteroid = asteroid,
                                isStarterAstroid = false,
                                isSelected = showAsteroidDetails.value == asteroid,
                                showDetails = {

                                    if (showAsteroidDetails.value == asteroid)
                                        showAsteroidDetails.value = null
                                    else
                                        showAsteroidDetails.value = asteroid
                                },
                                showMap = {
                                    showAsteroidMap.value = asteroid
                                }
                            )
                        }
                    }

                    val requiredSpacerCount = gridLayoutColumnCount - asteroidsInColumn.size

                    repeat(requiredSpacerCount) {
                        FillSpacer()
                    }
                }
            }
        }
    }
}
