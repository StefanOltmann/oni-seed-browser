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

import com.menecats.polybool.Epsilon
import com.menecats.polybool.PolyBool
import com.menecats.polybool.helpers.PolyBoolHelper.epsilon
import com.menecats.polybool.helpers.PolyBoolHelper.polygon
import com.menecats.polybool.models.Polygon
import kotlin.math.roundToInt
import model.Asteroid
import model.BiomePaths
import model.Cluster
import model.Point
import model.ZoneType

fun BiomePaths.optimize(): BiomePaths {

    val mergedPolygonMap = mutableMapOf<ZoneType, List<List<Point>>>()

    for ((zoneType, regions) in polygonMap.entries) {

        val regionPointsList = mutableListOf<List<DoubleArray>>()

        for (region in regions) {

            val regionPoints = mutableListOf<DoubleArray>()

            for (point in region)
                regionPoints.add(arrayOf(point.x.toDouble(), point.y.toDouble()).toDoubleArray())

            regionPointsList.add(regionPoints)
        }

        val polygon = Polygon(regionPointsList)

        val epsilon: Epsilon = epsilon()

        val mergedPolygon: Polygon = PolyBool.union(
            epsilon,
            polygon,
            polygon()
        )

        val resultListList = mutableListOf<List<Point>>()

        for (mergedPolygonRegion in mergedPolygon.regions) {

            val mergedPoints = mutableListOf<Point>()

            for (point in mergedPolygonRegion) {

                mergedPoints.add(
                    Point(
                        x = point[0].roundToInt(),
                        y = point[1].roundToInt()
                    )
                )
            }

            resultListList.add(mergedPoints)
        }

        mergedPolygonMap[zoneType] = resultListList
    }

    return BiomePaths(mergedPolygonMap)
}

fun List<Cluster>.optimizeBiomePaths(): List<Cluster> {

    val optimizedClusters = mutableListOf<Cluster>()

    for (world in this) {

        val optimizedAsteroids = mutableListOf<Asteroid>()

        for (asteroid in world.asteroids) {

            val optimizedBiomePaths = BiomePaths
                .parse(asteroid.biomePaths)
                .optimize()
                .serialize()

            optimizedAsteroids.add(
                asteroid.copy(
                    biomePaths = optimizedBiomePaths
                )
            )
        }

        optimizedClusters.add(
            world.copy(
                asteroids = optimizedAsteroids
            )
        )
    }

    return optimizedClusters
}
