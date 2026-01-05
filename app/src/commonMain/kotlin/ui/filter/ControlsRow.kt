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

import AppStorage
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.filter.FilterQuery
import toBase64
import ui.MNI_URL
import ui.icons.ContentCopy
import ui.onHover
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.defaultPadding
import ui.theme.hoverColor

@Composable
fun ControlsRow(
    filterQueryState: MutableState<FilterQuery>,
    filterPanelOpen: MutableState<Boolean>,
    onSearchButtonPressed: () -> Unit,
    writeToClipboard: (String) -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.defaultPadding()
    ) {

        FillSpacer()

        val contentCopyHovered = remember { mutableStateOf(false) }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(48.dp)
                .then(

                    if (filterQueryState.value.cluster != null)
                        Modifier
                            .onHover(contentCopyHovered)
                            .clickable {

                                val filterState = filterQueryState.value

                                /* Ignore call without cluster set. */
                                if (filterState.cluster == null)
                                    return@clickable

                                val cleanFilterState = filterState.cleanCopy()

                                val base64 = cleanFilterState.toBase64()

                                val url = "$MNI_URL?filter=$base64"

                                writeToClipboard(url)
                            }
                    else
                        Modifier
                )
        ) {

            Icon(
                imageVector = ContentCopy,
                contentDescription = null,
                tint = if (filterQueryState.value.cluster == null)
                    MaterialTheme.colorScheme.onBackground.copy(alpha = 0.3f)
                else if (contentCopyHovered.value)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(24.dp)
            )
        }

        DefaultSpacer()

        ResetButton(
            onClick = {

                filterQueryState.value = FilterQuery.EMPTY

                /* Save the reset to the storage. */
                AppStorage.saveFilter(FilterQuery.EMPTY)
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
