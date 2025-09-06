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

package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiCoordinateRequestFailed
import io.github.stefanoltmann.app.generated.resources.uiCoordinateRequested
import io.github.stefanoltmann.app.generated.resources.uiRequestCoordinateButton
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
import ui.theme.DefaultSpacer
import ui.theme.defaultRoundedCornerShape

@Composable
fun RequestCoordinateButton(
    enabled: Boolean,
    coordinate: String
) {

    val hovered = remember { mutableStateOf(false) }

    val requestedState = remember { mutableStateOf(false) }

    val invalidRequestState = remember { mutableStateOf(false) }

    val coroutineScope = rememberCoroutineScope()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .onHover(hovered)
            .border(
                1.dp,
                MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .background(
                if (enabled && !requestedState.value && hovered.value)
                    MaterialTheme.colorScheme.surface
                else
                    MaterialTheme.colorScheme.background,
                defaultRoundedCornerShape
            )
            .noRippleClickable {

                if (enabled && !requestedState.value) {

                    requestedState.value = true

                    coroutineScope.launch {

                        val requestValid = DefaultWebClient.request(coordinate)

                        if (!requestValid)
                            invalidRequestState.value = true
                    }
                }
            }
            .alpha(if (enabled) 1.0f else 0.3f)
    ) {

        DefaultSpacer()

        if (invalidRequestState.value) {

            Text(
                text = stringResource(Res.string.uiCoordinateRequestFailed),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.error,
                maxLines = 1,
                modifier = Modifier.offset(y = -2.dp)
            )

        } else if (requestedState.value) {

            Text(
                text = stringResource(Res.string.uiCoordinateRequested),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                modifier = Modifier.offset(y = -2.dp)
            )

        } else {

            Text(
                text = stringResource(Res.string.uiRequestCoordinateButton),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                modifier = Modifier.offset(y = -2.dp)
            )
        }

        DefaultSpacer()
    }
}
