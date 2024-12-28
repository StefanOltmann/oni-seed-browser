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
import model.filter.GameModeType
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.clusterTypeBaseArboria
import oni_seed_browser.app.generated.resources.clusterTypeBaseAridio
import oni_seed_browser.app.generated.resources.clusterTypeBaseBlastedCeres
import oni_seed_browser.app.generated.resources.clusterTypeBaseCeres
import oni_seed_browser.app.generated.resources.clusterTypeBaseOasisse
import oni_seed_browser.app.generated.resources.clusterTypeBaseOceania
import oni_seed_browser.app.generated.resources.clusterTypeBaseRime
import oni_seed_browser.app.generated.resources.clusterTypeBaseTerra
import oni_seed_browser.app.generated.resources.clusterTypeBaseTheBadlands
import oni_seed_browser.app.generated.resources.clusterTypeBaseVerdante
import oni_seed_browser.app.generated.resources.clusterTypeBaseVolcanea
import oni_seed_browser.app.generated.resources.clusterTypeDlcArboria
import oni_seed_browser.app.generated.resources.clusterTypeDlcAridio
import oni_seed_browser.app.generated.resources.clusterTypeDlcBlastedCeres
import oni_seed_browser.app.generated.resources.clusterTypeDlcCeres
import oni_seed_browser.app.generated.resources.clusterTypeDlcCeresMantle
import oni_seed_browser.app.generated.resources.clusterTypeDlcCeresMinor
import oni_seed_browser.app.generated.resources.clusterTypeDlcFlippedMoonlet
import oni_seed_browser.app.generated.resources.clusterTypeDlcFolia
import oni_seed_browser.app.generated.resources.clusterTypeDlcFrozenForestMoonlet
import oni_seed_browser.app.generated.resources.clusterTypeDlcMetallicSwampyMoonlet
import oni_seed_browser.app.generated.resources.clusterTypeDlcOasisse
import oni_seed_browser.app.generated.resources.clusterTypeDlcOceania
import oni_seed_browser.app.generated.resources.clusterTypeDlcQuagmiris
import oni_seed_browser.app.generated.resources.clusterTypeDlcRadioactiveOceanMoonlet
import oni_seed_browser.app.generated.resources.clusterTypeDlcRime
import oni_seed_browser.app.generated.resources.clusterTypeDlcSquelchy
import oni_seed_browser.app.generated.resources.clusterTypeDlcTerra
import oni_seed_browser.app.generated.resources.clusterTypeDlcTerrania
import oni_seed_browser.app.generated.resources.clusterTypeDlcTheBadlands
import oni_seed_browser.app.generated.resources.clusterTypeDlcTheDesolandsMoonlet
import oni_seed_browser.app.generated.resources.clusterTypeDlcVerdante
import oni_seed_browser.app.generated.resources.clusterTypeDlcVolcanea
import org.jetbrains.compose.resources.StringResource

@Suppress("UNUSED")
@Serializable
enum class ClusterType(
    val prefix: String,
    val requiredDlcs: List<Dlc>,
    val gameMode: GameModeType,
    val nameStringResource: StringResource,
    val asteroidTypes: List<AsteroidType>,
    val starMapRadius: Int = 12
) {

    /** Terra */
    BASE_TERRA(
        prefix = "SNDST-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseTerra,
        asteroidTypes = listOf(
            AsteroidType.SandstoneDefault
        )
    ),

    /** Ceres */
    BASE_CERES(
        prefix = "CER-A",
        requiredDlcs = listOf(Dlc.BaseGame, Dlc.FrostyPlanet),
        nameStringResource = Res.string.clusterTypeBaseCeres,
        gameMode = GameModeType.BASEGAME_STANDARD,
        asteroidTypes = listOf(
            AsteroidType.CeresBaseGameAsteroid
        )
    ),

    /** Blasted Ceres */
    BASE_BLASTED_CERES(
        prefix = "CERS-A",
        requiredDlcs = listOf(Dlc.BaseGame, Dlc.FrostyPlanet),
        gameMode = GameModeType.BASEGAME_THELAB,
        nameStringResource = Res.string.clusterTypeBaseBlastedCeres,
        asteroidTypes = listOf(
            AsteroidType.CeresBaseGameShatteredAsteroid
        )
    ),

    /** Oceania */
    BASE_OCEANIA(
        prefix = "OCAN-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseOceania,
        asteroidTypes = listOf(
            AsteroidType.Oceania
        )
    ),

    /** Rime */
    BASE_RIME(
        prefix = "S-FRZ",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseRime,
        asteroidTypes = listOf(
            AsteroidType.SandstoneFrozen
        )
    ),

    /** Verdante */
    BASE_VERDANTE(
        prefix = "LUSH-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseVerdante,
        asteroidTypes = listOf(
            AsteroidType.ForestLush
        )
    ),

    /** Arboria */
    BASE_ARBORIA(
        prefix = "FRST-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseArboria,
        asteroidTypes = listOf(
            AsteroidType.ForestDefault
        )
    ),

    /** Volcanea */
    BASE_VOLCANEA(
        prefix = "VOLCA",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseVolcanea,
        asteroidTypes = listOf(
            AsteroidType.Volcanic
        )
    ),

    /** The Badlands */
    BASE_THE_BADLANDS(
        prefix = "BAD-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseTheBadlands,
        asteroidTypes = listOf(
            AsteroidType.Badlands
        )
    ),

    /** Aridio */
    BASE_ARIDIO(
        prefix = "HTFST-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseAridio,
        asteroidTypes = listOf(
            AsteroidType.ForestHot
        )
    ),

    /** Oasisse */
    BASE_OASISSE(
        prefix = "OASIS-A",
        requiredDlcs = listOf(Dlc.BaseGame),
        gameMode = GameModeType.BASEGAME_STANDARD,
        nameStringResource = Res.string.clusterTypeBaseOasisse,
        asteroidTypes = listOf(
            AsteroidType.Oasis
        )
    ),

    /** Terra */
    DLC_TERRA(
        prefix = "V-SNDST-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcTerra,
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
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcCeres,
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

    /** Ceres (lab) */
    DLC_BLASTED_CERES(
        prefix = "V-CERS-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_THELAB,
        nameStringResource = Res.string.clusterTypeDlcBlastedCeres,
        asteroidTypes = listOf(
            AsteroidType.CeresClassicShatteredAsteroid,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcOceania,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcSquelchy,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcRime,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcVerdante,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcArboria,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcVolcanea,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcTheBadlands,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcAridio,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_CLASSIC,
        nameStringResource = Res.string.clusterTypeDlcOasisse,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcTerrania,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcCeresMinor,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcFolia,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcQuagmiris,
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
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcMetallicSwampyMoonlet,
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
        starMapRadius = 14
    ),

    /** The Desolands Moonlet */
    DLC_THE_DESOLANDS_MOONLET(
        prefix = "M-BAD-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcTheDesolandsMoonlet,
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
        starMapRadius = 14
    ),

    /** Frozen Forest Moonlet */
    DLC_FROZEN_FOREST_MOONLET(
        prefix = "M-FRZ-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcFrozenForestMoonlet,
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
        starMapRadius = 14
    ),

    /** Flipped Moonlet */
    DLC_FLIPPED_MOONLET(
        prefix = "M-FLIP-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcFlippedMoonlet,
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
        starMapRadius = 14
    ),

    /** Radioactive Ocean Moonlet */
    DLC_RADIOACTIVE_OCEAN_MOONLET(
        prefix = "M-RAD-C",
        requiredDlcs = listOf(Dlc.SpacedOut),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcRadioactiveOceanMoonlet,
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
        starMapRadius = 14
    ),

    /** Radioactive Ocean Moonlet */
    DLC_CERES_MANTLE(
        prefix = "M-CERS-C",
        requiredDlcs = listOf(Dlc.SpacedOut, Dlc.FrostyPlanet),
        gameMode = GameModeType.SPACEDOUT_SPACEDOUT,
        nameStringResource = Res.string.clusterTypeDlcCeresMantle,
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
        starMapRadius = 14
    );

    fun dlcRequirementsFulfilled(requirements: List<Dlc>): Boolean =
        requirements.containsAll(requiredDlcs)

    fun isFrostyPlanet(): Boolean =
        requiredDlcs.contains(Dlc.FrostyPlanet)

    fun isBaseGame(): Boolean =
        requiredDlcs.contains(Dlc.BaseGame)
}
