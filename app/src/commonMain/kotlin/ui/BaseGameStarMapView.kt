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
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.background_space
import model.Cluster
import model.StarMapEntryVanilla
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.theme.DefaultSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultPadding
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.lightGray

private const val CIRCLE_SIZE_DP = 96

private val circleColor = lightGray.copy(alpha = 0.2f)

@Composable
fun BaseGameStarMapView(
    cluster: Cluster,
    favoriteCoordinates: MutableState<List<String>>,
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
                favoriteCoordinates = favoriteCoordinates,
                likeCount = null,
                showMapClicked = null,
                showFavoriteIcon = false,
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

                        val entries = entriesPerDistance[distance]

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Box(
                                modifier = Modifier
                                    .background(lightGray)
                                    .height(2.dp)
                                    .weight(1F)
                            )

                            DefaultSpacer()

                            Text(
                                text = ((distance + 2) * 10).toString() + " 000 km",
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onBackground,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )

                            DefaultSpacer()

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
                                .height((CIRCLE_SIZE_DP + 12 + 24).dp)
                                .fillMaxWidth()
                                .defaultPadding()
                        ) {

                            if (entries != null) {

                                for (entry in entries) {

                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Box(
                                            contentAlignment = Alignment.Center,
                                            modifier = Modifier
                                                .size(CIRCLE_SIZE_DP.dp)
                                                .border(0.dp, circleColor, CircleShape)
                                        ) {

                                            Image(
                                                painter = painterResource(getVanillaSpacePOIDrawable(entry.id)),
                                                contentDescription = null
                                            )
                                        }

                                        HalfSpacer()

                                        Text(
                                            text = stringResource(entry.id.stringResource),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onBackground,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis,
                                            modifier = Modifier.height(24.dp)
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
