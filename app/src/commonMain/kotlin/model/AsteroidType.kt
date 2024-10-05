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

/**
 * See https://oxygennotincluded.fandom.com/wiki/Planetoid_Clusters
 */
enum class AsteroidType(
    val displayName: String
) {

    /* Base game starters */
    TERRA("Terra Asteroid"),
    CERES("Ceres Asteroid"),
    OCEANIA("Oceania Asteroid"),
    RIME("Rime Asteroid"),
    VERDANTE("Verdante Asteroid"),
    ARBORIA("Arboria Asteroid"),
    VOLCANEA("Volcanea Asteroid"),
    THE_BADLANDS("The Badlands Asteroid"),
    ARIDIO("Aridio Asteroid"),
    OASISSE("Oasisse Asteroid"),

    /* DLC classic starters */
    TERRA_SPACEDOUT("Terra Asteroid"),
    CERES_SPACEDOUT("Ceres Asteroid"),
    OCEANIA_SPACEDOUT("Oceania Asteroid"),
    SQUELCHY("Squelchy Asteroid"),
    RIME_SPACEDOUT("Rime Asteroid"),
    VERDANTE_SPACEDOUT("Verdante Asteroid"),
    ARBORIA_SPACEDOUT("Arboria Asteroid"),
    VOLCANEA_SPACEDOUT("Volcanea Asteroid"),
    THE_BADLANDS_SPACEDOUT("The Badlands Asteroid"),
    ARIDIO_SPACEDOUT("Aridio Asteroid"),
    OASISSE_SPACEDOUT("Oasisse Asteroid"),

    /* DLC asteroid starters */
    TERRANIA("Terrania Asteroid"),
    CERES_MINOR("Ceres Minor Asteroid"),
    FOLIA("Folia Asteroid"),
    QUAGMIRIS("Quagmiris Asteroid"),
    METALLIC_SWAMPY("Metallic Swampy Asteroid"),
    THE_DESOLANDS("The Desolands Asteroid"),
    FROZEN_FOREST("Frozen Forest Asteroid"),
    FLIPPED("Flipped Asteroid"),
    RADIOACTIVE_OCEAN("Radioactive Ocean Asteroid"),

    /* Other asteroids */
    RADIOACTIVE_SWAMP("Radioactive Swamp Asteroid"),
    GLOWOOD_WASTELAND("Glowood Wasteland Asteroid"),
    RADIOACTIVE_FOREST("Radioactive Forest Asteroid"),
    STINKO_SWAMP("Stinko Swamp Asteroid"),
    RADIOACTIVE_TERRA("Radioactive Terra Asteroid"),
    RADIOACTIVE_TERRABOG_ASTEROID("Radioactive Terrabog Asteroid"),
    OILY_SWAMP("Oily Swamp Asteroid"),
    RUSTY_OIL("Rusty Oil Asteroid"),
    IRRADIATED_FOREST("Irradiated Forest Asteroid"),
    IRRADIATED_SWAMPY("Irradiated Swampy Asteroid"),
    IRRADIATED_MARSH_ASTEROID("Irradiated Marsh Asteroid"),
    TUNDRA("Tundra Asteroid"),
    MARSHY("Marshy Asteroid"),
    SUPERCONDUCTIVE("Superconductive Asteroid"),
    MOO("Moo Asteroid"),
    WATER("Water Asteroid"),
    REGOLITH("Regolith Asteroid"),

    /* Mixing */
    BLASTED_CERES("Blasted Ceres Asteroid");

    companion object {

        @Suppress("CyclomaticComplexMethod", "kotlin:S1479")
        fun of(worldName: String): AsteroidType = when (worldName) {

            /* Base game */
            "SandstoneDefault" -> TERRA
            "CeresBaseGameAsteroid" -> CERES
            "Oceania" -> OCEANIA
            "SandstoneFrozen" -> RIME
            "ForestLush" -> VERDANTE
            "ForestDefault" -> ARBORIA
            "Volcanic" -> VOLCANEA
            "Badlands" -> THE_BADLANDS
            "ForestHot" -> ARIDIO
            "Oasis" -> OASISSE

            /* DLC classic */
            "VanillaSandstoneDefault" -> TERRA_SPACEDOUT
            "VanillaOceania" -> OCEANIA_SPACEDOUT
            "VanillaArboria" -> ARBORIA_SPACEDOUT
            "VanillaAridio" -> ARIDIO_SPACEDOUT
            "VanillaOasis" -> OASISSE_SPACEDOUT
            "VanillaSwampDefault" -> SQUELCHY
            "VanillaSandstoneFrozen" -> RIME_SPACEDOUT
            "VanillaForestDefault" -> VERDANTE_SPACEDOUT
            "VanillaVolcanic" -> VOLCANEA_SPACEDOUT
            "VanillaBadlands" -> THE_BADLANDS_SPACEDOUT

            /* DLC moonlets */
            "TerraMoonlet" -> TERRANIA

            "CeresClassicAsteroid" -> CERES_SPACEDOUT
            "CeresSpacedOutAsteroid" -> CERES_MINOR
            "MixingCeresAsteroid" -> BLASTED_CERES
            "ForestMoonlet" -> FOLIA
            "SwampMoonlet" -> QUAGMIRIS

            "MiniMetallicSwampyStart" -> METALLIC_SWAMPY
            "MiniMetallicSwampy" -> METALLIC_SWAMPY
            "MiniBadlands" -> THE_DESOLANDS
            "MiniBadlandsStart" -> THE_DESOLANDS
            "MiniBadlandsWarp" -> THE_DESOLANDS
            "MiniForestFrozen" -> FROZEN_FOREST
            "MiniForestFrozenStart" -> FROZEN_FOREST
            "MiniForestFrozenWarp" -> FROZEN_FOREST
            "MiniFlipped" -> FLIPPED
            "MiniFlippedStart" -> FLIPPED
            "MiniFlippedWarp" -> FLIPPED
            "MiniRadioactiveOcean" -> RADIOACTIVE_OCEAN
            "MiniRadioactiveOceanStart" -> RADIOACTIVE_OCEAN
            "MiniRadioactiveOceanWarp" -> RADIOACTIVE_OCEAN
            "MediumRadioactiveVanillaWarpPlanet" -> RADIOACTIVE_SWAMP
            "MediumForestyWasteland" -> GLOWOOD_WASTELAND
            "MediumForestyRadioactiveVanillaWarpPlanet" -> RADIOACTIVE_FOREST
            "MediumSwampy" -> STINKO_SWAMP
            "MediumSandyRadioactiveVanillaWarpPlanet" -> RADIOACTIVE_TERRA
            "MediumSandySwamp" -> RADIOACTIVE_TERRABOG_ASTEROID
            "WarpOilySwamp" -> OILY_SWAMP
            "OilRichWarpTarget" -> RUSTY_OIL
            "IdealLandingSite" -> IRRADIATED_FOREST
            "SwampyLandingSite" -> IRRADIATED_SWAMPY
            "MetalHeavyLandingSite" -> IRRADIATED_MARSH_ASTEROID
            "TundraMoonlet" -> TUNDRA
            "MarshyMoonlet" -> MARSHY
            "NiobiumMoonlet" -> SUPERCONDUCTIVE
            "MooMoonlet" -> MOO
            "WaterMoonlet" -> WATER
            "RegolithMoonlet" -> REGOLITH
            "MiniRegolithMoonlet" -> REGOLITH

            else -> error("Unknown world: $worldName")
        }
    }
}
