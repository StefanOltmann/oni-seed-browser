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

package ui.filter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import model.Cluster
import org.jetbrains.compose.resources.painterResource
import ui.getClusterDrawable
import ui.grayScaleFilter
import ui.onHover
import ui.theme.halfPadding
import kotlin.math.max

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ClusterSelection(
    spacedOutDlcSelected: State<Boolean>,
    enableFrostyPlanet: State<Boolean>
) {

    val clusters = if (spacedOutDlcSelected.value)
        Cluster.spacedOutCluster
    else
        Cluster.baseGameCluster

    val filteredClusters = clusters.filterNot {
        !enableFrostyPlanet.value && it.isFrostyPlanet()
    }

    FlowRow(
        maxItemsInEachRow = max(
            if (enableFrostyPlanet.value) 10 else 9,
            filteredClusters.size / 2
        )
    ) {

        for (cluster in filteredClusters) {

            val clusterHovered = remember { mutableStateOf(false) }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .halfPadding()
                    .onHover(clusterHovered)
                    .scale(if (clusterHovered.value) 1.1F else 1F)
            ) {

                Image(
                    painter = painterResource(
                        getClusterDrawable(cluster)
                    ),
                    contentDescription = null,
                    colorFilter = if (clusterHovered.value)
                        null
                    else
                        grayScaleFilter,
                    modifier = Modifier.size(100.dp)
                )

                Text(
                    text = cluster.displayName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2,
                    modifier = Modifier.size(100.dp, 48.dp)
                )

            }
        }
    }
}
