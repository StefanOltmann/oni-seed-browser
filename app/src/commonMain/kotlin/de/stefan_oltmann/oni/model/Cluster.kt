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

import de.stefan_oltmann.oni.model.serializer.ClusterTypeSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Suppress("UNUSED")
@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class Cluster(

    @ProtoNumber(1)
    val coordinate: String,

    @ProtoNumber(2)
    val uploaderSteamIdHash: String,

    @ProtoNumber(3)
    val uploaderAuthenticated: Boolean,

    @ProtoNumber(4)
    val uploadDate: Long,

    @ProtoNumber(5)
    val gameVersion: Int,

    @ProtoNumber(6)
    @Serializable(with = ClusterTypeSerializer::class)
    val cluster: ClusterType,

    @ProtoNumber(7)
    val asteroids: List<Asteroid>,

    @ProtoNumber(8)
    val starMapEntriesVanilla: List<StarMapEntryVanilla>,

    @ProtoNumber(9)
    val starMapEntriesSpacedOut: List<StarMapEntrySpacedOut>

)
