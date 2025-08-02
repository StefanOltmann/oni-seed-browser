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

class LruCache<K, V>(
    private val maxSize: Int
) {

    private val map = LinkedHashMap<K, V>()

    fun get(key: K): V? {

        val value = map.remove(key)

        /* Re-insert to mark as recently used */
        if (value != null)
            map[key] = value

        return value
    }

    fun put(key: K, value: V) {

        if (map.containsKey(key)) {

            map.remove(key)

        } else if (map.size >= maxSize) {

            val oldestKey = map.keys.first()

            map.remove(oldestKey)
        }

        map[key] = value
    }
}
