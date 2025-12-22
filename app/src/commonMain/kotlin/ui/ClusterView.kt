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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.platform.LocalUriHandler
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
import ui.theme.hoverColor
import ui.theme.lightGrayTransparentBorderColor
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
    showFavoriteIcon: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    Column(
        modifier = Modifier
            .background(anthraticeTransparentBackgroundColor, defaultRoundedCornerShape)
            .border(0.dp, lightGrayTransparentBorderColor, defaultRoundedCornerShape)
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

        val urlWasCopied = remember { mutableStateOf(false) }

        val url = MNI_URL + cluster.coordinate

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.offset(y = -4.dp)
        ) {

            /*
             * Set notice back after 3 seconds.
             */
            LaunchedEffect(urlWasCopied.value) {

                if (!urlWasCopied.value)
                    return@LaunchedEffect

                delay(1000)

                urlWasCopied.value = false
            }

            Spacer(modifier = Modifier.width(defaultSpacing + halfSpacing))

            Row(
                modifier = Modifier.noRippleClickable {
                    writeToClipboard(url)

                    urlWasCopied.value = true
                }
            ) {

                Text(
                    text = if (urlWasCopied.value)
                        stringResource(Res.string.uiCopiedToClipboard)
                    else
                        url,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                DefaultSpacer()

                if (!urlWasCopied.value) {

                    val copyHovered = remember { mutableStateOf(false) }

                    Icon(
                        imageVector = ContentCopy,
                        contentDescription = null,
                        tint = if (copyHovered.value)
                            hoverColor
                        else
                            MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .onHover(copyHovered)
                            .size(16.dp)
                            .offset(y = 2.dp)
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
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .onHover(openHovered)
                    .size(16.dp)
                    .noRippleClickable {
                        uriHandler.openUri(url)
                    }
            )

            VerticalDivider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .height(doubleSpacing)
                    .padding(horizontal = defaultSpacing)
            )

            Text(
                text = "V " + cluster.gameVersion,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            val username = steamIdToUsernameMap[cluster.uploaderSteamIdHash]

            if (username != null) {

                VerticalDivider(
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .height(doubleSpacing)
                        .padding(horizontal = defaultSpacing)
                )

                Text(
                    text = username,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            val uploadDate = cluster.uploadDate

            VerticalDivider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .height(doubleSpacing)
                    .padding(horizontal = defaultSpacing)
            )

            Text(
                text = formatDate(uploadDate),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            if (cluster.uploaderAuthenticated) {

                VerticalDivider(
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .height(doubleSpacing)
                        .padding(horizontal = defaultSpacing)
                )

                Icon(
                    imageVector = IconAuthenticated,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.size(16.dp)
                )
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
