/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de
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
import de.stefan_oltmann.oni.model.GeyserType
import de.stefan_oltmann.oni.model.WorldTrait
import de.stefan_oltmann.oni.model.ZoneType
import de.stefan_oltmann.oni.model.filter.FilterCondition
import de.stefan_oltmann.oni.model.filter.FilterItemGeyserCount
import de.stefan_oltmann.oni.model.filter.FilterItemGoodGeyserCount
import de.stefan_oltmann.oni.model.filter.FilterItemType
import de.stefan_oltmann.oni.model.filter.FilterItemWorldTrait
import de.stefan_oltmann.oni.model.filter.FilterItemZoneType
import de.stefan_oltmann.oni.model.filter.FilterQuery
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiCount
import org.jetbrains.compose.resources.stringResource
import ui.drawableResource
import ui.model.stringResource
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

                for (asteroidType in cluster.asteroidTypes) {

                    FilterSelectionEntryItem(
                        image = asteroidType.drawableResource,
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
                                image = worldTrait.drawableResource,
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

                    } else if (filterItemType == FilterItemType.ZONE_TYPE) {

                        for (zoneType in ZoneType.entries) {

                            FilterSelectionEntryItem(
                                image = zoneType.drawableResource,
                                text = stringResource(zoneType.stringResource),
                                onClick = {

                                    /* Update the query */
                                    filterQueryState.value = filterQueryState.value.setFilterItem(
                                        rulesIndex = filterSelectionValue.rulesIndex,
                                        ruleIndex = filterSelectionValue.ruleIndex,
                                        filterItem = FilterItemZoneType(
                                            zoneType = zoneType,
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
                                image = geyserType.drawableResource,
                                text = stringResource(geyserType.stringResource) + when (filterItemType) {
                                    FilterItemType.GEYSER_COUNT -> " " + stringResource(Res.string.uiCount)
                                    FilterItemType.GOOD_GEYSER_COUNT -> " " + stringResource(Res.string.uiCount)
                                    else -> ""
                                },
                                onClick = {

                                    val filterItem = when (filterItemType) {

                                        FilterItemType.GEYSER_COUNT -> FilterItemGeyserCount(
                                            geyser = geyserType,
                                            condition = FilterCondition.AT_LEAST,
                                            count = 1
                                        )

                                        FilterItemType.GOOD_GEYSER_COUNT -> FilterItemGoodGeyserCount(
                                            geyser = geyserType,
                                            condition = FilterCondition.AT_LEAST,
                                            count = 1
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
