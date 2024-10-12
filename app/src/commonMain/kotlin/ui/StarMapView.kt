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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import model.World
import ui.theme.defaultPadding

@Composable
fun StarMapView(
    world: World,
    onCloseClicked: () -> Unit
) {

    Box(
        modifier = Modifier
            .background(Color.Black)
            .noRippleClickable {
                /* Ignore clicks */
            }
    ) {

        CloseButton(
            onClick = onCloseClicked
        )

        Column {

            CoordinateBox(
                coordinate = world.coordinate,
                showMapClicked = null
            )

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.defaultPadding()
            ) {

                BoxWithConstraints(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {

                    val density = LocalDensity.current.density


                    Canvas(
                        modifier = Modifier.fillMaxSize()
                    ) {

                        drawLine(Color.Red, Offset(0f, 0f), Offset(size.width, size.height))

                    }
                }
            }
        }
    }
}
