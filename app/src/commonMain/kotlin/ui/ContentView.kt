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

package ui

import AppStorage
import START_WITH_LATEST_MAPS
import START_WITH_TOP_RATED_MAPS
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.background_space
import io.github.stefanoltmann.app.generated.resources.uiCoordinateNotFound
import io.github.stefanoltmann.app.generated.resources.uiNoFavoredClustersFound
import io.github.stefanoltmann.app.generated.resources.uiNoResults
import io.github.stefanoltmann.app.generated.resources.uiSearching
import io.github.stefanoltmann.app.generated.resources.uiTitle
import io.github.stefanoltmann.app.generated.resources.uiUsernameLabel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import model.Asteroid
import model.Cluster
import model.Contributor
import model.filter.FilterQuery
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
import service.sampleWorldsJson
import ui.filter.FilterPanel
import ui.icons.IconKofi
import ui.icons.IconLeaderboardFilled
import ui.icons.IconLeaderboardOutlined
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.halfPadding
import ui.theme.lightGray
import web.registerShowClusterViewList

@Composable
fun ContentView(
    urlHash: State<String?>,
    isMniEmbedded: Boolean,
    connected: Boolean,
    localPort: Int?,
    /**
     * Note: LocalClipboardManager does not work for Compose for Web
     * in all browsers for some reason. That's why we use a workaround here.
     */
    writeToClipboard: (String) -> Unit
) {

    val errorMessage = remember { mutableStateOf<String?>(null) }

    val density = LocalDensity.current.density
    val useCompactLayout = remember { mutableStateOf(false) }

    val contributorsState = produceState(emptyList<Contributor>()) {

        try {

            value = DefaultWebClient.findContributors()

        } catch (ex: Exception) {

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    val contributors = contributorsState.value

    val steamIdToUsernameMap: Map<String, String?> = remember(contributors) {
        contributors.associate { it.steamIdHash to it.username }
    }

    val worldCount = produceState<Long?>(null) {

        try {

            value = DefaultWebClient.countSeeds()

        } catch (ex: Throwable) {

            /* We MUST catch Throwable here to prevent UI freezes. */

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    val favoredCoordinates = remember { mutableStateOf(emptyList<String>()) }

    LaunchedEffect(connected) {

        try {

            if (connected)
                favoredCoordinates.value = DefaultWebClient.findFavoredCoordinates()

        } catch (ex: Throwable) {

            /* We MUST catch Throwable here to prevent UI freezes. */

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    Box(
        modifier = Modifier.onSizeChanged {
            useCompactLayout.value = it.width / density < 400
        }
    ) {

        val coroutineScope = rememberCoroutineScope()

        val filterQueryState = remember {
            mutableStateOf(AppStorage.loadFilter())
        }

        val lazyListState = rememberLazyListState()

        val showStarMap = remember { mutableStateOf<Cluster?>(null) }

        val showAsteroidMap = remember { mutableStateOf<Asteroid?>(null) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val clusters = remember { mutableStateOf(emptyList<Cluster>()) }

        val showFavorites = remember { mutableStateOf(false) }
        val showLeaderboard = remember { mutableStateOf(false) }

        val likeCounts: MutableState<Map<String, Int>?> = remember { mutableStateOf(null) }

        // TODO: These showX variables should REALLY be a finite-state automaton
        val showClusterViewList = remember { mutableStateOf(false) }

        LaunchedEffect(urlHash.value) {

            val urlHashValue = urlHash.value

            if (urlHashValue != null) {

                println("Load specific coordinate: $urlHashValue")

                try {

                    isGettingNewResults.value = true

                    val world = DefaultWebClient.find(urlHashValue)

                    if (world != null)
                        clusters.value = listOf(world)
                    else
                        clusters.value = emptyList()

                    /* Reset */
                    likeCounts.value = null

                } catch (ex: Throwable) {

                    /* We MUST catch Throwable here to prevent UI freezes. */

                    ex.printStackTrace()

                    errorMessage.value = ex.stackTraceToString()

                } finally {
                    isGettingNewResults.value = false
                }

            } else if (START_WITH_TOP_RATED_MAPS) {

                try {

                    isGettingNewResults.value = true

                    val topRatedClusters = DefaultWebClient.findTopRatedClusters()

                    clusters.value = topRatedClusters.map { it.cluster }

                    likeCounts.value =
                        topRatedClusters.associate { it.cluster.coordinate to it.likeCount }

                } catch (ex: Throwable) {

                    /* We MUST catch Throwable here to prevent UI freezes. */

                    ex.printStackTrace()

                    errorMessage.value = ex.stackTraceToString()

                } finally {
                    isGettingNewResults.value = false
                }

            } else if (START_WITH_LATEST_MAPS) {

                try {

                    isGettingNewResults.value = true

                    val latestClusters = DefaultWebClient.findLatestClusters()

                    clusters.value = latestClusters

                } catch (ex: Throwable) {

                    /* We MUST catch Throwable here to prevent UI freezes. */

                    ex.printStackTrace()

                    errorMessage.value = ex.stackTraceToString()

                } finally {
                    isGettingNewResults.value = false
                }

            } else {

                println("Load demo data...")

                val parsedClusters = Json.decodeFromString<List<Cluster>>(sampleWorldsJson)

                /* DLCs first */
                clusters.value = parsedClusters.sortedWith(
                    compareBy({ it.cluster.isBaseGame() }, { it.cluster })
                )

                /* Reset */
                likeCounts.value = null
            }
        }

        showClusterViewList.value = (
            showStarMap.value == null &&
                showAsteroidMap.value == null &&
                !showFavorites.value &&
                !showLeaderboard.value
            )
        registerShowClusterViewList(showClusterViewList.value)

        val worldForStarMapView = showStarMap.value

        if (worldForStarMapView != null) {

            if (worldForStarMapView.starMapEntriesSpacedOut != null) {

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

            return
        }

        val asteroidForMapView = showAsteroidMap.value

        if (asteroidForMapView != null) {

            AsteroidMapPopup(
                asteroid = asteroidForMapView,
                onCloseClicked = { showAsteroidMap.value = null }
            )

            return
        }

        Box {

            /* Background */
            Image(
                painter = painterResource(Res.drawable.background_space),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    /* Avoid white background while the image loads. */
                    .background(Color(0xFF181828))
            )

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

                    val uriHandler = LocalUriHandler.current

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(32.dp)
                            .noRippleClickable {
                                uriHandler.openUri("https://ko-fi.com/StefanOltmann")
                            }
                    ) {

                        Image(
                            imageVector = IconKofi,
                            contentDescription = null
                        )
                    }

                    DefaultSpacer()

                    if (connected) {

                        Icon(
                            imageVector = if (showFavorites.value)
                                Icons.Filled.Favorite
                            else
                                Icons.Outlined.FavoriteBorder,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier
                                .halfPadding()
                                .size(32.dp)
                                .noRippleClickable {

                                    showFavorites.value = !showFavorites.value

                                    if (showFavorites.value)
                                        showLeaderboard.value = false
                                }
                        )
                    }

                    Icon(
                        imageVector = if (showLeaderboard.value)
                            IconLeaderboardFilled
                        else
                            IconLeaderboardOutlined,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .halfPadding()
                            .size(32.dp)
                            .noRippleClickable {

                                showLeaderboard.value = !showLeaderboard.value

                                if (showLeaderboard.value)
                                    showFavorites.value = false
                            }
                    )

                    /*
                     * Only show the login button in the standalone version.
                     */
                    if (connected || (!connected && !isMniEmbedded))
                        LoginWithSteamButton(
                            connected = connected,
                            localPort = localPort
                        )

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

                if (showLeaderboard.value) {

                    Box(
                        modifier = Modifier.weight(1F)
                    ) {

                        LeaderboardViewList(errorMessage)
                    }

                    if (connected) {

                        /*
                         * Logged-in users can change their name.
                         */

                        HorizontalSeparator()

                        DefaultSpacer()

                        val usernameChangeSuccess = remember { mutableStateOf(false) }

                        val usernameInDatabase = remember { mutableStateOf("") }

                        val username = remember { mutableStateOf("") }

                        LaunchedEffect(true) {

                            val result = DefaultWebClient.getUsername() ?: ""

                            username.value = result
                            usernameInDatabase.value = result
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(defaultSpacing),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            TextField(
                                value = username.value,
                                onValueChange = { newName ->
                                    username.value = newName
                                },
                                label = {
                                    Text(stringResource(Res.string.uiUsernameLabel))
                                },
                                placeholder = {
                                    Text("Anonymous")
                                },
                                singleLine = true,
                                textStyle = MaterialTheme.typography.bodyLarge.copy(
                                    color = MaterialTheme.colorScheme.onBackground
                                ),
                                shape = defaultRoundedCornerShape,
                                colors = TextFieldDefaults.colors().copy(
                                    /* Background */
                                    unfocusedContainerColor = MaterialTheme.colorScheme.background,
                                    focusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                                    /* No indicators */
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    errorIndicatorColor = Color.Transparent,
                                    disabledIndicatorColor = Color.Transparent,
                                    /* Text colors */
                                    focusedTextColor = lightGray,
                                    unfocusedTextColor = lightGray,
                                    errorTextColor = lightGray,
                                    disabledTextColor = lightGray,
                                    focusedLabelColor = lightGray,
                                    unfocusedLabelColor = lightGray,
                                    errorLabelColor = lightGray,
                                    disabledLabelColor = lightGray,
                                    cursorColor = lightGray
                                ),
                                modifier = Modifier
                                    .height(60.dp)
                                    .width(240.dp)
                            )

                            SetUsernameButton(
                                /* Enable button if there is something to change. */
                                enabled = username.value != usernameInDatabase.value,
                                onClick = {

                                    coroutineScope.launch {

                                        usernameChangeSuccess.value =
                                            DefaultWebClient.setUsername(username.value)

                                        if (usernameChangeSuccess.value)
                                            usernameInDatabase.value = username.value
                                    }
                                }
                            )

                            if (usernameChangeSuccess.value) {

                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = null,
                                    tint = Color.Green
                                )
                            }
                        }

                        DoubleSpacer()
                    }

                } else if (showFavorites.value) {

                    FavoritesPanel(
                        errorMessage,
                        lazyListState,
                        useCompactLayout,
                        favoredCoordinates,
                        showStarMap,
                        showAsteroidMap,
                        connected,
                        isMniEmbedded,
                        steamIdToUsernameMap,
                        writeToClipboard
                    )

                } else {

                    MainPanel(
                        filterQueryState,
                        isGettingNewResults,
                        errorMessage,
                        clusters,
                        likeCounts,
                        worldCount,
                        coroutineScope,
                        urlHash,
                        connected,
                        lazyListState,
                        useCompactLayout,
                        favoredCoordinates,
                        showStarMap,
                        showAsteroidMap,
                        isMniEmbedded,
                        steamIdToUsernameMap,
                        writeToClipboard
                    )
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.FavoritesPanel(
    errorMessage: MutableState<String?>,
    lazyListState: LazyListState,
    useCompactLayout: MutableState<Boolean>,
    favoredCoordinates: MutableState<List<String>>,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Asteroid?>,
    connected: Boolean,
    isMniEmbedded: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    val favoredClustersState = produceState(emptyList<Cluster>()) {

        try {

            value = DefaultWebClient.findFavoredClusters()

        } catch (ex: Exception) {

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.Companion.weight(1F)
    ) {

        val favoredClusters = favoredClustersState.value

        if (favoredClusters.isNotEmpty()) {

            ClusterViewList(
                lazyListState = lazyListState,
                clusters = favoredClustersState.value,
                useCompactLayout = useCompactLayout.value,
                favoriteCoordinates = favoredCoordinates,
                likeCounts = null,
                showStarMap = showStarMap,
                showAsteroidMap = showAsteroidMap,
                showFavoriteIcon = connected,
                showMniUrl = isMniEmbedded,
                steamIdToUsernameMap = steamIdToUsernameMap,
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
    clusters: MutableState<List<Cluster>>,
    likeCounts: MutableState<Map<String, Int>?>,
    worldCount: State<Long?>,
    coroutineScope: CoroutineScope,
    urlHash: State<String?>,
    connected: Boolean,
    lazyListState: LazyListState,
    useCompactLayout: MutableState<Boolean>,
    favoredCoordinates: MutableState<List<String>>,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Asteroid?>,
    isMniEmbedded: Boolean,
    steamIdToUsernameMap: Map<String, String?>,
    writeToClipboard: (String) -> Unit
) {

    val search: suspend () -> Unit = {

        println("Searching...")

        try {

            val filterQuery = filterQueryState.value

            isGettingNewResults.value = true

            errorMessage.value = null

            /* Reset the data */
            clusters.value = emptyList()

            val searchResultWorlds = DefaultWebClient.search(filterQuery)

            val sortedWorlds = searchResultWorlds.sortedByDescending { it.getRating() }

            clusters.value = sortedWorlds

            /* Reset */
            likeCounts.value = null

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
        }
    )

    if (isGettingNewResults.value) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.Companion.weight(1F)
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
            modifier = Modifier.Companion.weight(1F)
        ) {

            val coordinate = urlHash.value

            if (coordinate == null) {

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
                        text = stringResource(Res.string.uiCoordinateNotFound)
                            .replace("{coordinate}", coordinate),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    DoubleSpacer()

                    RequestCoordinateButton(
                        enabled = connected,
                        coordinate = coordinate
                    )
                }
            }
        }

    } else {

        Box(
            modifier = Modifier.weight(1F)
        ) {

            ClusterViewList(
                lazyListState = lazyListState,
                clusters = clusters.value,
                useCompactLayout = useCompactLayout.value,
                favoriteCoordinates = favoredCoordinates,
                likeCounts = likeCounts,
                showStarMap = showStarMap,
                showAsteroidMap = showAsteroidMap,
                showFavoriteIcon = connected,
                showMniUrl = isMniEmbedded,
                steamIdToUsernameMap = steamIdToUsernameMap,
                writeToClipboard = writeToClipboard
            )
        }
    }
}
