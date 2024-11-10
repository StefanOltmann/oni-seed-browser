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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import model.AsteroidType
import model.Cluster
import model.SpacedOutSpacePOI
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.background_space
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.theme.defaultPadding
import ui.theme.defaultSpacing
import ui.theme.halfSpacing
import ui.theme.lightGray

private const val ROTATION_RADIANS = (30f * PI / 180).toFloat()

private val gridColor = lightGray.copy(alpha = 0.2f)
private val pathStroke = Stroke(1f)

@Composable
fun SpacedOutStarMapView(
    cluster: Cluster,
    onCloseClicked: () -> Unit,
    writeToClipboard: (String) -> Unit
) {

    if (cluster.starMapEntriesSpacedOut == null)
        return

    Box(
        modifier = Modifier
            .background(Color.Black)
            .noRippleClickable {
                /* Ignore clicks */
            }
    ) {

        /* Background */
        Image(
            painter = painterResource(Res.drawable.background_space),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        CloseButton(
            onClick = onCloseClicked
        )

        Column {

            CoordinateBox(
                index = 0,
                totalCount = 0,
                coordinate = cluster.coordinate,
                showMapClicked = null,
                writeToClipboard = writeToClipboard
            )

            BoxWithConstraints(
                contentAlignment = Alignment.Center,
                modifier = Modifier.defaultPadding().fillMaxSize()
            ) {

                val clusterType = cluster.cluster
                val radius = clusterType.starmapRadius - 1


                HexagonalGrid(radius)


                val hexSize =
                    minOf(maxWidth.value, maxHeight.value) / (radius * 3.2f)
                val bufferDistance = 0 //some distance between hexes optionally

                val rStep = (hexSize) * sqrt(3f) + bufferDistance
                val qStep = (3f / 2f) * (hexSize + bufferDistance)


                for (entry in cluster.starMapEntriesSpacedOut) {


                    val xOffset = entry.r * rStep + (0.5f * entry.q * rStep)

                    val yOffset = entry.q * qStep

                    Box(
                        modifier = Modifier
                            .offset(
                                x = xOffset.dp,
                                y = yOffset.dp
                            )
                            .size(hexSize.times(LocalDensity.current.density).dp)
                    ) {

                        val asteroidType = AsteroidType.entries.find { it.name == entry.id }

                        val spacedOutSpacePOI = if (asteroidType == null)
                            SpacedOutSpacePOI.entries.find { it.name == entry.id }
                        else
                            null

                        if (asteroidType != null) {

                            TooltipContainer(
                                tooltipContent = {
                                    GenericTooltip {
                                        Text(
                                            text = stringResource(asteroidType.stringResource),
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = MaterialTheme.colorScheme.onBackground,
                                            lineHeight = 0.sp,
                                            modifier = Modifier.padding(
                                                horizontal = defaultSpacing,
                                                vertical = halfSpacing
                                            )
                                        )
                                    }
                                },
                                yOffset = 20
                            ) {

                                Image(
                                    painter = painterResource(getAsteroidTypeDrawable(asteroidType)),
                                    contentDescription = null,
                                    modifier = Modifier.scale(1.5f)
                                )
                            }

                        } else if (spacedOutSpacePOI != null) {

                            TooltipContainer(
                                tooltipContent = {
                                    GenericTooltip {
                                        Text(
                                            text = stringResource(spacedOutSpacePOI.stringResource),
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = MaterialTheme.colorScheme.onBackground,
                                            lineHeight = 0.sp,
                                            modifier = Modifier.padding(
                                                horizontal = defaultSpacing,
                                                vertical = halfSpacing
                                            )
                                        )
                                    }
                                },
                                yOffset = 20
                            ) {

                                Image(
                                    painter = painterResource(getSpacedOutSpacePOIDrawable(spacedOutSpacePOI)),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun HexagonalGrid(radius:Int) {

    Canvas(modifier = Modifier.fillMaxSize()) {

        val hexSize = minOf(size.width, size.height) / (radius * 3.2f)

        val hexHeight = (hexSize * 2 * (cos(PI / 6))).toFloat()

        for (q in -radius..radius) {

            val r1 = maxOf(-radius, -q - radius)
            val r2 = minOf(radius, -q + radius)

            for (r in r1..r2) {

                val x = size.width / 2 + hexSize * 3 / 2 * q * cos(ROTATION_RADIANS) -
                    hexHeight * (r + q / 2f) * sin(ROTATION_RADIANS)

                val y = size.height / 2 + hexSize * 3 / 2 * q * sin(ROTATION_RADIANS) +
                    hexHeight * (r + q / 2f) * cos(ROTATION_RADIANS)

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

                drawPath(path, gridColor, style = pathStroke)
            }
        }
    }
}
