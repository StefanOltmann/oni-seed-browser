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
import serializer.ClusterTypeSerializer

@Suppress("UNUSED")
@Serializable
data class Cluster(

    val coordinate: String,

    @Serializable(with = ClusterTypeSerializer::class)
    val cluster: ClusterType,

    val dlcs: List<Dlc>,

    val asteroids: List<Asteroid>,

    val starMapEntriesVanilla: List<StarMapEntryVanilla>?,

    val starMapEntriesSpacedOut: List<StarMapEntrySpacedOut>?

) {

    /**
     * Rating value for sorting, based on the starter asteroid.
     */
    fun getRating(): Int {

        val startingAsteroid = asteroids.first()

        var rating = 0

        /* Rate traits higher than geysers; for that multiply. */
        for (worldTrait in startingAsteroid.worldTraits)
            rating += worldTrait.rating.value * 3

        for (geyser in startingAsteroid.geysers)
            rating += geyser.id.rating.value

        return rating
    }
}
