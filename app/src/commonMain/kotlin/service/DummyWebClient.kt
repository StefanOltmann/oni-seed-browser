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

package service

import SearchRequest
import SearchResponse
import kotlinx.serialization.json.Json
import model.World

object DummyWebClient : WebClient {

    override suspend fun search(searchRequest: SearchRequest): SearchResponse {

        val worlds = Json.decodeFromString<List<World>>(sampleWorldsJson)

        val sortedWorlds = worlds.sortedBy { it.cluster }

        // Temporary code to move a world with SVG info at first. Will be removed later.
        val firstWorld = sortedWorlds.find { it.coordinate == "V-SNDST-C-1545981059-0-0-NO" }!!
        val sortedWorldsManipulated = sortedWorlds.toMutableList()
        sortedWorldsManipulated.remove(firstWorld)
        sortedWorldsManipulated.add(0, firstWorld)

        return SearchResponse(
            page = 1,
            pageSize = 50,
            totalPages = 1,
            totalResults = worlds.size,
            worlds = sortedWorldsManipulated
        )
    }
}
