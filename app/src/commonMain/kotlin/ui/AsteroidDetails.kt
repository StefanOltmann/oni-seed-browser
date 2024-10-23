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

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.Asteroid
import model.BiomePaths
import org.jetbrains.compose.resources.stringResource
import ui.theme.DefaultSpacer
import ui.theme.anthraticeTransparentBackgroundColor
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.lightGray
import ui.theme.lightGrayTransparentBorderColor

@Composable
fun AsteroidDetails(
    asteroid: Asteroid,
    showAsteroidMap: () -> Unit
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight()
            .padding(
                start = 0.dp,
                top = doubleSpacing,
                bottom = doubleSpacing,
                end = doubleSpacing
            )
            .background(anthraticeTransparentBackgroundColor, defaultRoundedCornerShape)
            .border(0.dp, lightGrayTransparentBorderColor, defaultRoundedCornerShape)
    ) {

        DefaultSpacer()

        Text(
            text = stringResource(asteroid.id.stringResource) + " details",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onBackground,
        )

        DefaultSpacer()

        Box(
            modifier = Modifier
        ) {

            val scrollState = rememberScrollState()

            /* Scroll to top if Asteroid is switched. */
            LaunchedEffect(asteroid) {
                scrollState.scrollTo(0)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(defaultSpacing),
                modifier = Modifier.verticalScroll(scrollState)
            ) {

                Box(
                    contentAlignment = Alignment.BottomCenter,
                    modifier = Modifier
                        .width(250.dp)
                        .noRippleClickable(showAsteroidMap)
                ) {

                    val biomePaths = BiomePaths.parse(asteroid.biomePaths)

                    AsteroidMap(
                        asteroid = asteroid,
                        biomePaths = biomePaths,
                        iconSize = 24.dp,
                        enableClickListener = false,
                        // TODO Implement highlighting on hover
                        highlightedGeyser = remember { mutableStateOf(null) },
                        highlightedZoneType = remember { mutableStateOf(null) },
                        onGeyserClick = null,
                        contentAlignment = Alignment.BottomCenter
                    )
                }

                for (worldTrait in asteroid.worldTraits)
                    WorlTraitDetail(worldTrait)

                for (geyser in asteroid.geysers.sortedBy { it.id })
                    GeyserDetail(geyser)

                DefaultSpacer()
            }

            VerticalScrollbar(
                adapter = rememberScrollbarAdapter(scrollState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
                style = defaultScrollbarStyle().copy(
                    unhoverColor = lightGray.copy(alpha = 0.4f),
                    hoverColor = lightGray
                ),
            )
        }
    }
}
