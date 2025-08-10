package ui

import AppStorage
import START_WITH_LATEST_MAPS
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
import model.Asteroid
import model.Cluster
import model.filter.FilterQuery
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
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

@Composable
fun ContentView(
    urlHash: State<String?>,
    isMniEmbedded: Boolean,
    connectedUserId: String?,
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

    val steamIdToUsernameMap = produceState(emptyMap()) {

        try {

            value = DefaultWebClient.getUsernameMap()

        } catch (ex: Throwable) {

            /* We MUST catch Throwable here to prevent UI freezes. */

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
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

    LaunchedEffect(connectedUserId) {

        try {

            if (connectedUserId != null)
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

        val showStarMap = remember { mutableStateOf<Cluster?>(null) }

        val showAsteroidMap = remember { mutableStateOf<Pair<Cluster, Asteroid>?>(null) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val clusters = remember { mutableStateOf(emptyList<String>()) }

        val showFavorites = remember { mutableStateOf(false) }
        val showLeaderboard = remember { mutableStateOf(false) }

        val likeCounts: MutableState<Map<String, Int>?> = remember { mutableStateOf(null) }

        LaunchedEffect(urlHash.value) {

            val urlHashValue = urlHash.value

            if (urlHashValue != null) {

                println("Load specific coordinate: $urlHashValue")

                try {

                    isGettingNewResults.value = true

                    val world = DefaultWebClient.find(urlHashValue)

                    if (world != null)
                        clusters.value = listOf(world.coordinate)
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

                clusters.value = emptyList<String>()

                /* Reset */
                likeCounts.value = null
            }
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

                    if (connectedUserId != null) {

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
                    if (connectedUserId != null || (connectedUserId == null && !isMniEmbedded))
                        LoginWithSteamButton(
                            connectedUserId = connectedUserId,
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

                    if (connectedUserId != null) {

                        /*
                         * Logged-in users can change their name.
                         */

                        HorizontalSeparator()

                        DefaultSpacer()

                        val usernameChangeSuccess = remember { mutableStateOf(false) }

                        val usernameInDatabase = remember { mutableStateOf("") }

                        val username = remember { mutableStateOf("") }

                        LaunchedEffect(true) {

                            val result = steamIdToUsernameMap.value[connectedUserId] ?: ""

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
                        useCompactLayout,
                        favoredCoordinates,
                        showStarMap,
                        showAsteroidMap,
                        connectedUserId,
                        isMniEmbedded,
                        steamIdToUsernameMap.value,
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
                        connectedUserId,
                        useCompactLayout,
                        favoredCoordinates,
                        showStarMap,
                        showAsteroidMap,
                        isMniEmbedded,
                        steamIdToUsernameMap.value,
                        writeToClipboard
                    )
                }
            }

            Box(
                Modifier.background(Color.Black)
            ) {

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

                } else {

                    val asteroidForMapView = showAsteroidMap.value

                    if (asteroidForMapView != null) {

                        Column {

                            Box(
                                modifier = Modifier.weight(1F)
                            ) {

                                AsteroidMapPopup(
                                    asteroid = asteroidForMapView.second,
                                    onCloseClicked = { showAsteroidMap.value = null }
                                )
                            }

                            AlternativeMapViewerLinkBox(
                                coordinate = asteroidForMapView.first.coordinate,
                                asteroidType = asteroidForMapView.second.id
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ColumnScope.FavoritesPanel(
    useCompactLayout: MutableState<Boolean>,
    favoredCoordinates: MutableState<List<String>>,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
    connectedUserId: String?,
    isMniEmbedded: Boolean,
    steamIdToUsernameMap: Map<String, String>,
    writeToClipboard: (String) -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.Companion.weight(1F)
    ) {

        if (favoredCoordinates.value.isNotEmpty()) {

            ClusterViewList(
                clusters = favoredCoordinates.value,
                useCompactLayout = useCompactLayout.value,
                favoriteCoordinates = favoredCoordinates,
                likeCounts = null,
                showStarMap = showStarMap,
                showAsteroidMap = showAsteroidMap,
                showFavoriteIcon = connectedUserId != null,
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
    clusters: MutableState<List<String>>,
    likeCounts: MutableState<Map<String, Int>?>,
    worldCount: State<Long?>,
    coroutineScope: CoroutineScope,
    urlHash: State<String?>,
    connectedUserId: String?,
    useCompactLayout: MutableState<Boolean>,
    favoredCoordinates: MutableState<List<String>>,
    showStarMap: MutableState<Cluster?>,
    showAsteroidMap: MutableState<Pair<Cluster, Asteroid>?>,
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

            clusters.value = searchResultWorlds

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
                        enabled = connectedUserId != null,
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
                clusters = clusters.value,
                useCompactLayout = useCompactLayout.value,
                favoriteCoordinates = favoredCoordinates,
                likeCounts = likeCounts,
                showStarMap = showStarMap,
                showAsteroidMap = showAsteroidMap,
                showFavoriteIcon = connectedUserId != null,
                showMniUrl = isMniEmbedded,
                steamIdToUsernameMap = steamIdToUsernameMap,
                writeToClipboard = writeToClipboard
            )
        }
    }
}
