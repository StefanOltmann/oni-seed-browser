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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import oni_seed_browser.app.generated.resources.dlc_frosty_planet
import oni_seed_browser.app.generated.resources.dlc_spaced_out
import oni_seed_browser.app.generated.resources.oni_logo
import org.jetbrains.compose.resources.painterResource
import theme.DefaultSpacer
import theme.DoubleSpacer
import theme.FillSpacer
import theme.defaultPadding
import theme.defaultRoundedCornerShape
import theme.doubleSpacing

@Composable
fun FilterPanel() {

    val filterPanelOpen = remember { mutableStateOf(false) }

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

            DefaultSpacer()

            Row(
                modifier = Modifier.defaultPadding(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(64.dp)
            ) {

                Image(
                    painter = painterResource(Res.drawable.oni_logo),
                    contentDescription = null,
                    modifier = Modifier.height(logoIconHeight)
                )

                Image(
                    painter = painterResource(Res.drawable.dlc_spaced_out),
                    contentDescription = null,
                    modifier = Modifier.height(logoIconHeight)
                )

                Image(
                    painter = painterResource(Res.drawable.dlc_frosty_planet),
                    contentDescription = null,
                    modifier = Modifier.height(logoIconHeight)
                )
            }

            DefaultSpacer()
        }
    }
}
