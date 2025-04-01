/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.times
import model.Geyser
import model.GeyserType
import org.jetbrains.compose.resources.painterResource
import ui.theme.FillSpacer
import ui.theme.anthracite
import ui.theme.gray3
import ui.theme.halfPadding
import ui.theme.halfSpacing

val badRatingBackground = Color(0xFF43383E)

/**
 * Good geysers are at least average
 */
const val GOOD_AVG_EMIT_RATE_THRESHOLD = 0.5F

/**
 * Bad geysers are in the lowest third.
 */
const val MEDIUM_AVG_EMIT_RATE_THRESHOLD = 0.33F

val goodAvgEmitRateColor = Color.Green
val mediumAvgEmitRateColor = Color.Yellow
val badAvgEmitRateColor = Color(0xFFffa192) // lighter red

@Composable
fun GeysersRow(
    geysers: List<Geyser>,
    maxWidth: Dp,
    isStarterAsteroid: Boolean
) {

    val sortedGeysers = geysers.sortedBy { it.id }

    val sortedGeysersWithoutOilWells = sortedGeysers.filterNot { it.id == GeyserType.OIL_RESERVOIR }

    val oilWellCount = sortedGeysers.size - sortedGeysersWithoutOilWells.size

    val geyserCount = sortedGeysersWithoutOilWells.size + oilWellCount.coerceIn(0, 1)

    val spacingPerGeyser = min(
        (maxWidth - geyserCount.times(48.dp)) / (geyserCount - 1),
        halfSpacing
    )

    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.spacedBy(spacingPerGeyser),
        modifier = Modifier.height(48.dp)
    ) {

        for (geyser in sortedGeysersWithoutOilWells) {

            TooltipContainer(
                tooltipContent = { GeyserTooltip(geyser.id, 1, geyser.avgEmitRate) },
                yOffset = 16
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            if (geyser.id.rating.isNegative())
                                badRatingBackground
                            else
                                gray3,
                            CircleShape
                        )
                        .border(
                            1.dp,
                            anthracite,
                            CircleShape
                        )
                ) {

                    /*
                     * For good geysers, show the amount in they produce
                     * with a circular progress indicator.
                     */
                    if (!geyser.id.rating.isNegative())
                        AvgEmitRateRatingIndicator(geyser)

                    Image(
                        painter = painterResource(getGeyserDrawable(geyser.id)),
                        contentDescription = null,
                        alignment = Alignment.BottomCenter,
                        modifier = Modifier.halfPadding()
                    )
                }
            }
        }

        if (oilWellCount > 0) {

            TooltipContainer(
                tooltipContent = { GeyserTooltip(GeyserType.OIL_RESERVOIR, oilWellCount, 3333) },
                yOffset = -5
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            gray3,
                            CircleShape
                        )
                        .border(
                            1.dp,
                            anthracite,
                            CircleShape
                        )
                ) {

                    Image(
                        painter = painterResource(getGeyserDrawable(GeyserType.OIL_RESERVOIR)),
                        contentDescription = null,
                        alignment = Alignment.BottomCenter,
                        modifier = Modifier.halfPadding()
                    )

                    if (oilWellCount > 1) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(20.dp)
                                .offset(y = 14.dp)
                                .background(
                                    countBackground,
                                    CircleShape
                                )
                        ) {

                            Text(
                                text = "$oilWellCount",
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.offset(y = -4.dp)
                            )
                        }
                    }
                }
            }
        }

        if (isStarterAsteroid)
            FillSpacer()
    }
}

fun getAvgEmitRateRatingColor(avgEmitRateRating: Float): Color =
    if (avgEmitRateRating >= GOOD_AVG_EMIT_RATE_THRESHOLD)
        goodAvgEmitRateColor
    else if (avgEmitRateRating >= MEDIUM_AVG_EMIT_RATE_THRESHOLD)
        mediumAvgEmitRateColor
    else
        badAvgEmitRateColor

@Composable
fun AvgEmitRateRatingIndicator(geyser: Geyser) {

    if (geyser.id == GeyserType.OIL_RESERVOIR)
        return

    CircularProgressIndicator(
        progress = { geyser.avgEmitRateRating },
        modifier = Modifier.fillMaxSize(),
        color = getAvgEmitRateRatingColor(geyser.avgEmitRateRating).copy(alpha = 0.6F),
        gapSize = 0.dp
    )
}
