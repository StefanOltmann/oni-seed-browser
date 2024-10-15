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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.space_hexagon
import oni_seed_browser.app.generated.resources.space_hexagon_hover
import org.jetbrains.compose.resources.painterResource
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfPadding
import ui.theme.halfSpacing

@Composable
fun CoordinateBox(
    index: Int,
    totalCount: Int,
    coordinate: String,
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

        SelectionContainer {

            Text(
                text = coordinate,
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
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

        if (showMapClicked != null) {

            val hovered = remember { mutableStateOf(false) }

            Image(
                painter = if (hovered.value)
                    painterResource(Res.drawable.space_hexagon_hover)
                else
                    painterResource(Res.drawable.space_hexagon),
                contentDescription = null,
                modifier = Modifier
                    .onHover(hovered)
                    .halfPadding()
                    .height(32.dp)
                    .noRippleClickable(showMapClicked)
                    .align(Alignment.CenterEnd)
            )
        }
    }
}
