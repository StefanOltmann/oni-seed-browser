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
    val type: String,
    val stringResource: StringResource,
    val rating: Rating = Rating.NEUTRAL
) {

    /*
     * Sorted by order to be displayed
     */

    COOL_STEAM(
        type = "steam",
        stringResource = Res.string.geyserTypeCoolSteamVent,
        /* Good thing to have for water production. */
        rating = Rating.GOOD
    ),
    HYDROGEN(
        type = "hot_hydrogen",
        stringResource = Res.string.geyserTypeHydrogenVent,
        /* Free energy */
        rating = Rating.VERY_GOOD
    ),
    NATURAL_GAS(
        type = "methane",
        stringResource = Res.string.geyserTypeNaturalGasGeyser,
        /* Free energy & for cooking */
        rating = Rating.VERY_GOOD
    ),
    CHLORINE(
        type = "chlorine_gas",
        stringResource = Res.string.geyserTypeChlorineGasVent,
        /* Has its uses */
        rating = Rating.GOOD
    ),
    HOT_STEAM(
        type = "hot_steam",
        stringResource = Res.string.geyserTypeSteamVent,
        /* Usable energy, harder to handle. */
        rating = Rating.GOOD
    ),
    HOT_CO2(
        type = "hot_co2",
        stringResource = Res.string.geyserTypeCarbonDioxideVent,
        /* Mostly useless */
        rating = Rating.VERY_BAD
    ),
    HOT_POLLUTED_O2(
        type = "hot_po2",
        stringResource = Res.string.geyserTypeHotPollutedOxygenVent,
        /* Crap */
        rating = Rating.VERY_BAD
    ),
    INFECTIOUS_POLLUTED_O2(
        type = "slimy_po2",
        stringResource = Res.string.geyserTypeInfectiousPollutedOxygenVent,
        /* Usually does not produce enough to be helpful. */
        rating = Rating.BAD
    ),
    WATER(
        type = "hot_water",
        stringResource = Res.string.geyserTypeWaterGeyser,
        /* We love free water */
        rating = Rating.VERY_GOOD
    ),
    COOL_SLUSH_WATER(
        type = "slush_water",
        stringResource = Res.string.geyserTypeCoolSlushGeyser,
        /* Cool polluted water, free or germs. */
        rating = Rating.VERY_GOOD
    ),
    POLLUTED_WATER(
        type = "filthy_water",
        stringResource = Res.string.geyserTypePollutedWaterVent,
        /* Many plants can directly consume it. */
        rating = Rating.VERY_GOOD
    ),
    COOL_SALT_WATER(
        type = "slush_salt_water",
        stringResource = Res.string.geyserTypeCoolSaltSlushGeyser,
        /* Brine brings coolness and salt. */
        rating = Rating.VERY_GOOD
    ),
    HOT_SALT_WATER(
        type = "salt_water",
        stringResource = Res.string.geyserTypeSaltWaterGeyser,
        /* It's useful */
        rating = Rating.GOOD
    ),
    LIQUID_CO2(
        type = "liquid_co2",
        stringResource = Res.string.geyserTypeCarbonDioxideGeyser,
        /* Source of coolness, but heats up very fast. */
        rating = Rating.NEUTRAL
    ),
    LEAKY_OIL_FISSURE(
        type = "oil_drip",
        stringResource = Res.string.geyserTypeLeakyOilFissure,
        /* Doesn't matter if it's there. Does not produce a lot most of the times. */
        rating = Rating.NEUTRAL
    ),
    LIQUID_SULFUR_GEYSER(
        type = "liquid_sulfur",
        stringResource = Res.string.geyserTypeLiquidSulfurGeyser
    ),
    IRON_VOLCANO(
        type = "molten_iron",
        stringResource = Res.string.geyserTypeIronVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    COPPER_VOLCANO(
        type = "molten_copper",
        stringResource = Res.string.geyserTypeCopperVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    GOLD_VOLCANO(
        type = "molten_gold",
        stringResource = Res.string.geyserTypeGoldVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    ALUMINIUM_VOLCANO(
        type = "molten_aluminum",
        stringResource = Res.string.geyserTypeAluminiumVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    COBALT_VOLCANO(
        type = "molten_cobalt",
        stringResource = Res.string.geyserTypeCobaltVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    TUNGSTEN_VOLCANO(
        type = "molten_tungsten",
        stringResource = Res.string.geyserTypeTungstenVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    NIOBIUM_VOLCANO(
        type = "molten_niobium",
        stringResource = Res.string.geyserTypeNiobiumVolcano,
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    VOLCANO(
        type = "big_volcano",
        stringResource = Res.string.geyserTypeVolcano
    ),
    MINOR_VOLCANO(
        type = "small_volcano",
        stringResource = Res.string.geyserTypeMinorVolcano
    ),
    OIL_RESERVOIR(
        type = "OilWell",
        stringResource = Res.string.geyserTypeOilReservoir,
        /* Rated good, because the more the better. */
        rating = Rating.GOOD
    )
}
