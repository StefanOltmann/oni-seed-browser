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

package worldgen

import de.stefan_oltmann.oni.model.ClusterType

object CoordinateUtil {

    fun generateRandomCoordinate(): String {

        val randomClusterType = ClusterType.entries.random()

        val randomSeed = (1..Int.MAX_VALUE).random()

        return "${randomClusterType.prefix}-$randomSeed-0-0-0"
    }
}
