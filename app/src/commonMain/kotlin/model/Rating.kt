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

package model

import androidx.compose.ui.graphics.Color
import ui.theme.anthracite

enum class Rating(
    val value: Int,
    val color: Color
) {

    VERY_GOOD(
        value = 2,
        color = Color(0xFF437E3D)
    ),

    GOOD(
        value = 1,
        Color(0xFF8EB18A)
    ),

    NEUTRAL(
        value = 0,
        color = anthracite
    ),

    BAD(
        value = -1,
        color = Color(0xFFFFD27F)
    ),

    VERY_BAD(
        value = -2,
        color = Color(0xFFA62D2D)
    );

    fun isNegative() =
        this == BAD || this == VERY_BAD
}
