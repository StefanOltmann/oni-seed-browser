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

package ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import model.Cluster
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.logo_oni
import oni_seed_browser.app.generated.resources.logo_spaced_out
import org.jetbrains.compose.resources.painterResource
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.ctaColor
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing
import ui.theme.halfPadding
import ui.theme.halfSpacing
import kotlin.math.max

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FilterPanel() {

    val filterPanelOpen = remember { mutableStateOf(false) }

    val maxSizeModifier = if (filterPanelOpen.value)
        Modifier.fillMaxSize()
    else
        Modifier

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = doubleSpacing)
            .padding(bottom = doubleSpacing)
            .background(MaterialTheme.colorScheme.surface, defaultRoundedCornerShape)
            .then(maxSizeModifier)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(48.dp)
                .fillMaxWidth()
                .background(
                    Color.Black,
                    if (filterPanelOpen.value)
                        RoundedCornerShape(
                            topStart = 8.dp,
                            topEnd = 8.dp
                        )
                    else
                        defaultRoundedCornerShape
                )
                .clickable {
                    filterPanelOpen.value = !filterPanelOpen.value
                }
        ) {

            DoubleSpacer()

            Text(
                text = "Filter",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )

            FillSpacer()

            Icon(
                imageVector = if (filterPanelOpen.value)
                    Icons.Default.KeyboardArrowUp
                else
                    Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(48.dp)
            )

            DefaultSpacer()
        }

        AnimatedVisibility(filterPanelOpen.value) {

            val spacedOutDlcSelected = remember { mutableStateOf(false) }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
            ) {

                DefaultSpacer()

                Row(
                    modifier = Modifier.defaultPadding(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterHorizontally)
                ) {

                    val baseGameLogoHovered = remember { mutableStateOf(false) }
                    val spacedOutLogoHovered = remember { mutableStateOf(false) }

                    Image(
                        painter = painterResource(Res.drawable.logo_oni),
                        contentDescription = null,
                        colorFilter = if (!spacedOutDlcSelected.value || baseGameLogoHovered.value)
                            null
                        else
                            grayScaleFilter,
                        modifier = Modifier
                            .height(logoIconHeight)
                            .onHover(baseGameLogoHovered)
                            .noRippleClickable { spacedOutDlcSelected.value = false }
                            .scale(if (baseGameLogoHovered.value) 1.2F else 1F)
                    )

                    Image(
                        painter = painterResource(Res.drawable.logo_spaced_out),
                        contentDescription = null,
                        colorFilter = if
                                          (spacedOutDlcSelected.value || spacedOutLogoHovered.value)
                            null
                        else
                            grayScaleFilter,
                        modifier = Modifier
                            .height(logoIconHeight)
                            .onHover(spacedOutLogoHovered)
                            .noRippleClickable { spacedOutDlcSelected.value = true }
                            .scale(if (spacedOutLogoHovered.value) 1.2F else 1F)
                    )
                }

                HorizontalSeparator()

                Column(
                    modifier = Modifier
                        .weight(1F)
                        .verticalScroll(rememberScrollState())
                ) {

                    val clusters = if (spacedOutDlcSelected.value)
                        Cluster.spacedOutCluster
                    else
                        Cluster.baseGameCluster

                    FlowRow(
                        maxItemsInEachRow = max(10, clusters.size / 2)
                    ) {

                        for (cluster in clusters) {

                            val clusterHovered = remember { mutableStateOf(false) }

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .halfPadding()
                                    .onHover(clusterHovered)
                            ) {

                                Image(
                                    painter = painterResource(
                                        getClusterDrawable(cluster)
                                    ),
                                    contentDescription = null,
                                    colorFilter = if (clusterHovered.value)
                                        null
                                    else
                                        grayScaleFilter,
                                    modifier = Modifier.size(100.dp)
                                )

                                Text(
                                    text = cluster.displayName,
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    textAlign = TextAlign.Center,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 2,
                                    modifier = Modifier.size(100.dp, 48.dp)
                                )

                            }
                        }
                    }

                    HorizontalSeparator()

                    DefaultSpacer()

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.defaultPadding()
                    ) {

                        FilterPanelEntry()

                        AddRuleButton(
                            text = "OR",
                            onClick = { println("add OR rule") }
                        )
                    }

                    HorizontalSeparator()
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.defaultPadding()
                ) {

                    AddRuleButton(
                        text = "AND",
                        onClick = { println("add rule") }
                    )

                    FillSpacer()

                    ResetButton(
                        onClick = { println("reset") }
                    )

                    DefaultSpacer()

                    SearchButton(
                        onClick = { println("Search") }
                    )
                }
            }
        }
    }
}

@Composable
private fun HorizontalSeparator() {

    Box(
        modifier = Modifier
            .defaultPadding()
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
            .height(2.dp)
    )
}

@Composable
private fun AddRuleButton(
    text: String,
    onClick: () -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(halfSpacing, Alignment.CenterHorizontally),
        modifier = Modifier
            .border(
                1.dp,
                MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .size(120.dp, 48.dp)
            .clickable { onClick() }
    ) {

        Text(
            text = "ADD",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Box(
            modifier = Modifier
                .padding()
                .background(
                    ctaColor,
                    defaultRoundedCornerShape
                )
        ) {

            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(halfSpacing)
            )
        }

        Text(
            text = "RULE",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Composable
private fun ResetButton(
    onClick: () -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(
                1.dp,
                MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .size(120.dp, 48.dp)
            .clickable { onClick() }
    ) {

        Text(
            text = "RESET",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Composable
private fun SearchButton(
    onClick: () -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(
                1.dp,
                MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .background(
                ctaColor,
                defaultRoundedCornerShape
            )
            .size(120.dp, 48.dp)
            .clickable { onClick() }
    ) {

        Text(
            text = "SEARCH",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
