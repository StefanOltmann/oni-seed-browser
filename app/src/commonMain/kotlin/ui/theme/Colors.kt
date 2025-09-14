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

package ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val lightGray = Color(0xFFE8E9ED)

// Modern dark theme with better contrast and depth
val anthracite = Color(0xFF1A1C23)
val surfaceColor = Color(0xFF2A2D36)
val surfaceVariantColor = Color(0xFF34374A)
val surfaceTint = Color(0xFF3B4049)

val gray3 = Color(0xFF545454)

// Modern accent colors
val ctaColor = Color(0xFF5B9BD5) // Modern blue
val primaryAccent = Color(0xFF72C7E7) // Brighter cyan
val secondaryAccent = Color(0xFF9B59B6) // Purple accent

val hoverColor = Color(0xFFFFC107) // Amber for hover states

// Improved transparency and border colors
val lightGrayTransparentBorderColor = lightGray.copy(alpha = 0.12f)
val anthraticeTransparentBackgroundColor = Color(0xFF1F2128).copy(alpha = 0.85f)

// Enhanced card background with subtle gradient feel
val cardColorBackground = Color(0xFF252832).copy(alpha = 0.7f)

// Success and error colors for modern UI
val successColor = Color(0xFF4CAF50)
val errorColor = Color(0xFFF44336)
val warningColor = Color(0xFFFF9800)

val appColorScheme = darkColorScheme(
    background = anthracite,
    surface = surfaceColor,
    onSurface = lightGray,
    onSurfaceVariant = surfaceVariantColor,
    surfaceTint = surfaceTint,
    primary = primaryAccent,
    onPrimary = Color.White,
    secondary = secondaryAccent,
    onSecondary = Color.White,
    onBackground = lightGray,
    surfaceContainer = surfaceColor,
    surfaceContainerHigh = surfaceVariantColor,
    outline = lightGrayTransparentBorderColor,
    outlineVariant = lightGrayTransparentBorderColor.copy(alpha = 0.08f)
)
