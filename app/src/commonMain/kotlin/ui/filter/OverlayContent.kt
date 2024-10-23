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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.GeyserType
import model.WorldTrait
import model.filter.FilterCondition
import model.filter.FilterItemGeyserCount
import model.filter.FilterItemGeyserOutput
import model.filter.FilterItemType
import model.filter.FilterItemWorldTrait
import model.filter.FilterQuery
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.uiCount
import oni_seed_browser.app.generated.resources.uiOutput
import org.jetbrains.compose.resources.stringResource
import ui.getAsteroidTypeDrawable
import ui.getGeyserDrawable
import ui.getWorldTraitDrawable
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape

@Composable
fun OverlayContent(
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
            .width(300.dp)
    ) {

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {

            if (filterSelectionValue.type == FilterSelectionType.ASTEROID) {

                FilterSelectionEntryItem(
                    text = "Any of the asteroids",
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
                        text = stringResource(asteroidType.stringResource),
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

            } else if (filterSelectionValue.type == FilterSelectionType.ITEM) {

                for (filterItemType in FilterItemType.entries) {

                    /* TODO Add support later */
                    if (filterItemType == FilterItemType.SPACE_DESTINATION_COUNT)
                        continue

                    /* TODO We need backend support */
                    if (filterItemType == FilterItemType.GEYSER_COUNT)
                        continue

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Box(
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.onBackground)
                                .width(70.dp)
                                .height(2.dp)
                        )

                        Text(
                            text = stringResource(filterItemType.stringResource).uppercase(),
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onBackground
                        )

                        Box(
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.onBackground)
                                .width(70.dp)
                                .height(2.dp)
                        )
                    }

                    if (filterItemType == FilterItemType.WORLD_TRAIT) {

                        for (worldTrait in WorldTrait.entries) {

                            FilterSelectionEntryItem(
                                image = getWorldTraitDrawable(worldTrait),
                                text = stringResource(worldTrait.stringResource),
                                onClick = {

                                    /* Update the query */
                                    filterQueryState.value = filterQueryState.value.setFilterItem(
                                        rulesIndex = filterSelectionValue.rulesIndex,
                                        ruleIndex = filterSelectionValue.ruleIndex,
                                        filterItem = FilterItemWorldTrait(
                                            worldTrait = worldTrait,
                                            has = true
                                        )
                                    )

                                    /* Close pop-up */
                                    filterSelection.value = null
                                }
                            )
                        }

                    } else {

                        for (geyserType in GeyserType.entries) {

                            FilterSelectionEntryItem(
                                image = getGeyserDrawable(geyserType),
                                text = stringResource(geyserType.stringResource) + when (filterItemType) {
                                    FilterItemType.GEYSER_COUNT -> " " + stringResource(Res.string.uiCount)
                                    FilterItemType.GEYSER_OUTPUT -> " " + stringResource(Res.string.uiOutput)
                                    else -> ""
                                },
                                onClick = {

                                    val filterItem = when (filterItemType) {
                                        FilterItemType.GEYSER_COUNT -> FilterItemGeyserCount(
                                            geyser = geyserType,
                                            condition = FilterCondition.AT_LEAST,
                                            count = 1
                                        )

                                        FilterItemType.GEYSER_OUTPUT -> FilterItemGeyserOutput(
                                            geyser = geyserType,
                                            condition = FilterCondition.AT_LEAST,
                                            outputInGramPerSecond = 1
                                        )

                                        else -> error("Illegal item type for geysers: $filterItemType")
                                    }

                                    /* Update the query */
                                    filterQueryState.value = filterQueryState.value.setFilterItem(
                                        rulesIndex = filterSelectionValue.rulesIndex,
                                        ruleIndex = filterSelectionValue.ruleIndex,
                                        filterItem = filterItem
                                    )

                                    /* Close pop-up */
                                    filterSelection.value = null
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
