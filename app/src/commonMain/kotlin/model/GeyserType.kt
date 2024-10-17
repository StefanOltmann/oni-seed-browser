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

@Suppress("UNUSED")
@Serializable
enum class GeyserType(
    val type: String,
    val displayName: String,
    val rating: Rating = Rating.NEUTRAL
) {

    /*
     * Sorted by order to be displayed
     */

    COOL_STEAM(
        type = "steam",
        displayName = "Cool Steam Vent",
        /* Good thing to have for water production. */
        rating = Rating.GOOD
    ),
    HYDROGEN(
        type = "hot_hydrogen",
        displayName = "Hydrogen Vent",
        /* Free energy */
        rating = Rating.VERY_GOOD
    ),
    NATURAL_GAS(
        type = "methane",
        displayName = "Natural Gas Geyser",
        /* Free energy & for cooking */
        rating = Rating.VERY_GOOD
    ),
    CHLORINE(
        type = "chlorine_gas",
        displayName = "Chlorine Gas Vent",
        /* Has its uses */
        rating = Rating.GOOD
    ),
    HOT_STEAM(
        type = "hot_steam",
        displayName = "Steam Vent",
        /* Usable energy, harder to handle. */
        rating = Rating.GOOD
    ),
    HOT_CO2(
        type = "hot_co2",
        displayName = "Carbon Dioxide Vent",
        /* Mostly useless */
        rating = Rating.VERY_BAD
    ),
    HOT_POLLUTED_O2(
        type = "hot_po2",
        displayName = "Hot Polluted Oxygen Vent",
        /* Crap */
        rating = Rating.VERY_BAD
    ),
    INFECTIOUS_POLLUTED_O2(
        type = "slimy_po2",
        displayName = "Infectious Polluted Oxygen Vent",
        /* Usually does not produce enough to be helpful. */
        rating = Rating.BAD
    ),
    WATER(
        type = "hot_water",
        displayName = "Water Geyser",
        /* We love free water */
        rating = Rating.VERY_GOOD
    ),
    COOL_SLUSH_WATER(
        type = "slush_water",
        displayName = "Cool Slush Geyser",
        /* Cool polluted water, free or germs. */
        rating = Rating.VERY_GOOD
    ),
    POLLUTED_WATER(
        type = "filthy_water",
        displayName = "Polluted Water Vent",
        /* Many plants can directly consume it. */
        rating = Rating.VERY_GOOD
    ),
    COOL_SALT_WATER(
        type = "slush_salt_water",
        displayName = "Cool Salt Slush Geyser",
        /* Brine brings coolness and salt. */
        rating = Rating.VERY_GOOD
    ),
    HOT_SALT_WATER(
        type = "salt_water",
        displayName = "Salt Water Geyser",
        /* It's useful */
        rating = Rating.GOOD
    ),
    LIQUID_CO2(
        type = "liquid_co2",
        displayName = "Carbon Dioxide Geyser",
        /* Source of coolness, but heats up very fast. */
        rating = Rating.NEUTRAL
    ),
    LEAKY_OIL_FISSURE(
        type = "oil_drip",
        displayName = "Leaky Oil Fissure",
        /* Doesn't matter if it's there. Does not produce a lot most of the times. */
        rating = Rating.NEUTRAL
    ),
    LIQUID_SULFUR_GEYSER(
        type = "liquid_sulfur",
        displayName = "Liquid Sulfur Geyser"
    ),
    IRON_VOLCANO(
        type = "molten_iron",
        displayName = "Iron Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    COPPER_VOLCANO(
        type = "molten_copper",
        displayName = "Copper Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    GOLD_VOLCANO(
        type = "molten_gold",
        displayName = "Gold Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    ALUMINIUM_VOLCANO(
        type = "molten_aluminum",
        displayName = "Aluminium Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    COBALT_VOLCANO(
        type = "molten_cobalt",
        displayName = "Cobalt Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    TUNGSTEN_VOLCANO(
        type = "molten_tungsten",
        displayName = "Tungsten Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    NIOBIUM_VOLCANO(
        type = "molten_niobium",
        displayName = "Niobium Volcano",
        /* Metal geysers are good. */
        rating = Rating.GOOD
    ),
    VOLCANO(
        type = "big_volcano",
        displayName = "Valcano"
    ),
    MINOR_VOLCANO(
        type = "small_volcano",
        displayName = "Minor Volcano"
    ),
    OIL_RESERVOIR(
        type = "OilWell",
        displayName = "Oil Reservoir",
        /* Rated good, because the more the better. */
        rating = Rating.GOOD
    )
}
