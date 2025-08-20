/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

package model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.geyserTypeAluminiumVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeCarbonDioxideGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCarbonDioxideVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeChlorineCoolGasVent
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
import ui.ElementType

@Suppress("UNUSED")
@Serializable
enum class GeyserType(

    /** Type descriptor as used by the game. */
    val type: String,

    /** i18n resource */
    val stringResource: StringResource,

    /** Emitted element type */
    val emittedElementType: ElementType,

    /** Rating we assigned if a geyser is useful or bad. */
    val rating: Rating = Rating.NEUTRAL,

    /** Min average emit rate in grams per second. */
    val minAvgEmitRate: Int,

    /** Max average emit rate in grams per second. */
    val maxAvgEmitRate: Int,

    /** Mean average emit rate in grams per second. */
    val meanAvgEmitRate: Int,

    /** Standard deviation for average emit rate. */
    val avgEmitRateStdDev: Int

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
        emittedElementType = ElementType.STEAM,
        rating = Rating.GOOD, // Good thing to have for water production
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500,
        avgEmitRateStdDev = 230
    ),
    HYDROGEN(
        type = "hot_hydrogen",
        stringResource = Res.string.geyserTypeHydrogenVent,
        emittedElementType = ElementType.HYDROGEN_GAS,
        rating = Rating.VERY_GOOD, // Free energy
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105, // According to wiki and data
        avgEmitRateStdDev = 15 // data: 13
    ),
    NATURAL_GAS(
        type = "methane",
        stringResource = Res.string.geyserTypeNaturalGasGeyser,
        emittedElementType = ElementType.NATURAL_GAS,
        rating = Rating.VERY_GOOD, // Free energy & for cooking
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 14
    ),
    CHLORINE(
        type = "chlorine_gas",
        stringResource = Res.string.geyserTypeChlorineGasVent,
        emittedElementType = ElementType.CHLORINE_GAS,
        rating = Rating.GOOD, // Has its uses
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 14
    ),
    CHLORINE_COOL(
        type = "chlorine_gas_cool",
        stringResource = Res.string.geyserTypeChlorineCoolGasVent,
        emittedElementType = ElementType.CHLORINE_GAS,
        rating = Rating.GOOD, // Has its uses
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 14
    ),
    HOT_STEAM(
        type = "hot_steam",
        stringResource = Res.string.geyserTypeSteamVent,
        emittedElementType = ElementType.STEAM,
        rating = Rating.GOOD, // Usable energy, harder to handle.
        minAvgEmitRate = 333,
        maxAvgEmitRate = 1333,
        meanAvgEmitRate = 750, // data: 716
        avgEmitRateStdDev = 100 // data: 105
    ),
    HOT_CO2(
        type = "hot_co2",
        stringResource = Res.string.geyserTypeCarbonDioxideVent,
        emittedElementType = ElementType.CARBON_DIOXIDE,
        rating = Rating.VERY_BAD, // mostly useless
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 13
    ),
    HOT_POLLUTED_O2(
        type = "hot_po2",
        stringResource = Res.string.geyserTypeHotPollutedOxygenVent,
        emittedElementType = ElementType.POLLUTED_OXYGEN,
        rating = Rating.VERY_BAD, // Crap
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 13
    ),
    INFECTIOUS_POLLUTED_O2(
        type = "slimy_po2",
        stringResource = Res.string.geyserTypeInfectiousPollutedOxygenVent,
        emittedElementType = ElementType.POLLUTED_OXYGEN,
        rating = Rating.BAD, // Usually does not produce enough to be helpful.
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 13
    ),
    WATER(
        type = "hot_water",
        stringResource = Res.string.geyserTypeWaterGeyser,
        emittedElementType = ElementType.WATER,
        rating = Rating.VERY_GOOD, // We love free water
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000, // data: 2867
        avgEmitRateStdDev = 400 // data: 396
    ),
    COOL_SLUSH_WATER(
        type = "slush_water",
        stringResource = Res.string.geyserTypeCoolSlushGeyser,
        emittedElementType = ElementType.POLLUTED_WATER,
        rating = Rating.VERY_GOOD, // Cool polluted water, free from germs.
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500, // data: 1463
        avgEmitRateStdDev = 200 // data: 199
    ),
    POLLUTED_WATER(
        type = "filthy_water",
        stringResource = Res.string.geyserTypePollutedWaterVent,
        emittedElementType = ElementType.POLLUTED_WATER,
        rating = Rating.VERY_GOOD, // Many plants can consume it directly.
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000, // data: 2920
        avgEmitRateStdDev = 400 // data: 384
    ),
    COOL_SALT_WATER(
        type = "slush_salt_water",
        stringResource = Res.string.geyserTypeCoolSaltSlushGeyser,
        emittedElementType = ElementType.SALT_WATER,
        /* Brine brings coolness and salt. */
        rating = Rating.VERY_GOOD,
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500, // data: 1463
        avgEmitRateStdDev = 200, // data: 186
    ),
    HOT_SALT_WATER(
        type = "salt_water",
        stringResource = Res.string.geyserTypeSaltWaterGeyser,
        emittedElementType = ElementType.SALT_WATER,
        rating = Rating.GOOD, // Free salt
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000, // data: 2969
        avgEmitRateStdDev = 400 // data: 392
    ),
    LIQUID_CO2(
        type = "liquid_co2",
        stringResource = Res.string.geyserTypeCarbonDioxideGeyser,
        emittedElementType = ElementType.CARBON_DIOXIDE,
        rating = Rating.NEUTRAL, // Source of coolness, but heats up very fast
        minAvgEmitRate = 67,
        maxAvgEmitRate = 267,
        meanAvgEmitRate = 150,
        avgEmitRateStdDev = 20
    ),
    LEAKY_OIL_FISSURE(
        type = "oil_drip",
        stringResource = Res.string.geyserTypeLeakyOilFissure,
        emittedElementType = ElementType.CRUDE_OIL,
        rating = Rating.NEUTRAL, // Doesn't matter if it's there. Does not produce a lot.
        minAvgEmitRate = 1,
        maxAvgEmitRate = 333,
        meanAvgEmitRate = 125, // data: 182
        avgEmitRateStdDev = 35 // data: 34
    ),
    LIQUID_SULFUR_GEYSER(
        type = "liquid_sulfur",
        stringResource = Res.string.geyserTypeLiquidSulfurGeyser,
        emittedElementType = ElementType.LIQUID_SULFUR,
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500, // data: 1597
        avgEmitRateStdDev = 250
    ),
    IRON_VOLCANO(
        type = "molten_iron",
        stringResource = Res.string.geyserTypeIronVolcano,
        emittedElementType = ElementType.MOLTEN_IRON,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 41
    ),
    COPPER_VOLCANO(
        type = "molten_copper",
        stringResource = Res.string.geyserTypeCopperVolcano,
        emittedElementType = ElementType.MOLTEN_COPPER,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 38
    ),
    GOLD_VOLCANO(
        type = "molten_gold",
        stringResource = Res.string.geyserTypeGoldVolcano,
        emittedElementType = ElementType.MOLTEN_GOLD,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 42
    ),
    ALUMINIUM_VOLCANO(
        type = "molten_aluminum",
        stringResource = Res.string.geyserTypeAluminiumVolcano,
        emittedElementType = ElementType.MOLTEN_ALUMINUM,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 41
    ),
    COBALT_VOLCANO(
        type = "molten_cobalt",
        stringResource = Res.string.geyserTypeCobaltVolcano,
        emittedElementType = ElementType.MOLTEN_COBALT,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 42
    ),
    TUNGSTEN_VOLCANO(
        type = "molten_tungsten",
        stringResource = Res.string.geyserTypeTungstenVolcano,
        emittedElementType = ElementType.MOLTEN_TUNGSTEN,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 41
    ),
    NIOBIUM_VOLCANO(
        type = "molten_niobium",
        stringResource = Res.string.geyserTypeNiobiumVolcano,
        emittedElementType = ElementType.MOLTEN_NIOBIUM,
        rating = Rating.GOOD, // Metal geysers are good.
        minAvgEmitRate = 533,
        maxAvgEmitRate = 2133,
        meanAvgEmitRate = 1200,
        avgEmitRateStdDev = 165
    ),
    VOLCANO(
        type = "big_volcano",
        stringResource = Res.string.geyserTypeVolcano,
        emittedElementType = ElementType.MAGMA,
        minAvgEmitRate = 533,
        maxAvgEmitRate = 2133,
        meanAvgEmitRate = 1100, // data: 1193
        avgEmitRateStdDev = 150 // data: 156
    ),
    MINOR_VOLCANO(
        type = "small_volcano",
        stringResource = Res.string.geyserTypeMinorVolcano,
        emittedElementType = ElementType.MAGMA,
        minAvgEmitRate = 267,
        maxAvgEmitRate = 1067,
        meanAvgEmitRate = 550, // data: 593
        avgEmitRateStdDev = 75
    ),
    OIL_RESERVOIR(
        type = "OilWell",
        stringResource = Res.string.geyserTypeOilReservoir,
        emittedElementType = ElementType.CRUDE_OIL,
        rating = Rating.GOOD, // Rated good, because the more the better.
        minAvgEmitRate = 3333,
        maxAvgEmitRate = 3333,
        meanAvgEmitRate = 3333,
        avgEmitRateStdDev = 0
    );

    val lowAvgEmitRate = meanAvgEmitRate - avgEmitRateStdDev

    val highAvgEmitRate = meanAvgEmitRate + avgEmitRateStdDev

    fun getAvgEmitRateRating(avgEmitRate: Int): Float =
        ((avgEmitRate - lowAvgEmitRate).toFloat() / (highAvgEmitRate - lowAvgEmitRate))
            .coerceIn(minimumValue = 0.01F, maximumValue = 1.0F)
}
