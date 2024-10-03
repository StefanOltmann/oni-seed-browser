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
    val asteroidId: AsteroidType?,

    /* Items */
    val geyserCount: FilterItemGeyserCount?,
    val geyserOutput: FilterItemGeyserOutput?,
    val worldTrait: FilterItemWorldTrait?,

    /* Only for base game, not for Spaced Out */
    val spaceDestinationCount: FilterItemSpaceDestinationCount?,

    /* OR-connected rules (only to be set for the root rules) */
    val orRules: List<FilterRule>
)
