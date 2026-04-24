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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.AsteroidType
import ui.icons.IconExternalLink
import ui.theme.defaultSpacing
import ui.theme.minimalRoundedCornerShape

private const val ONIMAXXING_URL = "https://onimaxxing.com/worldgen/"

private const val ONI_VIEW_URL = "https://m45sci.xyz/u/dist/oni-view/view.html"

@Composable
fun OpenExternalButton(
    url: String,
    text: String,
    modifier: Modifier = Modifier
) {

    val uriHandler = LocalUriHandler.current

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        modifier = modifier
            .background(MaterialTheme.colorScheme.background, minimalRoundedCornerShape)
            .height(32.dp)
            .padding(horizontal = defaultSpacing)
            .noRippleClickable {
                uriHandler.openUri(url)
            }
    ) {

        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            maxLines = 1
        )

        Icon(
            imageVector = IconExternalLink,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(16.dp)
        )
    }
}

@Composable
fun OpenInOnimaxxingButton(
    coordinate: String,
    modifier: Modifier = Modifier
) {

    OpenExternalButton(
        url = ONIMAXXING_URL + coordinate,
        text = "onimaxxing",
        modifier = modifier
    )
}

@Composable
fun OpenInOnimaxxingStarmapButton(
    coordinate: String,
    modifier: Modifier = Modifier
) {

    OpenExternalButton(
        url = "$ONIMAXXING_URL$coordinate/Starmap",
        text = "onimaxxing",
        modifier = modifier
    )
}

@Composable
fun OpenInOniViewButton(
    coordinate: String,
    asteroidType: AsteroidType,
    modifier: Modifier = Modifier
) {

    OpenExternalButton(
        url = ONI_VIEW_URL + "?coord=" + coordinate + "&asteroid=" + asteroidType.name,
        text = "ONI View",
        modifier = modifier
    )
}
