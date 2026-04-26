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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.ktor.http.HttpStatusCode
import io.ktor.http.isSuccess
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
import kotlin.time.measureTimedValue
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import service.DefaultWebClient
import service.worldgenGenerate
import service.worldgenInit
import service.worldgenSupported
import service.worldgenVersion
import ui.icons.IconPauseCircleFilled
import ui.icons.IconPlayCircleFilled
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.lightGray
import worldgen.CoordinateUtil
import worldgen.WorldgenMapData
import worldgen.WorldgenMapDataConverter

private const val DEFAULT_DELAY_MS = 100
private const val DELAY_MS_STEP = 100
private const val WARN_DELAY_MS = 500
private const val MAX_DELAY_MS = 10000

@Composable
fun MapGenerationView(
    isLoggedIn: Boolean,
    errorMessage: MutableState<String?>
) {

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

        } catch (ex: CancellationException) {
            throw ex
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

    /*
     * Map generation takes around 500ms. If we delay by 500ms
     * it generates one map per second. That's fast enough.
     */
    var delayMillis by remember { mutableIntStateOf(DEFAULT_DELAY_MS) }

    LaunchedEffect(isRunning, isInitialized) {

        while (isRunning && isInitialized) {

            /*
             * Wait a bit before generating the next map to prevent
             * being rate limited by the server.
             */
            delay(delayMillis.milliseconds)

            try {

                val coordinate = CoordinateUtil.generateRandomCoordinate()

                val (statusCode, duration) = measureTimedValue {

                    val json: String = worldgenGenerate(coordinate)

                    val worldgenMapData = WorldgenMapData.fromJson(json)

                    val cluster = WorldgenMapDataConverter.convert(
                        mapData = worldgenMapData,
                        gameVersion = worldgenVersion.substringBefore('+').toInt()
                    )

                    DefaultWebClient.upload(cluster)
                }

                /*
                 * The server returned that the map already exists.
                 * We just skip to the next one.
                 */
                if (statusCode == HttpStatusCode.Conflict)
                    continue

                /*
                 * If the server is under heavy load, we wait a second
                 * and then continue with slower uploads.
                 */
                if (statusCode == HttpStatusCode.TooManyRequests) {

                    /*
                     * We increase the delay time by 100ms.
                     * If we reach a 5-second delay, we stop generating maps because
                     * it doesn't make sense to wait that long.
                     */

                    delayMillis += DELAY_MS_STEP

                    if (delayMillis > MAX_DELAY_MS) {

                        println("Server is under heavy load. Stopping map generation.")

                        isRunning = false
                        delayMillis = DEFAULT_DELAY_MS

                        break

                    } else {

                        println("Server is under heavy load. Upload delay is now ${delayMillis}ms.")

                        /*
                         * Wait a bit before continuing to give the server time
                         * to clear the queue up.
                         */
                        delay(duration = 1.seconds)

                        continue
                    }
                }

                if (statusCode.isSuccess()) {

                    generatedCount += 1

                    println("Generated map $coordinate in ${duration.inWholeMilliseconds}ms.")

                    errorMessage.value = null

                } else {

                    println("Map uploading failed for $coordinate.")

                    errorMessage.value = "Map uploading failed after ${duration.inWholeMilliseconds}ms"

                    /*
                     * After an error, wait for 30 seconds.
                     * This is to prevent server spamming.
                     */
                    delay(30.seconds)
                }

            } catch (ex: CancellationException) {

                errorMessage.value = null

                /*
                 * Let the cancellation propagate.
                 */
                throw ex

            } catch (ex: Throwable) {

                /*
                 * Catch Throwable here to prevent UI freezes.
                 */

                println("Map generation failed: ${ex.message}")
                ex.printStackTrace()

                errorMessage.value = "Map generation failed: ${ex.message}"

                /*
                 * Stop generating maps after an error and retry 30 seconds later.
                 * This is to prevent server spamming.
                 */
                isRunning = false
                delay(30.seconds)
                isRunning = true
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
                color = lightGray
            )

            DefaultSpacer()

            Text(
                text = "To contribute maps, just click the button below and leave this page open.",
                style = MaterialTheme.typography.bodyLarge,
                color = lightGray
            )

            DoubleSpacer()

            Box(
                contentAlignment = Alignment.Center
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.size(108.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .size(108.dp)
                            .border(8.dp, lightGray.copy(alpha = 0.1f), CircleShape)
                    )

                    if (isRunning)
                        CircularProgressIndicator(
                            modifier = Modifier.size(108.dp),
                            strokeWidth = 8.dp,
                            color = lightGray
                        )

                    IconButton(
                        onClick = {
                            isRunning = !isRunning
                        },
                        enabled = isInitialized && isLoggedIn,
                        modifier = Modifier.size(96.dp)
                    ) {

                        Icon(
                            imageVector = if (isRunning)
                                IconPauseCircleFilled
                            else
                                IconPlayCircleFilled,
                            contentDescription = if (isRunning) "Stop" else "Start",
                            tint = lightGray,
                            modifier = Modifier.size(96.dp)
                        )
                    }
                }

                if (!isLoggedIn) {

                    Box(
                        modifier = Modifier.background(
                            Color.Black.copy(alpha = 0.9f),
                            defaultRoundedCornerShape
                        )
                    ) {

                        Text(
                            text = "Please login to contribute maps.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = lightGray,
                            modifier = Modifier.defaultPadding()
                        )
                    }
                }
            }

            DoubleSpacer()

            Text(
                text = "Maps contributed in this session:",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground
            )

            Text(
                text = "$generatedCount",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )

            if (delayMillis > WARN_DELAY_MS) {

                DoubleSpacer()

                Text(
                    text = "Server is under heavy load. Uploads are delayed by $delayMillis ms.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }
    }
}
