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

package model

import kotlinx.serialization.Serializable
import serializer.AsteroidTypeStringSerializer

@Serializable
data class Asteroid(

    @Serializable(with = AsteroidTypeStringSerializer::class)
    val id: AsteroidType,

    val offsetX: Int,
    val offsetY: Int,

    val sizeX: Int,
    val sizeY: Int,

    val worldTraits: List<WorldTrait>,
    val biomePaths: String,

    val pointsOfInterest: List<PointOfInterest>,
    val geysers: List<Geyser>

) {

    fun getBiomes(): Set<ZoneType> =
        BiomePaths.parse(biomePaths).polygonMap.keys
}
