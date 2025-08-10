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

package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiConnected
import io.github.stefanoltmann.app.generated.resources.uiLoginWithSteam
import org.jetbrains.compose.resources.stringResource
import ui.icons.IconSteam
import ui.theme.DefaultSpacer
import ui.theme.HalfSpacer
import ui.theme.halfPadding
import ui.theme.minimalRoundedCornerShape

private const val LOGIN_BASE_URL: String =
    "https://steam.auth.stefanoltmann.de/login?redirect="

private const val PUBLIC_LOGIN_URL: String =
    LOGIN_BASE_URL + "https://stefan-oltmann.de/oni-seed-browser/"

@Composable
fun LoginWithSteamButton(
    connectedUserId: String?,
    localPort: Int?
) {

    val hovered = remember { mutableStateOf(false) }

    val uriHandler = LocalUriHandler.current

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .onHover(hovered)
            .background(
                if (connectedUserId == null && hovered.value)
                    MaterialTheme.colorScheme.surface
                else
                    MaterialTheme.colorScheme.background,
                minimalRoundedCornerShape
            )
            .noRippleClickable {

                if (connectedUserId != null)
                    return@noRippleClickable

                if (localPort == null)
                    uriHandler.openUri(PUBLIC_LOGIN_URL)
                else
                    uriHandler.openUri(LOGIN_BASE_URL + "http://localhost:$localPort")
            }
    ) {

        DefaultSpacer()

        Icon(
            imageVector = IconSteam,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .halfPadding()
                .size(24.dp)
        )

        HalfSpacer()

        if (connectedUserId == null) {

            Text(
                text = stringResource(Res.string.uiLoginWithSteam),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                modifier = Modifier.offset(y = -2.dp)
            )

            /*
             * To follow https://partner.steamgames.com/doc/marketing/branding
             * and avoid trouble.
             */
            Text(
                text = "®",
                style = MaterialTheme.typography.bodySmall,
                fontSize = 6.sp,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                modifier = Modifier.align(Alignment.Top)
            )

        } else {

            Text(
                text = stringResource(Res.string.uiConnected),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                modifier = Modifier.offset(y = -2.dp)
            )
        }

        DefaultSpacer()
    }
}
