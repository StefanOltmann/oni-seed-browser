/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLElement
import ui.App
import util.getQueryParameters
import util.isTokenValid

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    ComposeViewport(document.body!!) {

        val params = remember { getQueryParameters(window.location.search) }

        val isMniEmbedded = remember { params["embedded"] == "mni" }

        val isAnonymous = remember { params["anonymous"] == "true" }

        val connected = remember { mutableStateOf(false) }

        LaunchedEffect(true) {

            val tokenParameter = params["token"]

            if (!tokenParameter.isNullOrBlank() && isTokenValid(tokenParameter)) {

                /* The token was checked and can be saved to storage. */
                AppStorage.setToken(tokenParameter)

                /* Update the UI */
                connected.value = true

            } else {

                /* Check for stored token */

                val storedToken = AppStorage.getToken()

                if (!storedToken.isNullOrBlank()) {

                    /*
                     * Set it to the UI if valid or remove it from store.
                     */
                    if (isTokenValid(storedToken))
                        connected.value = true
                    else
                        AppStorage.clearToken()
                }
            }
        }

        /* Some debug values */
        println("Running on domain: ${document.domain}")
        println("Users language: " + Locale.current.language)
        println("Users language tag: " + Locale.current.toLanguageTag())
        println("Users region: " + Locale.current.region)
        println("Cookies: ${document.cookie}")
        println("Parameters: $params")

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
            isAnonymous = isAnonymous,
            connected = connected.value,
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
