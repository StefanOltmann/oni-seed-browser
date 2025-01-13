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

package ui.filter

import AppStorage
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.filter.FilterQuery
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.defaultPadding

@Composable
fun ControlsRow(
    filterQueryState: MutableState<FilterQuery>,
    filterPanelOpen: MutableState<Boolean>,
    onSearchButtonPressed: () -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.defaultPadding()
    ) {

        FillSpacer()

        DefaultSpacer()

        ResetButton(
            onClick = {

                filterQueryState.value = FilterQuery.ALL

                /* Save the reset to the storage. */
                AppStorage.saveFilter(FilterQuery.ALL)
            }
        )

        DefaultSpacer()

        SearchButton(
            enabled = filterQueryState.value.cluster != null,
            onClick = {

                val filterState = filterQueryState.value

                /* Ignore call without cluster set. */
                if (filterState.cluster == null)
                    return@SearchButton

                /* Remove empty rules */
                val cleanFilterState = filterState.cleanCopy()

                /* Save filter */
                AppStorage.saveFilter(cleanFilterState)

                /* Set the clean state back. */
                filterQueryState.value = cleanFilterState

                onSearchButtonPressed()

                /* Close the panel, so the user can see the results. */
                filterPanelOpen.value = false
            }
        )
    }
}
