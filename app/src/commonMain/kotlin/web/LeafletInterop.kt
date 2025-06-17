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

@file:OptIn(ExperimentalJsExport::class)

package web

import androidx.compose.ui.geometry.Rect
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport
import kotlin.js.JsName
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.Cluster

private val activeLeafletBoxes = mutableMapOf<String, LeafletBoxData>()
private val clusterViewListBounds = mutableMapOf<Int, Rect>()
private var visibleClusterViewList = false;

private data class LeafletBoxData @OptIn(ExperimentalUuidApi::class) constructor(
    var bounds: Rect,
    var cluster: Cluster,
    var index: Int,
    var uploadUuid: Uuid,
    var dataImageBaseUrl: String,
    var active: Boolean
)

@OptIn(ExperimentalUuidApi::class)
fun registerOrUpdateLeafletBox(cluster: Cluster, bounds: Rect, index: Int, uploadUuid: Uuid, dataImageBaseUrl: String) {
    activeLeafletBoxes[cluster.coordinate] = LeafletBoxData(bounds, cluster, index, uploadUuid, dataImageBaseUrl, active = true)
}

fun unregisterLeafletBox(cluster: Cluster) {
    activeLeafletBoxes[cluster.coordinate]?.active = false
}

fun registerOrUpdateClusterViewList(id: Int, bounds: Rect) {
    clusterViewListBounds[id] = bounds
}

fun registerShowClusterViewList(showClusterViewList: Boolean) {
    visibleClusterViewList = showClusterViewList
}

// TODO: once Kotlin supports it, make this return objects or at least a non-manually serialized JSON string
@OptIn(ExperimentalUuidApi::class)
@JsExport
@JsName("getActiveLeafletBoxesJson")
fun getActiveLeafletBoxesJson(): String {
    val activeBoxes = activeLeafletBoxes.values.filter { it.active }

    val mapItemsJson = activeBoxes.map { box ->
        """
        {
            "bottom": ${box.bounds.bottom},
            "left": ${box.bounds.left},
            "right": ${box.bounds.right},
            "top": ${box.bounds.top},
            "seed": "${box.cluster.coordinate}",
            "index": ${box.index},
            "uploadUuid": "${box.uploadUuid}",
            "dataImageBaseUrl": "${box.dataImageBaseUrl}"
        }
        """.trimIndent()
    }.joinToString(",")

    val boundsJson = clusterViewListBounds.map { rect ->
        """
        {
            "bottom": ${rect.value.bottom},
            "left": ${rect.value.left},
            "right": ${rect.value.right},
            "top": ${rect.value.top}
        }
        """.trimIndent()
    }.joinToString(",")

    val result = """
    {
        "map-containers": [
            $mapItemsJson
        ],
        "visible-scroll-bounds": [
            $boundsJson
        ],
        "visible": $visibleClusterViewList
    }
    """.trimIndent()
    return result
}


