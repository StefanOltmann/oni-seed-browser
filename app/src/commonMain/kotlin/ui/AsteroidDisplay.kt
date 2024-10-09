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
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.times
import model.Asteroid
import model.Geyser
import model.PointOfInterest
import org.jetbrains.compose.resources.painterResource
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfPadding
import ui.theme.halfSpacing
import ui.theme.hoverColor

@Composable
fun AsteroidDisplay(
    asteroid: Asteroid,
    isStarterAstroid: Boolean,
    showTooltip: MutableState<Tooltip?>,
    showMap: () -> Unit
) {

    val canShowMap = asteroid.biomePaths != null

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(
            MaterialTheme.colorScheme.surfaceVariant,
            defaultRoundedCornerShape
        ).border(
            if (isStarterAstroid) 2.dp else 0.dp,
            Color.Black,
            defaultRoundedCornerShape
        ).defaultPadding().fillMaxWidth()
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(124.dp)
                .background(Color.Black, defaultRoundedCornerShape)
        ) {

            Image(
                painter = painterResource(getAsteroidTypeDrawable(asteroid.id)),
                contentDescription = null,
                modifier = Modifier.defaultPadding()
            )

            if (canShowMap) {

                val hovered = remember { mutableStateOf(false) }

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = if (hovered.value)
                        hoverColor
                    else
                        MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .onHover(hovered)
                        .halfPadding()
                        .size(24.dp)
                        .border(
                            1.dp,
                            if (hovered.value)
                                hoverColor
                            else
                                MaterialTheme.colorScheme.onBackground,
                            defaultRoundedCornerShape
                        )
                        .align(Alignment.BottomEnd)
                        .noRippleClickable(showMap)
                )
            }
        }

        DefaultSpacer()

        BoxWithConstraints {

            val maxWidth = maxWidth

            Column(
                horizontalAlignment = Alignment.Start
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(defaultSpacing),
                    modifier = Modifier.height(24.dp)
                ) {

                    Text(
                        text = asteroid.id.displayName,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                    )

                    for (worldTrait in asteroid.worldTraits) {

                        Image(
                            painter = painterResource(getWorldTraitDrawable(worldTrait)),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                HalfSpacer()

                GeysersRow(asteroid.geysers, maxWidth, isStarterAstroid, showTooltip)

                HalfSpacer()

                PointOfInterestsRow(asteroid.pointsOfInterest, maxWidth, isStarterAstroid)
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun GeysersRow(
    geysers: List<Geyser>,
    maxWidth: Dp,
    isStarterAstroid: Boolean,
    showTooltip: MutableState<Tooltip?>
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

            val hovered = remember { mutableStateOf(false) }

            val coordinates = remember { mutableStateOf<LayoutCoordinates?>(null) }

            val posInRoot = coordinates.value?.positionInRoot()

            val density = LocalDensity.current.density

            LaunchedEffect(hovered.value) {

                if (hovered.value && posInRoot != null) {

                    showTooltip.value = Tooltip(
                        position = DpOffset(
                            posInRoot.x.dp.div(density).plus(24.dp),
                            posInRoot.y.dp.div(density).plus(24.dp)
                        ),
                        content = {

                            GeyserCountAndName(geyserType, count)
                        }
                    )
                }

                if (!hovered.value)
                    showTooltip.value = null
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        MaterialTheme.colorScheme.surface,
                        CircleShape
                    )
                    .border(
                        if (hovered.value) 2.dp else 1.dp,
                        Color.Black,
                        CircleShape
                    )
                    .onPlaced {
                        coordinates.value = it
                    }
                    .onHover(hovered)
            ) {

                Image(
                    painter = painterResource(getGeyserDrawable(geyserType)),
                    contentDescription = null,
                    alignment = Alignment.BottomCenter,
                    modifier = Modifier.padding()
                )

                if (count > 1) {

                    Text(
                        text = "$count",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.offset(y = 12.dp)
                    )
                }
            }
        }

        if (isStarterAstroid)
            FillSpacer()
    }
}

@Composable
private fun PointOfInterestsRow(
    pointsOfInterest: List<PointOfInterest>,
    maxWidth: Dp,
    isStarterAstroid: Boolean
) {

    if (pointsOfInterest.isEmpty()) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(48.dp)
        ) {

            DoubleSpacer()

            Text(
                text = "No POIs",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5F)
            )

            DoubleSpacer()
        }

        return
    }

    val poisByTypeMap = pointsOfInterest.groupBy { it.id }

    val sortedPoiTypes = poisByTypeMap.keys.sorted()

    val spacingPerPoi = min(
        (maxWidth - sortedPoiTypes.size.times(48.dp)) / (sortedPoiTypes.size - 1),
        halfSpacing
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(spacingPerPoi),
        modifier = Modifier.height(48.dp)
    ) {

        for (poiType in sortedPoiTypes) {

            val count = poisByTypeMap[poiType]!!.size

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        MaterialTheme.colorScheme.surface,
                        CircleShape
                    )
                    .border(
                        1.dp,
                        Color.Black,
                        CircleShape
                    )
            ) {

                Image(
                    painter = painterResource(getPointOfInterestDrawable(poiType)),
                    contentDescription = null,
                    modifier = Modifier.padding(defaultSpacing)
                )

                if (count > 1) {

                    Text(
                        text = "$count",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.offset(y = 12.dp)
                    )
                }
            }
        }

        if (isStarterAstroid)
            FillSpacer()
    }
}
