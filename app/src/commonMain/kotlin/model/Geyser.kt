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
import model.serializer.GeyserTypeStringSerializer

@Suppress("UNUSED")
@Serializable
data class Geyser(

    @Serializable(with = GeyserTypeStringSerializer::class)
    val id: GeyserType,

    val x: Short,
    val y: Short,

    /**
     * Emit rate in gram per second when active.
     *
     * Can be quite high for some geysers.
     * Like 221888
     */
    val emitRate: Int,

    /** Average emit rate in gram per second. */
    val avgEmitRate: Short,

    /** Idle time after eruption in seconds. */
    val idleTime: Short,

    /** Duration of eruption in seconds. */
    val eruptionTime: Short,

    /** Count of dormancy cycles. */
    val dormancyCycles: Float,

    /** Count of active cycles. */
    val activeCycles: Float
) {

    @kotlinx.serialization.Transient
    val overallTime = idleTime + eruptionTime

    @kotlinx.serialization.Transient
    val overallCycles = activeCycles + dormancyCycles

    /**
     * Rating of geyser output in a range of 0.01F to 1.00F
     */
    @kotlinx.serialization.Transient
    val avgEmitRateRating: Float = id.getAvgEmitRateRating(avgEmitRate)

    @kotlinx.serialization.Transient
    val storageTankTons: Float = (dormancyCycles * avgEmitRate * SECONDS_PER_CYCLE) / GRAMS_PER_TON

}
