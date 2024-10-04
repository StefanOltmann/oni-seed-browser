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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import model.World
import ui.theme.FillSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import kotlin.math.max

@Composable
fun WorldView(
    world: World
) {

    BoxWithConstraints(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface, defaultRoundedCornerShape)
    ) {

        val gridLayoutColumnCount = max(
            maxWidth.div(400.dp).toInt(),
            1
        )

        Column(
            modifier = Modifier.defaultPadding(),
            verticalArrangement = Arrangement.spacedBy(defaultSpacing)
        ) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {

                SelectionContainer {

                    Text(
                        text = world.coordinate,
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }
            }

            val firstAsteroid = world.asteroids.first()

            /* First Asteroid should span the whole column. */
            AsteroidDisplay(
                asteroid = firstAsteroid,
                isStarterAstroid = true
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
                                isStarterAstroid = false
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
