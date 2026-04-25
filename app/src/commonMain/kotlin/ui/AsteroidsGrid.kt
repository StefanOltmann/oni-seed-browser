/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
 * https://stefan-oltmann.de
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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.Cluster
import kotlin.math.max
import ui.theme.FillSpacer
import ui.theme.defaultSpacing

@Composable
fun AsteroidsGrid(
    cluster: Cluster,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>
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

            val asteroidsIterator = cluster.asteroids.iterator()

            val firstAsteroid = asteroidsIterator.next()

            AsteroidView(
                asteroid = firstAsteroid,
                isStarterAsteroid = true,
                showMap = {
                    showAsteroidMap.value = cluster to firstAsteroid
                }
            )

            if (asteroidsIterator.hasNext()) {

                val secondAsteroid = asteroidsIterator.next()

                AsteroidView(
                    asteroid = secondAsteroid,
                    isStarterAsteroid = false,
                    showMap = {
                        showAsteroidMap.value = cluster to secondAsteroid
                    }
                )
            }

            val remainingAsteroids = asteroidsIterator.asSequence().toList()

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
                                isStarterAsteroid = false,
                                showMap = {
                                    showAsteroidMap.value = cluster to asteroid
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
