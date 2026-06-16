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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.ComposeViewport
import de.stefan_oltmann.oni.model.Cluster
import kotlin.time.measureTime
import kotlinx.browser.document
import kotlinx.browser.window
import service.worldgenGenerate
import service.worldgenInit
import service.worldgenVersion
import ui.App
import util.getQueryParameters
import worldgen.WorldgenMapData
import worldgen.WorldgenMapDataConverter

@OptIn(ExperimentalComposeUiApi::class, ExperimentalWasmJsInterop::class)
fun main() {

    ComposeViewport(document.body!!) {

        val params = remember { getQueryParameters(window.location.search) }

        val isMniEmbedded = remember { params["embedded"] == "mni" }

        val filterQuery = remember {

            params["filter"]?.let {

                if (it.isEmpty())
                    return@remember null

                try {

                    createFilterQuery(it)

                } catch (ex: Throwable) {

                    println("Error parsing filter: $it")
                    ex.printStackTrace()

                    null
                }
            }
        }

        val previewCluster = remember { mutableStateOf<Cluster?>(null) }

        /*
         * Check preview token.
         *
         * Call the page with ?preview=M-BAD-C-1484520278-0-0-0 to preview a cluster.
         */
        LaunchedEffect(Unit) {

            val previewCoordinate = params["preview"]

            if (previewCoordinate.isNullOrBlank())
                return@LaunchedEffect

            worldgenInit()

            val worldgenVersion = worldgenVersion()

            println("Worldgen version: $worldgenVersion")

            val duration = measureTime {

                val json: String = worldgenGenerate(previewCoordinate)

                val worldgenMapData = WorldgenMapData.fromJson(json)

                val cluster = WorldgenMapDataConverter.convert(
                    mapData = worldgenMapData,
                    gameVersion = worldgenVersion.substringBefore('+').toInt()
                )

                previewCluster.value = cluster
            }

            println("Test world generation took ${duration.inWholeMilliseconds}ms")
        }

        val urlHash = remember {
            mutableStateOf(document.location?.hash?.drop(1)?.ifBlank { null })
        }

        val origin: String = document.location?.origin ?: "-/-"
        val href: String = document.location?.href ?: "-/-"

        /* Some debug values */
        println("### ONI Seed Browser $APP_VERSION ###")
        println("Running on domain: ${document.domain}")
        println("Origin: $origin")
        println("HREF: $href")
        println("URL hash: ${urlHash.value}")
        println("URL filter query: $filterQuery")
        println("Preview cluster: ${previewCluster.value?.coordinate}")
        println("Users language: " + Locale.current.language)
        println("Users language tag: " + Locale.current.toLanguageTag())
        println("Users region: " + Locale.current.region)
        println("Cookies: ${document.cookie}")

        window.onhashchange = {

            urlHash.value = it.newURL.substringAfter('#', "").ifBlank { null }
        }

        App(
            urlHash = urlHash,
            urlFilterQuery = filterQuery,
            isMniEmbedded = isMniEmbedded,
            localPort = null,
            writeToClipboard = {
                window.navigator.clipboard.writeText(it)
            }
        )
    }
}
