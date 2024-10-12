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

package ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.Asteroid
import model.World
import ui.theme.doubleSpacing
import ui.theme.lightGray

@Composable
fun WorldViewList(
    lazyListState: LazyListState,
    worlds: List<World>,
    showStarMap: MutableState<World?>,
    showAsteroidMap: MutableState<Asteroid?>,
    showAsteroidDetails: MutableState<Asteroid?>,
    showTooltip: MutableState<Tooltip?>,
    showScrollbar: Boolean = true
) {

    Box {

        LazyColumn(
            state = lazyListState,
            verticalArrangement = Arrangement.spacedBy(doubleSpacing),
            modifier = Modifier.padding(doubleSpacing)
        ) {

            itemsIndexed(worlds) { index, world ->

                WorldView(
                    world,
                    index + 1,
                    worlds.size,
                    showStarMap,
                    showAsteroidMap,
                    showAsteroidDetails,
                    showTooltip
                )
            }
        }

        if (showScrollbar) {

            VerticalScrollbar(
                adapter = rememberScrollbarAdapter(lazyListState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
                style = defaultScrollbarStyle().copy(
                    unhoverColor = lightGray.copy(alpha = 0.4f),
                    hoverColor = lightGray
                )
            )
        }
    }
}
