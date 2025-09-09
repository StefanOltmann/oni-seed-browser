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

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber
import model.serializer.GeyserTypeSerializer

@Suppress("UNUSED")
@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class Geyser(

    @ProtoNumber(1)
    @Serializable(with = GeyserTypeSerializer::class)
    val id: GeyserType,

    @ProtoNumber(2)
    val x: Short,

    @ProtoNumber(3)
    val y: Short,

    /**
     * Emit rate in gram per second when active.
     * In our data values range from 2 to 528019.
     */
    @ProtoNumber(4)
    val emitRate: Int,

    /** Average emit rate in gram per second. */
    @ProtoNumber(5)
    val avgEmitRate: Short,

    /**
     * Idle time after eruption in seconds.
     * In our data values range from 0 to 11930.
     */
    @ProtoNumber(6)
    val idleTime: Short,

    /**
     * Duration of eruption in seconds.
     * In our data values range from 1 to 1014.
     */
    @ProtoNumber(7)
    val eruptionTime: Short,

    /**
     * Count of dormancy cycles.
     * In our data values range from 0 to 135.
     */
    @ProtoNumber(8)
    val dormancyCyclesRounded: Short,

    /**
     * Count of active cycles.
     * In our data values range from 0 to 180.
     */
    @ProtoNumber(9)
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
