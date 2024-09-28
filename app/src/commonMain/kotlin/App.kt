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

import androidx.compose.foundation.Image
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import model.GeyserType
import model.WorldSummary
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.cluster_base_terra
import oni_seed_browser.app.generated.resources.cluster_spacedout_terrania
import oni_seed_browser.app.generated.resources.oni_logo
import org.jetbrains.compose.resources.painterResource
import service.DummyWebClient

@Composable
fun App() {
    MaterialTheme {

        val string = produceState<SearchResponse?>(null) {

            value = DummyWebClient.search(
                SearchRequest(
                    selectedWorld = "null",
                    worldTraits = emptyList(),
                    page = 0,
                    vanilla = true
                )
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "ONI Seed Browser",
                style = MaterialTheme.typography.h3
            )

            Image(
                painter = painterResource(Res.drawable.oni_logo),
                contentDescription = null
            )

            Box {

                val lazyListState = rememberLazyListState()

                val response = string.value

                if (response != null) {

                    LazyColumn(
                        state = lazyListState,
                        contentPadding = PaddingValues(defaultSpacing),
                        verticalArrangement = Arrangement.spacedBy(doubleSpacing),
                        modifier = Modifier.padding(defaultSpacing)
                    ) {

                        items(response.summaries) { summary ->

                            WorldSummaryView(summary)
                        }
                    }
                }

                VerticalScrollbar(
                    adapter = rememberScrollbarAdapter(lazyListState),
                    modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd)
                )
            }
        }
    }

}

@Composable
fun WorldSummaryView(summary: WorldSummary) {

    Box(Modifier.background(Color.LightGray, defaultRoundedCornerShape)) {

        Row {

            Box(
                contentAlignment = Alignment.Center
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {

                    Image(
                        painter = painterResource(Res.drawable.cluster_spacedout_terrania),
                        contentDescription = null
                    )

                    SelectionContainer {

                        Text(
                            text = summary.coordinate,
                            style = MaterialTheme.typography.body2,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    for (trait in summary.worldTraitsOfStarter) {

                        Text(
                            text = trait.displayName,
                            style = MaterialTheme.typography.body2
                        )
                    }
                }
            }

            Column (
                modifier = Modifier.weight(1F)
            ) {

                for (geyserType in GeyserType.entries) {

                    val count = summary.geysersCountOfStarter[geyserType] ?: 0

                    if (count == 0)
                        continue

                    Row(
                        modifier = Modifier
                            .padding(4.dp)
                            .width(250.dp)
                            .background(Color.DarkGray, defaultRoundedCornerShape)
                    ) {

                        Text(
                            text = geyserType.displayName,
                            style = MaterialTheme.typography.body1,
                            color = Color.White,
                            modifier = Modifier.weight(1F)
                        )

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .padding(4.dp)
                                .size(32.dp)
                                .background(Color.Blue, CircleShape)
                        ) {

                            Text(
                                text = count.toString(),
                                style = MaterialTheme.typography.body1,
                                color = Color.White
                            )
                        }
                    }
                }

            }
        }
    }
}
