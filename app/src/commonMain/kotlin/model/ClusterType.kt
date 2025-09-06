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

import kotlinx.serialization.Serializable

@Suppress("UNUSED")
@Serializable
enum class ClusterType(
    val prefix: String,
    val requiredDlcs: List<Dlc>,
    val gameMode: GameModeType,
    val asteroidTypes: List<AsteroidType>,
    val exportCollection: ClusterExportCollection,
    val starMapRadius: Int = 12
) {

    /** Terra */
    BASE_TERRA(
        prefix = "SNDST-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.SandstoneDefault
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Ceres */
    BASE_CERES(
        prefix = "CER-A",
        requiredDlcs = listOf(Dlc.BaseGame, Dlc.FrostyPlanet),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.CeresBaseGameAsteroid
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Blasted Ceres */
    BASE_BLASTED_CERES(
        prefix = "CERS-A",
        requiredDlcs = listOf(Dlc.BaseGame, Dlc.FrostyPlanet),
        gameMode = GameModeType.BASEGAME_THELAB,
        asteroidTypes = listOf(
            AsteroidType.CeresBaseGameShatteredAsteroid
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Relica */
    BASE_RELICA(
        prefix = "PRE-A",
        requiredDlcs = listOf(Dlc.BaseGame, Dlc.PrehistoricPlanet),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.PrehistoricBaseGameAsteroid
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** RelicAAAAAAAGHH */
    BASE_RELICA_LAB(
        prefix = "PRES-A",
        requiredDlcs = listOf(Dlc.BaseGame, Dlc.PrehistoricPlanet),
        gameMode = GameModeType.BASEGAME_THELAB,
        asteroidTypes = listOf(
            AsteroidType.PrehistoricShatteredBaseGameAsteroid
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Oceania */
    BASE_OCEANIA(
        prefix = "OCAN-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.Oceania
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Rime */
    BASE_RIME(
        prefix = "S-FRZ",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.SandstoneFrozen
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Verdante */
    BASE_VERDANTE(
        prefix = "LUSH-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.ForestLush
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Arboria */
    BASE_ARBORIA(
        prefix = "FRST-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.ForestDefault
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Volcanea */
    BASE_VOLCANEA(
        prefix = "VOLCA",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.Volcanic
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** The Badlands */
    BASE_THE_BADLANDS(
        prefix = "BAD-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.Badlands
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Aridio */
    BASE_ARIDIO(
        prefix = "HTFST-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.ForestHot
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Oasisse */
    BASE_OASISSE(
        prefix = "OASIS-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.Oasis
        ),
        exportCollection = ClusterExportCollection.BASEGAME
    ),

    /** Terra */
    DLC_TERRA(
        prefix = "V-SNDST-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaSandstoneDefault,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Ceres */
    DLC_CERES(
        prefix = "V-CER-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.CeresClassicAsteroid,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_2
    ),

    /** Ceres (lab) */
    DLC_BLASTED_CERES(
        prefix = "V-CERS-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_THELAB,
        asteroidTypes = listOf(
            AsteroidType.CeresClassicShatteredAsteroid,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_2
    ),

    /** Relica */
    DLC_RELICA(
        prefix = "V-PRE-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.PrehistoricPlanet),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.PrehistoricClassicAsteroid,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_2
    ),

    /** RelicAAAAAAAGHH */
    DLC_RELICA_LAB(
        prefix = "V-PRES-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.PrehistoricPlanet),
        gameMode = GameModeType.SPACEDOUT_THELAB,
        asteroidTypes = listOf(
            AsteroidType.PrehistoricShatteredClassicAsteroid,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_2
    ),

    /** Oceania */
    DLC_OCEANIA(
        prefix = "V-OCAN-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaOceania,
            AsteroidType.MediumForestyWasteland,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Squelchy */
    DLC_SQUELCHY(
        prefix = "V-SWMP-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaSwampDefault,
            AsteroidType.MediumForestyRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Rime */
    DLC_RIME(
        prefix = "V-SFRZ-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaSandstoneFrozen,
            AsteroidType.MediumSwampy,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Verdante */
    DLC_VERDANTE(
        prefix = "V-LUSH-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaForestDefault,
            AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Arboria */
    DLC_ARBORIA(
        prefix = "V-FRST-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaArboria,
            AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Volcanea */
    DLC_VOLCANEA(
        prefix = "V-VOLCA-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaVolcanic,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** The Badlands */
    DLC_THE_BADLANDS(
        prefix = "V-BAD-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaBadlands,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Aridio */
    DLC_ARIDIO(
        prefix = "V-HTFST-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaAridio,
            AsteroidType.MediumSandySwamp,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Oasisse */
    DLC_OASISSE(
        prefix = "V-OASIS-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        asteroidTypes = listOf(
            AsteroidType.VanillaOasis,
            AsteroidType.MediumRadioactiveVanillaWarpPlanet,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.MiniRegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.CLASSIC_1
    ),

    /** Terrania */
    DLC_TERRANIA(
        prefix = "SNDST-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
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
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT
    ),

    /** Ceres Minor */
    DLC_CERES_MINOR(
        prefix = "CER-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
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
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT
    ),

    /** Relica Minor */
    DLC_RELICA_MINOR(
        prefix = "PRE-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.PrehistoricPlanet),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        asteroidTypes = listOf(
            AsteroidType.PrehistoricSpacedOutAsteroid,
            AsteroidType.IdealLandingSite,
            AsteroidType.WarpOilySandySwamp,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT
    ),

    /** Folia */
    DLC_FOLIA(
        prefix = "FRST-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
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
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT
    ),

    /** Quagmiris */
    DLC_QUAGMIRIS(
        prefix = "SWMP-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
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
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT
    ),

    /** Metallic Swampy Moonlet */
    DLC_METALLIC_SWAMPY_MOONLET(
        prefix = "M-SWMP-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        asteroidTypes = listOf(
            AsteroidType.MiniMetallicSwampyStart,
            AsteroidType.MiniBadlands,
            AsteroidType.MiniForestFrozenWarp,
            AsteroidType.MiniFlipped,
            AsteroidType.MiniRadioactiveOcean,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT,
        starMapRadius = 14
    ),

    /** The Desolands Moonlet */
    DLC_THE_DESOLANDS_MOONLET(
        prefix = "M-BAD-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
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
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT,
        starMapRadius = 14
    ),

    /** Frozen Forest Moonlet */
    DLC_FROZEN_FOREST_MOONLET(
        prefix = "M-FRZ-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        asteroidTypes = listOf(
            AsteroidType.MiniForestFrozenStart,
            AsteroidType.MiniBadlandsWarp,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniFlipped,
            AsteroidType.MiniRadioactiveOcean,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT,
        starMapRadius = 14
    ),

    /** Flipped Moonlet */
    DLC_FLIPPED_MOONLET(
        prefix = "M-FLIP-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        asteroidTypes = listOf(
            AsteroidType.MiniFlippedStart,
            AsteroidType.MiniBadlandsWarp,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniForestFrozen,
            AsteroidType.MiniRadioactiveOcean,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT,
        starMapRadius = 14
    ),

    /** Radioactive Ocean Moonlet */
    DLC_RADIOACTIVE_OCEAN_MOONLET(
        prefix = "M-RAD-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        asteroidTypes = listOf(
            AsteroidType.MiniRadioactiveOceanStart,
            AsteroidType.MiniBadlands,
            AsteroidType.MiniFlippedWarp,
            AsteroidType.MiniMetallicSwampy,
            AsteroidType.MiniForestFrozen,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT,
        starMapRadius = 14
    ),

    /** Radioactive Ocean Moonlet */
    DLC_CERES_MANTLE(
        prefix = "M-CERS-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        asteroidTypes = listOf(
            AsteroidType.MiniShatteredStartAsteroid,
            AsteroidType.MiniShatteredWarpAsteroid,
            AsteroidType.MiniShatteredGeoAsteroid,
            AsteroidType.SwampyLandingSite,
            AsteroidType.TundraMoonlet,
            AsteroidType.MarshyMoonlet,
            AsteroidType.MooMoonlet,
            AsteroidType.WaterMoonlet,
            AsteroidType.NiobiumMoonlet,
            AsteroidType.RegolithMoonlet
        ),
        exportCollection = ClusterExportCollection.SPACEDOUT,
        starMapRadius = 14
    );

    fun dlcRequirementsFulfilled(requirements: List<Dlc>): Boolean =
        requirements.containsAll(requiredDlcs)

    fun isFrostyPlanet(): Boolean =
        requiredDlcs.contains(Dlc.FrostyPlanet)

    fun isBaseGame(): Boolean =
        requiredDlcs.contains(Dlc.BaseGame)
}
