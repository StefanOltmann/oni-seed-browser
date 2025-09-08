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

@Suppress("UNUSED")
@Serializable
enum class ZoneType(
    val id: Byte
) {
    /*
     * Ordered by how they should appear in the biome list.
     */

    /** The default starting area should always come first. */
    Sandstone(3),
    Barren(16),

    Space(7),

    FrozenWastes(0),

    // CrystalCaverns(1),
    BoggyMarsh(2),
    ToxicJungle(4),

    Ocean(8),
    Rust(9),
    Forest(10),
    Radioactive(11),
    Swamp(12),
    Wasteland(13),

    // RocketInterior(14),
    Metallic(15),
    Moo(17),

    /* Ceres */
    IceCaves(18),
    CarrotQuarry(19),
    SugarWoods(20),

    /* Relica */
    PrehistoricGarden(21),
    PrehistoricRaptor(22),
    PrehistoricWetlands(23),

    /* Most of the time right above the magma biome. */
    OilField(6),

    /* Usually at the bottom of the map, so also listed at the bottom */
    MagmaCore(5);

    companion object {

        fun toMask(zoneTypes: Collection<ZoneType>): Int {

            var mask = 0

            for (zoneType in zoneTypes) {

                val bit = 1 shl zoneType.id.toInt()

                mask = mask or bit
            }

            return mask
        }

        fun fromMask(mask: Int): List<ZoneType> {

            if (mask == 0)
                return emptyList()

            val result = ArrayList<ZoneType>()

            for (zoneType in ZoneType.entries) {

                val bit = 1 shl zoneType.id.toInt()

                if ((mask and bit) != 0)
                    result.add(zoneType)
            }

            return result
        }

        fun has(mask: Int, zoneType: ZoneType): Boolean {

            val bit = 1 shl zoneType.id.toInt()

            return (mask and bit) != 0
        }
    }
}

