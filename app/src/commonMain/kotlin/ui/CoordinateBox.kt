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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt
import kotlinx.coroutines.delay
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.space_hexagon
import oni_seed_browser.app.generated.resources.uiCopiedToClipboard
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.icons.ContentCopy
import ui.theme.DoubleSpacer
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfPadding
import ui.theme.halfSpacing
import ui.theme.hoverColor

@Composable
fun CoordinateBox(
    index: Int,
    totalCount: Int,
    coordinate: String,
    showMapClicked: (() -> Unit)?,
    writeToClipboard: (String) -> Unit
) {

    val density = LocalDensity.current.density
    val width = remember { mutableStateOf(0) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(horizontal = defaultSpacing)
            .padding(top = defaultSpacing)
            .fillMaxWidth()
            .height(40.dp)
            .onSizeChanged { width.value = (it.width / density).roundToInt() }
    ) {

        val coordinateWasCopied = remember { mutableStateOf(false) }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.noRippleClickable {

                    writeToClipboard(coordinate)

                    coordinateWasCopied.value = true
                }
        ) {

            /*
             * Set notice back after 3 seconds.
             */
            LaunchedEffect(coordinateWasCopied.value) {

                if (!coordinateWasCopied.value)
                    return@LaunchedEffect

                delay(1000)

                coordinateWasCopied.value = false
            }

                    Text(
                        text = if (coordinateWasCopied.value)
                            stringResource(Res.string.uiCopiedToClipboard)
                        else
                            coordinate,
                        style = if (width.value >= 600)
                            MaterialTheme.typography.headlineLarge
                        else if (width.value >= 300)
                            MaterialTheme.typography.headlineSmall
                        else
                            MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

            if (!coordinateWasCopied.value) {

                DoubleSpacer()

                val hovered = remember { mutableStateOf(false) }

                Icon(
                    imageVector = ContentCopy,
                    contentDescription = null,
                    tint = if (hovered.value)
                        hoverColor
                    else
                        MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .onHover(hovered)
                        .size(24.dp)
                )
            }
        }

        if (width.value >= 600 && index > 0 && totalCount > 0)
            IndexIndicator(index, totalCount)

        if (showMapClicked != null) {

            val hovered = remember { mutableStateOf(false) }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .onHover(hovered)
                    .halfPadding()
                    .height(32.dp)
                    .noRippleClickable(showMapClicked)
                    .align(Alignment.CenterEnd)
            ) {

                Image(
                    painter = painterResource(Res.drawable.space_hexagon),
                    contentDescription = null
                )

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = if (hovered.value)
                        hoverColor
                    else
                        MaterialTheme.colorScheme.onBackground
                )
            }
        }
    }
}

@Composable
private fun BoxScope.IndexIndicator(
    index: Int,
    totalCount: Int
) {

    if (index > 0 && totalCount > 0) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(horizontal = halfSpacing)
                .height(32.dp)
                .background(
                    MaterialTheme.colorScheme.background,
                    defaultRoundedCornerShape
                )
        ) {

            Text(
                text = "# $index / $totalCount",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(horizontal = defaultSpacing)
            )
        }
    }
}
