/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import ui.icons.FooterGraphic
import ui.icons.FooterGraphicAnonymous

@Composable
fun Footer(
    isAnonymous: Boolean,
) {

    val uriHandler = LocalUriHandler.current

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .background(Color.Black)
    ) {

        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .clickable {
                    uriHandler.openUri("https://github.com/StefanOltmann/oni-seed-browser")
                }
        ) {

            if (isAnonymous) {

                Text(
                    text = "made by the Maps Not Included team with",
                    color = Color.White,
                    modifier = Modifier.padding(end = 6.dp)
                )

                Image(
                    imageVector = FooterGraphicAnonymous,
                    contentDescription = null,
                    modifier = Modifier.padding(bottom = 2.dp)
                )

            } else {

                Image(
                    imageVector = FooterGraphic,
                    contentDescription = null,
                    modifier = Modifier.padding(bottom = 2.dp)
                )

            }
        }
    }
}
