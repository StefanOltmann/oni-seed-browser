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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.logo_frosty_planet_banner
import org.jetbrains.compose.resources.painterResource
import ui.grayScaleFilter
import ui.noRippleClickable
import ui.theme.doubleSpacing

@Composable
fun DlcSelection(
    enableFrostyPlanet: MutableState<Boolean>
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(doubleSpacing, Alignment.CenterHorizontally)
    ) {

        Switch(
            checked = enableFrostyPlanet.value,
            onCheckedChange = { enableFrostyPlanet.value = it }
        )

        Image(
            painter = painterResource(Res.drawable.logo_frosty_planet_banner),
            contentDescription = null,
            colorFilter = if (enableFrostyPlanet.value)
                null
            else
                grayScaleFilter,
            modifier = Modifier.noRippleClickable {
                enableFrostyPlanet.value = !enableFrostyPlanet.value
            }
        )
    }
}
