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

import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.asteroidTypeBadlands
import oni_seed_browser.app.generated.resources.asteroidTypeCeresBaseGameAsteroid
import oni_seed_browser.app.generated.resources.asteroidTypeCeresBaseGameShatteredAsteroid
import oni_seed_browser.app.generated.resources.asteroidTypeCeresClassicAsteroid
import oni_seed_browser.app.generated.resources.asteroidTypeCeresClassicShatteredAsteroid
import oni_seed_browser.app.generated.resources.asteroidTypeCeresSpacedOutAsteroid
import oni_seed_browser.app.generated.resources.asteroidTypeForestDefault
import oni_seed_browser.app.generated.resources.asteroidTypeForestHot
import oni_seed_browser.app.generated.resources.asteroidTypeForestLush
import oni_seed_browser.app.generated.resources.asteroidTypeForestMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeIdealLandingSite
import oni_seed_browser.app.generated.resources.asteroidTypeMarshyMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet
import oni_seed_browser.app.generated.resources.asteroidTypeMediumForestyWasteland
import oni_seed_browser.app.generated.resources.asteroidTypeMediumRadioactiveVanillaWarpPlanet
import oni_seed_browser.app.generated.resources.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet
import oni_seed_browser.app.generated.resources.asteroidTypeMediumSandySwamp
import oni_seed_browser.app.generated.resources.asteroidTypeMediumSwampy
import oni_seed_browser.app.generated.resources.asteroidTypeMetalHeavyLandingSite
import oni_seed_browser.app.generated.resources.asteroidTypeMiniBadlands
import oni_seed_browser.app.generated.resources.asteroidTypeMiniBadlandsStart
import oni_seed_browser.app.generated.resources.asteroidTypeMiniBadlandsWarp
import oni_seed_browser.app.generated.resources.asteroidTypeMiniFlipped
import oni_seed_browser.app.generated.resources.asteroidTypeMiniFlippedStart
import oni_seed_browser.app.generated.resources.asteroidTypeMiniFlippedWarp
import oni_seed_browser.app.generated.resources.asteroidTypeMiniForestFrozen
import oni_seed_browser.app.generated.resources.asteroidTypeMiniForestFrozenStart
import oni_seed_browser.app.generated.resources.asteroidTypeMiniForestFrozenWarp
import oni_seed_browser.app.generated.resources.asteroidTypeMiniMetallicSwampy
import oni_seed_browser.app.generated.resources.asteroidTypeMiniMetallicSwampyStart
import oni_seed_browser.app.generated.resources.asteroidTypeMiniRadioactiveOcean
import oni_seed_browser.app.generated.resources.asteroidTypeMiniRadioactiveOceanStart
import oni_seed_browser.app.generated.resources.asteroidTypeMiniRadioactiveOceanWarp
import oni_seed_browser.app.generated.resources.asteroidTypeMiniRegolithMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeMixingCeresAsteroid
import oni_seed_browser.app.generated.resources.asteroidTypeMooMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeNiobiumMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeOasis
import oni_seed_browser.app.generated.resources.asteroidTypeOceania
import oni_seed_browser.app.generated.resources.asteroidTypeOilRichWarpTarget
import oni_seed_browser.app.generated.resources.asteroidTypeRegolithMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeSandstoneDefault
import oni_seed_browser.app.generated.resources.asteroidTypeSandstoneFrozen
import oni_seed_browser.app.generated.resources.asteroidTypeSwampMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeSwampyLandingSite
import oni_seed_browser.app.generated.resources.asteroidTypeTerraMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeTundraMoonlet
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaArboria
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaAridio
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaBadlands
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaForestDefault
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaOasis
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaOceania
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaSandstoneDefault
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaSandstoneFrozen
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaSwampDefault
import oni_seed_browser.app.generated.resources.asteroidTypeVanillaVolcanic
import oni_seed_browser.app.generated.resources.asteroidTypeVolcanic
import oni_seed_browser.app.generated.resources.asteroidTypeWarpOilySwamp
import oni_seed_browser.app.generated.resources.asteroidTypeWaterMoonlet
import org.jetbrains.compose.resources.StringResource

/**
 * See https://oxygennotincluded.fandom.com/wiki/Planetoid_Clusters
 */
enum class AsteroidType(
    val stringResource: StringResource
) {

    /** Terra Asteroid */
    SandstoneDefault(Res.string.asteroidTypeSandstoneDefault),

    /** Ceres Asteroid */
    CeresBaseGameAsteroid(Res.string.asteroidTypeCeresBaseGameAsteroid),

    /** Blasted Ceres Asteroid */
    CeresBaseGameShatteredAsteroid(Res.string.asteroidTypeCeresBaseGameShatteredAsteroid),

    /** Oceania Asteroid */
    Oceania(Res.string.asteroidTypeOceania),

    /** Rime Asteroid */
    SandstoneFrozen(Res.string.asteroidTypeSandstoneFrozen),

    /** Verdante Asteroid */
    ForestLush(Res.string.asteroidTypeForestLush),

    /** Arboria Asteroid */
    ForestDefault(Res.string.asteroidTypeForestDefault),

    /** Volcanea Asteroid */
    Volcanic(Res.string.asteroidTypeVolcanic),

    /** The Badlands Asteroid */
    Badlands(Res.string.asteroidTypeBadlands),

    /** Aridio Asteroid */
    ForestHot(Res.string.asteroidTypeForestHot),

    /** Oasisse Asteroid */
    Oasis(Res.string.asteroidTypeOasis),

    /** Terra Asteroid */
    VanillaSandstoneDefault(Res.string.asteroidTypeVanillaSandstoneDefault),

    /** Radioactive Swamp Asteroid */
    MediumRadioactiveVanillaWarpPlanet(Res.string.asteroidTypeMediumRadioactiveVanillaWarpPlanet),

    /** Ceres Asteroid */
    CeresClassicAsteroid(Res.string.asteroidTypeCeresClassicAsteroid),

    /** Stinko Swamp Asteroid */
    MediumSwampy(Res.string.asteroidTypeMediumSwampy),

    /** Oceania Asteroid */
    VanillaOceania(Res.string.asteroidTypeVanillaOceania),

    /** Glowood Wasteland Asteroid */
    MediumForestyWasteland(Res.string.asteroidTypeMediumForestyWasteland),

    /** Squelchy Asteroid */
    VanillaSwampDefault(Res.string.asteroidTypeVanillaSwampDefault),

    /** Radioactive Forest Asteroid */
    MediumForestyRadioactiveVanillaWarpPlanet(Res.string.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet),

    /** Rime Asteroid */
    VanillaSandstoneFrozen(Res.string.asteroidTypeVanillaSandstoneFrozen),

    /** Verdante Asteroid */
    VanillaForestDefault(Res.string.asteroidTypeVanillaForestDefault),

    /** Radioactive Terra Asteroid */
    MediumSandyRadioactiveVanillaWarpPlanet(Res.string.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet),

    /** Arboria Asteroid */
    VanillaArboria(Res.string.asteroidTypeVanillaArboria),

    /** Volcanea Asteroid */
    VanillaVolcanic(Res.string.asteroidTypeVanillaVolcanic),

    /** The Badlands Asteroid */
    VanillaBadlands(Res.string.asteroidTypeVanillaBadlands),

    /** Aridio Asteroid */
    VanillaAridio(Res.string.asteroidTypeVanillaAridio),

    /** Radioactive Terrabog Asteroid */
    MediumSandySwamp(Res.string.asteroidTypeMediumSandySwamp),

    /** Oasisse Asteroid */
    VanillaOasis(Res.string.asteroidTypeVanillaOasis),

    /** Terrania Asteroid */
    TerraMoonlet(Res.string.asteroidTypeTerraMoonlet),

    /** Irradiated Forest Asteroid */
    IdealLandingSite(Res.string.asteroidTypeIdealLandingSite),

    /** Oily Swamp Asteroid */
    WarpOilySwamp(Res.string.asteroidTypeWarpOilySwamp),

    /** Regolith Asteroid */
    RegolithMoonlet(Res.string.asteroidTypeRegolithMoonlet),

    /** Ceres Minor Asteroid */
    CeresSpacedOutAsteroid(Res.string.asteroidTypeCeresSpacedOutAsteroid),

    /** Irradiated Swampy Asteroid */
    SwampyLandingSite(Res.string.asteroidTypeSwampyLandingSite),

    /** Rusty Oil Asteroid */
    OilRichWarpTarget(Res.string.asteroidTypeOilRichWarpTarget),

    /** Folia Asteroid */
    ForestMoonlet(Res.string.asteroidTypeForestMoonlet),

    /** Quagmiris Asteroid */
    SwampMoonlet(Res.string.asteroidTypeSwampMoonlet),

    /** Irradiated Marsh Asteroid */
    MetalHeavyLandingSite(Res.string.asteroidTypeMetalHeavyLandingSite),

    /** The Desolands Asteroid */
    MiniBadlands(Res.string.asteroidTypeMiniBadlands),

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampyStart(Res.string.asteroidTypeMiniMetallicSwampyStart),

    /** Frozen Forest Asteroid */
    MiniForestFrozenWarp(Res.string.asteroidTypeMiniForestFrozenWarp),

    /** Flipped Asteroid */
    MiniFlipped(Res.string.asteroidTypeMiniFlipped),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOcean(Res.string.asteroidTypeMiniRadioactiveOcean),

    /** The Desolands Asteroid */
    MiniBadlandsStart(Res.string.asteroidTypeMiniBadlandsStart),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanWarp(Res.string.asteroidTypeMiniRadioactiveOceanWarp),

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampy(Res.string.asteroidTypeMiniMetallicSwampy),

    /** Frozen Forest Asteroid */
    MiniForestFrozen(Res.string.asteroidTypeMiniForestFrozen),

    /** Metallic Swampy Asteroid */
    MiniBadlandsWarp(Res.string.asteroidTypeMiniBadlandsWarp),

    /** Frozen Forest Asteroid */
    MiniForestFrozenStart(Res.string.asteroidTypeMiniForestFrozenStart),

    /** Flipped Asteroid */
    MiniFlippedStart(Res.string.asteroidTypeMiniFlippedStart),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanStart(Res.string.asteroidTypeMiniRadioactiveOceanStart),

    /** Flipped Asteroid */
    MiniFlippedWarp(Res.string.asteroidTypeMiniFlippedWarp),

    /**
     * Common outer asteroids
     */

    /** Tundra Asteroid */
    TundraMoonlet(Res.string.asteroidTypeTundraMoonlet),

    /** Marshy Asteroid */
    MarshyMoonlet(Res.string.asteroidTypeMarshyMoonlet),

    /** Superconductive Asteroid */
    NiobiumMoonlet(Res.string.asteroidTypeNiobiumMoonlet),

    /** Moo Asteroid */
    MooMoonlet(Res.string.asteroidTypeMooMoonlet),

    /** Water Asteroid */
    WaterMoonlet(Res.string.asteroidTypeWaterMoonlet),

    /** Regolith Asteroid */
    MiniRegolithMoonlet(Res.string.asteroidTypeMiniRegolithMoonlet),

    MixingCeresAsteroid(Res.string.asteroidTypeMixingCeresAsteroid),

    CeresClassicShatteredAsteroid(Res.string.asteroidTypeCeresClassicShatteredAsteroid)
}
