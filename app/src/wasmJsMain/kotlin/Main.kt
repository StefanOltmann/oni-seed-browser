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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.delay
import org.w3c.dom.HTMLElement
import service.DefaultWebClient
import ui.App
import util.getQueryParameters
import util.getValidSteamHash

@OptIn(ExperimentalComposeUiApi::class, ExperimentalWasmJsInterop::class)
fun main() {

    ComposeViewport(document.body!!) {

        val params = remember { getQueryParameters(window.location.search) }

        val isMniEmbedded = remember { params["embedded"] == "mni" }

        val connectedUserId = remember { mutableStateOf<String?>(null) }

        /*
         * App update check
         */
        LaunchedEffect(Unit) {

            val latestAppVersion = DefaultWebClient.getLatestAppVersion()

            println("Latest app version: $latestAppVersion")

            /* If the latest app version and APP_VERSION do not match, perform a browser reload */
            if (latestAppVersion != APP_VERSION) {

                /* Don't reload in development / localhost environment */
                val isLocalhost = document.domain == "localhost" || document.domain == "127.0.0.1"

                if (!isLocalhost) {

                    println("Reloading browser to update app version...")

                    delay(1000)

                    window.location.reload()

                } else {

                    println("Version mismatch detected but skipping reload in development environment")
                }
            }
        }

        /*
         * Check login token
         */
        LaunchedEffect(Unit) {

            val tokenParameter = params["token"]

            val validSteamHashParameter: String? =
                if (!tokenParameter.isNullOrBlank())
                    getValidSteamHash(tokenParameter)
                else
                    null

            if (!tokenParameter.isNullOrBlank() && validSteamHashParameter != null) {

                /* The token was checked and can be saved to storage. */
                AppStorage.setToken(tokenParameter)

                /* Update the UI */
                connectedUserId.value = validSteamHashParameter

            } else {

                /* Check for stored token */

                val storedToken = AppStorage.getToken()

                if (!storedToken.isNullOrBlank()) {

                    val validSteamHash = getValidSteamHash(storedToken)

                    /*
                     * Set it to the UI if valid or remove it from store.
                     */
                    if (validSteamHash != null)
                        connectedUserId.value = validSteamHash
                    else
                        AppStorage.clearToken()
                }
            }
        }

        /* Some debug values */
        println("### ONI Seed Browser $APP_VERSION ###")
        println("Running on domain: ${document.domain}")
        println("Users language: " + Locale.current.language)
        println("Users language tag: " + Locale.current.toLanguageTag())
        println("Users region: " + Locale.current.region)
        println("Cookies: ${document.cookie}")

        val urlHash = remember {
            mutableStateOf(document.location?.hash?.drop(1)?.ifBlank { null })
        }

        window.onhashchange = {

            urlHash.value = it.newURL.substringAfter('#', "").ifBlank { null }
        }

        hideLoader()

        App(
            urlHash = urlHash,
            isMniEmbedded = isMniEmbedded,
            connectedUserId = connectedUserId.value,
            localPort = null,
            writeToClipboard = {
                window.navigator.clipboard.writeText(it)
            }
        )
    }
}

/**
 * Function to hide the loader and show the app
 */
fun hideLoader() {

    val loader = document.getElementById("loader") as? HTMLElement
    val app = document.getElementById("app") as? HTMLElement

    /* Hide the loader */
    loader?.style?.display = "none"

    /* Show the app */
    app?.style?.display = "block"
}
