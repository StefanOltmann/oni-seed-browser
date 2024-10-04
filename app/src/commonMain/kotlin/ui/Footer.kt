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

package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import ui.icons.GithubMark
import ui.theme.halfSpacing
import ui.theme.white

@Composable
fun Footer() {

    val uriHandler = LocalUriHandler.current

    BoxWithConstraints {

        val showLink = maxWidth > 600.dp

        Row(
            horizontalArrangement = Arrangement.spacedBy(halfSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
        ) {

            Text(
                text = "Oxygen Not Included",
                style = MaterialTheme.typography.bodyLarge,
                color = white,
                modifier = Modifier
                    .offset(y = -2.dp)
                    .clickable {
                        uriHandler.openUri("https://www.klei.com/games/oxygen-not-included")
                    }
            )

            Text(
                text = "©",
                style = MaterialTheme.typography.bodyLarge,
                color = white,
                modifier = Modifier.offset(y = -2.dp)
            )

            Text(
                text = "Klei Entertainment",
                style = MaterialTheme.typography.bodyLarge,
                color = white,
                modifier = Modifier
                    .offset(y = -2.dp)
                    .clickable {
                        uriHandler.openUri("https://www.klei.com")
                    }
            )

            if (showLink) {

                Text(
                    text = "|",
                    style = MaterialTheme.typography.bodyLarge,
                    color = white,
                    modifier = Modifier.offset(y = -2.dp)
                )

                Icon(
                    imageVector = GithubMark,
                    tint = white,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )

                Text(
                    text = "https://github.com/StefanOltmann/oni-seed-browser",
                    style = MaterialTheme.typography.bodyLarge,
                    color = white,
                    modifier = Modifier
                        .offset(y = -2.dp)
                        .clickable {
                            uriHandler.openUri("https://github.com/StefanOltmann/oni-seed-browser")
                        }
                )
            }
        }
    }
}