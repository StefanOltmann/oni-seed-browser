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

package de.stefan_oltmann.oni.model

import de.stefan_oltmann.oni.model.serializer.AsteroidTypeSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class Asteroid(

    @ProtoNumber(1)
    @Serializable(with = AsteroidTypeSerializer::class)
    val id: AsteroidType,

    @ProtoNumber(2)
    val offsetX: Short,

    @ProtoNumber(3)
    val offsetY: Short,

    @ProtoNumber(4)
    val sizeX: Short,

    @ProtoNumber(5)
    val sizeY: Short,

    @ProtoNumber(6)
    val worldTraitsBitmask: Int,

    @ProtoNumber(7)
    val biomePaths: String,

    @ProtoNumber(8)
    val pointsOfInterest: List<PointOfInterest>,

    @ProtoNumber(9)
    val geysers: List<Geyser>

) {

    fun getEffectiveWorldTraits(): List<WorldTrait> =
        WorldTrait.fromMask(worldTraitsBitmask)

    fun getBiomePaths(): BiomePaths {

        try {

            val optimized = BiomePathsCompact.parse(biomePaths)

            return BiomePathsCompact.toBiomePaths(optimized)

        } catch (_: Exception) {

            println("Failed to parse biome paths in compact format. Falling back to old format.")
        }

        return BiomePaths.parse(biomePaths)
    }

    fun getBiomes(): Set<ZoneType> =
        getBiomePaths().polygonMap.keys
}
