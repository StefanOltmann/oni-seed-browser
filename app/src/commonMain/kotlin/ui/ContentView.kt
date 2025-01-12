package ui

import AppStorage
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import model.Asteroid
import model.Cluster
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.background_space
import oni_seed_browser.app.generated.resources.uiNoResults
import oni_seed_browser.app.generated.resources.uiSearching
import oni_seed_browser.app.generated.resources.uiTitle
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
import service.sampleWorldsJson
import ui.filter.FilterPanel
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing

@Composable
fun ContentView(
    urlHash: State<String?>,
    isMniEmbedded: State<Boolean>,
    /**
     * Note: LocalClipboardManager does not work for Compose for Web
     * in all browsers for some reason. That's why we use a workaround here.
     */
    writeToClipboard: (String) -> Unit
) {

    val errorMessage = remember { mutableStateOf<String?>(null) }

    val density = LocalDensity.current.density
    val useCompactLayout = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.onSizeChanged {
            useCompactLayout.value = it.width / density < 400
        }
    ) {

        val worldCount = produceState<Long?>(null) {

            try {

                value = DefaultWebClient.countSeeds()

            } catch (ex: Throwable) {

                /* We MUST catch Throwable here to prevent UI freezes. */

                ex.printStackTrace()

                errorMessage.value = ex.stackTraceToString()
            }
        }

        val steamId = produceState<String?>(null) {

            try {

                value = DefaultWebClient.getSteamId()

            } catch (ex: Throwable) {

                /* We MUST catch Throwable here to prevent UI freezes. */

                ex.printStackTrace()

                errorMessage.value = ex.stackTraceToString()
            }
        }

        println("Steam ID: ${steamId.value}")

        val coroutineScope = rememberCoroutineScope()

        val filterQueryState = remember {
            mutableStateOf(AppStorage.loadFilter())
        }

        val lazyListState = rememberLazyListState()

        val showStarMap = remember { mutableStateOf<Cluster?>(null) }

        val showAsteroidMap = remember { mutableStateOf<Asteroid?>(null) }

        val isGettingNewResults = remember { mutableStateOf(false) }

        val clusters = remember { mutableStateOf(emptyList<Cluster>()) }

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
                clusters.value = parsedClusters.sortedWith(compareBy({ it.cluster.isBaseGame() }, { it.cluster }))
            }
        }

        val worldForStarMapView = showStarMap.value

        if (worldForStarMapView != null) {

            if (worldForStarMapView.starMapEntriesSpacedOut != null) {

                SpacedOutStarMapView(
                    cluster = worldForStarMapView,
                    onCloseClicked = { showStarMap.value = null },
                    writeToClipboard = writeToClipboard
                )

            } else {

                BaseGameStarMapView(
                    cluster = worldForStarMapView,
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

                    LoginWithSteamButton(
                        connected = steamId.value != null
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

                        if (urlHash.value == null) {

                            Text(
                                text = stringResource(Res.string.uiNoResults),
                                style = MaterialTheme.typography.headlineSmall,
                                color = MaterialTheme.colorScheme.onBackground,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )

                        } else {

                            Text(
                                text = "Coordinate ${urlHash.value} was not found in database.",
                                style = MaterialTheme.typography.headlineSmall,
                                color = MaterialTheme.colorScheme.onBackground,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }

                } else {

                    Row(
                        modifier = Modifier.weight(1F)
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.weight(1F)
                        ) {

                            Box(
                                modifier = Modifier.weight(1F)
                            ) {

                                ClusterViewList(
                                    lazyListState,
                                    clusters.value,
                                    useCompactLayout.value,
                                    showStarMap,
                                    showAsteroidMap,
                                    showMniUrl = isMniEmbedded.value,
                                    writeToClipboard = writeToClipboard
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
