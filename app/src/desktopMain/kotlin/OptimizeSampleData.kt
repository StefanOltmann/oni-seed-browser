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

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.World
import service.sampleWorldsJson
import java.io.File

@OptIn(ExperimentalSerializationApi::class)
private val json = Json {
    this.prettyPrint = true
    this.prettyPrintIndent = "  "
}

fun main() {

    val parsedWorlds = json.decodeFromString<List<World>>(sampleWorldsJson)

    /* DLCs first */
    val sortedWorls = parsedWorlds.sortedWith(compareBy({ it.cluster.isBaseGame() }, { it.cluster }))

    val optimizedJson = json.encodeToString(sortedWorls)

    // TODO

    File("sample_worlds.json").writeText(optimizedJson)
}
