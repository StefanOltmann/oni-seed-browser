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

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.CanvasBasedWindow
import com.appstractive.jwt.JWT
import com.appstractive.jwt.from
import com.appstractive.jwt.issuer
import kotlinx.browser.document
import kotlinx.browser.window
import ui.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    CanvasBasedWindow(canvasElementId = "ComposeTarget") {

        val params = remember { getQueryParameters() }

        val isMniEmbedded = remember { params["embedded"] == "mni" }

        val jwt: String? = remember {

            val token = params["token"]

            if (!token.isNullOrBlank() && isTokenValid(token))
                token
            else
                null
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

        App(
            urlHash = urlHash,
            isMniEmbedded = isMniEmbedded,
            jwt = jwt,
            writeToClipboard = {
                window.navigator.clipboard.writeText(it)
            }
        )
    }
}

/*
 * Not a real verification, just a quick check
 * if the given String is a JWT.
 * The server will do the real check.
 */
private fun isTokenValid(token: String): Boolean {

    try {

        val jwt: JWT = JWT.from(token)

        val steamId = jwt.claims["steamId"]

        println("Steam ID (JWT): $steamId")

        return jwt.issuer == "mapsnotincluded"

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
