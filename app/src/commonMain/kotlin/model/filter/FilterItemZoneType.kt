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

package model.filter

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import model.ZoneType

@Serializable
data class FilterItemZoneType(

    /** True, if the condition is positive */
    val has: Boolean,

    val zoneType: ZoneType

) : FilterItem {

    @Transient
    override val type: FilterItemType = FilterItemType.ZONE_TYPE

    override fun switchCondition() =
        copy(has = !has)
}
