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

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.Geyser
import de.stefan_oltmann.oni.model.GeyserType

@Composable
fun AvgEmitRateRatingIndicator(geyser: Geyser) {

    if (geyser.id == GeyserType.OIL_RESERVOIR)
        return

    CircularProgressIndicator(
        progress = { geyser.avgEmitRateRating },
        modifier = Modifier.fillMaxSize(),
        color = getAvgEmitRateRatingColor(geyser.avgEmitRateRating).copy(alpha = 0.6F),
        gapSize = 0.dp
    )
}
