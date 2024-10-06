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

import SearchRequest
import SearchResponse
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import service.DefaultWebClient
import service.DummyWebClient
import ui.filter.FilterPanel
import ui.theme.AppTypography
import ui.theme.DefaultSpacer
import ui.theme.appColorScheme
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape

val logoIconHeight = 80.dp

const val ALLOW_WEB_CALLS = false

@Composable
fun App() {
    MaterialTheme(
        colorScheme = appColorScheme,
        typography = AppTypography()
    ) {

        val demoMode = remember { mutableStateOf(true) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val errorMessage = remember { mutableStateOf<String?>(null) }

        val string = produceState<SearchResponse?>(null, demoMode.value) {

            val webClient = if (demoMode.value)
                DummyWebClient
            else
                DefaultWebClient

            isGettingNewResults.value = true

            try {

                errorMessage.value = null

                /* Reset the data */
                value = null

                value = webClient.search(
                    SearchRequest(
                        selectedWorld = "null",
                        worldTraits = emptyList(),
                        page = 0,
                        vanilla = true
                    )
                )

            } catch (ex: Exception) {

                ex.printStackTrace()

                errorMessage.value = ex.stackTraceToString()

            } finally {
                isGettingNewResults.value = false
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {

            Text(
                text = "ONI Seed Browser",
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.defaultPadding()
            )

            errorMessage.value?.let {

                Column(
                    modifier = Modifier
                        .defaultPadding()
                        .height(128.dp)
                        .verticalScroll(rememberScrollState())
                        .background(
                            MaterialTheme.colorScheme.errorContainer,
                            defaultRoundedCornerShape
                        )
                ) {

                    Text(
                        text = it,
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onErrorContainer,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }

            Text(
                text = "This is a non-functional work-in-progress prototype.",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.error,
                fontWeight = FontWeight.Bold
            )

            DefaultSpacer()

            FilterPanel()

            if (ALLOW_WEB_CALLS) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .defaultPadding()
                        .border(1.dp, MaterialTheme.colorScheme.onBackground, defaultRoundedCornerShape)
                ) {

                    DefaultSpacer()

                    Switch(
                        checked = demoMode.value,
                        onCheckedChange = { demoMode.value = it }
                    )

                    DefaultSpacer()

                    Text(
                        text = "Demo Mode",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.defaultPadding()
                    )
                }
            }

            if (isGettingNewResults.value) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.weight(1F)
                ) {

                    Text(
                        text = "Calling webservice...",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }

            } else {

                val searchResponse = string.value

                val worldCount = searchResponse?.worlds?.size ?: 0

                Text(
                    text = "Showing $worldCount worlds",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Box(
                    modifier = Modifier.weight(1F)
                ) {

                    if (searchResponse != null)
                        WorldViewList(searchResponse.worlds)
                }
            }

            Footer()
        }
    }
}

