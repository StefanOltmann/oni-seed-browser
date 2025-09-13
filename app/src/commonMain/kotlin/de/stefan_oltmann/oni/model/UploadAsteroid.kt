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

package de.stefan_oltmann.oni.model.server.upload

import kotlinx.serialization.Serializable
import de.stefan_oltmann.oni.model.AsteroidType
import de.stefan_oltmann.oni.model.WorldTrait
import de.stefan_oltmann.oni.model.serializer.AsteroidTypeStringSerializer

/**
 * This is the format expected to be sent from the mod
 */
@Serializable
data class UploadAsteroid(

    @Serializable(with = AsteroidTypeStringSerializer::class)
    val id: AsteroidType,

    val offsetX: Short,
    val offsetY: Short,

    val sizeX: Short,
    val sizeY: Short,

    val worldTraits: List<WorldTrait>,

    val biomePaths: String,

    val pointsOfInterest: List<UploadPointOfInterest>,
    val geysers: List<UploadGeyser>

)
