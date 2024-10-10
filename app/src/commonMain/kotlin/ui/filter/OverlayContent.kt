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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import model.filter.FilterQuery
import ui.getAsteroidTypeDrawable
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
