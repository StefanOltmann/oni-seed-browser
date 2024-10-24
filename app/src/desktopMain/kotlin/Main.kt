/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.uiTitle
import org.jetbrains.compose.resources.stringResource
import ui.App

fun main() = application {

    Window(
        state = rememberWindowState(
            size = DpSize(1200.dp, 800.dp)
        ),
        title = stringResource(Res.string.uiTitle),
        onCloseRequest = ::exitApplication
    ) {
        App(
            urlHash = remember { mutableStateOf(null) },
            isMniEmbedded = remember { mutableStateOf(false) }
        )
    }
}
