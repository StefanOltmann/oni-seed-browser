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

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.asteroidTypeBadlands
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresBaseGameShatteredAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresClassicAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresClassicShatteredAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresSpacedOutAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestHot
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestLush
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeIdealLandingSite
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMarshyMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumForestyWasteland
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumRadioactiveVanillaWarpPlanet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumSandySwamp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumSwampy
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMetalHeavyLandingSite
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniBadlands
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniBadlandsStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniBadlandsWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniFlipped
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniFlippedStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniFlippedWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniForestFrozen
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniForestFrozenStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniForestFrozenWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniMetallicSwampy
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniMetallicSwampyStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRadioactiveOcean
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRadioactiveOceanStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRadioactiveOceanWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRegolithMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniShatteredGeoAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniShatteredStartAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniShatteredWarpAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMixingCeresAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMooMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeNiobiumMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOasis
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOceania
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOilRichWarpTarget
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricClassicAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricSpacedOutAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeRegolithMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSandstoneDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSandstoneFrozen
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSwampMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSwampyLandingSite
import io.github.stefanoltmann.app.generated.resources.asteroidTypeTerraMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeTundraMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaArboria
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaAridio
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaBadlands
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaForestDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaOasis
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaOceania
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaSandstoneDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaSandstoneFrozen
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaSwampDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaVolcanic
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVolcanic
import io.github.stefanoltmann.app.generated.resources.asteroidTypeWarpOilySandySwamp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeWarpOilySwamp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeWaterMoonlet
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

    /** Relica Asteroid */
    PrehistoricBaseGameAsteroid(Res.string.asteroidTypePrehistoricBaseGameAsteroid),

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

    /** Relica Asteroid */
    PrehistoricClassicAsteroid(Res.string.asteroidTypePrehistoricClassicAsteroid),

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

    WarpOilySandySwamp(Res.string.asteroidTypeWarpOilySandySwamp),

    /** Regolith Asteroid */
    RegolithMoonlet(Res.string.asteroidTypeRegolithMoonlet),

    /** Ceres Minor Asteroid */
    CeresSpacedOutAsteroid(Res.string.asteroidTypeCeresSpacedOutAsteroid),

    /** Relica Minor Asteroid */
    PrehistoricSpacedOutAsteroid(Res.string.asteroidTypePrehistoricSpacedOutAsteroid),

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

    CeresClassicShatteredAsteroid(Res.string.asteroidTypeCeresClassicShatteredAsteroid),

    MiniShatteredStartAsteroid(Res.string.asteroidTypeMiniShatteredStartAsteroid),

    MiniShatteredWarpAsteroid(Res.string.asteroidTypeMiniShatteredWarpAsteroid),

    MiniShatteredGeoAsteroid(Res.string.asteroidTypeMiniShatteredGeoAsteroid)

}
