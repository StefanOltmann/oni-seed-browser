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

import ClusterMetadataView
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
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiCopiedToClipboard
import kotlin.math.max
import kotlinx.coroutines.delay
import model.Asteroid
import model.Cluster
import org.jetbrains.compose.resources.stringResource
import ui.icons.ContentCopy
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
    useCompactLayout: Boolean,
    favoriteCoordinates: MutableState<List<String>>,
    likeCount: Int?,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Asteroid?>,
    showMniUrl: Boolean,
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

        val asteroid = showAsteroidMap.value

        if (asteroid == null) {

            AsteroidsGrid(
                cluster,
                useCompactLayout,
                showAsteroidMap
            )
        }

        val clipboardManager = LocalClipboardManager.current

        val urlWasCopied = remember { mutableStateOf(false) }

        val url = if (showMniUrl)
            MNI_URL + cluster.coordinate
        else
            ORIGINAL_URL + cluster.coordinate

        ClusterMetadataView(cluster, steamIdToUsernameMap, true)
    }

    HalfSpacer()
}

@Composable
private fun AsteroidsGrid(
    cluster: Cluster,
    useCompactLayout: Boolean,
    showAsteroidMap: MutableState<Asteroid?>
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
                useCompactLayout = useCompactLayout,
                showMap = {
                    showAsteroidMap.value = firstAsteroid
                }
            )

            if (asteroidsIterator.hasNext()) {

                val secondAsteroid = asteroidsIterator.next()

                AsteroidView(
                    asteroid = secondAsteroid,
                    isStarterAsteroid = false,
                    useCompactLayout = useCompactLayout,
                    showMap = {
                        showAsteroidMap.value = secondAsteroid
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
                                useCompactLayout = useCompactLayout,
                                showMap = {
                                    showAsteroidMap.value = asteroid
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
