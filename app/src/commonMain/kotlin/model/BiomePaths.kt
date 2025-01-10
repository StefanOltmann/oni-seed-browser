/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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

data class BiomePaths(

    val polygonMap: Map<ZoneType, List<List<Point>>>

) {

    fun serialize(): String =
        buildString {

            var firstZone = true

            for ((zoneType, pointsLists) in polygonMap) {

                if (!firstZone)
                    append('\n')

                firstZone = false

                append(zoneType)
                append(':')

                var firstEntry = true

                for (points in pointsLists) {

                    if (!firstEntry)
                        append(';')

                    firstEntry = false

                    for ((pointIndex, point) in points.withIndex()) {

                        if (pointIndex > 0)
                            append(" ")

                        append("${point.x},${point.y}")
                    }
                }
            }
        }

    companion object {

        fun parse(biomePaths: String): BiomePaths {

            val polygonMap = mutableMapOf<ZoneType, List<List<Point>>>()

            val lines = biomePaths
                .replace("\\n", "\n") // be robust for wrong newline
                .split('\n')

            for (line in lines) {

                val splittedLine = line.split(':')

                val zoneType = ZoneType.valueOf(splittedLine[0])
                val pointsLists = splittedLine[1].split(';')

                val biomePointsLists = mutableListOf<List<Point>>()

                for (pointsString in pointsLists) {

                    val points = mutableListOf<Point>()

                    for (pair in pointsString.split(' ')) {

                        val pairSplit = pair.split(',')

                        points.add(
                            Point(
                                x = pairSplit[0].toInt(),
                                y = pairSplit[1].toInt()
                            )
                        )
                    }

                    biomePointsLists.add(points)
                }

                polygonMap[zoneType] = biomePointsLists
            }

            return BiomePaths(polygonMap)
        }
    }
}
