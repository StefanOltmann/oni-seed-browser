/*
 * ONI Seed Browser Backend
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

object ZoneTypeMask {

    fun toMask(zoneTypes: Collection<ZoneType>): Int {

        var mask = 0

        for (zoneType in zoneTypes) {

            val bit = 1 shl zoneType.ordinal

            mask = mask or bit
        }

        return mask
    }

    fun fromMask(mask: Int): List<ZoneType> {

        if (mask == 0)
            return emptyList()

        val result = ArrayList<ZoneType>()

        for (zoneType in ZoneType.entries) {

            val bit = 1 shl zoneType.ordinal

            if ((mask and bit) != 0)
                result.add(zoneType)
        }

        return result
    }

    fun has(mask: Int, zoneType: ZoneType): Boolean {

        val bit = 1 shl zoneType.ordinal

        return (mask and bit) != 0
    }
}
