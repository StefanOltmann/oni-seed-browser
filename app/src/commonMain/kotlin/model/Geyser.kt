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
import model.serializer.GeyserTypeSerializer

@Suppress("UNUSED")
@Serializable
data class Geyser(

    @Serializable(with = GeyserTypeSerializer::class)
    val id: GeyserType,

    val x: Short,
    val y: Short,

    /**
     * Emit rate in gram per second when active.
     * In our data values range from 2 to 528019.
     */
    val emitRate: Int,

    /** Average emit rate in gram per second. */
    val avgEmitRate: Short,

    /**
     * Idle time after eruption in seconds.
     * In our data values range from 0 to 11930.
     */
    val idleTime: Short,

    /**
     * Duration of eruption in seconds.
     * In our data values range from 1 to 1014.
     */
    val eruptionTime: Short,

    /**
     * Count of dormancy cycles.
     * In our data values range from 0 to 135.
     */
    val dormancyCyclesRounded: Short,

    /**
     * Count of active cycles.
     * In our data values range from 0 to 180.
     */
    val activeCyclesRounded: Short

) {

    @kotlinx.serialization.Transient
    val overallTime = idleTime + eruptionTime

    @kotlinx.serialization.Transient
    val overallCycles = activeCyclesRounded + dormancyCyclesRounded

    /**
     * Rating of geyser output in a range of 0.01F to 1.00F
     */
    @kotlinx.serialization.Transient
    val avgEmitRateRating: Float = id.getAvgEmitRateRating(avgEmitRate)

    @kotlinx.serialization.Transient
    val storageTankTons: Float = (dormancyCyclesRounded * avgEmitRate * SECONDS_PER_CYCLE) / GRAMS_PER_TON

}
