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

import kotlinx.serialization.Serializable

/*
 * See https://oxygennotincluded.fandom.com/wiki/World_Trait
 */

@Suppress("UNUSED")
@Serializable
enum class WorldTrait(
    val rating: Rating = Rating.NEUTRAL
) {

    BouldersLarge,
    BouldersMedium,
    BouldersMixed,
    BouldersSmall,
    DeepOil(rating = Rating.VERY_GOOD), // More oil reservoirs
    FrozenCore(rating = Rating.GOOD), // Frozen core helps early with CO2 and to cool down the planet
    GeoActive(rating = Rating.VERY_GOOD), // More geyser output
    Geodes(rating = Rating.VERY_GOOD), // Helpful materials.
    GeoDormant(rating = Rating.VERY_BAD), // Less geyser output
    GlaciersLarge,
    IrregularOil(rating = Rating.VERY_GOOD), // More oil patches, easier to access.
    MagmaVents(rating = Rating.BAD), // Makes the game harder
    MetalPoor(rating = Rating.VERY_BAD), // Less metal
    MetalRich(rating = Rating.VERY_GOOD), // More metal
    MisalignedStart,
    SlimeSplats,
    SubsurfaceOcean,
    Volcanoes(rating = Rating.BAD), // Makes the game harder, but more heat energy.
    CrashedSatellites(rating = Rating.VERY_GOOD), // Lots of free radiation
    DistressSignal,
    LushCore(rating = Rating.GOOD), // Access to pips
    MetalCaves(rating = Rating.GOOD), // More free metal
    RadioactiveCrust(rating = Rating.GOOD); // More free radiation

}
