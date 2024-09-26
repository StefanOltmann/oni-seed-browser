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

enum class GeyserType(
    val displayName: String
) {

    /*
     * Warning: Do not sort or delete items here!
     * Ordinals must be kept stable for use in database.
     */

    COOL_STEAM(
        displayName = "Cool Steam Vent"
    ),
    HOT_STEAM(
        displayName = "Steam Vent"
    ),
    WATER(
        displayName = "Water Geyser"
    ),
    COOL_SLUSH_WATER(
        displayName = "Cool Slush Geyser"
    ),
    POLLUTED_WATER(
        displayName = "Polluted Water Vent"
    ),
    COOL_SALT_WATER(
        displayName = "Cool Salt Slush Geyser"
    ),
    HOT_SALT_WATER(
        displayName = "Salt Water Geyser"
    ),
    MINOR_VOLCANO(
        displayName = "Minor Volcano"
    ),
    VOLCANO(
        displayName = "Valcano"
    ),
    LIQUID_CO2(
        displayName = "Carbon Dioxide Geyser"
    ),
    HOT_CO2(
        displayName = "Carbon Dioxide Vent"
    ),
    HYDROGEN(
        displayName = "Hydrogen Vent"
    ),
    HOT_POLLUTED_O2(
        displayName = "Hot Polluted Oxygen Vent"
    ),
    INFECTIOUS_POLLUTED_O2(
        displayName = "Infectious Polluted Oxygen Vent"
    ),
    CHLORINE(
        displayName = "Chlorine Gas Vent"
    ),
    NATURAL_GAS(
        displayName = "Natural Gas Geyser"
    ),
    COPPER_VOLCANO(
        displayName = "Copper Volcano"
    ),
    IRON_VOLCANO(
        displayName = "Iron Volcano"
    ),
    GOLD_VOLCANO(
        displayName = "Gold Volcano"
    ),
    LEAKY_OIL_FISSURE(
        displayName = "Leaky Oil Fissure"
    ),
    ALUMINIUM_VOLCANO(
        displayName = "Aluminium Volcano"
    ),
    COBALT_VOLCANO(
        displayName = "Cobalt Volcano"
    ),
    SULFUR_GEYSER(
        displayName = "Sulfur Geyser"
    ),
    TUNGSTEN_VOLCANO(
        displayName = "Tungsten Volcano"
    ),
    NIOBIUM_VOLCANO(
        displayName = "Niobium Volcano"
    )
}
