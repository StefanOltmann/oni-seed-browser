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

package util

fun getQueryParameters(path: String): Map<String, String> {

    if (path.isBlank() || !path.contains("?"))
        return emptyMap()

    return path
        .substringAfter("?")
        .split("&")
        .mapNotNull {

            val index = it.indexOf('=')

            if (index == -1)
                return@mapNotNull null

            val key = it.substring(0, index)
            val value = it.substring(index + 1)

            if (key.isNotEmpty())
                key to value
            else
                null
        }
        .toMap()
}
