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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiSearch
import org.jetbrains.compose.resources.stringResource
import ui.noRippleClickable
import ui.onHover
import ui.theme.DefaultSpacer
import ui.theme.ctaColor
import ui.theme.defaultRoundedCornerShape
import ui.theme.hoverColor
import ui.theme.primaryAccent

@Composable
fun SearchButton(
    enabled: Boolean,
    onClick: () -> Unit
) {

    val hovered = remember { mutableStateOf(false) }

    val buttonBackground = if (enabled) {
        if (hovered.value) {
            Brush.horizontalGradient(
                colors = listOf(
                    ctaColor.copy(alpha = 0.9f),
                    primaryAccent.copy(alpha = 0.9f)
                )
            )
        } else {
            Brush.horizontalGradient(
                colors = listOf(ctaColor, ctaColor)
            )
        }
    } else {
        Brush.horizontalGradient(
            colors = listOf(Color.Transparent, Color.Transparent)
        )
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .shadow(
                elevation = if (enabled && hovered.value) 8.dp else 2.dp,
                shape = defaultRoundedCornerShape,
                ambientColor = if (enabled) ctaColor.copy(alpha = 0.3f) else Color.Transparent
            )
            .background(buttonBackground, defaultRoundedCornerShape)
            .border(
                1.dp,
                if (enabled)
                    if (hovered.value) hoverColor.copy(alpha = 0.5f)
                    else MaterialTheme.colorScheme.outline
                else
                    MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                defaultRoundedCornerShape
            )
            .size(140.dp, 48.dp)
            .onHover(hovered)
            .noRippleClickable(onClick)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = if (enabled)
                    Color.White
                else
                    MaterialTheme.colorScheme.onBackground.copy(alpha = 0.3f),
                modifier = Modifier.size(18.dp)
            )

            DefaultSpacer()

            Text(
                text = stringResource(Res.string.uiSearch),
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = if (enabled)
                    Color.White
                else
                    MaterialTheme.colorScheme.onBackground.copy(alpha = 0.3f)
            )
        }
    }
}
