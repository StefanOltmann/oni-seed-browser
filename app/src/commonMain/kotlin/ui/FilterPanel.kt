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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.logo_oni
import oni_seed_browser.app.generated.resources.logo_oni_gray
import oni_seed_browser.app.generated.resources.logo_spaced_out
import oni_seed_browser.app.generated.resources.logo_spaced_out_gray
import org.jetbrains.compose.resources.painterResource
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.ctaColor
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing
import ui.theme.halfSpacing

@Composable
fun FilterPanel() {

    val filterPanelOpen = remember { mutableStateOf(true) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = doubleSpacing)
            .background(MaterialTheme.colorScheme.surface, defaultRoundedCornerShape)
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

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                DefaultSpacer()

                val spacedOutDlcSelected = remember { mutableStateOf(false) }

                Row(
                    modifier = Modifier.defaultPadding(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterHorizontally)
                ) {

                    val baseGameLogoHovered = remember { mutableStateOf(false) }
                    val spacedOutLogoHovered = remember { mutableStateOf(false) }

                    Image(
                        painter = painterResource(
                            if (!spacedOutDlcSelected.value || baseGameLogoHovered.value)
                                Res.drawable.logo_oni
                            else
                                Res.drawable.logo_oni_gray
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .height(logoIconHeight)
                            .onHover(baseGameLogoHovered)
                            .noRippleClickable { spacedOutDlcSelected.value = false }
                    )

                    Image(
                        painter = painterResource(
                            if (spacedOutDlcSelected.value || spacedOutLogoHovered.value)
                                Res.drawable.logo_spaced_out
                            else
                                Res.drawable.logo_spaced_out_gray
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .height(logoIconHeight)
                            .onHover(spacedOutLogoHovered)
                            .noRippleClickable { spacedOutDlcSelected.value = true }
                    )
                }

                HorizontalLine()

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

                HorizontalLine()

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
private fun HorizontalLine() {

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
