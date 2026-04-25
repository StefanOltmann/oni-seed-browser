/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
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

package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import kotlin.time.measureTime
import service.worldgenGenerate
import service.worldgenInit
import service.worldgenSupported
import service.worldgenVersion
import worldgen.CoordinateUtil
import worldgen.WorldgenMapData
import worldgen.WorldgenMapDataConverter

@Composable
fun MapGenerationView() {

    if (!worldgenSupported) {

        Text(
            text = "Worldgen is not supported on this platform.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxSize()
        )

        return
    }

    LaunchedEffect(Unit) {

        worldgenInit()

        val worldgenVersion = worldgenVersion()

        println("Worldgen version: $worldgenVersion")

        val duration = measureTime {

            val coordinate = CoordinateUtil.generateRandomCoordinate()

            println("Generated random coordinate: $coordinate")

            val json: String = worldgenGenerate(coordinate)

            val worldgenMapData = WorldgenMapData.fromJson(json)

            val cluster = WorldgenMapDataConverter.convert(
                mapData = worldgenMapData,
                gameVersion = worldgenVersion.substringBefore('+').toInt()
            )
        }

        println("Test world generation took ${duration.inWholeMilliseconds}ms")
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "Upcoming: Map generation in the browser",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
