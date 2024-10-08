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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import model.Asteroid
import org.jetbrains.compose.resources.loadSvgPainter
import org.jetbrains.compose.resources.painterResource
import service.testSvg
import ui.theme.defaultPadding

@Composable
fun MapView(
    asteroid: Asteroid
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .defaultPadding()
            .fillMaxWidth()
    ) {

        BoxWithConstraints {

            val density = LocalDensity.current

            val maxHeightInPixels = maxHeight.div(density.density).value

            val scale = maxHeightInPixels / asteroid.sizeY

            Image(
                painter = loadSvgPainter(testSvg.encodeToByteArray(), density),
                contentDescription = null,
                modifier = Modifier.fillMaxHeight()
            )

            for (poi in asteroid.pointsOfInterest) {

                Image(
                    painter = painterResource(getPointOfInterestDrawable(poi.id)),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(
                            x = poi.posX.dp.times(density.density).times(scale),
                            y = poi.posY.dp.times(density.density).times(scale)
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
                            x = geyser.posX.dp.times(density.density).times(scale),
                            y = geyser.posY.dp.times(density.density).times(scale)
                        )
                        .size(32.dp)
                )
            }
        }
    }
}
