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

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.CanvasBasedWindow
import androidx.compose.ui.window.ComposeViewport
import com.appstractive.jwt.JWT
import com.appstractive.jwt.from
import com.appstractive.jwt.signatures.rs256
import com.appstractive.jwt.verify
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLElement
import ui.App

private val JWT_PUBLIC_KEY =
    """
        -----BEGIN PUBLIC KEY-----
        MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAssCfiAkLu
        dGa1okEQ4tyy7S9zPlH0PKoG/nRLCXcV4PGBnApj8+jj63ZtcYL/v
        IkOcLp/FuFUqm0EGXFNzl2EpKCFSMGeJ9yVj4TjJNKaOUrVivj8xM
        8/M6emy4bJ5svpJ2XXW9olkiU/KJ+JflgACVjFUTYt2AetuOALGE4
        MY+9XelGwccXoyB+rklBtiGCvZxZm4UN/7Bvp7oqKJiW+xanFEpOB
        r9seK565FTxtbSLtIWs2apkvVri5RAoSP4mh1YUXhB/+LOGYwu4Tm
        01p5D9qfA3k3EQw2gk7DHJNzcc2MrLJufA1WuM7+9LEyuLFB6waly
        vylenVV56w7ugOQIDAQAB
        -----END PUBLIC KEY-----
    """.trimIndent()

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    ComposeViewport(document.body!!) {

        val params = remember { getQueryParameters() }

        val isMniEmbedded = remember { params["embedded"] == "mni" }

        val connected = remember { mutableStateOf<Boolean>(false) }

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
            connected = connected.value,
            writeToClipboard = {
                window.navigator.clipboard.writeText(it)
            }
        )
    }
}

private suspend fun isTokenValid(token: String): Boolean {

    try {

        val jwt: JWT = JWT.from(token)

        val steamId = jwt.claims["steamId"]

        val verified = jwt.verify {

            rs256 { pem(JWT_PUBLIC_KEY) }

            issuer("mapsnotincluded")
        }

        if (verified)
            println("Steam ID: $steamId (verified)")
        else
            println("Steam ID unverified due to invalid JWT.")

        return verified

    } catch (ex: Exception) {

        ex.printStackTrace()

        return false
    }
}

private fun getQueryParameters(): Map<String, String> {

    val search = window.location.search

    if (search.isBlank() || !search.startsWith("?"))
        return emptyMap()

    return search
        .removePrefix("?")
        .split("&")
        .mapNotNull {

            val (key, value) = it.split("=")

            if (key.isNotEmpty())
                key to value
            else
                null
        }
        .toMap()
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
