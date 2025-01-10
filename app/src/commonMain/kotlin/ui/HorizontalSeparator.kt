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

package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import ui.theme.defaultPadding
import ui.theme.defaultSpacing
import ui.theme.lightGray

@Composable
fun HorizontalSeparator() {

    Box(
        modifier = Modifier
            .defaultPadding()
            .padding(horizontal = defaultSpacing)
            .background(lightGray.copy(alpha = 0.5f))
            .fillMaxWidth()
            .height(2.dp)
    )
}

@Composable
fun DashedHorizontalSeparator() {

    Box(
        modifier = Modifier
            .defaultPadding()
            .padding(horizontal = defaultSpacing)
            .background(lightGray.copy(alpha = 0.3f))
            .fillMaxWidth()
            .drawBehind {

                val dashLength = 8.dp.toPx()
                val gapLength = 8.dp.toPx()
                val strokeWidth = 2.dp.toPx()

                drawRoundRect(
                    color = lightGray.copy(alpha = 0.3f),
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
    )
}
