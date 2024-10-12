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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import model.World
import ui.theme.defaultPadding
import ui.theme.lightGray
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

private const val GRID_RADIUS = 12
private const val ROTATION_RADIANS = (30f * PI / 180).toFloat()

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

            BoxWithConstraints(
                contentAlignment = Alignment.Center,
                modifier = Modifier.defaultPadding().fillMaxSize()
            ) {

                HexagonalGrid()
            }
        }
    }
}

@Composable
private fun HexagonalGrid() {

    Canvas(modifier = Modifier.fillMaxSize().border(1.dp, Color.Red)) {

        val hexSize = minOf(size.width, size.height) / (GRID_RADIUS * 3.2f)

        val hexHeight = (hexSize * 2 * (cos(PI / 6))).toFloat()

        for (q in -GRID_RADIUS..GRID_RADIUS) {

            val r1 = maxOf(-GRID_RADIUS, -q - GRID_RADIUS)
            val r2 = minOf(GRID_RADIUS, -q + GRID_RADIUS)

            for (r in r1..r2) {

                val x = size.width / 2 +
                    (hexSize * 3 / 2 * q * cos(ROTATION_RADIANS) -
                        hexHeight * (r + q / 2f) * sin(ROTATION_RADIANS))

                val y = size.height / 2 +
                    (hexSize * 3 / 2 * q * sin(ROTATION_RADIANS) +
                        hexHeight * (r + q / 2f) * cos(ROTATION_RADIANS))

                val path = Path()

                for (pointIndex in 0..5) {

                    val angle = (PI / 3 * pointIndex).toFloat() + ROTATION_RADIANS

                    val pointX = x + hexSize * cos(angle)
                    val pointY = y + hexSize * sin(angle)

                    if (pointIndex == 0)
                        path.moveTo(pointX, pointY)
                    else
                        path.lineTo(pointX, pointY)
                }

                path.close()

                drawPath(path, lightGray, style = Stroke(width = 1f))
            }
        }
    }
}


