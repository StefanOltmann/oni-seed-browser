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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import model.Cluster
import model.Dlc
import model.filter.FilterQuery
import org.jetbrains.compose.resources.painterResource
import ui.getClusterDrawable
import ui.grayScaleFilter
import ui.noRippleClickable
import ui.onHover
import ui.theme.halfPadding
import ui.theme.hoverColor
import kotlin.math.max

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ClusterSelection(
    spacedOutDlcSelected: State<Boolean>,
    filterQueryState: MutableState<FilterQuery>
) {

    val query = filterQueryState.value

    val enableFrostyPlanet = query.dlcs.contains(Dlc.FrostyPlanet)

    val currentSelectedCluster: Cluster? = filterQueryState.value.cluster

    val clusters = if (spacedOutDlcSelected.value)
        Cluster.spacedOutCluster
    else
        Cluster.baseGameCluster

    val filteredClusters = clusters.filterNot {
        !enableFrostyPlanet && it.isFrostyPlanet()
    }

    FlowRow(
        maxItemsInEachRow = max(
            if (enableFrostyPlanet) 10 else 9,
            filteredClusters.size / 2
        )
    ) {

        for (cluster in filteredClusters) {

            val isSelected = currentSelectedCluster == cluster

            val clusterHovered = remember { mutableStateOf(false) }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .halfPadding()
                    .onHover(clusterHovered)
                    .scale(if (clusterHovered.value) 1.1F else 1F)
                    .noRippleClickable {

                        /* Update the state */
                        filterQueryState.value =
                            filterQueryState.value.copy(

                                /* Select the cluster or deselect everything */
                                cluster = if (isSelected) null else cluster,

                                /* Reset the filter rules */
                                rules = FilterQuery.ALL.rules
                            )
                    }
            ) {

                Image(
                    painter = painterResource(
                        getClusterDrawable(cluster)
                    ),
                    contentDescription = null,
                    colorFilter = if (clusterHovered.value || isSelected)
                        null
                    else
                        grayScaleFilter,
                    modifier = Modifier.size(100.dp)
                )

                Text(
                    text = cluster.displayName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (clusterHovered.value)
                        hoverColor
                    else
                        MaterialTheme.colorScheme.onBackground,
                    fontWeight = if (isSelected) FontWeight.Bold else null,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2,
                    modifier = Modifier.size(100.dp, 48.dp)
                )
            }
        }
    }
}
