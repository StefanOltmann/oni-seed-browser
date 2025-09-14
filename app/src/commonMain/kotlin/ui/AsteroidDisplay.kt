/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.WorldTrait
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.model.stringResource
import ui.theme.DefaultSpacer
import ui.theme.HalfSpacer
import ui.theme.anthraticeTransparentBackgroundColor
import ui.theme.cardColorBackground
import ui.theme.cardPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfPadding
import ui.theme.halfSpacing
import ui.theme.lightGrayTransparentBorderColor
import ui.theme.minimalRoundedCornerShape
import ui.theme.primaryAccent

val countBackground = Color.Black.copy(alpha = 0.3F)

@Composable
fun AsteroidView(
    asteroid: Asteroid,
    isStarterAsteroid: Boolean,
    showMap: () -> Unit
) {

    val cardHovered = remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .onHover(cardHovered)
            .shadow(
                elevation = if (cardHovered.value) 8.dp else 3.dp,
                shape = defaultRoundedCornerShape,
                ambientColor = if (isStarterAsteroid) primaryAccent.copy(alpha = 0.2f) else Color.Black.copy(alpha = 0.3f)
            )
            .background(
                Brush.horizontalGradient(
                    colors = if (isStarterAsteroid) {
                        listOf(
                            cardColorBackground.copy(alpha = 0.9f),
                            primaryAccent.copy(alpha = 0.1f)
                        )
                    } else {
                        listOf(
                            cardColorBackground.copy(alpha = 0.8f),
                            cardColorBackground.copy(alpha = 0.6f)
                        )
                    }
                ),
                defaultRoundedCornerShape
            )
            .border(
                if (isStarterAsteroid) 2.dp else 1.dp,
                if (isStarterAsteroid)
                    primaryAccent.copy(alpha = 0.4f)
                else
                    lightGrayTransparentBorderColor.copy(alpha = 0.3f),
                defaultRoundedCornerShape
            )
            .cardPadding()
            .fillMaxWidth()
    ) {

        val mapButtonHovered = remember { mutableStateOf(false) }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(124.dp)
                .shadow(
                    elevation = if (mapButtonHovered.value) 6.dp else 2.dp,
                    shape = defaultRoundedCornerShape,
                    ambientColor = primaryAccent.copy(alpha = 0.3f)
                )
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            Color.Black.copy(alpha = 0.9f),
                            Color.Black.copy(alpha = 1f)
                        )
                    ),
                    defaultRoundedCornerShape
                )
                .border(
                    1.dp,
                    if (mapButtonHovered.value)
                        primaryAccent.copy(alpha = 0.6f)
                    else
                        MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                    defaultRoundedCornerShape
                )
                .onHover(mapButtonHovered)
                .noRippleClickable(showMap)
        ) {

            Image(
                painter = painterResource(asteroid.id.drawableResource),
                contentDescription = null,
                modifier = Modifier.size(108.dp)
            )

            // Modern search overlay
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(28.dp)
                    .background(
                        if (mapButtonHovered.value)
                            primaryAccent.copy(alpha = 0.9f)
                        else
                            MaterialTheme.colorScheme.surface.copy(alpha = 0.8f),
                        minimalRoundedCornerShape
                    )
                    .border(
                        1.dp,
                        if (mapButtonHovered.value)
                            Color.White.copy(alpha = 0.8f)
                        else
                            MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                        minimalRoundedCornerShape
                    )
                    .align(Alignment.BottomEnd)
                    .padding(2.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = if (mapButtonHovered.value)
                        Color.White
                    else
                        MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.size(16.dp)
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
                    horizontalArrangement = Arrangement.spacedBy(halfSpacing),
                    modifier = Modifier.height(24.dp)
                ) {

                    Text(
                        text = stringResource(asteroid.id.stringResource),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    WorldTraitsRow(asteroid.getEffectiveWorldTraits())
                }

                HalfSpacer()

                GeysersRow(asteroid.geysers, maxWidth, isStarterAsteroid)

                HalfSpacer()

                PointOfInterestsRow(asteroid.pointsOfInterest, maxWidth, isStarterAsteroid)
            }
        }
    }
}

@Composable
private fun WorldTraitsRow(worldTraits: List<WorldTrait>) {

    Row {

        for (worldTrait in worldTraits.sorted()) {

            TooltipContainer(
                tooltipContent = {
                    GenericTooltip {
                        Text(
                            text = stringResource(worldTrait.stringResource),
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.padding(
                                horizontal = defaultSpacing,
                                vertical = halfSpacing
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                },
                yOffset = 15
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(
                            anthraticeTransparentBackgroundColor,
                            minimalRoundedCornerShape
                        )
                        .size(24.dp)
                ) {

                    Image(
                        painter = painterResource(worldTrait.drawableResource),
                        contentDescription = null,
                        modifier = Modifier.halfPadding()
                    )
                }
            }
        }
    }
}
