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

data class BiomePaths(

    val polygonMap: Map<ZoneType, List<List<Point>>>

) {

    companion object {

        fun parse(biomePaths: String): BiomePaths {

            val polygonMap = mutableMapOf<ZoneType, List<List<Point>>>()

            val lines = biomePaths.split('\n')

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
                                x = pairSplit[0].toFloat(),
                                y = pairSplit[1].toFloat()
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
