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

import androidx.compose.foundation.Image
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import model.Cluster
import model.GeyserType
import model.WorldSummary
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.cluster_base_arboria
import oni_seed_browser.app.generated.resources.cluster_base_aridio
import oni_seed_browser.app.generated.resources.cluster_base_oasisse
import oni_seed_browser.app.generated.resources.cluster_base_oceania
import oni_seed_browser.app.generated.resources.cluster_base_rime
import oni_seed_browser.app.generated.resources.cluster_base_terra
import oni_seed_browser.app.generated.resources.cluster_base_the_badlands
import oni_seed_browser.app.generated.resources.cluster_base_verdante
import oni_seed_browser.app.generated.resources.cluster_base_volcanea
import oni_seed_browser.app.generated.resources.cluster_spacedout_arboria
import oni_seed_browser.app.generated.resources.cluster_spacedout_aridio
import oni_seed_browser.app.generated.resources.cluster_spacedout_flipped_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_folia
import oni_seed_browser.app.generated.resources.cluster_spacedout_frozen_forest_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_metallic_swampy_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_oasisse
import oni_seed_browser.app.generated.resources.cluster_spacedout_oceania
import oni_seed_browser.app.generated.resources.cluster_spacedout_quagmiris
import oni_seed_browser.app.generated.resources.cluster_spacedout_radioactive_ocean_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_rime
import oni_seed_browser.app.generated.resources.cluster_spacedout_squelchy
import oni_seed_browser.app.generated.resources.cluster_spacedout_terra
import oni_seed_browser.app.generated.resources.cluster_spacedout_terrania
import oni_seed_browser.app.generated.resources.cluster_spacedout_the_badlands
import oni_seed_browser.app.generated.resources.cluster_spacedout_the_desolands_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_verdante
import oni_seed_browser.app.generated.resources.cluster_spacedout_volcanea
import oni_seed_browser.app.generated.resources.dlc_frosty_planet
import oni_seed_browser.app.generated.resources.dlc_spaced_out
import oni_seed_browser.app.generated.resources.oni_logo
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import service.DummyWebClient
import theme.AppTypography
import theme.DefaultSpacer
import theme.appColorScheme
import theme.defaultPadding
import theme.defaultRoundedCornerShape
import theme.defaultSpacing
import theme.doubleSpacing

val logoIconHeight = 80.dp

@Composable
fun App() {
    MaterialTheme(
        colorScheme = appColorScheme,
        typography = AppTypography()
    ) {

        val string = produceState<SearchResponse?>(null) {

            value = DummyWebClient.search(
                SearchRequest(
                    selectedWorld = "null",
                    worldTraits = emptyList(),
                    page = 0,
                    vanilla = true
                )
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(defaultSpacing),
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {

            Text(
                text = "ONI Map Explorer",
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.defaultPadding()
            )

            Text(
                text = "This is a non-functional work-in-progress version.",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.error
            )

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

            Box {

                val lazyListState = rememberLazyListState()

                val response = string.value

                if (response != null) {

                    LazyColumn(
                        state = lazyListState,
                        contentPadding = PaddingValues(defaultSpacing),
                        verticalArrangement = Arrangement.spacedBy(doubleSpacing),
                        modifier = Modifier.defaultPadding()
                    ) {

                        items(response.summaries) { summary ->

                            WorldSummaryView(summary)
                        }
                    }
                }

                VerticalScrollbar(
                    adapter = rememberScrollbarAdapter(lazyListState),
                    modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd)
                )
            }
        }
    }

}

@Composable
fun WorldSummaryView(summary: WorldSummary) {

    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface, defaultRoundedCornerShape)
    ) {

        Row(
            modifier = Modifier.defaultPadding()
        ) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.width(200.dp)
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {

                    Image(
                        painter = painterResource(getClusterDrawable(summary.cluster)),
                        contentDescription = null,
                        modifier = Modifier.defaultPadding()
                    )

                    SelectionContainer {

                        Text(
                            text = summary.coordinate,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }

                    DefaultSpacer()

                    for (trait in summary.worldTraitsOfStarter) {

                        Text(
                            text = trait.displayName,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
            }

            Column (
                modifier = Modifier
                    .weight(1F)
                    .defaultPadding()
            ) {

                for (geyserType in GeyserType.entries) {

                    val count = summary.geysersCountOfStarter[geyserType] ?: 0

                    if (count == 0)
                        continue

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(4.dp)
                            .width(250.dp)
                            .background(MaterialTheme.colorScheme.surfaceVariant, defaultRoundedCornerShape)
                    ) {

                        Text(
                            text = geyserType.displayName,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.weight(1F)
                        )

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .padding(4.dp)
                                .size(32.dp)
                                .background(Color.Blue, CircleShape)
                        ) {

                            Text(
                                text = count.toString(),
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun getClusterDrawable(cluster: Cluster): DrawableResource =
    when(cluster) {
        Cluster.BASE_TERRA -> Res.drawable.cluster_base_terra
        Cluster.BASE_OCEANIA -> Res.drawable.cluster_base_oceania
        Cluster.BASE_RIME -> Res.drawable.cluster_base_rime
        Cluster.BASE_VERDANTE -> Res.drawable.cluster_base_verdante
        Cluster.BASE_ARBORIA -> Res.drawable.cluster_base_arboria
        Cluster.BASE_VOLCANEA -> Res.drawable.cluster_base_volcanea
        Cluster.BASE_THE_BADLANDS -> Res.drawable.cluster_base_the_badlands
        Cluster.BASE_ARIDIO -> Res.drawable.cluster_base_aridio
        Cluster.BASE_OASISSE -> Res.drawable.cluster_base_oasisse
        Cluster.DLC_TERRA -> Res.drawable.cluster_spacedout_terra
        Cluster.DLC_OCEANIA -> Res.drawable.cluster_spacedout_oceania
        Cluster.DLC_SQUELCHY -> Res.drawable.cluster_spacedout_squelchy
        Cluster.DLC_RIME -> Res.drawable.cluster_spacedout_rime
        Cluster.DLC_VERDANTE -> Res.drawable.cluster_spacedout_verdante
        Cluster.DLC_ARBORIA -> Res.drawable.cluster_spacedout_arboria
        Cluster.DLC_VOLCANEA -> Res.drawable.cluster_spacedout_volcanea
        Cluster.DLC_THE_BADLANDS -> Res.drawable.cluster_spacedout_the_badlands
        Cluster.DLC_ARIDIO -> Res.drawable.cluster_spacedout_aridio
        Cluster.DLC_OASISSE -> Res.drawable.cluster_spacedout_oasisse
        Cluster.DLC_TERRANIA -> Res.drawable.cluster_spacedout_terrania
        Cluster.DLC_FOLIA -> Res.drawable.cluster_spacedout_folia
        Cluster.DLC_QUAGMIRIS -> Res.drawable.cluster_spacedout_quagmiris
        Cluster.DLC_METALLIC_SWAMPY_MOONLET -> Res.drawable.cluster_spacedout_metallic_swampy_moonlet
        Cluster.DLC_THE_DESOLANDS_MOONLET -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        Cluster.DLC_FROZEN_FOREST_MOONLET -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        Cluster.DLC_FLIPPED_MOONLET -> Res.drawable.cluster_spacedout_flipped_moonlet
        Cluster.DLC_RADIOACTIVE_OCEAN_MOONLET -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
    }
