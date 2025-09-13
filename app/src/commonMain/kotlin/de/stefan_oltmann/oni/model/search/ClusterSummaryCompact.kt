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

package de.stefan_oltmann.oni.model.search

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber
import de.stefan_oltmann.oni.model.Cluster
import de.stefan_oltmann.oni.model.Geyser
import de.stefan_oltmann.oni.model.GeyserType
import de.stefan_oltmann.oni.model.ZoneType

@Serializable
@OptIn(ExperimentalSerializationApi::class)
class ClusterSummaryCompact(

    @ProtoNumber(1)
    val seed: Int,

    @ProtoNumber(2)
    val remix: String? = null,

    @ProtoNumber(3)
    val asteroidSummaries: Array<AsteroidSummaryCompact>

) {

    companion object {

        fun create(cluster: Cluster): ClusterSummaryCompact {

            val seed = cluster.coordinate
                .substringAfter(cluster.cluster.prefix + "-")
                .substringBefore("-")
                .toInt()

            val remix = cluster.coordinate.substringAfterLast("-")

            return ClusterSummaryCompact(
                seed = seed,
                remix = if (remix == "0") null else remix,
                asteroidSummaries = buildList {

                    for (asteroid in cluster.asteroids) {

                        val geyserCounts: Map<GeyserType, Byte> = asteroid.geysers
                            .groupBy(Geyser::id)
                            .map { it.key to it.value.size.toByte() }
                            .toMap()

                        val goodGeyserCounts: Map<GeyserType, Byte> = asteroid.geysers
                            .groupBy(Geyser::id)
                            .map {
                                it.key to (it.value.count { g -> g.avgEmitRate >= g.id.meanAvgEmitRate }).toByte()
                            }
                            .toMap()

                        add(
                            AsteroidSummaryCompact(
                                id = asteroid.id,
                                worldTraitsBitMask = asteroid.worldTraitsBitmask,
                                zoneTypesBitMask = ZoneType.toMask(asteroid.getBiomes()),
                                geyserCounts = GeyserType.entries.map {
                                    geyserCounts[it] ?: 0
                                }.toByteArray(),
                                goodGeyserCounts = GeyserType.entries.map {
                                    goodGeyserCounts[it] ?: 0
                                }.toByteArray()
                            )
                        )
                    }
                }.toTypedArray()
            )
        }
    }
}
