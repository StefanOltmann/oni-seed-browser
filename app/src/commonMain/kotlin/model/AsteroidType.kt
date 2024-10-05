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

package model;

/**
 * See https://oxygennotincluded.fandom.com/wiki/Planetoid_Clusters
 */
enum class AsteroidType(
    val displayName: String
) {

    /** Terra Asteroid */
    SandstoneDefault("Terra Asteroid"),

    /** Ceres Asteroid */
    CeresBaseGameAsteroid("Ceres Asteroid"),

    /** Oceania Asteroid */
    Oceania("Oceania Asteroid"),

    /** Rime Asteroid */
    SandstoneFrozen("Rime Asteroid"),

    /** Verdante Asteroid */
    ForestLush("Verdante Asteroid"),

    /** Arboria Asteroid */
    ForestDefault("Arboria Asteroid"),

    /** Volcanea Asteroid */
    Volcanic("Volcanea Asteroid"),

    /** The Badlands Asteroid */
    Badlands("The Badlands Asteroid"),

    /** Aridio Asteroid */
    ForestHot("Aridio Asteroid"),

    /** Oasisse Asteroid */
    Oasis("Oasisse Asteroid"),

    /** Terra Asteroid */
    VanillaSandstoneDefault("Terra Asteroid"),

    /** Radioactive Swamp Asteroid */
    MediumRadioactiveVanillaWarpPlanet("Radioactive Swamp Asteroid"),

    /** Ceres Asteroid */
    CeresClassicAsteroid("Ceres Asteroid"),

    /** Stinko Swamp Asteroid */
    MediumSwampy("Stinko Swamp Asteroid"),

    /** Oceania Asteroid */
    VanillaOceania("Oceania Asteroid"),

    /** Glowood Wasteland Asteroid */
    MediumForestyWasteland("Glowood Wasteland Asteroid"),

    /** Squelchy Asteroid */
    VanillaSwampDefault("Squelchy Asteroid"),

    /** Radioactive Forest Asteroid */
    MediumForestyRadioactiveVanillaWarpPlanet("Radioactive Forest Asteroid"),

    /** Rime Asteroid */
    VanillaSandstoneFrozen("Rime Asteroid"),

    /** Verdante Asteroid */
    VanillaForestDefault("Verdante Asteroid"),

    /** Radioactive Terra Asteroid */
    MediumSandyRadioactiveVanillaWarpPlanet("Radioactive Terra Asteroid"),

    /** Arboria Asteroid */
    VanillaArboria("Arboria Asteroid"),

    /** Volcanea Asteroid */
    VanillaVolcanic("Volcanea Asteroid"),

    /** The Badlands Asteroid */
    VanillaBadlands("The Badlands Asteroid"),

    /** Aridio Asteroid */
    VanillaAridio("Aridio Asteroid"),

    /** Radioactive Terrabog Asteroid */
    MediumSandySwamp("Radioactive Terrabog Asteroid"),

    /** Oasisse Asteroid */
    VanillaOasis("Oasisse Asteroid"),

    /** Terrania Asteroid */
    TerraMoonlet("Terrania Asteroid"),

    /** Irradiated Forest Asteroid */
    IdealLandingSite("Irradiated Forest Asteroid"),

    /** Oily Swamp Asteroid */
    WarpOilySwamp("Oily Swamp Asteroid"),

    /** Regolith Asteroid */
    RegolithMoonlet("Regolith Asteroid"),

    /** Ceres Minor Asteroid */
    CeresSpacedOutAsteroid("Ceres Minor Asteroid"),

    /** Irradiated Swampy Asteroid */
    SwampyLandingSite("Irradiated Swampy Asteroid"),

    /** Rusty Oil Asteroid */
    OilRichWarpTarget("Rusty Oil Asteroid"),

    /** Folia Asteroid */
    ForestMoonlet("Folia Asteroid"),

    /** Quagmiris Asteroid */
    SwampMoonlet("Quagmiris Asteroid"),

    /** Irradiated Marsh Asteroid */
    MetalHeavyLandingSite("Irradiated Marsh Asteroid"),

    /** The Desolands Asteroid */
    MiniBadlands("The Desolands Asteroid"),

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampyStart("Metallic Swampy Asteroid (Start)"),

    /** Frozen Forest Asteroid */
    MiniForestFrozenWarp("Frozen Forest Asteroid"),

    /** Flipped Asteroid */
    MiniFlipped("Flipped Asteroid"),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOcean("Radioactive Ocean Asteroid"),

    /** The Desolands Asteroid */
    MiniBadlandsStart("The Desolands Asteroid"),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanWarp("Radioactive Ocean Asteroid"),

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampy("Metallic Swampy Asteroid"),

    /** Frozen Forest Asteroid */
    MiniForestFrozen("Frozen Forest Asteroid"),

    /** Metallic Swampy Asteroid */
    MiniBadlandsWarp("Metallic Swampy Asteroid"),

    /** Frozen Forest Asteroid */
    MiniForestFrozenStart("Frozen Forest Asteroid"),

    /** Flipped Asteroid */
    MiniFlippedStart("Flipped Asteroid"),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanStart("Radioactive Ocean Asteroid"),

    /** Flipped Asteroid */
    MiniFlippedWarp("Flipped Asteroid"),

    /**
     * Common outer asteroids
     */

    /** Tundra Asteroid */
    TundraMoonlet("Tundra Asteroid"),

    /** Marshy Asteroid */
    MarshyMoonlet("Marshy Asteroid"),

    /** Superconductive Asteroid */
    NiobiumMoonlet("Superconductive Asteroid"),

    /** Moo Asteroid */
    MooMoonlet("Moo Asteroid"),

    /** Water Asteroid */
    WaterMoonlet("Water Asteroid"),

    /** Regolith Asteroid */
    MiniRegolithMoonlet("Regolith Asteroid"),
}
