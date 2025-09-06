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

package ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.roundToLong
import model.GRAMS_PER_TON
import model.SECONDS_PER_CYCLE

@OptIn(ExperimentalComposeUiApi::class)
fun Modifier.onHover(hovered: MutableState<Boolean>) = this
    .onPointerEvent(PointerEventType.Enter) {
        hovered.value = true
    }
    .onPointerEvent(PointerEventType.Exit) {
        hovered.value = false
    }

val grayScaleFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })

@Composable
fun Modifier.noRippleClickable(onClick: (() -> Unit)): Modifier = this
    .clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() },
        onClick = onClick
    )

fun calcTonsPerCycle(gramPerSecond: Int): Float =
    (gramPerSecond / GRAMS_PER_TON) * SECONDS_PER_CYCLE

fun Float.toString(decimals: Int): String {

    require(decimals >= 0) { "Number of decimals must be non-negative" }

    val factor = 10.0.pow(decimals).toLong()
    val scaled = (this * factor).roundToLong()
    val sign = if (scaled < 0) "-" else ""
    val absScaled = abs(scaled)

    val whole = absScaled / factor
    val fraction = absScaled % factor

    return if (decimals > 0) {
        "$sign$whole.${fraction.toString().padStart(decimals, '0')}"
    } else {
        "$sign$whole"
    }
}
