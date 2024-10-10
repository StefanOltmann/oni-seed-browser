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

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import model.Asteroid
import model.BiomePaths
import org.jetbrains.compose.resources.painterResource
import ui.theme.defaultPadding

@Composable
fun MapView(
    asteroid: Asteroid
) {

    if (asteroid.biomePaths == null)
        return

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.defaultPadding()
    ) {

        BoxWithConstraints(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {

            val density = LocalDensity.current.density

            val maxHeightInPixels = maxHeight.value

            val viewScale = maxHeightInPixels / asteroid.sizeY

            val biomePaths = BiomePaths.parse(asteroid.biomePaths)

            Canvas(
                modifier = Modifier
                    .size(
                        width = (asteroid.sizeX * viewScale).dp,
                        height = (asteroid.sizeY * viewScale).dp,
                    )
            ) {

                for ((zoneType, pointsLists) in biomePaths.polygonMap) {

                    for (points in pointsLists) {

                        val path = Path()

                        val startingPoint = points.first()

                        path.moveTo(
                            startingPoint.x * viewScale * density,
                            startingPoint.y * viewScale * density
                        )

                        for (point in points.drop(1)) {

                            path.lineTo(
                                point.x * viewScale * density,
                                point.y * viewScale * density
                            )
                        }

                        path.lineTo(
                            startingPoint.x * viewScale * density,
                            startingPoint.y * viewScale * density
                        )

                        drawPath(path, zoneType.color)
                    }
                }
            }

            Box(
                modifier = Modifier
                    .size(
                        width = (asteroid.sizeX * viewScale).dp,
                        height = (asteroid.sizeY * viewScale).dp,
                    )
            ) {

                for (poi in asteroid.pointsOfInterest) {

                    Image(
                        painter = painterResource(getPointOfInterestDrawable(poi.id)),
                        contentDescription = null,
                        modifier = Modifier
                            .offset(
                                x = (poi.x * viewScale).dp.minus(16.dp),
                                y = (poi.y * viewScale).dp.minus(16.dp)
                            )
                            .size(32.dp)
                    )
                }

                for (geyser in asteroid.geysers) {

                    Image(
                        painter = painterResource(getGeyserDrawable(geyser.id)),
                        contentDescription = null,
                        modifier = Modifier
                            .offset(
                                x = (geyser.x * viewScale).dp.minus(16.dp),
                                y = (geyser.y * viewScale).dp.minus(16.dp)
                            )
                            .size(32.dp)
                    )
                }
            }
        }
    }
}
