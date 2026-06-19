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

package service

import de.stefan_oltmann.oni.model.Cluster
import kotlin.time.measureTimedValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import worldgen.WorldgenMapData
import worldgen.WorldgenMapDataConverter

actual object ClusterGenerator {

    private var worldgenVersion: String? = null

    private val clusterCache = LruCache<String, Cluster?>(100)

    actual suspend fun generateCluster(coordinate: String): Cluster {

        val cachedCluster = clusterCache.get(coordinate)

        /* Respond from cache when possible. */
        if (cachedCluster != null)
            return cachedCluster

        val (cluster, duration) = measureTimedValue {

            if (worldgenVersion == null)
                worldgenVersion = withContext(Dispatchers.Default) {
                    worldgenInit()
                    worldgenVersion()
                }

            requireNotNull(worldgenVersion) { "Worldgen version not initialized." }

            val json: String = worldgenGenerate(coordinate)

            val worldgenMapData = WorldgenMapData.fromJson(json)

            if (worldgenMapData.failure != null)
                error("Worldgen failed: ${worldgenMapData.failure.message}")

            WorldgenMapDataConverter.convert(
                mapData = worldgenMapData,
                gameVersion = worldgenVersion!!.substringBefore('+').toInt()
            )
        }

        clusterCache.put(coordinate, cluster)

        println("[GENERATOR] generateCluster(): $coordinate | GENERATED in ${duration.inWholeMilliseconds}ms")

        return cluster
    }
}
