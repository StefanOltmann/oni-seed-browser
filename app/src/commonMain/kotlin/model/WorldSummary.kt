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

package model

import kotlinx.serialization.Serializable
import serializer.ClusterSerializer

@Suppress("UNUSED")
@Serializable
data class WorldSummary(

    val coordinate: String,

    @Serializable(with = ClusterSerializer::class)
    val cluster: Cluster,

    /**
     * Number of DLCs activated.
     * Empty list means vanilla.
     */
    val dlcs: List<Dlc>,

    /**
     * Traits of the starting Asteroid
     */
    val worldTraitsOfStarter: List<WorldTrait>,

    /**
     * Counts of the starting Asteroid geysers (including Oil Wells)
     */
    val geysersCountOfStarter: Map<GeyserType, Int>,

    /**
     * Counts of the Star POIs
     */
    val starMapEntryCounts: Map<String, Int>
)
