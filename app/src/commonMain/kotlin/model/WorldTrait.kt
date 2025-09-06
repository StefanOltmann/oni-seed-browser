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

/*
 * See https://oxygennotincluded.fandom.com/wiki/World_Trait
 */

@Suppress("UNUSED")
@Serializable
enum class WorldTrait(
    id: Byte
) {

    BouldersLarge(0),
    BouldersMedium(1),
    BouldersMixed(2),
    BouldersSmall(3),
    DeepOil(4),
    FrozenCore(5),
    GeoActive(6),
    Geodes(7),
    GeoDormant(8),
    GlaciersLarge(9),
    IrregularOil(10),
    MagmaVents(11),
    MetalPoor(12),
    MetalRich(13),
    MisalignedStart(14),
    SlimeSplats(15),
    SubsurfaceOcean(16),
    Volcanoes(17),
    CrashedSatellites(18),
    DistressSignal(19),
    LushCore(20),
    MetalCaves(21),
    RadioactiveCrust(22);

    companion object {

        fun toMask(traits: Collection<WorldTrait>): Int {

            var mask = 0

            for (trait in traits) {

                val bit = 1 shl trait.ordinal

                mask = mask or bit
            }

            return mask
        }

        fun fromMask(mask: Int): List<WorldTrait> {

            if (mask == 0)
                return emptyList()

            val result = ArrayList<WorldTrait>()

            for (trait in WorldTrait.entries) {

                val bit = 1 shl trait.ordinal

                if ((mask and bit) != 0)
                    result.add(trait)
            }

            return result
        }

        fun has(mask: Int, trait: WorldTrait): Boolean {

            val bit = 1 shl trait.ordinal

            return (mask and bit) != 0
        }
    }
}
