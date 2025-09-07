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
import model.serializer.ClusterTypePrefixSerializer

@Suppress("UNUSED")
@Serializable
data class Cluster(

    val coordinate: String,

    /* As part of the upload this will be NULL but be set when stored. */
    val uploaderSteamIdHash: String? = null,

    /* As part of the upload this will be NULL but be set when stored. */
    val uploaderAuthenticated: Boolean? = null,

    /* As part of the upload this will be NULL but be set when stored. */
    val uploadDate: Long? = null,

    val gameVersion: Int,

    @Serializable(with = ClusterTypePrefixSerializer::class)
    val cluster: ClusterType,

    val asteroids: List<Asteroid>,

    val starMapEntriesVanilla: List<StarMapEntryVanilla>?,

    val starMapEntriesSpacedOut: List<StarMapEntrySpacedOut>?

) {

    fun withWorldTraitMask(): Cluster {

        val optimizedAsteroids = mutableListOf<Asteroid>()

        for (asteroid in asteroids) {

            /*
             * If world traits are already null, skip this step.
             */
            if (asteroid.worldTraits == null) {

                optimizedAsteroids.add(asteroid)

                continue
            }

            val worldTraitMask = WorldTrait.toMask(asteroid.worldTraits)

            optimizedAsteroids.add(
                asteroid.copy(
                    worldTraits = null,
                    worldTraitsBitmask = worldTraitMask
                )
            )
        }

        return copy(
            asteroids = optimizedAsteroids
        )
    }
}
