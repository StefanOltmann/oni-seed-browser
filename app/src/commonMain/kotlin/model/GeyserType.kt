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
import io.github.stefanoltmann.app.generated.resources.geyserTypeAluminiumVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeCarbonDioxideGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCarbonDioxideVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeChlorineGasVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeCobaltVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeCoolSaltSlushGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCoolSlushGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCoolSteamVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeCopperVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeGoldVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeHotPollutedOxygenVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeHydrogenVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeInfectiousPollutedOxygenVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeIronVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeLeakyOilFissure
import io.github.stefanoltmann.app.generated.resources.geyserTypeLiquidSulfurGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeMinorVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeNaturalGasGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeNiobiumVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeOilReservoir
import io.github.stefanoltmann.app.generated.resources.geyserTypePollutedWaterVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeSaltWaterGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeSteamVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeTungstenVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeWaterGeyser
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

@Suppress("UNUSED")
@Serializable
enum class GeyserType(

    /** Type descriptor as used by the game. */
    val type: String,

    /** i18n resource */
    val stringResource: StringResource,

    /** Rating we assigned if a geyser is useful or bad. */
    val rating: Rating = Rating.NEUTRAL,

    /** Min average emit rate in grams per second. */
    val minAvgEmitRate: Int,

    /** Max average emit rate in grams per second. */
    val maxAvgEmitRate: Int
) {

    /*
     * Sorted by order to be displayed
     *
     * The min and max average values for emit rate were
     * taken from a database query over 410k maps
     * and calculated using a standard deviation.
     */

    COOL_STEAM(
        type = "steam",
        stringResource = Res.string.geyserTypeCoolSteamVent,
        rating = Rating.GOOD, // Good thing to have for water production
        minAvgEmitRate = 1228,
        maxAvgEmitRate = 1682
    ),
    HYDROGEN(
        type = "hot_hydrogen",
        stringResource = Res.string.geyserTypeHydrogenVent,
        rating = Rating.VERY_GOOD, // Free energy
        minAvgEmitRate = 92,
        maxAvgEmitRate = 118
    ),
    NATURAL_GAS(
        type = "methane",
        stringResource = Res.string.geyserTypeNaturalGasGeyser,
        rating = Rating.VERY_GOOD, // Free energy & for cooking
        minAvgEmitRate = 85,
        maxAvgEmitRate = 127
    ),
    CHLORINE(
        type = "chlorine_gas",
        stringResource = Res.string.geyserTypeChlorineGasVent,
        rating = Rating.GOOD, // Has its uses
        minAvgEmitRate = 92,
        maxAvgEmitRate = 120
    ),
    HOT_STEAM(
        type = "hot_steam",
        stringResource = Res.string.geyserTypeSteamVent,
        rating = Rating.GOOD, // Usable energy, harder to handle.
        minAvgEmitRate = 611,
        maxAvgEmitRate = 821
    ),
    HOT_CO2(
        type = "hot_co2",
        stringResource = Res.string.geyserTypeCarbonDioxideVent,
        rating = Rating.VERY_BAD, // mostly useless
        minAvgEmitRate = 92,
        maxAvgEmitRate = 118
    ),
    HOT_POLLUTED_O2(
        type = "hot_po2",
        stringResource = Res.string.geyserTypeHotPollutedOxygenVent,
        rating = Rating.VERY_BAD, // Crap
        minAvgEmitRate = 93,
        maxAvgEmitRate = 119
    ),
    INFECTIOUS_POLLUTED_O2(
        type = "slimy_po2",
        stringResource = Res.string.geyserTypeInfectiousPollutedOxygenVent,
        rating = Rating.BAD, // Usually does not produce enough to be helpful.
        minAvgEmitRate = 93,
        maxAvgEmitRate = 119
    ),
    WATER(
        type = "hot_water",
        stringResource = Res.string.geyserTypeWaterGeyser,
        rating = Rating.VERY_GOOD, // We love free water
        minAvgEmitRate = 2471,
        maxAvgEmitRate = 3263
    ),
    COOL_SLUSH_WATER(
        type = "slush_water",
        stringResource = Res.string.geyserTypeCoolSlushGeyser,
        rating = Rating.VERY_GOOD, // Cool polluted water, free from germs.
        minAvgEmitRate = 1264,
        maxAvgEmitRate = 1662
    ),
    POLLUTED_WATER(
        type = "filthy_water",
        stringResource = Res.string.geyserTypePollutedWaterVent,
        rating = Rating.VERY_GOOD, // Many plants can consume it directly.
        minAvgEmitRate = 2536,
        maxAvgEmitRate = 3304
    ),
    COOL_SALT_WATER(
        type = "slush_salt_water",
        stringResource = Res.string.geyserTypeCoolSaltSlushGeyser,
        /* Brine brings coolness and salt. */
        rating = Rating.VERY_GOOD,
        minAvgEmitRate = 1277,
        maxAvgEmitRate = 1649
    ),
    HOT_SALT_WATER(
        type = "salt_water",
        stringResource = Res.string.geyserTypeSaltWaterGeyser,
        rating = Rating.GOOD, // Free salt
        minAvgEmitRate = 2577,
        maxAvgEmitRate = 3361
    ),
    LIQUID_CO2(
        type = "liquid_co2",
        stringResource = Res.string.geyserTypeCarbonDioxideGeyser,
        rating = Rating.NEUTRAL, // Source of coolness, but heats up very fast
        minAvgEmitRate = 130,
        maxAvgEmitRate = 170
    ),
    LEAKY_OIL_FISSURE(
        type = "oil_drip",
        stringResource = Res.string.geyserTypeLeakyOilFissure,
        rating = Rating.NEUTRAL, // Doesn't matter if it's there. Does not produce a lot.
        minAvgEmitRate = 148,
        maxAvgEmitRate = 216
    ),
    LIQUID_SULFUR_GEYSER(
        type = "liquid_sulfur",
        stringResource = Res.string.geyserTypeLiquidSulfurGeyser,
        minAvgEmitRate = 1347,
        maxAvgEmitRate = 1847
    ),
    IRON_VOLCANO(
        type = "molten_iron",
        stringResource = Res.string.geyserTypeIronVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 262,
        maxAvgEmitRate = 344
    ),
    COPPER_VOLCANO(
        type = "molten_copper",
        stringResource = Res.string.geyserTypeCopperVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 273,
        maxAvgEmitRate = 349
    ),
    GOLD_VOLCANO(
        type = "molten_gold",
        stringResource = Res.string.geyserTypeGoldVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 268,
        maxAvgEmitRate = 352
    ),
    ALUMINIUM_VOLCANO(
        type = "molten_aluminum",
        stringResource = Res.string.geyserTypeAluminiumVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 269,
        maxAvgEmitRate = 351
    ),
    COBALT_VOLCANO(
        type = "molten_cobalt",
        stringResource = Res.string.geyserTypeCobaltVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 267,
        maxAvgEmitRate = 351
    ),
    TUNGSTEN_VOLCANO(
        type = "molten_tungsten",
        stringResource = Res.string.geyserTypeTungstenVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 259,
        maxAvgEmitRate = 341
    ),
    NIOBIUM_VOLCANO(
        type = "molten_niobium",
        stringResource = Res.string.geyserTypeNiobiumVolcano,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 1035,
        maxAvgEmitRate = 1365
    ),
    VOLCANO(
        type = "big_volcano",
        stringResource = Res.string.geyserTypeVolcano,
        minAvgEmitRate = 1037,
        maxAvgEmitRate = 1349
    ),
    MINOR_VOLCANO(
        type = "small_volcano",
        stringResource = Res.string.geyserTypeMinorVolcano,
        minAvgEmitRate = 518,
        maxAvgEmitRate = 668
    ),
    OIL_RESERVOIR(
        type = "OilWell",
        stringResource = Res.string.geyserTypeOilReservoir,
        rating = Rating.GOOD, // Rated good, because the more the better.
        minAvgEmitRate = 3333,
        maxAvgEmitRate = 3333
    )
}
