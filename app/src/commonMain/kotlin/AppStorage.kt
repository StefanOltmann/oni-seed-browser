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

import de.stefan_oltmann.oni.model.filter.FilterQuery
import kotlinx.serialization.json.Json
import service.DefaultWebClient

private val jsonPretty = Json {
    prettyPrint = true
    ignoreUnknownKeys = false
    encodeDefaults = true
}

private const val FILTER_SETTINGS_KEY = "mni_filter"
private const val TOKEN_SETTINGS_KEY = "mni_token"
private const val FAVORITES_SETTINGS_KEY = "mni_favorites"
private const val LIKES_MIGRATION_SETTINGS_KEY = "mni_likes_migration"

object AppStorage {

    init {

        /* Remove old stuff */
        removeClientId()
    }

    private fun removeClientId() {

        settings.remove("id")
        settings.remove("mni_client_id")
    }

    fun getToken(): String? =
        settings.getStringOrNull(TOKEN_SETTINGS_KEY)

    fun setToken(token: String) {

        settings.remove("token") // old key

        settings.putString(TOKEN_SETTINGS_KEY, token)
    }

    fun clearToken() =
        settings.remove(TOKEN_SETTINGS_KEY)

    fun loadFilter(): FilterQuery {

        val json = settings.getStringOrNull(FILTER_SETTINGS_KEY)
            ?: settings.getStringOrNull("filter") // Old key
            ?: return FilterQuery.EMPTY

        return try {

            jsonPretty.decodeFromString<FilterQuery>(json)

        } catch (ex: Throwable) {

            /*
             * If parsing a stored filter query fails for any reason,
             * we just drop it. That's not the end of the world. ;)
             */

            ex.printStackTrace()

            FilterQuery.EMPTY
        }
    }

    fun saveFilter(filterQuery: FilterQuery) {

        try {

            val json = jsonPretty.encodeToString(filterQuery)

            settings.putString(FILTER_SETTINGS_KEY, json)

            settings.remove("filter") // old key

        } catch (ex: Exception) {

            /*
             * Saving the filter is optional and should not
             * break the service on malfunction.
             */

            ex.printStackTrace()

            settings.remove(FILTER_SETTINGS_KEY)
        }
    }

    suspend fun loadFavorites(): List<String> {

        migrateLikes()

        val json = settings.getStringOrNull(FAVORITES_SETTINGS_KEY)
            ?: return emptyList()

        return try {

            jsonPretty.decodeFromString<List<String>>(json)

        } catch (ex: Throwable) {

            ex.printStackTrace()

            emptyList()
        }
    }

    private suspend fun migrateLikes() {

        if (getToken() == null)
            return

        if (settings.getBoolean(LIKES_MIGRATION_SETTINGS_KEY, false))
            return

        try {

            val remoteFavorites = DefaultWebClient.findFavoredCoordinates()

            if (remoteFavorites.isNotEmpty()) {

                val localFavorites = loadFavoritesInternal()
                val mergedFavorites = (localFavorites + remoteFavorites).distinct()

                saveFavorites(mergedFavorites)
            }

            settings.putBoolean(LIKES_MIGRATION_SETTINGS_KEY, true)

        } catch (ex: Exception) {

            ex.printStackTrace()
        }
    }

    private fun loadFavoritesInternal(): List<String> {

        val json = settings.getStringOrNull(FAVORITES_SETTINGS_KEY)
            ?: return emptyList()

        return try {

            jsonPretty.decodeFromString<List<String>>(json)

        } catch (ex: Throwable) {

            ex.printStackTrace()

            emptyList()
        }
    }

    suspend fun rate(coordinate: String, like: Boolean) {

        val favorites = loadFavorites().toMutableList()

        if (like) {

            if (!favorites.contains(coordinate))
                favorites.add(coordinate)

        } else {
            favorites.remove(coordinate)
        }

        saveFavorites(favorites)
    }

    fun saveFavorites(favorites: List<String>) {

        if (favorites.isEmpty()) {
            settings.remove(FAVORITES_SETTINGS_KEY)
            return
        }

        try {

            val json = jsonPretty.encodeToString(favorites)

            settings.putString(FAVORITES_SETTINGS_KEY, json)

        } catch (ex: Exception) {

            ex.printStackTrace()

            settings.remove(FAVORITES_SETTINGS_KEY)
        }
    }
}
