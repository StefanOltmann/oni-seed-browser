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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.ClipEntry
import androidx.compose.ui.platform.LocalClipboard
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.app_icon
import io.github.stefanoltmann.app.generated.resources.uiTitle
import io.ktor.http.HttpStatusCode
import java.awt.datatransfer.StringSelection
import java.net.InetSocketAddress
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.App
import util.getQueryParameters
import util.getValidSteamHash

private var currentServer: HttpServer? = null

fun main() = application {

    Window(
        state = rememberWindowState(
            size = DpSize(800.dp, 800.dp)
        ),
        title = stringResource(Res.string.uiTitle),
        icon = painterResource(Res.drawable.app_icon),
        onCloseRequest = ::exitApplication
    ) {

        this.window.minimumSize = java.awt.Dimension(800, 800)

        val clipboard = LocalClipboard.current
        val clipboardScope = rememberCoroutineScope()

        val connectedUserId = remember { mutableStateOf<String?>(null) }

        val localPort = remember { mutableStateOf<Int?>(null) }

        /*
         * Check for stored tokens on start
         */
        LaunchedEffect(true) {

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

            /*
             * Start a local webservice if we are not connected.
             */
            if (connectedUserId.value == null) {

                localPort.value = startLocalWebservice(connectedUserId)

                println("Local webservice started on port: ${localPort.value}")
            }
        }

        App(
            urlHash = remember { mutableStateOf(null) },
            urlFilterQuery = null,
            isMniEmbedded = false,
            connectedUserId = connectedUserId.value,
            localPort = localPort.value,
            writeToClipboard = { text ->
                clipboardScope.launch {
                    clipboard.setClipEntry(ClipEntry(StringSelection(text)))
                }
            }
        )
    }
}

fun startLocalWebservice(
    connectedUserId: MutableState<String?>
): Int {

    require(currentServer == null) { "Server was already started." }

    val loopbackAddress = InetSocketAddress("127.0.0.1", 0)

    val server = HttpServer.create(loopbackAddress, 0)

    server.createContext("/", DefaultHttpHandler(connectedUserId))

    server.start()

    currentServer = server

    return server.address.port
}

private class DefaultHttpHandler(
    val connectedUserId: MutableState<String?>
) : HttpHandler {

    override fun handle(exchange: HttpExchange) = runBlocking {

        val path = exchange.requestURI.toString()

        println("Received request for path: $path")

        val queryParams = getQueryParameters(path)

        val tokenParameter = queryParams["token"]

        if (!tokenParameter.isNullOrBlank()) {

            println("Token parameter: $tokenParameter")

            val validSteamHashParameter: String? = getValidSteamHash(tokenParameter)

            if (validSteamHashParameter != null) {

                /* The token was checked and can be saved to storage. */
                AppStorage.setToken(tokenParameter)

                /* Update the UI */
                connectedUserId.value = validSteamHashParameter
            }
        }

        val response = if (connectedUserId.value != null)
            "Logged in!".encodeToByteArray()
        else
            "Login failed!".encodeToByteArray()

        exchange.sendResponseHeaders(HttpStatusCode.OK.value, response.size.toLong())

        exchange.responseHeaders["Content-Type"] = "text/plain; charset=utf-8"

        exchange.responseBody.use {
            it.write(response)
        }
    }
}
