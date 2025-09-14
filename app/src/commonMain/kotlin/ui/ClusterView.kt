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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.Cluster
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiCopiedToClipboard
import kotlin.math.max
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.stringResource
import ui.icons.ContentCopy
import ui.icons.IconAuthenticated
import ui.icons.IconExternalLink
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.anthraticeTransparentBackgroundColor
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.halfSpacing
import ui.theme.lightGrayTransparentBorderColor
import ui.theme.minimalRoundedCornerShape
import ui.theme.quarterSpacing
import ui.theme.successColor
import util.formatDate

val widthPerWorld: Dp = 380.dp

@Composable
fun ClusterView(
    cluster: Cluster,
    index: Int,
    totalCount: Int,
    favoriteCoordinates: MutableState<List<String>>,
    likeCount: Int?,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
    showMniUrl: Boolean,
    showFavoriteIcon: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    val clusterHovered = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .onHover(clusterHovered)
            .shadow(
                elevation = if (clusterHovered.value) 12.dp else 4.dp,
                shape = defaultRoundedCornerShape,
                ambientColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
            )
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        anthraticeTransparentBackgroundColor.copy(alpha = 0.9f),
                        anthraticeTransparentBackgroundColor.copy(alpha = 0.7f)
                    )
                ),
                defaultRoundedCornerShape
            )
            .border(
                1.dp,
                lightGrayTransparentBorderColor.copy(alpha = if (clusterHovered.value) 0.4f else 0.2f),
                defaultRoundedCornerShape
            )
    ) {

        CoordinateBox(
            index = index,
            totalCount = totalCount,
            coordinate = cluster.coordinate,
            favoriteCoordinates = favoriteCoordinates,
            likeCount = likeCount,
            showMapClicked = { showStarMap.value = cluster },
            showFavoriteIcon = showFavoriteIcon,
            writeToClipboard = writeToClipboard
        )

        HalfSpacer()

        AsteroidsGrid(
            cluster,
            showAsteroidMap
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            MaterialTheme.colorScheme.surface.copy(alpha = 0.2f)
                        )
                    )
                )
                .padding(horizontal = defaultSpacing, vertical = quarterSpacing)
        ) {

            val clipboardManager = LocalClipboardManager.current
            val urlWasCopied = remember { mutableStateOf(false) }

            val url = if (showMniUrl)
                MNI_URL + cluster.coordinate
            else
                ORIGINAL_URL + cluster.coordinate

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.offset(y = -2.dp)
            ) {

                LaunchedEffect(urlWasCopied.value) {

                    if (!urlWasCopied.value)
                        return@LaunchedEffect

                    delay(1000)

                    urlWasCopied.value = false
                }

                val urlHovered = remember { mutableStateOf(false) }

                Row(
                    modifier = Modifier
                        .onHover(urlHovered)
                        .background(
                            if (urlWasCopied.value)
                                successColor.copy(alpha = 0.1f)
                            else if (urlHovered.value)
                                MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)
                            else Color.Transparent,
                            minimalRoundedCornerShape
                        )
                        .padding(horizontal = halfSpacing, vertical = quarterSpacing)
                        .noRippleClickable {
                            clipboardManager.setText(AnnotatedString(url))
                            urlWasCopied.value = true
                        }
                ) {

                    Text(
                        text = if (urlWasCopied.value)
                            stringResource(Res.string.uiCopiedToClipboard)
                        else
                            url,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium,
                        color = if (urlWasCopied.value)
                            successColor
                        else if (urlHovered.value)
                            MaterialTheme.colorScheme.primary
                        else
                            MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    if (!urlWasCopied.value) {
                        DefaultSpacer()

                        Icon(
                            imageVector = ContentCopy,
                            contentDescription = null,
                            tint = if (urlHovered.value)
                                MaterialTheme.colorScheme.primary
                            else
                                MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                            modifier = Modifier.size(12.dp)
                        )
                    }
                }

                HalfSpacer()

                val openHovered = remember { mutableStateOf(false) }

                val uriHandler = LocalUriHandler.current

                Icon(
                    imageVector = IconExternalLink,
                    contentDescription = null,
                    tint = if (openHovered.value)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .onHover(openHovered)
                        .size(16.dp)
                        .noRippleClickable {
                            uriHandler.openUri(url)
                        }
                )

                VerticalDivider(
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .height(doubleSpacing)
                        .padding(horizontal = defaultSpacing)
                )

                Text(
                    text = "V " + cluster.gameVersion,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                val username = steamIdToUsernameMap[cluster.uploaderSteamIdHash]

                if (username != null) {

                    VerticalDivider(
                        thickness = 1.dp,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .height(doubleSpacing)
                            .padding(horizontal = defaultSpacing)
                    )

                    Text(
                        text = username,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }

                val uploadDate = cluster.uploadDate

                VerticalDivider(
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .height(doubleSpacing)
                        .padding(horizontal = defaultSpacing)
                )

                Text(
                    text = formatDate(uploadDate),
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                if (cluster.uploaderAuthenticated) {

                    VerticalDivider(
                        thickness = 1.dp,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .height(doubleSpacing)
                            .padding(horizontal = defaultSpacing)
                    )

                    Icon(
                        imageVector = IconAuthenticated,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }

    HalfSpacer()
}

@Composable
private fun AsteroidsGrid(
    cluster: Cluster,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>
) {

    BoxWithConstraints(
        modifier = Modifier.padding(
            start = defaultSpacing,
            end = defaultSpacing,
            bottom = defaultSpacing
        )
    ) {

        val gridLayoutColumnCount = max(
            maxWidth.div(widthPerWorld).toInt(),
            1
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(defaultSpacing)
        ) {

            val asteroidsIterator = cluster.asteroids.iterator()

            val firstAsteroid = asteroidsIterator.next()

            /* First Asteroid should span the whole column. */
            AsteroidView(
                asteroid = firstAsteroid,
                isStarterAsteroid = true,
                showMap = {
                    showAsteroidMap.value = cluster to firstAsteroid
                }
            )

            if (asteroidsIterator.hasNext()) {

                val secondAsteroid = asteroidsIterator.next()

                AsteroidView(
                    asteroid = secondAsteroid,
                    isStarterAsteroid = false,
                    showMap = {
                        showAsteroidMap.value = cluster to secondAsteroid
                    }
                )
            }

            val remainingAsteroids = asteroidsIterator.asSequence().toList()

            val asteroidsPerColumn = remainingAsteroids.chunked(gridLayoutColumnCount)

            for (asteroidsInColumn in asteroidsPerColumn) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(defaultSpacing)
                ) {

                    for (asteroid in asteroidsInColumn) {

                        Box(
                            modifier = Modifier.weight(1F)
                        ) {

                            AsteroidView(
                                asteroid = asteroid,
                                isStarterAsteroid = false,
                                showMap = {
                                    showAsteroidMap.value = cluster to asteroid
                                }
                            )
                        }
                    }

                    val requiredSpacerCount = gridLayoutColumnCount - asteroidsInColumn.size

                    repeat(requiredSpacerCount) {
                        FillSpacer()
                    }
                }
            }
        }
    }
}
