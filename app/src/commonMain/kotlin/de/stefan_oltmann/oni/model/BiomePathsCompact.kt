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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.stefan_oltmann.oni.model

import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSerializationApi::class)
data class BiomePathsCompact(

    val polygonMap: Map<ZoneType, List<List<DeltaPoint>>>

) {

    fun serialize(): String =
        buildString {

            var firstZone = true

            for ((zoneType, pointsLists) in polygonMap) {

                if (!firstZone)
                    append('\n')

                firstZone = false

                append(zoneType.id)
                append(':')

                var firstPath = true

                for (points in pointsLists) {

                    if (!firstPath)
                        append('|')

                    firstPath = false

                    append(points.joinToString(" ") { "${it.dx} ${it.dy}" })
                }
            }
        }

    companion object {

        fun parse(biomePaths: String): BiomePathsCompact {

            val polygonMap = mutableMapOf<ZoneType, List<List<DeltaPoint>>>()

            val lines = biomePaths.replace("\\n", "\n").split('\n')

            for (line in lines) {

                val (zoneId, rest) = line.split(':', limit = 2)

                val zoneType = ZoneType.entries.find { it.id == zoneId.toByte() }
                    ?: error("Unknown zone type: $zoneId")

                val pathsStrings = rest.split('|')

                val deltaPaths = pathsStrings.map { pathStr ->
                    val numbers = pathStr.split(' ').filter { it.isNotEmpty() }.map { it.toInt() }
                    numbers.chunked(2).map { (dx, dy) -> DeltaPoint(dx, dy) }
                }

                polygonMap[zoneType] = deltaPaths
            }

            return BiomePathsCompact(polygonMap)
        }

        fun fromBiomePaths(biomePaths: BiomePaths): BiomePathsCompact =
            BiomePathsCompact(
                biomePaths.polygonMap.mapValues { (_, pathsLists) ->
                    pathsLists.map { points -> deltaEncode(points) }
                }
            )

        fun toBiomePaths(deltas: BiomePathsCompact): BiomePaths =
            BiomePaths(
                deltas.polygonMap.mapValues { (_, deltaPathsLists) ->
                    deltaPathsLists.map { deltaDecode(it) }
                }
            )

        /** Delta-encode a single list of Points */
        private fun deltaEncode(points: List<Point>): List<DeltaPoint> {
            val result = mutableListOf<DeltaPoint>()
            var prevX = 0
            var prevY = 0
            for (p in points) {
                val dx = p.x - prevX
                val dy = p.y - prevY
                result.add(DeltaPoint(dx, dy))
                prevX = p.x
                prevY = p.y
            }
            return result
        }

        /** Reconstruct absolute Points from delta-encoded list */
        private fun deltaDecode(deltas: List<DeltaPoint>): List<Point> {
            val result = mutableListOf<Point>()
            var prevX = 0
            var prevY = 0
            for (d in deltas) {
                val x = prevX + d.dx
                val y = prevY + d.dy
                result.add(Point(x, y))
                prevX = x
                prevY = y
            }
            return result
        }
    }

    /** Delta-encoded point, stores the difference to previous point */
    data class DeltaPoint(val dx: Int, val dy: Int)
}
