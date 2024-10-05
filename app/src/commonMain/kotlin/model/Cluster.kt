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

import kotlinx.serialization.Serializable

@Suppress("UNUSED")
@Serializable
enum class Cluster(
    val prefix: String,
    val displayName: String,
    val asteroidTypes: List<AsteroidType>
) {

    /** Terra */
    BASE_TERRA(
        prefix = "SNDST-A",
        displayName = "Terra",
        asteroidTypes = listOf(
            AsteroidType.SandstoneDefault
        )
    ),

    /** Ceres */
    BASE_CERES(
        prefix = "CER-A",
        displayName = "Ceres",
        asteroidTypes = listOf(
            AsteroidType.CeresBaseGameAsteroid
        )
    ),

    /** Oceania */
    BASE_OCEANIA(
        prefix = "OCAN-A",
        displayName = "Oceania",
        asteroidTypes = listOf(
            AsteroidType.Oceania
        )
    ),

    /** Rime */
    BASE_RIME(
        prefix = "S-FRZ",
        displayName = "Rime",
        asteroidTypes = listOf(
            AsteroidType.SandstoneFrozen
        )
    ),

    /** Verdante */
    BASE_VERDANTE(
        prefix = "LUSH-A",
        displayName = "Verdante",
        asteroidTypes = listOf(
            AsteroidType.ForestLush
        )
    ),

    /** Arboria */
    BASE_ARBORIA(
        prefix = "FRST-A",
        displayName = "Arboria",
        asteroidTypes = listOf(
            AsteroidType.ForestDefault
        )
    ),

    /** Volcanea */
    BASE_VOLCANEA(
        prefix = "VOLCA",
        displayName = "Volcanea",
        asteroidTypes = listOf(
            AsteroidType.Volcanic
        )
    ),

    /** The Badlands */
    BASE_THE_BADLANDS(
        prefix = "BAD-A",
        displayName = "The Badlands",
        asteroidTypes = listOf(
            AsteroidType.Badlands
        )
    ),

    /** Aridio */
    BASE_ARIDIO(
        prefix = "HTFST-A",
        displayName = "Aridio",
        asteroidTypes = listOf(
            AsteroidType.ForestHot
        )
    ),

    /** Oasisse */
    BASE_OASISSE(
        prefix = "OASIS-A",
        displayName = "Oasisse",
        asteroidTypes = listOf(
            AsteroidType.Oasis
        )
    ),

    /** Terra */
    DLC_TERRA(
        prefix = "V-SNDST-C",
        displayName = "Terra",
        asteroidTypes = listOf(
            AsteroidType.VanillaSandstoneDefault,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Ceres */
    DLC_CERES(
        prefix = "V-CER-C",
        displayName = "Ceres",
        asteroidTypes = listOf(
            AsteroidType.CeresClassicAsteroid,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Oceania */
    DLC_OCEANIA(
        prefix = "V-OCAN-C",
        displayName = "Oceania",
        asteroidTypes = listOf(
            AsteroidType.VanillaOceania,
            AsteroidType.MediumForestyWasteland,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Squelchy */
    DLC_SQUELCHY(
        prefix = "V-SWMP-C",
        displayName = "Squelchy",
        asteroidTypes = listOf(
            AsteroidType.VanillaSwampDefault,
            AsteroidType.MediumForestyRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Rime */
    DLC_RIME(
        prefix = "V-SFRZ-C",
        displayName = "Rime",
        asteroidTypes = listOf(
            AsteroidType.VanillaSandstoneFrozen,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Verdante */
    DLC_VERDANTE(
        prefix = "V-LUSH-C",
        displayName = "Verdante",
        asteroidTypes = listOf(
            AsteroidType.VanillaForestDefault,
            AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Arboria */
    DLC_ARBORIA(
        prefix = "V-FRST-C",
        displayName = "Arboria",
        asteroidTypes = listOf(
            AsteroidType.VanillaArboria,
            AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Volcanea */
    DLC_VOLCANEA(
        prefix = "V-VOLCA-C",
        displayName = "Volcanea",
        asteroidTypes = listOf(
            AsteroidType.VanillaVolcanic,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** The Badlands */
    DLC_THE_BADLANDS(
        prefix = "V-BAD-C",
        displayName = "The Badlands",
        asteroidTypes = listOf(
            AsteroidType.VanillaBadlands,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Aridio */
    DLC_ARIDIO(
        prefix = "V-HTFST-C",
        displayName = "Aridio",
        asteroidTypes = listOf(
            AsteroidType.VanillaAridio,
            AsteroidType.MediumSandySwamp,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Oasisse */
    DLC_OASISSE(
        prefix = "V-OASIS-C",
        displayName = "Oasisse",
        asteroidTypes = listOf(
            AsteroidType.VanillaOasis,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        )
    ),

    /** Terrania */
    DLC_TERRANIA(
        prefix = "SNDST-C",
        displayName = "Terrania",
        asteroidTypes = listOf(
            AsteroidType.TerraMoonlet,
            AsteroidType.IdealLandingSite,
            AsteroidType.WarpOilySwamp,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Ceres Minor */
    DLC_CERES_MINOR(
        prefix = "CER-C",
        displayName = "Ceres Minor",
        asteroidTypes = listOf(
            AsteroidType.CeresSpacedOutAsteroid,
            AsteroidType.SwampyLandingSite,
            AsteroidType.OilRichWarpTarget,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Folia */
    DLC_FOLIA(
        prefix = "FRST-C",
        displayName = "Folia",
        asteroidTypes = listOf(
            AsteroidType.ForestMoonlet,
            AsteroidType.SwampyLandingSite,
            AsteroidType.OilRichWarpTarget,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Quagmiris */
    DLC_QUAGMIRIS(
        prefix = "SWMP-C",
        displayName = "Quagmiris",
        asteroidTypes = listOf(
            AsteroidType.SwampMoonlet,
            AsteroidType.MetalHeavyLandingSite,
            AsteroidType.OilRichWarpTarget,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Metallic Swampy Moonlet */
    DLC_METALLIC_SWAMPY_MOONLET(
        prefix = "M-SWMP-C",
        displayName = "Metallic Swampy Moonlet",
        asteroidTypes = listOf(
            AsteroidType.MiniBadlands,
            AsteroidType.MiniMetallicSwampyStart,
            AsteroidType.MiniForestFrozenWarp,
            AsteroidType.MiniFlipped,
            AsteroidType.MiniRadioactiveOcean,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** The Desolands Moonlet */
    DLC_THE_DESOLANDS_MOONLET(
        prefix = "M-BAD-C",
        displayName = "The Desolands Moonlet",
        asteroidTypes = listOf(
            AsteroidType.MiniBadlandsStart,
            AsteroidType.MiniRadioactiveOceanWarp,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniForestFrozen,
            AsteroidType.MiniFlipped,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Frozen Forest Moonlet */
    DLC_FROZEN_FOREST_MOONLET(
        prefix = "M-FRZ-C",
        displayName = "Frozen Forest Moonlet",
        asteroidTypes = listOf(
            AsteroidType.MiniBadlandsWarp,
            AsteroidType.MiniForestFrozenStart,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniFlipped,
            AsteroidType.MiniRadioactiveOcean,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Flipped Moonlet */
    DLC_FLIPPED_MOONLET(
        prefix = "M-FLIP-C",
        displayName = "Flipped Moonlet",
        asteroidTypes = listOf(
            AsteroidType.MiniBadlandsWarp,
            AsteroidType.MiniFlippedStart,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniForestFrozen,
            AsteroidType.MiniRadioactiveOcean,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    ),

    /** Radioactive Ocean Moonlet */
    DLC_RADIOACTIVE_OCEAN_MOONLET(
        prefix = "M-RAD-C",
        displayName = "Radioactive Ocean Moonlet",
        asteroidTypes = listOf(
            AsteroidType.MiniBadlands,
            AsteroidType.MiniRadioactiveOceanStart,
            AsteroidType.MiniFlippedWarp,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniForestFrozen,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        )
    );

    fun isFrostyPlanet(): Boolean =
        this == BASE_CERES || this == DLC_CERES || this == DLC_CERES_MINOR

    companion object {

        val baseGameCluster = listOf(
            BASE_TERRA, BASE_CERES, BASE_OCEANIA, BASE_RIME, BASE_VERDANTE, BASE_ARBORIA,
            BASE_VOLCANEA, BASE_THE_BADLANDS, BASE_ARIDIO, BASE_OASISSE
        )

        val spacedOutCluster = listOf(
            DLC_TERRA, DLC_CERES, DLC_OCEANIA, DLC_SQUELCHY, DLC_RIME, DLC_VERDANTE,
            DLC_ARBORIA, DLC_VOLCANEA, DLC_THE_BADLANDS, DLC_ARIDIO, DLC_OASISSE,
            DLC_TERRANIA, DLC_CERES_MINOR, DLC_FOLIA, DLC_QUAGMIRIS,
            DLC_METALLIC_SWAMPY_MOONLET, DLC_THE_DESOLANDS_MOONLET,
            DLC_FROZEN_FOREST_MOONLET, DLC_FLIPPED_MOONLET, DLC_RADIOACTIVE_OCEAN_MOONLET
        )
    }
}
