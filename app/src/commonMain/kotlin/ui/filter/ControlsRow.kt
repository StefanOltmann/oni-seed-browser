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

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.filter.FilterQuery
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.defaultPadding
import ui.theme.defaultSpacing

@Composable
fun ControlsRow(
    filterQueryState: MutableState<FilterQuery>,
    filterPanelOpen: MutableState<Boolean>
) {

    val debugText = remember { mutableStateOf("") }

    if (debugText.value.isNotEmpty()) {

        SelectionContainer {

            TextField(
                value = debugText.value,
                onValueChange = {},
                maxLines = 5,
                modifier = Modifier
                    .padding(
                        horizontal = defaultSpacing
                    )
                    .fillMaxWidth()
            )
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.defaultPadding()
    ) {

        FillSpacer()

        DefaultSpacer()

        ResetButton(
            onClick = {
                filterQueryState.value = FilterQuery.ALL
            }
        )

        DefaultSpacer()

        SearchButton(
            onClick = {

                val filterState = filterQueryState.value

                /* Ignore call without cluster set. */
                if (filterState.cluster == null)
                    return@SearchButton

                /* Remove empty rules */
                val cleanFilterState = filterState.cleanCopy()

                /* Set the clean state back. */
                filterQueryState.value = cleanFilterState

                val filterJson = Json {
                    prettyPrint = true
                }.encodeToString(cleanFilterState)

                debugText.value = filterJson

                println("Search: $filterJson")

                // TODO Send to server

                /* Close the panel, so the user can see the results. */
                // filterPanelOpen.value = false
            }
        )
    }
}
