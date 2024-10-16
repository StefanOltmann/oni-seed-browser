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

import androidx.compose.ui.graphics.Color
import kotlinx.serialization.Serializable

/*
 * See https://oxygennotincluded.fandom.com/wiki/World_Trait
 */

@Suppress("UNUSED")
@Serializable
enum class WorldTrait(
    val displayName: String,
    val color: Color,
    val rating: Rating = Rating.NEUTRAL
) {

    BouldersLarge(
        displayName = "Large Boulders",
        color = Color(0xFFBDBDBD)
    ),
    BouldersMedium(
        displayName = "Medium Boulders",
        color = Color(0xFFBDBDBD)
    ),
    BouldersMixed(
        displayName = "Mixed Boulders",
        color = Color(0xFFBDBDBD)
    ),
    BouldersSmall(
        displayName = "Small Boulders",
        color = Color(0xFFBDBDBD)
    ),
    DeepOil(
        displayName = "Trapped Oil",
        color = Color(0xFF6E6E6E),
        /* More oil reservoirs */
        rating = Rating.VERY_GOOD
    ),
    FrozenCore(
        displayName = "Frozen Core",
        color = Color(0xFFA1D6ED),
        /* Frozen core helps early with CO2 and to cool down the planet */
        rating = Rating.GOOD
    ),
    GeoActive(
        displayName = "Geoactive",
        color = Color(0xFFECA649),
        /* More geyser output */
        rating = Rating.VERY_GOOD
    ),
    Geodes(
        displayName = "Geodes",
        color = Color(0xFFC47BF4),
        /* Helpful materials. */
        rating = Rating.GOOD
    ),
    GeoDormant(
        displayName = "Geodormant",
        color = Color(0xFF8895A1),
        /* Less geyser output */
        rating = Rating.VERY_BAD
    ),
    GlaciersLarge(
        displayName = "Large Glaciers",
        color = Color(0xFFA1D6ED)
    ),
    IrregularOil(
        displayName = "Irregular Oil",
        color = Color(0xFF6C6C6C),
        /* More oil patches, easier to access. */
        rating = Rating.VERY_GOOD
    ),
    MagmaVents(
        displayName = "Magma Channels",
        color = Color(0xFFE7544D),
        /* Makes the game harder */
        rating = Rating.BAD
    ),
    MetalPoor(
        displayName = "Metal Poor",
        color = Color(0xFF8794A0),
        /* Less metal */
        rating = Rating.VERY_BAD
    ),
    MetalRich(
        displayName = "Metal Rich",
        color = Color(0xFFD2AB4B),
        /* More metal */
        rating = Rating.VERY_GOOD
    ),
    MisalignedStart(
        displayName = "Alternate Pod Location",
        color = Color(0xFFE7DC93)
    ),
    SlimeSplats(
        displayName = "Slime Molds",
        color = Color(0xFF8EB542)
    ),
    SubsurfaceOcean(
        displayName = "Subsurface Ocean",
        color = Color(0xFF61CEF0)
    ),
    Volcanoes(
        displayName = "Volcanic Activity",
        color = Color(0xFFE7544D),
        /* Makes the game harder, but more heat energy. */
        rating = Rating.BAD
    ),
    CrashedSatellites(
        displayName = "Crashed Satellites",
        color = Color(0xFF7ED360),
        /* Lots of free radiation */
        rating = Rating.VERY_GOOD
    ),
    DistressSignal(
        displayName = "Frozen Friend",
        color = Color(0xFF8794A0)
    ),
    LushCore(
        displayName = "Lush Core",
        color = Color(0xFF66A052),
        /* Access to pips */
        rating = Rating.GOOD
    ),
    MetalCaves(
        displayName = "Metallic Caves",
        color = Color(0xFFD2AB4B),
        /* More free metal */
        rating = Rating.GOOD
    ),
    RadioactiveCrust(
        displayName = "Radioactive Crust",
        color = Color(0xFF7ED360),
        /* More free radiation */
        rating = Rating.GOOD
    )
}

