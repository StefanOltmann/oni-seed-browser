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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ui.theme.DefaultSpacer
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfPadding
import ui.theme.halfSpacing
import ui.theme.hoverColor

@Composable
fun CoordinateBox(
    index: Int,
    totalCount: Int,
    coordinate: String,
    shareClicked: (() -> Unit)?,
    showMapClicked: (() -> Unit)?
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(horizontal = defaultSpacing)
            .padding(top = defaultSpacing)
            .fillMaxWidth()
            .height(40.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            SelectionContainer {

                Text(
                    text = coordinate,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            if (shareClicked != null) {

                DefaultSpacer()

                val hovered = remember { mutableStateOf(false) }

                Box(
                    modifier = Modifier
                        .border(
                            1.dp,
                            if (hovered.value)
                                hoverColor
                            else
                                MaterialTheme.colorScheme.onBackground,
                            defaultRoundedCornerShape
                        )
                        .noRippleClickable(shareClicked)
                        .onHover(hovered)
                ) {

                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = null,
                        tint = if (hovered.value)
                            hoverColor
                        else
                            MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .halfPadding()
                            .size(24.dp)
                    )
                }
            }
        }

        if (index > 0 && totalCount > 0) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(horizontal = halfSpacing)
                    .height(32.dp)
                    .background(
                        MaterialTheme.colorScheme.background,
                        defaultRoundedCornerShape
                    )
            ) {

                Text(
                    text = "# $index / $totalCount",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(horizontal = defaultSpacing)
                )
            }
        }

        if (showMapClicked != null)
            ShowMapButton(
                onClick = showMapClicked,
                size = 32.dp,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
            )
    }
}
