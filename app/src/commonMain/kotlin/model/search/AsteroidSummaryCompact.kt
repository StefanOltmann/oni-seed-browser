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

package model.search

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber
import kotlinx.serialization.protobuf.ProtoPacked
import model.AsteroidType
import model.serializer.AsteroidTypeIdSerializer

@Serializable
@OptIn(ExperimentalSerializationApi::class)
class AsteroidSummaryCompact(

    @ProtoNumber(1)
    @Serializable(with = AsteroidTypeIdSerializer::class)
    val id: AsteroidType,

    @ProtoNumber(2)
    val worldTraitsBitMask: Int,

    @ProtoNumber(3)
    val zoneTypesBitMask: Int,

    /**
     * Count of all geysers
     *
     * Index = GeyserType ordinal
     */
    @ProtoNumber(4)
    @ProtoPacked
    val geyserCounts: ByteArray,

    /**
     * Count of all good (= avg or better) geysers
     *
     * Index = GeyserType ordinal
     */
    @ProtoNumber(5)
    @ProtoPacked
    val goodGeyserCounts: ByteArray

)
