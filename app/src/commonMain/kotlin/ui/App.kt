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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
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
    connectedUserId: String?,
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

        val density = LocalDensity.current.density
        val displayTooSmall = remember { mutableStateOf(false) }

        Column {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1F)
                    .onSizeChanged {
                        displayTooSmall.value = (it.width / density) < (800 - 16)
                    }
            ) {

                ContentView(
                    urlHash,
                    isMniEmbedded,
                    connectedUserId,
                    localPort,
                    writeToClipboard
                )

                /*
                 * We dropped support for small screens. It never looked good.
                 *
                 * We show the warning as an overlay on top of the content,
                 * so the state doesn't get lost if a user makes the window
                 * to small on accident.
                 */
                if (displayTooSmall.value) {

                    Box(
                        modifier = Modifier
                            .background(Color.Black.copy(alpha = 0.9f))
                            .fillMaxSize()
                            .noRippleClickable {
                                /* Catch all clicks */
                            }
                    )

                    Text(
                        text = "Please view the page on a bigger screen to see the content.",
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(16.dp)
                    )

                    return@Box
                }
            }

            Footer()
        }
    }
}
