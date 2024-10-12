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

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.theme.defaultRoundedCornerShape
import ui.theme.halfPadding
import ui.theme.hoverColor

@Composable
fun BoxScope.ShowMapButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    val hovered = remember { mutableStateOf(false) }

    Icon(
        imageVector = Icons.Default.Search,
        contentDescription = null,
        tint = if (hovered.value)
            hoverColor
        else
            MaterialTheme.colorScheme.onBackground,
        modifier = Modifier
            .onHover(hovered)
            .halfPadding()
            .size(24.dp)
            .border(
                1.dp,
                if (hovered.value)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .noRippleClickable(onClick)
            .then(modifier)
    )
}
