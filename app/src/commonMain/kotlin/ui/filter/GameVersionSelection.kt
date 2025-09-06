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
import model.Dlc
import model.GameModeType
import model.filter.FilterQuery
import org.jetbrains.compose.resources.painterResource
import ui.grayScaleFilter
import ui.logoIconHeight
import ui.model.icon
import ui.noRippleClickable
import ui.onHover
import ui.theme.defaultPadding

@Composable
fun GameVersionSelection(
    filterQueryState: MutableState<FilterQuery>
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterHorizontally),
        modifier = Modifier.defaultPadding()
    ) {

        val baseGameLogoHovered = remember { mutableStateOf(false) }
        val spacedOutLogoHovered = remember { mutableStateOf(false) }

        val spacedOutDlcSelected = filterQueryState.value.dlcs.contains(Dlc.SpacedOut)

        Image(
            painter = painterResource(Dlc.BaseGame.icon),
            contentDescription = null,
            colorFilter = if (!spacedOutDlcSelected || baseGameLogoHovered.value)
                null
            else
                grayScaleFilter,
            modifier = Modifier
                .height(logoIconHeight)
                .onHover(baseGameLogoHovered)
                .noRippleClickable {

                    if (!spacedOutDlcSelected)
                        return@noRippleClickable

                    val mainVersionsRemoved = filterQueryState.value.dlcs.filterNot { it.isMainVersion }

                    filterQueryState.value = filterQueryState.value.copy(
                        dlcs = mainVersionsRemoved + Dlc.BaseGame,
                        cluster = null,
                        mode = GameModeType.BASEGAME_STANDARD,
                        rules = emptyList()
                    )
                }
                .scale(if (baseGameLogoHovered.value) 1.1F else 1F)
        )

        Image(
            painter = painterResource(Dlc.SpacedOut.icon),
            contentDescription = null,
            colorFilter = if (spacedOutDlcSelected || spacedOutLogoHovered.value)
                null
            else
                grayScaleFilter,
            modifier = Modifier
                .height(logoIconHeight)
                .onHover(spacedOutLogoHovered)
                .noRippleClickable {

                    if (spacedOutDlcSelected)
                        return@noRippleClickable

                    val mainVersionsRemoved = filterQueryState.value.dlcs.filterNot { it.isMainVersion }

                    filterQueryState.value = filterQueryState.value.copy(
                        dlcs = mainVersionsRemoved + Dlc.SpacedOut,
                        cluster = null,
                        mode = GameModeType.SPACEDOUT_SPACEDOUT,
                        rules = emptyList()
                    )
                }
                .scale(if (spacedOutLogoHovered.value) 1.1F else 1F)
        )
    }
}
