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

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.Cluster
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import service.worldgenGenerate
import service.worldgenInit
import service.worldgenSupported
import service.worldgenVersion
import ui.icons.IconPauseCircleFilled
import ui.icons.IconPlayCircleFilled
import ui.theme.DoubleSpacer
import ui.theme.defaultPadding
import ui.theme.lightGray
import worldgen.CoordinateUtil
import worldgen.WorldgenMapData
import worldgen.WorldgenMapDataConverter

@Composable
fun MapGenerationView() {

    /*
     * Check if it's supported
     */

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

    /*
     * Show initialization...
     */

    var isInitialized by remember { mutableStateOf(false) }
    var worldgenVersion by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {

        try {

            worldgenVersion = withContext(Dispatchers.Default) {
                worldgenInit()
                worldgenVersion()
            }

            println("Worldgen version initialized: $worldgenVersion")

            isInitialized = true

        } catch (ex: Exception) {
            println("Worldgen initialization failed.")
            ex.printStackTrace()
        }
    }

    /*
     * At this point everything is ready.
     */

    var isRunning by remember { mutableStateOf(false) }

    var generatedCount by remember { mutableIntStateOf(0) }

    LaunchedEffect(isRunning, isInitialized) {

        while (isRunning && isInitialized) {

            try {

                val coordinate = CoordinateUtil.generateRandomCoordinate()

                val cluster: Cluster = withContext(Dispatchers.Default) {

                    val json: String = worldgenGenerate(coordinate)

                    val worldgenMapData = WorldgenMapData.fromJson(json)

                    WorldgenMapDataConverter.convert(
                        mapData = worldgenMapData,
                        gameVersion = worldgenVersion.substringBefore('+').toInt()
                    )
                }

                // TODO Upload cluster

                generatedCount += 1

                println("Generated map: $coordinate")

            } catch (e: Exception) {

                e.printStackTrace()
                println("Map generation failed: ${e.message}")
            }
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.defaultPadding()
        ) {

            Text(
                text = "Contribute maps to ONI Seed Browser!",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground
            )

            DoubleSpacer()

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.size(64.dp)
                ) {

                    if (isRunning) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(64.dp),
                            strokeWidth = 4.dp,
                            color = lightGray
                        )
                    } else {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .border(4.dp, lightGray, CircleShape)
                        )
                    }

                    IconButton(
                        onClick = {
                            isRunning = !isRunning
                        },
                        enabled = isInitialized,
                        modifier = Modifier.size(64.dp)
                    ) {

                        Icon(
                            imageVector = if (isRunning) IconPauseCircleFilled else IconPlayCircleFilled,
                            contentDescription = if (isRunning) "Stop" else "Start",
                            tint = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.size(48.dp)
                        )
                    }
                }
            }

            DoubleSpacer()

            Text(
                text = "Maps contribution in this session:",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground
            )

            Text(
                text = "$generatedCount",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}
