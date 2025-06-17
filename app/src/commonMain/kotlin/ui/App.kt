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

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.theme.AppTypography
import ui.theme.appColorScheme

const val ORIGINAL_URL = "https://stefan-oltmann.de/oni-seed-browser/#"
const val MNI_URL = "https://mapsnotincluded.org/map-explorer/"

val logoIconHeight = 80.dp

@Composable
fun App(
    urlHash: State<String?>,
    isMniEmbedded: Boolean,
    isAnonymous: Boolean,
    connected: Boolean,
    localPort: Int?,
    /**
     * Note: LocalClipboardManager does not work for Compose for Web
     * in all browsers for some reason. That's why we use a workaround here.
     */
    writeToClipboard: (String) -> Unit
) {

    MaterialTheme(
        colorScheme = appColorScheme,
        typography = AppTypography()
    ) {

        Column {

            Box(
                modifier = Modifier.weight(1F)
            ) {

                ContentView(
                    urlHash,
                    isMniEmbedded,
                    connected,
                    localPort,
                    writeToClipboard
                )
            }

            Footer(
                isAnonymous = isAnonymous
            )
        }
    }
}
