/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
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
package worldgen

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

/*
 * This is the Kotlin data model equivalent of
 * https://www.npmjs.com/package/@tigin-backwards/oxygen-not-included-worldgen
 */

@Serializable
data class WorldgenMapData(
    val coordinate: String,
    val seed: Int,
    @SerialName("cluster_id") val clusterId: String,
    val starmap: List<StarmapEntry>,
    @SerialName("starmap_pois") val starmapPois: List<StarmapPoi>,
    @SerialName("vanilla_starmap") val vanillaStarmap: List<VanillaStarmapEntry>,
    val worlds: List<WorldMapData>,
    val failure: WorldgenFailure?,
    val telemetry: List<WorldgenEvent>
) {

    companion object {

        private val strictJson = Json {
            ignoreUnknownKeys = false
        }

        fun fromJson(json: String): WorldgenMapData =
            strictJson.decodeFromString<WorldgenMapData>(json)
    }
}

@Serializable
data class WorldgenFailure(
    val stage: String,
    @SerialName("world_index") val worldIndex: Int,
    val message: String
)

@Serializable
data class WorldgenEvent(
    val category: String,
    val message: String
)

@Serializable
data class WorldMapData(
    val name: String,
    val width: Int,
    val height: Int,
    @SerialName("is_starting") val isStarting: Boolean,
    @SerialName("world_traits") val worldTraits: List<String>,
    @SerialName("biome_cells") val biomeCells: List<BiomeCell>,
    val geysers: List<GeyserSpawn>,
    val buildings: List<EntitySpawn>,
    val pickupables: List<EntitySpawn>,
    @SerialName("other_entities") val otherEntities: List<EntitySpawn>
)

@Serializable
data class BiomeCell(
    val id: Int,
    val type: String,
    val x: Float,
    val y: Float,
    val poly: List<Float>
)

@Serializable
open class EntitySpawn(
    val tag: String,
    val cell: Int,
    val x: Int,
    val y: Int
)

@Serializable
data class GeyserSpawn(
    val tag: String,
    val cell: Int,
    val x: Int,
    val y: Int,
    val type: String,
    @SerialName("scaled_rate") val scaledRate: Double? = null,
    @SerialName("scaled_iter_len") val scaledIterLen: Double? = null,
    @SerialName("scaled_iter_pct") val scaledIterPct: Double? = null,
    @SerialName("scaled_year_len") val scaledYearLen: Double? = null,
    @SerialName("scaled_year_pct") val scaledYearPct: Double? = null
)

@Serializable
data class StarmapEntry(
    @SerialName("world_index") val worldIndex: Int,
    val q: Int,
    val r: Int
)

@Serializable
data class StarmapPoi(
    @SerialName("poi_type") val poiType: String,
    val q: Int,
    val r: Int
)

@Serializable
data class VanillaStarmapEntry(
    val type: String,
    val distance: Int
)
