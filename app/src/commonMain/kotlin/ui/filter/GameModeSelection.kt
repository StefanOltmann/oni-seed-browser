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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import model.filter.FilterQuery
import model.filter.GameModeType
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.getGameModeDrawable
import ui.grayScaleFilter
import ui.noRippleClickable
import ui.onHover
import ui.theme.halfPadding
import ui.theme.hoverColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun GameModeSelection(
    filterQueryState: MutableState<FilterQuery>
) {

    val query = filterQueryState.value
    val currentSelectedMode = query.mode

    val filteredGameModes = GameModeType.entries.filter { it.doDlcSettingsAllowMode(query.dlcs) };

    FlowRow {

        for (gameMode in filteredGameModes) {

            val isSelected = currentSelectedMode == gameMode

            val modeHovered = remember { mutableStateOf(false) }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .halfPadding()
                    .onHover(modeHovered)
                    .scale(if (modeHovered.value) 1.1F else 1F)
                    .noRippleClickable {

                        /* Update the state */
                        filterQueryState.value =
                            filterQueryState.value.copy(
                                mode = gameMode,
                                cluster = null,
                                rules = emptyList()
                            )
                    }
            ) {

                Image(
                    painter = painterResource(
                        getGameModeDrawable(gameMode)
                    ),
                    contentDescription = null,
                    colorFilter = if (modeHovered.value || isSelected)
                        null
                    else
                        grayScaleFilter,
                    modifier = Modifier.size(100.dp)
                )

                Text(
                    text = stringResource(gameMode.nameStringResource),
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (modeHovered.value || isSelected)
                        hoverColor
                    else
                        MaterialTheme.colorScheme.onBackground,
                    fontWeight = if (isSelected) FontWeight.Bold else null,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.width(100.dp)
                )
            }
        }
    }
}
