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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiCopiedToClipboard
import kotlinx.coroutines.delay
import model.Cluster
import org.jetbrains.compose.resources.stringResource
import ui.MNI_URL
import ui.ORIGINAL_URL
import ui.icons.ContentCopy
import ui.icons.IconExternalLink
import ui.noRippleClickable
import ui.onHover
import ui.theme.DefaultSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.halfSpacing
import ui.theme.hoverColor
import util.formatDate

@Composable
fun VerticalDividerIfRoom() {
    // The FlowRow automatically handles wrapping.
    // This divider will only look correct when in-line with others.
    // You could adjust visibility dynamically if needed using layout detection.
    VerticalDivider(
        thickness = 1.dp,
        color = MaterialTheme.colorScheme.onBackground,
        modifier = Modifier
            .height(doubleSpacing)
            .padding(horizontal = defaultSpacing)
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ClusterMetadataView(
    cluster: Cluster,
    steamIdToUsernameMap: Map<String, String?>,
    showMniUrl: Boolean,
    modifier: Modifier = Modifier
) {
    val clipboardManager = LocalClipboardManager.current
    val uriHandler = LocalUriHandler.current

    val urlWasCopied = remember { mutableStateOf(false) }
    val url = if (showMniUrl)
        MNI_URL + cluster.coordinate
    else
        ORIGINAL_URL + cluster.coordinate

    // Start timer to reset copied message
    LaunchedEffect(urlWasCopied.value) {
        if (urlWasCopied.value) {
            delay(1000)
            urlWasCopied.value = false
        }
    }
    Row(
        modifier = modifier.wrapContentWidth()
    ) {

        Spacer(modifier = Modifier.width(defaultSpacing + halfSpacing))

        FlowRow(
            modifier = Modifier
                .wrapContentWidth(),
        ) {

            // URL + Copy button always grouped
            Row(
                modifier = Modifier
                    .defaultMinSize(minWidth = 0.dp)
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .noRippleClickable {
                        clipboardManager.setText(AnnotatedString(url))
                        urlWasCopied.value = true
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (urlWasCopied.value)
                        stringResource(Res.string.uiCopiedToClipboard)
                    else
                        url,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .weight(1f, fill = false)
                )

                DefaultSpacer()

                val copyHovered = remember { mutableStateOf(false) }

                Icon(
                    imageVector = ContentCopy,
                    contentDescription = "Copy URL",
                    tint = if (copyHovered.value) hoverColor else MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .onHover(copyHovered)
                        .size(16.dp)
                        .offset(y = 2.dp)
                )

                HalfSpacer()

                // External link icon
                val openHovered = remember { mutableStateOf(false) }

                Icon(
                    imageVector = IconExternalLink,
                    contentDescription = "Open in browser",
                    tint = if (openHovered.value) hoverColor else MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .onHover(openHovered)
                        .size(16.dp)
                        .noRippleClickable {
                            uriHandler.openUri(url)
                        }
                )
            }

            // Game version
            VerticalDividerIfRoom()
            Text(
                text = "ONI Ver. ${cluster.gameVersion}",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            // Username
            steamIdToUsernameMap[cluster.uploaderSteamIdHash]?.let { username ->
                VerticalDividerIfRoom()
                Text(
                    text = username,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            // Upload date
            cluster.uploadDate?.let { date ->
                VerticalDividerIfRoom()
                Text(
                    text = formatDate(date),
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

        Spacer(modifier = Modifier.width(defaultSpacing + halfSpacing))
    }
}
