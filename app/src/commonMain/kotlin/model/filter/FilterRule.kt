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
import model.AsteroidType

@Serializable
data class FilterRule(

    /* NULL = All asteroids */
    val asteroid: AsteroidType?,

    /* Items */
    val geyserCount: FilterItemGeyserCount?,
    val geyserOutput: FilterItemGeyserOutput?,
    val worldTrait: FilterItemWorldTrait?,
    val spaceDestinationCount: FilterItemSpaceDestinationCount? // only base game
) {

    fun hasItemSet(): Boolean =
        geyserCount != null ||
            geyserOutput != null ||
            worldTrait != null ||
            spaceDestinationCount != null

    fun getItemDescription(): String =
        when {
            geyserCount != null -> "Count: ${geyserCount.geyser.displayName}"
            geyserOutput != null -> "Output (g/s): ${geyserOutput.geyser.displayName}"
            worldTrait != null -> worldTrait.worldTrait.displayName
            spaceDestinationCount != null -> "Space destination: ${spaceDestinationCount.poi}"
            else -> "-/-"
        }

    fun getConditionDescription(): String =
        when {
            geyserCount != null -> geyserCount.condition.displayString
            geyserOutput != null -> geyserOutput.condition.displayString
            worldTrait != null -> if (worldTrait.has) "has" else "hasn't"
            spaceDestinationCount != null -> "Space destination: ${spaceDestinationCount.poi}"
            else -> "-/-"
        }

    fun switchCondition() =
        copy(
            geyserOutput = geyserOutput?.switchCondition(),
            geyserCount = geyserCount?.switchCondition(),
            worldTrait = worldTrait?.switchCondition(),
            spaceDestinationCount = spaceDestinationCount?.switchCondition()
        )

    companion object {

        val EMPTY: FilterRule = FilterRule(
            asteroid = null,
            geyserCount = null,
            geyserOutput = null,
            worldTrait = null,
            spaceDestinationCount = null
        )
    }
}
