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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import model.filter.FilterQuery
import ui.HorizontalSeparator
import ui.noRippleClickable
import ui.theme.DefaultSpacer
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing

enum class FilterSelectionType {
    ASTEROID,
    ITEM
}

data class FilterSelection(
    val rulesIndex: Int,
    val ruleIndex: Int,
    val type: FilterSelectionType
)

@Composable
fun FilterPanel(
    filterQueryState: MutableState<FilterQuery>,
    onSearchButtonPressed: () -> Unit
) {

    val filterPanelOpen = remember { mutableStateOf(false) }

    val filterSelection = remember { mutableStateOf<FilterSelection?>(null) }

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

            val spacedOutDlcSelected: MutableState<Boolean> = remember {
                mutableStateOf(filterQueryState.value.cluster?.isBaseGame()?.not() ?: false)
            }

            Box {

                Column(
                    modifier = Modifier.alpha(
                        if (filterSelection.value == null) 1.0f else 0.2f
                    )
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1F)
                            .verticalScroll(rememberScrollState())
                    ) {

                        DefaultSpacer()

                        GameVersionSelection(
                            spacedOutDlcSelected = spacedOutDlcSelected,
                            filterQueryState = filterQueryState
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
                            filterQueryState = filterQueryState,
                            filterSelection = filterSelection
                        )
                    }

                    HorizontalSeparator()

                    ControlsRow(
                        filterQueryState = filterQueryState,
                        filterPanelOpen = filterPanelOpen,
                        onSearchButtonPressed = onSearchButtonPressed
                    )
                }

                if (filterSelection.value != null) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .noRippleClickable {

                                /* Close pop-up */
                                filterSelection.value = null
                            }
                            .fillMaxSize()
                    ) {

                        OverlayContent(
                            filterQueryState = filterQueryState,
                            filterSelection = filterSelection
                        )
                    }
                }
            }
        }
    }
}
