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

package de.stefan_oltmann.oni.model

import kotlinx.serialization.Serializable

@Suppress("UNUSED")
@Serializable
enum class GeyserType(

    /** Unique ID */
    val id: Byte,

    /** Type descriptor as used by the game. */
    val type: String,

    /** Min average emit rate in grams per second. */
    val minAvgEmitRate: Short,

    /** Max average emit rate in grams per second. */
    val maxAvgEmitRate: Short,

    /** Mean average emit rate in grams per second. */
    val meanAvgEmitRate: Short,

    /** Standard deviation for average emit rate. */
    val avgEmitRateStdDev: Short

) {

    /*
     * Sorted by order to be displayed
     *
     * The min and max average values for emit rate were
     * taken from a database query over 410k maps
     * and calculated using a standard deviation.
     */

    COOL_STEAM(
        id = 0,
        type = "steam",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500,
        avgEmitRateStdDev = 230
    ),
    HYDROGEN(
        id = 1,
        type = "hot_hydrogen",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    NATURAL_GAS(
        id = 2,
        type = "methane",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    CHLORINE(
        id = 3,
        type = "chlorine_gas",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    CHLORINE_COOL(
        id = 4,
        type = "chlorine_gas_cool",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    HOT_STEAM(
        id = 5,
        type = "hot_steam",
        minAvgEmitRate = 333,
        maxAvgEmitRate = 1333,
        meanAvgEmitRate = 750,
        avgEmitRateStdDev = 100
    ),
    HOT_CO2(
        id = 6,
        type = "hot_co2",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    HOT_POLLUTED_O2(
        id = 7,
        type = "hot_po2",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    INFECTIOUS_POLLUTED_O2(
        id = 8,
        type = "slimy_po2",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15
    ),
    WATER(
        id = 9,
        type = "hot_water",
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000,
        avgEmitRateStdDev = 400
    ),
    COOL_SLUSH_WATER(
        id = 10,
        type = "slush_water",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500,
        avgEmitRateStdDev = 200
    ),
    POLLUTED_WATER(
        id = 11,
        type = "filthy_water",
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000,
        avgEmitRateStdDev = 400
    ),
    COOL_SALT_WATER(
        id = 12,
        type = "slush_salt_water",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500,
        avgEmitRateStdDev = 200
    ),
    HOT_SALT_WATER(
        id = 13,
        type = "salt_water",
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000,
        avgEmitRateStdDev = 400
    ),
    LIQUID_CO2(
        id = 14,
        type = "liquid_co2",
        minAvgEmitRate = 67,
        maxAvgEmitRate = 267,
        meanAvgEmitRate = 150,
        avgEmitRateStdDev = 20
    ),
    LEAKY_OIL_FISSURE(
        id = 15,
        type = "oil_drip",
        minAvgEmitRate = 1,
        maxAvgEmitRate = 333,
        meanAvgEmitRate = 125,
        avgEmitRateStdDev = 35
    ),
    LIQUID_SULFUR_GEYSER(
        id = 16,
        type = "liquid_sulfur",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500,
        avgEmitRateStdDev = 250
    ),
    IRON_VOLCANO(
        id = 17,
        type = "molten_iron",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40
    ),
    COPPER_VOLCANO(
        id = 18,
        type = "molten_copper",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40
    ),
    GOLD_VOLCANO(
        id = 19,
        type = "molten_gold",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40
    ),
    ALUMINIUM_VOLCANO(
        id = 20,
        type = "molten_aluminum",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40
    ),
    COBALT_VOLCANO(
        id = 21,
        type = "molten_cobalt",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40
    ),
    TUNGSTEN_VOLCANO(
        id = 22,
        type = "molten_tungsten",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40
    ),
    NIOBIUM_VOLCANO(
        id = 23,
        type = "molten_niobium",
        minAvgEmitRate = 533,
        maxAvgEmitRate = 2133,
        meanAvgEmitRate = 1200,
        avgEmitRateStdDev = 165
    ),
    VOLCANO(
        id = 24,
        type = "big_volcano",
        minAvgEmitRate = 533,
        maxAvgEmitRate = 2133,
        meanAvgEmitRate = 1100,
        avgEmitRateStdDev = 150
    ),
    MINOR_VOLCANO(
        id = 25,
        type = "small_volcano",
        minAvgEmitRate = 267,
        maxAvgEmitRate = 1067,
        meanAvgEmitRate = 550,
        avgEmitRateStdDev = 75
    ),
    OIL_RESERVOIR(
        id = 26,
        type = "OilWell",
        minAvgEmitRate = 3333,
        maxAvgEmitRate = 3333,
        meanAvgEmitRate = 3333,
        avgEmitRateStdDev = 0
    );

    val lowAvgEmitRate = meanAvgEmitRate - avgEmitRateStdDev

    val highAvgEmitRate = meanAvgEmitRate + avgEmitRateStdDev

    fun getAvgEmitRateRating(avgEmitRate: Short): Float =
        ((avgEmitRate - lowAvgEmitRate).toFloat() / (highAvgEmitRate - lowAvgEmitRate))
            .coerceIn(minimumValue = 0.01F, maximumValue = 1.0F)
}
