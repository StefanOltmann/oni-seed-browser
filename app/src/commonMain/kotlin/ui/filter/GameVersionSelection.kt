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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import model.filter.FilterQuery
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.logo_oni
import oni_seed_browser.app.generated.resources.logo_spaced_out
import org.jetbrains.compose.resources.painterResource
import ui.grayScaleFilter
import ui.logoIconHeight
import ui.noRippleClickable
import ui.onHover
import ui.theme.defaultPadding

@Composable
fun GameVersionSelection(
    spacedOutDlcSelected: MutableState<Boolean>,
    filterQueryState: MutableState<FilterQuery>
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterHorizontally),
        modifier = Modifier.defaultPadding()
    ) {

        val baseGameLogoHovered = remember { mutableStateOf(false) }
        val spacedOutLogoHovered = remember { mutableStateOf(false) }

        Image(
            painter = painterResource(Res.drawable.logo_oni),
            contentDescription = null,
            colorFilter = if (!spacedOutDlcSelected.value || baseGameLogoHovered.value)
                null
            else
                grayScaleFilter,
            modifier = Modifier
                .height(logoIconHeight)
                .onHover(baseGameLogoHovered)
                .noRippleClickable {

                    if (!spacedOutDlcSelected.value)
                        return@noRippleClickable

                    spacedOutDlcSelected.value = false

                    filterQueryState.value = filterQueryState.value.copy(
                        cluster = null,
                        rules = emptyList()
                    )
                }
                .scale(if (baseGameLogoHovered.value) 1.1F else 1F)
        )

        Image(
            painter = painterResource(Res.drawable.logo_spaced_out),
            contentDescription = null,
            colorFilter = if (spacedOutDlcSelected.value || spacedOutLogoHovered.value)
                null
            else
                grayScaleFilter,
            modifier = Modifier
                .height(logoIconHeight)
                .onHover(spacedOutLogoHovered)
                .noRippleClickable {

                    if (spacedOutDlcSelected.value)
                        return@noRippleClickable

                    spacedOutDlcSelected.value = true

                    filterQueryState.value = filterQueryState.value.copy(
                        cluster = null,
                        rules = emptyList()
                    )
                }
                .scale(if (spacedOutLogoHovered.value) 1.1F else 1F)
        )
    }
}
