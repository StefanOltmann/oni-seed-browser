/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
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

import AppStorage
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.Cluster
import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.filter.FilterQuery
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.background_space
import io.github.stefanoltmann.app.generated.resources.uiInvalidCoordinate
import io.github.stefanoltmann.app.generated.resources.uiMapNotFound
import io.github.stefanoltmann.app.generated.resources.uiNoFavoredClustersFound
import io.github.stefanoltmann.app.generated.resources.uiNoResults
import io.github.stefanoltmann.app.generated.resources.uiSearching
import io.github.stefanoltmann.app.generated.resources.uiTitle
import io.github.stefanoltmann.app.generated.resources.uiWelcome
import io.github.stefanoltmann.app.generated.resources.uiWelcomeInstruction
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.ClusterGenerator
import service.DefaultWebClient
import ui.filter.FilterPanel
import ui.icons.IconBookmarks
import ui.icons.IconBookmarksFilled
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing
import ui.theme.halfPadding

@Composable
fun ContentView(
    urlHash: State<String?>,
    urlFilterQuery: FilterQuery?,
    isMniEmbedded: Boolean,
    /**
     * Note: LocalClipboardManager does not work for Compose for Web
     * in all browsers for some reason. That's why we use a workaround here.
     */
    writeToClipboard: (String) -> Unit
) {

    val errorMessage = remember { mutableStateOf<String?>(null) }

    val worldCount = produceState<Long?>(null) {

        try {

            value = DefaultWebClient.countSeeds()

        } catch (ex: CancellationException) {
            throw ex
        } catch (ex: Throwable) {

            /* We MUST catch Throwable here to prevent UI freezes. */

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    val favoredCoordinates = remember { mutableStateOf(emptyList<String>()) }

    LaunchedEffect(Unit) {

        try {

            favoredCoordinates.value = AppStorage.loadFavorites()

        } catch (ex: CancellationException) {
            throw ex
        } catch (ex: Throwable) {

            /* We MUST catch Throwable here to prevent UI freezes. */

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {

        /* Background */
        Image(
            painter = painterResource(Res.drawable.background_space),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                /* Avoid the white background while the image loads. */
                .background(Color(0xFF181828))
        )

        val coroutineScope = rememberCoroutineScope()

        val filterQueryState = remember {
            mutableStateOf(
                urlFilterQuery ?: AppStorage.loadFilter()
            )
        }

        val showStarMap = remember { mutableStateOf<Cluster?>(null) }

        val showAsteroidMap = remember { mutableStateOf<Pair<Cluster, Asteroid>?>(null) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val clusters = remember { mutableStateOf(emptyList<String>()) }

        val showFavorites = remember { mutableStateOf(false) }

        LaunchedEffect(urlHash.value) {

            val urlHashValue = urlHash.value

            if (urlHashValue != null) {

                println("Load specific coordinate: $urlHashValue")

                try {

                    isGettingNewResults.value = true

                    try {

                        val world = ClusterGenerator.generateCluster(urlHashValue)

                        clusters.value = listOf(world.coordinate)

                    } catch (ex: Exception) {

                        ex.printStackTrace()

                        errorMessage.value = "Wanted coordinate failed to generate: $urlHashValue"

                        clusters.value = emptyList()
                    }

                } catch (ex: CancellationException) {
                    throw ex
                } catch (ex: Throwable) {

                    /* We MUST catch Throwable here to prevent UI freezes. */

                    ex.printStackTrace()

                    errorMessage.value = ex.stackTraceToString()

                } finally {
                    isGettingNewResults.value = false
                }

            } else {

                clusters.value = emptyList()
            }
        }

        Box {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.background(MaterialTheme.colorScheme.background)
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    DoubleSpacer()

                    BoxWithConstraints {

                        Text(
                            text = stringResource(Res.string.uiTitle),
                            style = if (maxWidth >= 500.dp)
                                MaterialTheme.typography.displayMedium
                            else if (maxWidth >= 400.dp)
                                MaterialTheme.typography.displaySmall
                            else
                                MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.onBackground,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.defaultPadding()
                        )
                    }

                    FillSpacer()

                    Icon(
                        imageVector = if (showFavorites.value)
                            IconBookmarksFilled
                        else
                            IconBookmarks,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .halfPadding()
                            .size(32.dp)
                            .noRippleClickable {

                                showFavorites.value = !showFavorites.value
                            }
                    )

                    DefaultSpacer()

                    val uriHandler = LocalUriHandler.current

                    SponsorButton {
                        uriHandler.openUri("https://github.com/sponsors/StefanOltmann")
                    }

                    DefaultSpacer()

                    MoreAppsButton {

                        val locale = Locale.current.language

                        val url = if (locale == "de")
                            "https://stefan-oltmann.de/portfolio/de/index.html#projects"
                        else
                            "https://stefan-oltmann.de/portfolio/en/index.html#projects"

                        uriHandler.openUri(url)
                    }

                    DefaultSpacer()

                    DoubleSpacer()
                }

                errorMessage.value?.let {

                    Column(
                        modifier = Modifier
                            .padding(doubleSpacing)
                            .height(100.dp)
                            .verticalScroll(rememberScrollState())
                            .background(
                                MaterialTheme.colorScheme.errorContainer,
                                defaultRoundedCornerShape
                            )
                    ) {

                        Text(
                            text = it,
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onErrorContainer,
                            fontWeight = FontWeight.Bold,
                            maxLines = 50,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.defaultPadding()
                        )
                    }
                }

                if (showFavorites.value) {

                    FavoritesPanel(
                        favoredCoordinates,
                        showStarMap,
                        showAsteroidMap,
                        writeToClipboard
                    )

                } else {

                    MainPanel(
                        filterQueryState,
                        isGettingNewResults,
                        errorMessage,
                        clusters,
                        worldCount,
                        coroutineScope,
                        urlHash,
                        favoredCoordinates,
                        showStarMap,
                        showAsteroidMap,
                        isMniEmbedded,
                        startWithFilterPanelOpen = urlFilterQuery != null,
                        writeToClipboard
                    )
                }
            }

            Box(
                Modifier.background(Color.Black)
            ) {

                val worldForStarMapView = showStarMap.value

                if (worldForStarMapView != null) {

                    if (!worldForStarMapView.starMapEntriesSpacedOut.isEmpty()) {

                        SpacedOutStarMapView(
                            cluster = worldForStarMapView,
                            favoriteCoordinates = favoredCoordinates,
                            onCloseClicked = { showStarMap.value = null },
                            writeToClipboard = writeToClipboard
                        )

                    } else {

                        BaseGameStarMapView(
                            cluster = worldForStarMapView,
                            favoriteCoordinates = favoredCoordinates,
                            onCloseClicked = { showStarMap.value = null },
                            writeToClipboard = writeToClipboard
                        )
                    }

                } else {

                    val asteroidForMapView = showAsteroidMap.value

                    if (asteroidForMapView != null) {

                        AsteroidMapPopup(
                            asteroid = asteroidForMapView.second,
                            coordinate = asteroidForMapView.first.coordinate,
                            onCloseClicked = { showAsteroidMap.value = null }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.FavoritesPanel(
    favoredCoordinates: MutableState<List<String>>,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
    writeToClipboard: (String) -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.weight(1F)
    ) {

        if (favoredCoordinates.value.isNotEmpty()) {

            ClusterViewList(
                clusters = favoredCoordinates.value,
                favoriteCoordinates = favoredCoordinates,
                showStarMap = showStarMap,
                showAsteroidMap = showAsteroidMap,
                writeToClipboard = writeToClipboard
            )

        } else {

            Text(
                text = stringResource(Res.string.uiNoFavoredClustersFound),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun ColumnScope.MainPanel(
    filterQueryState: MutableState<FilterQuery>,
    isGettingNewResults: MutableState<Boolean>,
    errorMessage: MutableState<String?>,
    clusters: MutableState<List<String>>,
    worldCount: State<Long?>,
    coroutineScope: CoroutineScope,
    urlHash: State<String?>,
    favoredCoordinates: MutableState<List<String>>,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
    isMniEmbedded: Boolean,
    startWithFilterPanelOpen: Boolean,
    writeToClipboard: (String) -> Unit
) {

    val hasPerformedSearch = remember { mutableStateOf(false) }

    val search: suspend () -> Unit = {

        try {

            val filterQuery = filterQueryState.value

            println("[SEARCH] $filterQuery")

            isGettingNewResults.value = true

            errorMessage.value = null

            /* Reset the data */
            clusters.value = emptyList()

            /*
             * Allow the UI to update.
             */
            delay(200)

            val searchResultWorlds = withContext(Dispatchers.Default) {
                DefaultWebClient.search(filterQuery)
            }

            clusters.value = searchResultWorlds
            hasPerformedSearch.value = true

        } catch (ex: CancellationException) {
            throw ex
        } catch (ex: Exception) {

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()

        } finally {
            isGettingNewResults.value = false
        }
    }

    HalfSpacer()

    FilterPanel(
        worldCount = worldCount.value,
        filterQueryState = filterQueryState,
        onSearchButtonPressed = {
            coroutineScope.launch { search() }
        },
        showMniUrl = isMniEmbedded,
        startWithFilterPanelOpen = startWithFilterPanelOpen,
        writeToClipboard = writeToClipboard
    )

    if (isGettingNewResults.value) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1F)
        ) {

            Text(
                text = stringResource(Res.string.uiSearching),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

    } else if (clusters.value.isEmpty()) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1F)
        ) {

            val coordinate = urlHash.value

            if (coordinate != null) {

                if (ClusterType.isValidCoordinate(coordinate)) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = stringResource(Res.string.uiMapNotFound),
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }

                } else {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = stringResource(Res.string.uiInvalidCoordinate),
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )

                        DoubleSpacer()

                        Text(
                            text = coordinate,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onBackground,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

            } else if (hasPerformedSearch.value) {

                Text(
                    text = stringResource(Res.string.uiNoResults),
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

            } else {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = stringResource(Res.string.uiWelcome),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = stringResource(Res.string.uiWelcomeInstruction),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            }
        }

    } else {

        Box(
            modifier = Modifier.weight(1F)
        ) {

            ClusterViewList(
                clusters = clusters.value,
                favoriteCoordinates = favoredCoordinates,
                showStarMap = showStarMap,
                showAsteroidMap = showAsteroidMap,
                writeToClipboard = writeToClipboard
            )
        }
    }
}
