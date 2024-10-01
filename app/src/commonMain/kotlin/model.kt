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

import kotlinx.serialization.Serializable
import model.World

@Serializable
data class SearchRequest(
    val selectedWorld: String,
    val worldTraits: List<String>,
    val page: Int,
    val vanilla: Boolean
)

@Serializable
data class SearchResponse(
    val page: Int,
    val pageSize: Int,
    val totalPages: Int,
    val totalResults: Int,
    val worlds: List<World>
)
