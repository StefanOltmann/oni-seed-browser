/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.icon_starmap
import io.github.stefanoltmann.app.generated.resources.uiCopiedToClipboard
import kotlin.math.roundToInt
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
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
    favoriteCoordinates: MutableState<List<String>>,
    showMapClicked: (() -> Unit)?,
    showFavoriteIcon: Boolean,
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

        Row(
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {

            if (showFavoriteIcon) {

                val favorite = favoriteCoordinates.value.contains(coordinate)

                val coroutineScope = rememberCoroutineScope()

                Icon(
                    imageVector = if (favorite)
                        Icons.Filled.Favorite
                    else
                        Icons.Outlined.FavoriteBorder,
                    contentDescription = null,
                    tint = if (favorite)
                        Color.Red
                    else
                        MaterialTheme.colorScheme.onBackground.copy(alpha = 0.3f),
                    modifier = Modifier
                        .halfPadding()
                        .size(32.dp)
                        .noRippleClickable {

                            coroutineScope.launch {

                                /*
                                 * Perform the operation on the backend and if that
                                 * is successful show the change in the UI.
                                 *
                                 * We want to keep backend and frontend in sync here.
                                 */

                                if (favorite) {

                                    if (DefaultWebClient.rate(coordinate, like = false))
                                        favoriteCoordinates.value -= coordinate

                                } else {

                                    if (DefaultWebClient.rate(coordinate, like = true))
                                        favoriteCoordinates.value += coordinate
                                }
                            }
                        }
                )
            }

            if (showMapClicked != null)
                ShowMapButton(showMapClicked)
        }
    }
}

@Composable
private fun ShowMapButton(
    showMapClicked: (() -> Unit)
) {

    val hovered = remember { mutableStateOf(false) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .onHover(hovered)
            .halfPadding()
            .size(32.dp)
            .noRippleClickable(showMapClicked)
    ) {

        Icon(
            painter = painterResource(Res.drawable.icon_starmap),
            contentDescription = null,
            tint = if (hovered.value)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground
        )
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
