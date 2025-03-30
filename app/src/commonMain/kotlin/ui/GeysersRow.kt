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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.times
import model.Geyser
import org.jetbrains.compose.resources.painterResource
import ui.theme.FillSpacer
import ui.theme.anthracite
import ui.theme.gray3
import ui.theme.halfSpacing

@Composable
fun GeysersRow(
    geysers: List<Geyser>,
    maxWidth: Dp,
    isStarterAstroid: Boolean
) {

    val geyserByTypeMap = geysers.groupBy { it.id }

    val sortedGeyserTypes = geyserByTypeMap.keys.sorted()

    val spacingPerGeyser = min(
        (maxWidth - sortedGeyserTypes.size.times(48.dp)) / (sortedGeyserTypes.size - 1),
        halfSpacing
    )

    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.spacedBy(spacingPerGeyser),
        modifier = Modifier.height(48.dp)
    ) {

        for (geyserType in sortedGeyserTypes) {

            val count = geyserByTypeMap[geyserType]!!.size

            TooltipContainer(
                tooltipContent = { GeyserTooltip(geyserType, count) },
                yOffset = -5
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            if (geyserType.rating.isNegative())
                                geyserType.rating.color.copy(alpha = 0.1F)
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

                    Image(
                        painter = painterResource(getGeyserDrawable(geyserType)),
                        contentDescription = null,
                        alignment = Alignment.BottomCenter,
                        modifier = Modifier.padding()
                    )

                    if (count > 1) {

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
                                text = "$count",
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

        if (isStarterAstroid)
            FillSpacer()
    }
}
