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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import model.Asteroid
import model.World
import ui.theme.FillSpacer
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import kotlin.math.max

val widthPerWorld: Dp = 380.dp

@Composable
fun WorldView(
    world: World,
    showMapAsteroid: MutableState<Asteroid?>,
    showTooltip: MutableState<Tooltip?>
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(defaultSpacing),
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.surface,
                defaultRoundedCornerShape
            )
    ) {

        CoordinateBox(world.coordinate)

        val asteroid = showMapAsteroid.value

        if (asteroid == null) {

            AsteroidsGrid(
                world,
                showMapAsteroid,
                showTooltip
            )
        }
    }
}

@Composable
private fun AsteroidsGrid(
    world: World,
    showMapAsteroid: MutableState<Asteroid?>,
    showTooltip: MutableState<Tooltip?>
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
                showTooltip = showTooltip,
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
                                showTooltip = showTooltip,
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
