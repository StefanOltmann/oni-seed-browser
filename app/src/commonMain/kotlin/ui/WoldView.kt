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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import model.Asteroid
import model.World
import org.jetbrains.compose.resources.loadSvgPainter
import service.testSvg
import ui.theme.FillSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.hoverColor
import kotlin.math.max

val widthPerWorld: Dp = 380.dp

@Composable
fun WorldView(
    world: World
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(defaultSpacing),
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.surface,
                defaultRoundedCornerShape
            )
    ) {

        val showMapAsteroid = remember { mutableStateOf<Asteroid?>(null) }

        Box {

            CoordinateBox(world.coordinate)

            if (showMapAsteroid.value != null) {

                Box(
                    contentAlignment = Alignment.CenterEnd,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                ) {

                    val hovered = remember { mutableStateOf(false) }

                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = null,
                        tint = if (hovered.value)
                            hoverColor
                        else
                            MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .onHover(hovered)
                            .padding(horizontal = defaultSpacing)
                            .size(40.dp)
                            .noRippleClickable {
                                showMapAsteroid.value = null
                            }
                    )
                }
            }
        }

        if (showMapAsteroid.value == null) {

            AsteroidsGrid(
                world,
                showMapAsteroid
            )

        } else {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .defaultPadding()
                    .fillMaxWidth()
            ) {

                Image(
                    painter = loadSvgPainter(testSvg.encodeToByteArray(), LocalDensity.current),
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
private fun CoordinateBox(
    coordinate: String
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {

        SelectionContainer {

            Text(
                text = coordinate,
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}

@Composable
private fun AsteroidsGrid(
    world: World,
    showMapAsteroid: MutableState<Asteroid?>
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

            val firstAsteroid = world.asteroids.first()

            /* First Asteroid should span the whole column. */
            AsteroidDisplay(
                asteroid = firstAsteroid,
                isStarterAstroid = true,
                showMap = {
                    showMapAsteroid.value = firstAsteroid
                }
            )

            val remainingAsteroids = world.asteroids.drop(1)

            val asteroidsPerColumn = remainingAsteroids.chunked(gridLayoutColumnCount)

            for (asteroidsInColumn in asteroidsPerColumn) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(defaultSpacing)
                ) {

                    for (asteroid in asteroidsInColumn) {

                        Box(
                            modifier = Modifier.weight(1F)
                        ) {

                            AsteroidDisplay(
                                asteroid = asteroid,
                                isStarterAstroid = false,
                                showMap = {
                                    showMapAsteroid.value = asteroid
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
