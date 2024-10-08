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
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import model.filter.FilterQuery
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import ui.HorizontalSeparator
import ui.getAsteroidTypeDrawable
import ui.noRippleClickable
import ui.onHover
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.ctaColor
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.halfSpacing
import ui.theme.hoverColor

enum class FilterSelectionType {
    ASTEROID,
    ITEM,
    CONDITION
}

data class FilterSelection(
    val rulesIndex: Int,
    val ruleIndex: Int,
    val type: FilterSelectionType
)

@Composable
fun FilterPanel() {

    val filterQueryState = remember { mutableStateOf(FilterQuery.ALL) }

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

            val spacedOutDlcSelected = remember { mutableStateOf(false) }

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
                        filterPanelOpen = filterPanelOpen
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

@Composable
private fun OverlayContent(
    filterQueryState: MutableState<FilterQuery>,
    filterSelection: MutableState<FilterSelection?>
) {

    val filterSelectionValue = filterSelection.value
        ?: return

    val cluster = filterQueryState.value.cluster
        ?: return

    Box(
        modifier = Modifier
            .defaultPadding()
            .background(
                MaterialTheme.colorScheme.background,
                defaultRoundedCornerShape
            )
    ) {

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {

            if (filterSelectionValue.type == FilterSelectionType.ASTEROID) {

                FilterSelectionEntryItem(
                    text = "Sum of all asteroids",
                    onClick = {

                        /* Update the query */
                        filterQueryState.value = filterQueryState.value.setAsteroid(
                            rulesIndex = filterSelectionValue.rulesIndex,
                            ruleIndex = filterSelectionValue.ruleIndex,
                            asteroidType = null
                        )

                        /* Close pop-up */
                        filterSelection.value = null
                    }
                )

                for (asteroidType in cluster.asteroidTypes) {

                    FilterSelectionEntryItem(
                        image = getAsteroidTypeDrawable(asteroidType),
                        text = asteroidType.displayName,
                        onClick = {

                            /* Update the query */
                            filterQueryState.value = filterQueryState.value.setAsteroid(
                                rulesIndex = filterSelectionValue.rulesIndex,
                                ruleIndex = filterSelectionValue.ruleIndex,
                                asteroidType = asteroidType
                            )

                            /* Close pop-up */
                            filterSelection.value = null
                        }
                    )
                }

            } else {


                for (each in 1..5) {

                    FilterSelectionEntryItem(
                        text = "Test item $each",
                        onClick = {

                            /* Close pop-up */
                            filterSelection.value = null
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun FilterSelectionEntryItem(
    image: DrawableResource? = null,
    text: String,
    onClick: () -> Unit
) {

    val hovered = remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .onHover(hovered)
            .padding(
                horizontal = defaultSpacing,
                vertical = halfSpacing
            )
            .height(40.dp)
            .sizeIn(minWidth = 200.dp, maxWidth = 400.dp)
            .noRippleClickable(onClick)
    ) {

        if (image != null) {

            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = if (hovered.value)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.defaultPadding()
        )
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
