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
    val displayName: String
) {

    COOL_STEAM(
        type = "steam",
        displayName = "Cool Steam Vent"
    ),
    HOT_STEAM(
        type = "hot_steam",
        displayName = "Steam Vent"
    ),
    WATER(
        type = "hot_water",
        displayName = "Water Geyser"
    ),
    COOL_SLUSH_WATER(
        type = "slush_water",
        displayName = "Cool Slush Geyser"
    ),
    POLLUTED_WATER(
        type = "filthy_water",
        displayName = "Polluted Water Vent"
    ),
    COOL_SALT_WATER(
        type = "slush_salt_water",
        displayName = "Cool Salt Slush Geyser"
    ),
    HOT_SALT_WATER(
        type = "salt_water",
        displayName = "Salt Water Geyser"
    ),
    MINOR_VOLCANO(
        type = "small_volcano",
        displayName = "Minor Volcano"
    ),
    VOLCANO(
        type = "big_volcano",
        displayName = "Valcano"
    ),
    LIQUID_CO2(
        type = "liquid_co2",
        displayName = "Carbon Dioxide Geyser"
    ),
    HOT_CO2(
        type = "hot_co2",
        displayName = "Carbon Dioxide Vent"
    ),
    HYDROGEN(
        type = "hot_hydrogen",
        displayName = "Hydrogen Vent"
    ),
    HOT_POLLUTED_O2(
        type = "hot_po2",
        displayName = "Hot Polluted Oxygen Vent"
    ),
    INFECTIOUS_POLLUTED_O2(
        type = "slimy_po2",
        displayName = "Infectious Polluted Oxygen Vent"
    ),
    CHLORINE(
        type = "chlorine_gas",
        displayName = "Chlorine Gas Vent"
    ),
    NATURAL_GAS(
        type = "methane",
        displayName = "Natural Gas Geyser"
    ),
    COPPER_VOLCANO(
        type = "molten_copper",
        displayName = "Copper Volcano"
    ),
    IRON_VOLCANO(
        type = "molten_iron",
        displayName = "Iron Volcano"
    ),
    GOLD_VOLCANO(
        type = "molten_gold",
        displayName = "Gold Volcano"
    ),
    LEAKY_OIL_FISSURE(
        type = "oil_drip",
        displayName = "Leaky Oil Fissure"
    ),
    ALUMINIUM_VOLCANO(
        type = "molten_aluminum",
        displayName = "Aluminium Volcano"
    ),
    COBALT_VOLCANO(
        type = "molten_cobalt",
        displayName = "Cobalt Volcano"
    ),
    SULFUR_GEYSER(
        type = "liquid_sulfur",
        displayName = "Sulfur Geyser"
    ),
    TUNGSTEN_VOLCANO(
        type = "molten_tungsten",
        displayName = "Tungsten Volcano"
    ),
    NIOBIUM_VOLCANO(
        type = "molten_niobium",
        displayName = "Niobium Volcano"
    ),
    OIL_WELL(
        type = "OilWell",
        displayName = "Oil Well"
    )
}
