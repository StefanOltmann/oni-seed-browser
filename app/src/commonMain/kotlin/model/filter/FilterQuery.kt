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

package model.filter

import kotlinx.serialization.Serializable
import model.Cluster
import model.Dlc
import model.filter.FilterRule.Companion.EMPTY
import serializer.ClusterSerializer

@Serializable
data class FilterQuery(

    @Serializable(with = ClusterSerializer::class)
    val cluster: Cluster?,

    val dlcs: List<Dlc>,

    /**
     * List of connected OR-rules.
     *
     * All rules in a list are connected with an OR-condition,
     * while all collections of rules lists are connected with AND.
     */
    val rules: List<List<FilterRule>>

) {

    fun addEmptyAndRule(): FilterQuery {

        val newRules = rules.toMutableList()

        newRules.add(listOf(EMPTY))

        return copy(
            rules = newRules
        )
    }

    companion object {

        val ALL = FilterQuery(
            cluster = null,
            dlcs = listOf(Dlc.FrostyPlanet),
            rules = emptyList()
        )
    }
}
