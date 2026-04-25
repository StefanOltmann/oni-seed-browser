/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
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

package ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ui.theme.defaultRoundedCornerShape
import ui.theme.halfSpacing
import ui.theme.hoverColor
import ui.theme.lightGrayTransparentBorderColor

@Composable
private fun DrawerButton(
    arrowImage: ImageVector,
    onClick: () -> Unit
) {
    val hovered = remember { mutableStateOf(false) }
    Box(
        contentAlignment = Alignment.CenterEnd,
        modifier = Modifier
            .fillMaxHeight()
            .width(30.dp)
            .noRippleClickable(onClick)
            .border(0.dp, if (hovered.value) hoverColor else lightGrayTransparentBorderColor, defaultRoundedCornerShape)
            .onHover(hovered)
    ) {

        Icon(
            imageVector = arrowImage,
            contentDescription = null,
            tint = if (hovered.value)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .padding(horizontal = halfSpacing)
                .size(30.dp)
        )
    }
}