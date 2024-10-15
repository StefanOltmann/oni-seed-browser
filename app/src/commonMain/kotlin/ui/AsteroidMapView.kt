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

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import model.Asteroid
import model.BiomePaths
import model.Geyser
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.background_space
import org.jetbrains.compose.resources.painterResource
import ui.theme.*
import kotlin.math.min

@Composable
fun AsteroidMapPopup(
    asteroid: Asteroid,
    onCloseClicked: () -> Unit
) {

    val coroutineScope = rememberCoroutineScope()

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

        val highlightedGeyser = remember { mutableStateOf<Geyser?>(null) }

        Column {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = asteroid.id.displayName,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            val biomePaths = BiomePaths.parse(asteroid.biomePaths)

            val geyserListLazyListState = rememberLazyListState()

            val sortedGeysers = asteroid.geysers.sortedBy { it.id }

            Row(
                modifier = Modifier.defaultPadding()
            ) {

                AsteroidBiomeDetails(asteroid, biomePaths)

                Box(
                    modifier = Modifier.weight(1F)
                ) {

                    AsteroidMap(
                        asteroid = asteroid,
                        biomePaths = biomePaths,
                        iconSize = 32.dp,
                        onGeyserClick = {

                            coroutineScope.launch {

                                val clickedGeyserIndex = sortedGeysers.indexOf(it)

                                if (clickedGeyserIndex >= 0)
                                    geyserListLazyListState.animateScrollToItem(clickedGeyserIndex)
                            }
                        },
                        highlightedGeyser = highlightedGeyser
                    )
                }

                AsteroidGeysersDetails(
                    sortedGeysers,
                    geyserListLazyListState,
                    highlightedGeyser
                )
            }
        }
    }
}

@Composable
fun AsteroidMap(
    asteroid: Asteroid,
    biomePaths: BiomePaths,
    iconSize: Dp,
    highlightedGeyser: MutableState<Geyser?>,
    onGeyserClick: ((Geyser) -> Unit)?,
    contentAlignment: Alignment = Alignment.Center
) {

    val halfIconSize: Dp = iconSize.div(2)

    BoxWithConstraints(
        contentAlignment = contentAlignment,
        modifier = Modifier.fillMaxSize()
    ) {

        /* Don't render if too small to avoid issues. */
        if (maxWidth < 50.dp || maxHeight < 50.dp)
            return@BoxWithConstraints

        val density = LocalDensity.current.density

        val viewScale = min(
            maxHeight.value / asteroid.sizeY,
            maxWidth.value / asteroid.sizeX
        )

        Canvas(
            modifier = Modifier
                .size(
                    width = (asteroid.sizeX * viewScale).dp,
                    height = (asteroid.sizeY * viewScale).dp,
                )
                .border(0.dp, lightGrayTransparentBorderColor)
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
                            x = (poi.x * viewScale).dp - halfIconSize,
                            y = (poi.y * viewScale).dp - halfIconSize
                        )
                        .size(iconSize)
                )
            }

            for (geyser in asteroid.geysers) {

                val isHighlighted = highlightedGeyser.value == geyser

                Image(
                    painter = painterResource(getGeyserDrawable(geyser.id)),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(
                            x = (geyser.x * viewScale).dp - halfIconSize,
                            y = (geyser.y * viewScale).dp - halfIconSize
                        )
                        .size(iconSize)
                        .border(
                            if (isHighlighted)
                                2.dp
                            else
                                0.dp,
                            if (isHighlighted)
                                hoverColor
                            else
                                Color.Transparent,
                            CircleShape
                        )
                        .noRippleClickable {

                            if (isHighlighted)
                                highlightedGeyser.value = null
                            else
                                highlightedGeyser.value = geyser

                            onGeyserClick?.invoke(geyser)
                        }
                )
            }
        }
    }
}

@Composable
private fun AsteroidBiomeDetails(
    asteroid: Asteroid,
    biomePaths: BiomePaths
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight()
            .background(anthraticeTransparentBackgroundColor, defaultRoundedCornerShape)
            .border(0.dp, lightGrayTransparentBorderColor, defaultRoundedCornerShape)
    ) {

        DefaultSpacer()

        Text(
            text = "Biome details",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onBackground,
        )

        DefaultSpacer()

        Box(
            modifier = Modifier
        ) {

            val scrollState = rememberScrollState()

            /* Scroll to top if Asteroid is switched. */
            LaunchedEffect(asteroid) {
                scrollState.scrollTo(0)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(defaultSpacing),
                modifier = Modifier.verticalScroll(scrollState)
            ) {

                val presentZoneTypes = biomePaths.polygonMap.keys.sorted()

                for (zoneType in presentZoneTypes)
                    ZoneTypeDetail(zoneType)

                DefaultSpacer()
            }

            VerticalScrollbar(
                adapter = rememberScrollbarAdapter(scrollState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
                style = defaultScrollbarStyle().copy(
                    unhoverColor = lightGray.copy(alpha = 0.4f),
                    hoverColor = lightGray
                ),
            )
        }
    }
}

@Composable
private fun AsteroidGeysersDetails(
    geysers: List<Geyser>,
    geyserListLazyListState: LazyListState,
    highlightedGeyser: MutableState<Geyser?>
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight()
            .background(anthraticeTransparentBackgroundColor, defaultRoundedCornerShape)
            .border(0.dp, lightGrayTransparentBorderColor, defaultRoundedCornerShape)
    ) {

        DefaultSpacer()

        Text(
            text = "Geyser details",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onBackground,
        )

        DefaultSpacer()

        Box(
            modifier = Modifier
        ) {

            LazyColumn(
                state = geyserListLazyListState,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(defaultSpacing),
                contentPadding = PaddingValues(bottom = doubleSpacing)
            ) {

                items(geysers) { geyser ->

                    val isHighlighted = highlightedGeyser.value == geyser

                    GeyserDetail(
                        geyser = geyser,
                        modifier = Modifier
                            .noRippleClickable {

                                if (isHighlighted)
                                    highlightedGeyser.value = null
                                else
                                    highlightedGeyser.value = geyser
                            }
                            .border(
                                if (isHighlighted)
                                    2.dp
                                else
                                    0.dp,
                                if (isHighlighted)
                                    hoverColor
                                else
                                    lightGrayTransparentBorderColor,
                                defaultRoundedCornerShape
                            )
                    )
                }
            }

            VerticalScrollbar(
                adapter = rememberScrollbarAdapter(geyserListLazyListState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
                style = defaultScrollbarStyle().copy(
                    unhoverColor = lightGray.copy(alpha = 0.4f),
                    hoverColor = lightGray
                ),
            )
        }
    }
}
