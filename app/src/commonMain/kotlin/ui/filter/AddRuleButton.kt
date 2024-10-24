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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.uiAdd
import oni_seed_browser.app.generated.resources.uiRule
import org.jetbrains.compose.resources.stringResource
import ui.noRippleClickable
import ui.onHover
import ui.theme.halfSpacing
import ui.theme.hoverColor

@Composable
fun AddRuleButton(
    text: String,
    onClick: () -> Unit
) {

    val fontColor = MaterialTheme.colorScheme.onBackground

    val hovered = remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(halfSpacing, Alignment.CenterHorizontally),
        modifier = Modifier
            .onHover(hovered)
            .drawBehind {

                val dashLength = 8.dp.toPx()
                val gapLength = 8.dp.toPx()
                val strokeWidth = 2.dp.toPx()

                drawRoundRect(
                    color = fontColor,
                    size = this.size,
                    cornerRadius = CornerRadius(
                        8.dp.toPx(),
                        8.dp.toPx()
                    ),
                    style = Stroke(
                        width = strokeWidth,
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(dashLength, gapLength))
                    )
                )
            }
            .widthIn(120.dp)
            .height(40.dp)
            .noRippleClickable(onClick)
    ) {

        Text(
            text = stringResource(Res.string.uiAdd) + " '" + text + "' " + stringResource(Res.string.uiRule),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            color = if (hovered.value)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground
        )
    }
}
