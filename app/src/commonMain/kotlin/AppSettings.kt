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

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.filter.FilterQuery

private val jsonPretty = Json {
    prettyPrint = true
    ignoreUnknownKeys = false
    encodeDefaults = true
}

private const val USER_ID_SETTINGS_KEY = "user"
private const val FILTER_SETTINGS_KEY = "filter"

object AppSettings {

    val userId: String = getOrCreateUserId()

    @OptIn(ExperimentalUuidApi::class)
    private fun getOrCreateUserId(): String {

        val existingId = settings.getStringOrNull(USER_ID_SETTINGS_KEY)

        if (existingId != null)
            return existingId

        val newId = Uuid.random().toString()

        settings.putString(USER_ID_SETTINGS_KEY, newId)

        return newId
    }

    fun loadFilter(): FilterQuery {

        val json = settings.getStringOrNull(FILTER_SETTINGS_KEY)
            ?: return FilterQuery.ALL

        return try {

            jsonPretty.decodeFromString<FilterQuery>(json)

        } catch (ex: Exception) {

            /*
             * If parsing a stored filter query fails for any reason,
             * we just drop it. That's not the end of the world. ;)
             */

            ex.printStackTrace()

            FilterQuery.ALL
        }
    }

    fun saveFilter(filterQuery: FilterQuery) {

        val json = jsonPretty.encodeToString(filterQuery)

        settings.putString(FILTER_SETTINGS_KEY, json)
    }
}
