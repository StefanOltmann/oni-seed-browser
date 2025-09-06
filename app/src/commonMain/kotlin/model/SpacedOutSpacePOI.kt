/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de
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

@Suppress("all")
enum class SpacedOutSpacePOI(
    id: Byte
) {

    /*
     * Asteroids
     */

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

    WarpOilySandySwamp(69),

    /*
     * Others
     */

    ArtifactSpacePOI_GravitasSpaceStation1(70),
    ArtifactSpacePOI_GravitasSpaceStation2(71),
    ArtifactSpacePOI_GravitasSpaceStation3(72),
    ArtifactSpacePOI_GravitasSpaceStation4(73),
    ArtifactSpacePOI_GravitasSpaceStation5(74),
    ArtifactSpacePOI_GravitasSpaceStation6(75),
    ArtifactSpacePOI_GravitasSpaceStation7(76),
    ArtifactSpacePOI_GravitasSpaceStation8(77),
    ArtifactSpacePOI_RussellsTeapot(78),
    HarvestableSpacePOI_CarbonAsteroidField(79),
    HarvestableSpacePOI_ChlorineCloud(80),
    HarvestableSpacePOI_DLC2CeresField(81),
    HarvestableSpacePOI_DLC2CeresOreField(82),
    HarvestableSpacePOI_ForestyOreField(83),
    HarvestableSpacePOI_FrozenOreField(84),
    HarvestableSpacePOI_GasGiantCloud(85),
    HarvestableSpacePOI_GildedAsteroidField(86),
    HarvestableSpacePOI_GlimmeringAsteroidField(87),
    HarvestableSpacePOI_HeliumCloud(88),
    HarvestableSpacePOI_IceAsteroidField(89),
    HarvestableSpacePOI_InterstellarIceField(90),
    HarvestableSpacePOI_InterstellarOcean(91),
    HarvestableSpacePOI_MetallicAsteroidField(92),
    HarvestableSpacePOI_OilyAsteroidField(93),
    HarvestableSpacePOI_OrganicMassField(94),
    HarvestableSpacePOI_OxidizedAsteroidField(95),
    HarvestableSpacePOI_OxygenRichAsteroidField(96),
    HarvestableSpacePOI_RadioactiveAsteroidField(97),
    HarvestableSpacePOI_RadioactiveGasCloud(98),
    HarvestableSpacePOI_RockyAsteroidField(99),
    HarvestableSpacePOI_SaltyAsteroidField(100),
    HarvestableSpacePOI_SandyOreField(101),
    HarvestableSpacePOI_SatelliteField(102),
    HarvestableSpacePOI_SwampyOreField(103),
    HarvestableSpacePOI_DLC4PrehistoricMixingField(104),
    HarvestableSpacePOI_DLC4PrehistoricOreField(105),
    HarvestableSpacePOI_DLC4ImpactorDebrisField1(106),
    HarvestableSpacePOI_DLC4ImpactorDebrisField2(107),
    HarvestableSpacePOI_DLC4ImpactorDebrisField3(108),
    TemporalTear(109)
}
