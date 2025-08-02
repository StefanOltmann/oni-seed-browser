/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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

import model.Cluster
import model.Contributor
import model.RatedCluster
import model.filter.FilterQuery

interface WebClient {

    suspend fun countSeeds(): Long?

    suspend fun findLatestClusters(): List<String>

    suspend fun findTopRatedClusters(): List<RatedCluster>

    suspend fun find(coordinate: String): Cluster?

    /*
     * Requests a coordinate and returns if the request was valid.
     * Can be invalid if coordinate has the wrong syntax.
     */
    suspend fun request(coordinate: String): Boolean

    suspend fun findFavoredCoordinates(): List<String>

    suspend fun rate(coordinate: String, like: Boolean): Boolean

    suspend fun search(filterQuery: FilterQuery): List<String>

    suspend fun getUsername(): String?

    suspend fun setUsername(username: String): Boolean

    suspend fun findContributors(): List<Contributor>

}
