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

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import model.WorldSummary
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
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
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

        Text(summary.toString())

    }
}
