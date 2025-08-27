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
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMixingPrehistoricAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMooMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeNiobiumMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOasis
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOceania
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOilRichWarpTarget
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricClassicAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricShatteredBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricShatteredClassicAsteroid
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
enum class AsteroidType {

    /** Terra Asteroid */
    SandstoneDefault,

    /** Ceres Asteroid */
    CeresBaseGameAsteroid,

    /** Blasted Ceres Asteroid */
    CeresBaseGameShatteredAsteroid,

    /** Relica Asteroid */
    PrehistoricBaseGameAsteroid,

    /** Oceania Asteroid */
    Oceania,

    /** Rime Asteroid */
    SandstoneFrozen,

    /** Verdante Asteroid */
    ForestLush,

    /** Arboria Asteroid */
    ForestDefault,

    /** Volcanea Asteroid */
    Volcanic,

    /** The Badlands Asteroid */
    Badlands,

    /** Aridio Asteroid */
    ForestHot,

    /** Oasisse Asteroid */
    Oasis,

    /** Terra Asteroid */
    VanillaSandstoneDefault,

    /** Radioactive Swamp Asteroid */
    MediumRadioactiveVanillaWarpPlanet,

    /** Ceres Asteroid */
    CeresClassicAsteroid,

    /** Relica Asteroid */
    PrehistoricClassicAsteroid,

    /** Stinko Swamp Asteroid */
    MediumSwampy,

    /** Oceania Asteroid */
    VanillaOceania,

    /** Glowood Wasteland Asteroid */
    MediumForestyWasteland,

    /** Squelchy Asteroid */
    VanillaSwampDefault,

    /** Radioactive Forest Asteroid */
    MediumForestyRadioactiveVanillaWarpPlanet,

    /** Rime Asteroid */
    VanillaSandstoneFrozen,

    /** Verdante Asteroid */
    VanillaForestDefault,

    /** Radioactive Terra Asteroid */
    MediumSandyRadioactiveVanillaWarpPlanet,

    /** Arboria Asteroid */
    VanillaArboria,

    /** Volcanea Asteroid */
    VanillaVolcanic,

    /** The Badlands Asteroid */
    VanillaBadlands,

    /** Aridio Asteroid */
    VanillaAridio,

    /** Radioactive Terrabog Asteroid */
    MediumSandySwamp,

    /** Oasisse Asteroid */
    VanillaOasis,

    /** Terrania Asteroid */
    TerraMoonlet,

    /** Irradiated Forest Asteroid */
    IdealLandingSite,

    /** Oily Swamp Asteroid */
    WarpOilySwamp,

    WarpOilySandySwamp,

    /** Regolith Asteroid */
    RegolithMoonlet,

    /** Ceres Minor Asteroid */
    CeresSpacedOutAsteroid,

    /** Relica Minor Asteroid */
    PrehistoricSpacedOutAsteroid,

    /** Irradiated Swampy Asteroid */
    SwampyLandingSite,

    /** Rusty Oil Asteroid */
    OilRichWarpTarget,

    /** Folia Asteroid */
    ForestMoonlet,

    /** Quagmiris Asteroid */
    SwampMoonlet,

    /** Irradiated Marsh Asteroid */
    MetalHeavyLandingSite,

    /** The Desolands Asteroid */
    MiniBadlands,

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampyStart,

    /** Frozen Forest Asteroid */
    MiniForestFrozenWarp,

    /** Flipped Asteroid */
    MiniFlipped,

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOcean,

    /** The Desolands Asteroid */
    MiniBadlandsStart,

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanWarp,

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampy,

    /** Frozen Forest Asteroid */
    MiniForestFrozen,

    /** Metallic Swampy Asteroid */
    MiniBadlandsWarp,

    /** Frozen Forest Asteroid */
    MiniForestFrozenStart,

    /** Flipped Asteroid */
    MiniFlippedStart,

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanStart,

    /** Flipped Asteroid */
    MiniFlippedWarp,

    /**
     * Common outer asteroids
     */

    /** Tundra Asteroid */
    TundraMoonlet,

    /** Marshy Asteroid */
    MarshyMoonlet,

    /** Superconductive Asteroid */
    NiobiumMoonlet,

    /** Moo Asteroid */
    MooMoonlet,

    /** Water Asteroid */
    WaterMoonlet,

    /** Regolith Asteroid */
    MiniRegolithMoonlet,

    MixingCeresAsteroid,

    CeresClassicShatteredAsteroid,

    MiniShatteredStartAsteroid,

    MiniShatteredWarpAsteroid,

    MiniShatteredGeoAsteroid,

    PrehistoricShatteredBaseGameAsteroid,

    PrehistoricShatteredClassicAsteroid,

    MixingPrehistoricAsteroid;

    fun getStringResource(): StringResource = when(this) {
        SandstoneDefault -> Res.string.asteroidTypeSandstoneDefault
        CeresBaseGameAsteroid -> Res.string.asteroidTypeCeresBaseGameAsteroid
        CeresBaseGameShatteredAsteroid -> Res.string.asteroidTypeCeresBaseGameShatteredAsteroid
        PrehistoricBaseGameAsteroid -> Res.string.asteroidTypePrehistoricBaseGameAsteroid
        Oceania -> Res.string.asteroidTypeOceania
        SandstoneFrozen -> Res.string.asteroidTypeSandstoneFrozen
        ForestLush -> Res.string.asteroidTypeForestLush
        ForestDefault -> Res.string.asteroidTypeForestDefault
        Volcanic -> Res.string.asteroidTypeVolcanic
        Badlands -> Res.string.asteroidTypeBadlands
        ForestHot -> Res.string.asteroidTypeForestHot
        Oasis -> Res.string.asteroidTypeOasis
        VanillaSandstoneDefault -> Res.string.asteroidTypeVanillaSandstoneDefault
        MediumRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumRadioactiveVanillaWarpPlanet
        CeresClassicAsteroid -> Res.string.asteroidTypeCeresClassicAsteroid
        PrehistoricClassicAsteroid -> Res.string.asteroidTypePrehistoricClassicAsteroid
        MediumSwampy -> Res.string.asteroidTypeMediumSwampy
        VanillaOceania -> Res.string.asteroidTypeVanillaOceania
        MediumForestyWasteland -> Res.string.asteroidTypeMediumForestyWasteland
        VanillaSwampDefault -> Res.string.asteroidTypeVanillaSwampDefault
        MediumForestyRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet
        VanillaSandstoneFrozen -> Res.string.asteroidTypeVanillaSandstoneFrozen
        VanillaForestDefault -> Res.string.asteroidTypeVanillaForestDefault
        MediumSandyRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet
        VanillaArboria -> Res.string.asteroidTypeVanillaArboria
        VanillaVolcanic -> Res.string.asteroidTypeVanillaVolcanic
        VanillaBadlands -> Res.string.asteroidTypeVanillaBadlands
        VanillaAridio -> Res.string.asteroidTypeVanillaAridio
        MediumSandySwamp -> Res.string.asteroidTypeMediumSandySwamp
        VanillaOasis -> Res.string.asteroidTypeVanillaOasis
        TerraMoonlet -> Res.string.asteroidTypeTerraMoonlet
        IdealLandingSite -> Res.string.asteroidTypeIdealLandingSite
        WarpOilySwamp -> Res.string.asteroidTypeWarpOilySwamp
        WarpOilySandySwamp -> Res.string.asteroidTypeWarpOilySandySwamp
        RegolithMoonlet -> Res.string.asteroidTypeRegolithMoonlet
        CeresSpacedOutAsteroid -> Res.string.asteroidTypeCeresSpacedOutAsteroid
        PrehistoricSpacedOutAsteroid -> Res.string.asteroidTypePrehistoricSpacedOutAsteroid
        SwampyLandingSite -> Res.string.asteroidTypeSwampyLandingSite
        OilRichWarpTarget -> Res.string.asteroidTypeOilRichWarpTarget
        ForestMoonlet -> Res.string.asteroidTypeForestMoonlet
        SwampMoonlet -> Res.string.asteroidTypeSwampMoonlet
        MetalHeavyLandingSite -> Res.string.asteroidTypeMetalHeavyLandingSite
        MiniBadlands -> Res.string.asteroidTypeMiniBadlands
        MiniMetallicSwampyStart -> Res.string.asteroidTypeMiniMetallicSwampyStart
        MiniForestFrozenWarp -> Res.string.asteroidTypeMiniForestFrozenWarp
        MiniFlipped -> Res.string.asteroidTypeMiniFlipped
        MiniRadioactiveOcean -> Res.string.asteroidTypeMiniRadioactiveOcean
        MiniBadlandsStart -> Res.string.asteroidTypeMiniBadlandsStart
        MiniRadioactiveOceanWarp -> Res.string.asteroidTypeMiniRadioactiveOceanWarp
        MiniMetallicSwampy -> Res.string.asteroidTypeMiniMetallicSwampy
        MiniForestFrozen -> Res.string.asteroidTypeMiniForestFrozen
        MiniBadlandsWarp -> Res.string.asteroidTypeMiniBadlandsWarp
        MiniForestFrozenStart -> Res.string.asteroidTypeMiniForestFrozenStart
        MiniFlippedStart -> Res.string.asteroidTypeMiniFlippedStart
        MiniRadioactiveOceanStart -> Res.string.asteroidTypeMiniRadioactiveOceanStart
        MiniFlippedWarp -> Res.string.asteroidTypeMiniFlippedWarp
        TundraMoonlet -> Res.string.asteroidTypeTundraMoonlet
        MarshyMoonlet -> Res.string.asteroidTypeMarshyMoonlet
        NiobiumMoonlet -> Res.string.asteroidTypeNiobiumMoonlet
        MooMoonlet -> Res.string.asteroidTypeMooMoonlet
        WaterMoonlet -> Res.string.asteroidTypeWaterMoonlet
        MiniRegolithMoonlet -> Res.string.asteroidTypeMiniRegolithMoonlet
        MixingCeresAsteroid -> Res.string.asteroidTypeMixingCeresAsteroid
        CeresClassicShatteredAsteroid -> Res.string.asteroidTypeCeresClassicShatteredAsteroid
        MiniShatteredStartAsteroid -> Res.string.asteroidTypeMiniShatteredStartAsteroid
        MiniShatteredWarpAsteroid -> Res.string.asteroidTypeMiniShatteredWarpAsteroid
        MiniShatteredGeoAsteroid -> Res.string.asteroidTypeMiniShatteredGeoAsteroid
        PrehistoricShatteredBaseGameAsteroid -> Res.string.asteroidTypePrehistoricShatteredBaseGameAsteroid
        PrehistoricShatteredClassicAsteroid -> Res.string.asteroidTypePrehistoricShatteredClassicAsteroid
        MixingPrehistoricAsteroid -> Res.string.asteroidTypeMixingPrehistoricAsteroid
    }
}
