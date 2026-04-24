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

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.Cluster

@Composable
fun PreviewClusterView(
    previewCluster: Cluster,
    writeToClipboard: (String) -> Unit
) {

    val showStarMap = remember { mutableStateOf<Cluster?>(null) }

    val showAsteroidMap = remember { mutableStateOf<Pair<Cluster, Asteroid>?>(null) }

    val asteroidForMapView = showAsteroidMap.value

    if (showStarMap.value != null) {

        if (!previewCluster.starMapEntriesSpacedOut.isEmpty()) {

            SpacedOutStarMapView(
                cluster = previewCluster,
                favoriteCoordinates = mutableStateOf(emptyList()),
                onCloseClicked = { showStarMap.value = null },
                writeToClipboard = writeToClipboard
            )

        } else {

            BaseGameStarMapView(
                cluster = previewCluster,
                favoriteCoordinates = mutableStateOf(emptyList()),
                onCloseClicked = { showStarMap.value = null },
                writeToClipboard = writeToClipboard
            )
        }

    } else if (asteroidForMapView != null) {

        AsteroidMapPopup(
            asteroid = asteroidForMapView.second,
            coordinate = asteroidForMapView.first.coordinate,
            onCloseClicked = { showAsteroidMap.value = null }
        )

    } else {

        ClusterView(
            cluster = previewCluster,
            index = 0,
            totalCount = 1,
            favoriteCoordinates = mutableStateOf(emptyList()),
            showStarMap = showStarMap,
            showAsteroidMap = showAsteroidMap,
            steamIdToUsernameMap = emptyMap(),
            writeToClipboard = writeToClipboard
        )
    }
}
