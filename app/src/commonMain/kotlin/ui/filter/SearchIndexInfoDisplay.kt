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

package ui.filter

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.search.SearchIndex
import service.DefaultWebClient
import ui.theme.defaultRoundedCornerShape
import util.formatDate
import util.formatFileSize

@Composable
fun SearchIndexInfoDisplay(
    selectedCluster: ClusterType?
) {
    val currentSearchIndex = remember { mutableStateOf<SearchIndex?>(null) }
    val currentIndexSize = remember { mutableStateOf(0L) }
    val showAllIndexes = remember { mutableStateOf(false) }

    LaunchedEffect(selectedCluster) {
        currentSearchIndex.value = DefaultWebClient.getCurrentSearchIndex()
        if (currentSearchIndex.value?.clusterType == selectedCluster) {
            currentIndexSize.value = DefaultWebClient.getCurrentSearchIndexSize()
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Search index info or not downloaded message
        if (selectedCluster != null) {
            if (currentSearchIndex.value?.clusterType == selectedCluster) {
                val searchIndex = currentSearchIndex.value!!
                Text(
                    text = "Index: ${formatFileSize(currentIndexSize.value)} | ${formatDate(searchIndex.timestamp)}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )
            } else {
                Text(
                    text = "Search index not downloaded",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))
        }

        // View all indexes button - always available
        Text(
            text = "View All",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .clickable { showAllIndexes.value = true }
                .border(
                    1.dp,
                    MaterialTheme.colorScheme.primary.copy(alpha = 0.3f),
                    defaultRoundedCornerShape
                )
                .padding(horizontal = 6.dp, vertical = 2.dp)
        )
    }

    if (showAllIndexes.value) {
        SearchIndexOverlayModal(
            onDismiss = { showAllIndexes.value = false }
        )
    }
}
