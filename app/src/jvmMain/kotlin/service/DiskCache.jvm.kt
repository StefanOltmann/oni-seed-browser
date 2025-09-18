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
package service

import java.io.File
import kotlin.getValue

/* Cross-platform local app data directory for ONI Seed Browser */
private val localAppData: File by lazy {

    val os = System.getProperty("os.name").lowercase()
    val userHome = System.getProperty("user.home")

    val path = when {

        os.contains("win") ->
            System.getenv("LOCALAPPDATA") ?: "$userHome/AppData/Local"

        os.contains("mac") ->
            "$userHome/Library/Application Support"

        else -> // Linux & others
            System.getenv("XDG_DATA_HOME") ?: "$userHome/.local/share"

    } + "/ONI Seed Browser/"

    File(path).apply {
        mkdirs()
    }
}

actual class DiskCache(
    name: String
) {

    private lateinit var dir: File

    init {

        this.dir = File(localAppData, name)
            .apply { mkdirs() }
    }

    actual suspend fun save(key: String, data: ByteArray, modifiedTime: Long) {

        val file = File(dir, key)

        file.writeBytes(data)
        file.setLastModified(modifiedTime)
    }

    actual suspend fun load(key: String): Pair<ByteArray, Long>? {

        val file = File(dir, key)

        if (file.exists())
            return file.readBytes() to file.lastModified()

        return null
    }

    actual suspend fun delete(key: String) {
        File(dir, key).delete()
    }

    actual suspend fun deleteAll() {
        dir.deleteRecursively()
    }
}

actual val searchIndexCache: DiskCache = DiskCache("search-index")
