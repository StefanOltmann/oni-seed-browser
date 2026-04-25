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

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.stefan_oltmann.oni.model.AsteroidType

private const val ONI_VIEW_URL = "https://m45sci.xyz/u/dist/oni-view/view.html"

@Composable
fun OpenInOniViewButton(
    coordinate: String,
    asteroidType: AsteroidType,
    modifier: Modifier = Modifier
) {
    OpenExternalButton(
        url = "$ONI_VIEW_URL?coord=$coordinate&asteroid=${asteroidType.name}",
        text = "ONI View",
        modifier = modifier
    )
}