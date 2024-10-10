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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import ui.noRippleClickable
import ui.onHover
import ui.theme.defaultPadding
import ui.theme.defaultSpacing
import ui.theme.halfSpacing
import ui.theme.hoverColor

@Composable
fun FilterSelectionEntryItem(
    image: DrawableResource? = null,
    text: String,
    onClick: () -> Unit
) {

    val hovered = remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .onHover(hovered)
            .padding(
                horizontal = defaultSpacing,
                vertical = halfSpacing
            )
            .height(40.dp)
            .sizeIn(minWidth = 200.dp, maxWidth = 400.dp)
            .noRippleClickable(onClick)
    ) {

        if (image != null) {

            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = if (hovered.value)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.defaultPadding()
        )
    }
}
