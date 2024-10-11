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

package ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val lightGray = Color(0xFFF2F2F2)

val anthracite = Color(0xFF222529)
val surfaceColor = Color(0xFF383a3e)
val surfaceVariantColor = Color(0xFF424346)
val surfaceTint = Color(0xFF4d4d4d)

//val darkRed = Color(0xFFA62D2D)
//val darkGreen = Color(0xFF437E3D)

val ctaColor = Color.Blue

val hoverColor = Color.Yellow

val appColorScheme = darkColorScheme(
    background = anthracite,
    surface = surfaceColor,
    onSurfaceVariant = surfaceVariantColor,
    surfaceTint = surfaceTint,
    primary = Color(0xFF72bcd4)
)
