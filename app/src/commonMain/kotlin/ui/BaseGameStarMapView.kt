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
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import model.Cluster
import model.StarMapEntryVanilla
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.background_space
import org.jetbrains.compose.resources.painterResource
import ui.theme.defaultPadding
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.halfSpacing
import ui.theme.lightGray

@Composable
fun BaseGameStarMapView(
    cluster: Cluster,
    onCloseClicked: () -> Unit,
    writeToClipboard: (String) -> Unit
) {

    if (cluster.starMapEntriesVanilla == null)
        return

    val entriesPerDistance: Map<Int, List<StarMapEntryVanilla>> =
        cluster.starMapEntriesVanilla.groupBy { it.distance }

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

            val scrollState = rememberScrollState()

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = doubleSpacing,
                            vertical = defaultSpacing
                        )
                        .verticalScroll(scrollState)
                ) {

                    for (distance in 17 downTo 0) {

                        val entries = entriesPerDistance[distance] ?: continue

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Box(
                                modifier = Modifier
                                    .background(lightGray)
                                    .height(2.dp)
                                    .weight(1F)
                            )

                            Text(
                                text = ((distance + 2) * 10).toString() + " 000 km",
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onBackground,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.defaultPadding()
                            )

                            Box(
                                modifier = Modifier
                                    .background(lightGray)
                                    .height(2.dp)
                                    .weight(1F)
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(doubleSpacing, Alignment.CenterHorizontally),
                            modifier = Modifier
                                .height(108.dp)
                                .fillMaxWidth()
                                .defaultPadding()
                        ) {

                            for (entry in entries) {

                                TooltipContainer(
                                    tooltipContent = {
                                        GenericTooltip {
                                            Text(
                                                text = entry.id.name,
                                                style = MaterialTheme.typography.bodyLarge,
                                                color = MaterialTheme.colorScheme.onBackground,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis,
                                                lineHeight = 0.sp,
                                                modifier = Modifier.padding(
                                                    horizontal = defaultSpacing,
                                                    vertical = halfSpacing
                                                )
                                            )
                                        }
                                    },
                                    yOffset = 15
                                ) {

                                    Box(
                                        contentAlignment = Alignment.Center,
                                        modifier = Modifier
                                            .size(96.dp)
                                            .border(2.dp, lightGray, CircleShape)
                                    ) {

                                        Text(
                                            text = entry.id.name,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onBackground,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis,
                                            modifier = Modifier.defaultPadding()
                                        )
                                    }
                                }
                            }
                        }
                    }
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
}
