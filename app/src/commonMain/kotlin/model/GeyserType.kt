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
enum class GeyserType(

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
        type = "steam",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500,
        avgEmitRateStdDev = 230
    ),
    HYDROGEN(
        type = "hot_hydrogen",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105, // According to wiki and data
        avgEmitRateStdDev = 15 // data: 13
    ),
    NATURAL_GAS(
        type = "methane",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 14
    ),
    CHLORINE(
        type = "chlorine_gas",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 14
    ),
    CHLORINE_COOL(
        type = "chlorine_gas_cool",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 14
    ),
    HOT_STEAM(
        type = "hot_steam",
        minAvgEmitRate = 333,
        maxAvgEmitRate = 1333,
        meanAvgEmitRate = 750, // data: 716
        avgEmitRateStdDev = 100 // data: 105
    ),
    HOT_CO2(
        type = "hot_co2",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 13
    ),
    HOT_POLLUTED_O2(
        type = "hot_po2",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 13
    ),
    INFECTIOUS_POLLUTED_O2(
        type = "slimy_po2",
        minAvgEmitRate = 47,
        maxAvgEmitRate = 187,
        meanAvgEmitRate = 105,
        avgEmitRateStdDev = 15 // data: 13
    ),
    WATER(
        type = "hot_water",
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000, // data: 2867
        avgEmitRateStdDev = 400 // data: 396
    ),
    COOL_SLUSH_WATER(
        type = "slush_water",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500, // data: 1463
        avgEmitRateStdDev = 200 // data: 199
    ),
    POLLUTED_WATER(
        type = "filthy_water",
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000, // data: 2920
        avgEmitRateStdDev = 400 // data: 384
    ),
    COOL_SALT_WATER(
        type = "slush_salt_water",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500, // data: 1463
        avgEmitRateStdDev = 200, // data: 186
    ),
    HOT_SALT_WATER(
        type = "salt_water",
        minAvgEmitRate = 1333,
        maxAvgEmitRate = 5333,
        meanAvgEmitRate = 3000, // data: 2969
        avgEmitRateStdDev = 400 // data: 392
    ),
    LIQUID_CO2(
        type = "liquid_co2",
        minAvgEmitRate = 67,
        maxAvgEmitRate = 267,
        meanAvgEmitRate = 150,
        avgEmitRateStdDev = 20
    ),
    LEAKY_OIL_FISSURE(
        type = "oil_drip",
        minAvgEmitRate = 1,
        maxAvgEmitRate = 333,
        meanAvgEmitRate = 125, // data: 182
        avgEmitRateStdDev = 35 // data: 34
    ),
    LIQUID_SULFUR_GEYSER(
        type = "liquid_sulfur",
        minAvgEmitRate = 667,
        maxAvgEmitRate = 2667,
        meanAvgEmitRate = 1500, // data: 1597
        avgEmitRateStdDev = 250
    ),
    IRON_VOLCANO(
        type = "molten_iron",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 41
    ),
    COPPER_VOLCANO(
        type = "molten_copper",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 38
    ),
    GOLD_VOLCANO(
        type = "molten_gold",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 42
    ),
    ALUMINIUM_VOLCANO(
        type = "molten_aluminum",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 41
    ),
    COBALT_VOLCANO(
        type = "molten_cobalt",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 42
    ),
    TUNGSTEN_VOLCANO(
        type = "molten_tungsten",
        minAvgEmitRate = 133,
        maxAvgEmitRate = 533,
        meanAvgEmitRate = 300,
        avgEmitRateStdDev = 40 // data: 41
    ),
    NIOBIUM_VOLCANO(
        type = "molten_niobium",
        minAvgEmitRate = 533,
        maxAvgEmitRate = 2133,
        meanAvgEmitRate = 1200,
        avgEmitRateStdDev = 165
    ),
    VOLCANO(
        type = "big_volcano",
        minAvgEmitRate = 533,
        maxAvgEmitRate = 2133,
        meanAvgEmitRate = 1100, // data: 1193
        avgEmitRateStdDev = 150 // data: 156
    ),
    MINOR_VOLCANO(
        type = "small_volcano",
        minAvgEmitRate = 267,
        maxAvgEmitRate = 1067,
        meanAvgEmitRate = 550, // data: 593
        avgEmitRateStdDev = 75
    ),
    OIL_RESERVOIR(
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
