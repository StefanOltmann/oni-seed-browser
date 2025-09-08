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

package model.server.upload

import kotlinx.serialization.Serializable
import model.GeyserType
import model.serializer.GeyserTypeStringSerializer

/**
 * This is the format expected to be sent from the mod
 */
@Suppress("UNUSED")
@Serializable
data class UploadGeyser(

    @Serializable(with = GeyserTypeStringSerializer::class)
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

    /** Count of dormancy cycles. */
    val dormancyCycles: Float,

    /** Count of active cycles. */
    val activeCycles: Float
)
