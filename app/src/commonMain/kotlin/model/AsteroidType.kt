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
enum class AsteroidType(
    val id: Byte
) {

    /** Terra Asteroid */
    SandstoneDefault(0),

    /** Ceres Asteroid */
    CeresBaseGameAsteroid(1),

    /** Blasted Ceres Asteroid */
    CeresBaseGameShatteredAsteroid(2),

    /** Oceania Asteroid */
    Oceania(3),

    /** Rime Asteroid */
    SandstoneFrozen(4),

    /** Verdante Asteroid */
    ForestLush(5),

    /** Arboria Asteroid */
    ForestDefault(6),

    /** Volcanea Asteroid */
    Volcanic(7),

    /** The Badlands Asteroid */
    Badlands(8),

    /** Aridio Asteroid */
    ForestHot(9),

    /** Oasisse Asteroid */
    Oasis(10),

    /** Terra Asteroid */
    VanillaSandstoneDefault(11),

    /** Radioactive Swamp Asteroid */
    MediumRadioactiveVanillaWarpPlanet(12),

    /** Ceres Asteroid */
    CeresClassicAsteroid(13),

    /** Stinko Swamp Asteroid */
    MediumSwampy(14),

    /** Oceania Asteroid */
    VanillaOceania(15),

    /** Glowood Wasteland Asteroid */
    MediumForestyWasteland(16),

    /** Squelchy Asteroid */
    VanillaSwampDefault(17),

    /** Radioactive Forest Asteroid */
    MediumForestyRadioactiveVanillaWarpPlanet(18),

    /** Rime Asteroid */
    VanillaSandstoneFrozen(19),

    /** Verdante Asteroid */
    VanillaForestDefault(20),

    /** Radioactive Terra Asteroid */
    MediumSandyRadioactiveVanillaWarpPlanet(21),

    /** Arboria Asteroid */
    VanillaArboria(22),

    /** Volcanea Asteroid */
    VanillaVolcanic(23),

    /** The Badlands Asteroid */
    VanillaBadlands(24),

    /** Aridio Asteroid */
    VanillaAridio(25),

    /** Radioactive Terrabog Asteroid */
    MediumSandySwamp(26),

    /** Oasisse Asteroid */
    VanillaOasis(27),

    /** Terrania Asteroid */
    TerraMoonlet(28),

    /** Irradiated Forest Asteroid */
    IdealLandingSite(29),

    /** Oily Swamp Asteroid */
    WarpOilySwamp(30),

    /** Regolith Asteroid */
    RegolithMoonlet(31),

    /** Ceres Minor Asteroid */
    CeresSpacedOutAsteroid(32),

    /** Irradiated Swampy Asteroid */
    SwampyLandingSite(33),

    /** Rusty Oil Asteroid */
    OilRichWarpTarget(34),

    /** Folia Asteroid */
    ForestMoonlet(35),

    /** Quagmiris Asteroid */
    SwampMoonlet(36),

    /** Irradiated Marsh Asteroid */
    MetalHeavyLandingSite(37),

    /** The Desolands Asteroid */
    MiniBadlands(38),

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampyStart(39),

    /** Frozen Forest Asteroid */
    MiniForestFrozenWarp(40),

    /** Flipped Asteroid */
    MiniFlipped(41),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOcean(42),

    /** The Desolands Asteroid */
    MiniBadlandsStart(43),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanWarp(44),

    /** Metallic Swampy Asteroid */
    MiniMetallicSwampy(45),

    /** Frozen Forest Asteroid */
    MiniForestFrozen(46),

    /** Metallic Swampy Asteroid */
    MiniBadlandsWarp(47),

    /** Frozen Forest Asteroid */
    MiniForestFrozenStart(48),

    /** Flipped Asteroid */
    MiniFlippedStart(49),

    /** Radioactive Ocean Asteroid */
    MiniRadioactiveOceanStart(50),

    /** Flipped Asteroid */
    MiniFlippedWarp(51),

    /**
     * Common outer asteroids
     */

    /** Tundra Asteroid */
    TundraMoonlet(52),

    /** Marshy Asteroid */
    MarshyMoonlet(53),

    /** Superconductive Asteroid */
    NiobiumMoonlet(54),

    /** Moo Asteroid */
    MooMoonlet(55),

    /** Water Asteroid */
    WaterMoonlet(56),

    /** Regolith Asteroid */
    MiniRegolithMoonlet(57),

    MixingCeresAsteroid(58),

    CeresClassicShatteredAsteroid(59),

    MiniShatteredStartAsteroid(60),

    MiniShatteredWarpAsteroid(61),

    MiniShatteredGeoAsteroid(62),

    PrehistoricBaseGameAsteroid(63),

    PrehistoricClassicAsteroid(64),

    PrehistoricSpacedOutAsteroid(65),

    PrehistoricShatteredBaseGameAsteroid(66),

    PrehistoricShatteredClassicAsteroid(67),

    MixingPrehistoricAsteroid(68),

    WarpOilySandySwamp(69);

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
