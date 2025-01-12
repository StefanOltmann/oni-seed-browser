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

import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.window.CanvasBasedWindow
import kotlinx.browser.document
import kotlinx.browser.window
import ui.App

const val SESSION_COOKIE_MAX_AGE = 90 * 24 * 60 * 60

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    CanvasBasedWindow(canvasElementId = "ComposeTarget") {

        val params = remember { getQueryParameters() }

        val isMniEmbedded = derivedStateOf { params["embedded"] == "mni" }

        /* Some debug values */
        println("Running on domain: ${document.domain}")
        println("Users language: " + Locale.current.language)
        println("Users language tag: " + Locale.current.toLanguageTag())
        println("Users region: " + Locale.current.region)
        println("Parameters: $params")
        println("Cookies: ${document.cookie}")

        val urlHash = remember {
            mutableStateOf(document.location?.hash?.drop(1)?.ifBlank { null })
        }

        params["userSession"]?.let { session ->

            document.cookie = "${"USER_SESSION"}=$session; max-age=$SESSION_COOKIE_MAX_AGE; path=/"
        }

        window.onhashchange = {

            urlHash.value = it.newURL.substringAfter('#', "").ifBlank { null }
        }

        App(
            urlHash = urlHash,
            isMniEmbedded = isMniEmbedded,
            writeToClipboard = {
                window.navigator.clipboard.writeText(it)
            }
        )
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
