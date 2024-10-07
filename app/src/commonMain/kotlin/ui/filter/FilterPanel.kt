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

package ui.filter

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import model.filter.FilterQuery
import ui.HorizontalSeparator
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.ctaColor
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing

@Composable
fun FilterPanel() {

    val filterQueryState = remember { mutableStateOf(FilterQuery.ALL) }

    val filterPanelOpen = remember { mutableStateOf(false) }

    val maxSizeModifier = if (filterPanelOpen.value)
        Modifier.fillMaxSize()
    else
        Modifier

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = doubleSpacing)
            .padding(bottom = doubleSpacing)
            .background(MaterialTheme.colorScheme.surface, defaultRoundedCornerShape)
            .then(maxSizeModifier)
    ) {

        FilterHeader(filterPanelOpen)

        AnimatedVisibility(filterPanelOpen.value) {

            val spacedOutDlcSelected = remember { mutableStateOf(false) }

            Box {

                Box(
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 80.dp)
                        .fillMaxSize()
                ) {

                    /*
                     * For overlay components
                     */

                }

                Column {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1F)
                            .verticalScroll(rememberScrollState())
                    ) {

                        DefaultSpacer()

                        GameVersionSelection(
                            spacedOutDlcSelected = spacedOutDlcSelected
                        )

                        DlcSelection(
                            filterQueryState = filterQueryState
                        )

                        HorizontalSeparator()

                        ClusterSelection(
                            spacedOutDlcSelected = spacedOutDlcSelected,
                            filterQueryState = filterQueryState
                        )

                        HorizontalSeparator()

                        DefaultSpacer()

                        RuleEditor(
                            filterQueryState = filterQueryState
                        )
                    }

                    HorizontalSeparator()

                    ControlsRow(
                        filterQueryState = filterQueryState,
                        filterPanelOpen = filterPanelOpen
                    )
                }
            }
        }
    }
}

@Composable
private fun ControlsRow(
    filterQueryState: MutableState<FilterQuery>,
    filterPanelOpen: MutableState<Boolean>
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.defaultPadding()
    ) {

        FillSpacer()

        ResetButton(
            onClick = {
                filterQueryState.value = FilterQuery.ALL
            }
        )

        DefaultSpacer()

        SearchButton(
            onClick = {

                // TODO Send to server
                println("Search")

                /* Close the panel, so the user can see the results. */
                filterPanelOpen.value = false
            }
        )
    }
}

@Composable
private fun ResetButton(
    onClick: () -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(
                1.dp,
                MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .size(120.dp, 48.dp)
            .clickable { onClick() }
    ) {

        Text(
            text = "RESET",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Composable
private fun SearchButton(
    onClick: () -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(
                1.dp,
                MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .background(
                ctaColor,
                defaultRoundedCornerShape
            )
            .size(120.dp, 48.dp)
            .clickable { onClick() }
    ) {

        Text(
            text = "SEARCH",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
