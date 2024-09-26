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

/*
 * See https://oxygennotincluded.fandom.com/wiki/World_Trait
 */
enum class WorldTrait(
    val displayName: String,
    val traitId: String
) {

    /*
     * Warning: Do not sort or delete items here!
     * Ordinals must be kept stable for use in database.
     */

    LARGE_BOULDERS(
        displayName = "Large Boulders",
        traitId = "BouldersLarge"
    ),
    MEDIUM_BOULDERS(
        displayName = "Medium Boulders",
        traitId = "BouldersMedium"
    ),
    MIXED_BOULDERS(
        displayName = "Mixed Boulders",
        traitId = "BouldersMixed"
    ),
    SMALL_BOULDERS(
        displayName = "Small Boulders",
        traitId = "BouldersSmall"
    ),
    TRAPPED_OIL(
        displayName = "Trapped Oil",
        traitId = "DeepOil"
    ),
    FROZEN_CORE(
        displayName = "Frozen Core",
        traitId = "FrozenCore"
    ),
    GEOACTIVE(
        displayName = "Geoactive",
        traitId = "GeoActive"
    ),
    GEODES(
        displayName = "Geodes",
        traitId = "Geodes"
    ),
    GEODORMANT(
        displayName = "Geodormant",
        traitId = "GeoDormant"
    ),
    LARGE_GLACIERS(
        displayName = "Large Glaciers",
        traitId = "GlaciersLarge"
    ),
    IRREGULAR_OIL(
        displayName = "Irregular Oil",
        traitId = "IrregularOil"
    ),
    MAGMA_CHANNELS(
        displayName = "Magma Channels",
        traitId = "MagmaVents"
    ),
    METAL_POOR(
        displayName = "Metal Poor",
        traitId = "MetalPoor"
    ),
    METAL_RICH(
        displayName = "Metal Rich",
        traitId = "MetalRich"
    ),
    ALTERNATE_POD_LOCATION(
        displayName = "Alternate Pod Location",
        traitId = "MisalignedStart"
    ),
    SLIME_MOLDS(
        displayName = "Slime Molds",
        traitId = "SlimeSplats"
    ),
    SUBSURFACE_OCEAN(
        displayName = "Subsurface Ocean",
        traitId = "SubsurfaceOcean"
    ),
    VOLCANOES(
        displayName = "Volcanoes",
        traitId = "Volcanoes"
    ),
    CRASHED_SATELLITES(
        displayName = "Crashed Satellites",
        traitId = "CrashedSatellites"
    ),
    FROZEN_FRIEND(
        displayName = "Frozen Friend",
        traitId = "DistressSignal"
    ),
    LUSH_CORE(
        displayName = "Lush Core",
        traitId = "LushCore"
    ),
    METALLIC_CAVES(
        displayName = "Metallic Caves",
        traitId = "MetalCaves"
    ),
    RADIOACTIVE_CRUST(
        displayName = "Radioactive Crust",
        traitId = "RadioactiveCrust"
    )
}
