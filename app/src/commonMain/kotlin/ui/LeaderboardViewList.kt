/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiLeaderBoardCount
import io.github.stefanoltmann.app.generated.resources.uiLeaderBoardExplainer
import io.github.stefanoltmann.app.generated.resources.uiLeaderBoardRank
import io.github.stefanoltmann.app.generated.resources.uiLeaderBoardUsername
import io.github.stefanoltmann.app.generated.resources.uiLoading
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing
import ui.theme.lightGray
import util.formatDate

const val CONTRIBUTOR_LIST_UPDATE_INTERVAL_MS: Long = 60000

private val contributorListFontSize = 20.sp

@OptIn(ExperimentalTime::class)
@Composable
fun LeaderboardViewList(
    steamIdToUsernameMap: Map<String, String>,
    errorMessage: MutableState<String?>
) {

    val lastRefreshTime = remember { mutableStateOf(0L) }

    val contributorsState = produceState(emptyList()) {

        try {

            while (isActive) {

                lastRefreshTime.value = Clock.System.now().toEpochMilliseconds()

                value = DefaultWebClient.findContributors().map {
                    it.copy(
                        username = steamIdToUsernameMap[it.steamIdHash]
                    )
                }

                delay(CONTRIBUTOR_LIST_UPDATE_INTERVAL_MS)
            }

        } catch (_: CancellationException) {

            // That's fine.

        } catch (ex: Exception) {

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    val contributors = contributorsState.value

    if (contributors.isEmpty()) {

        Text(
            text = stringResource(Res.string.uiLoading),
            style = MaterialTheme.typography.headlineSmall,
            color = lightGray
        )

        return
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        DefaultSpacer()

        Text(
            text = stringResource(Res.string.uiLeaderBoardExplainer),
            style = MaterialTheme.typography.bodyLarge,
            fontSize = contributorListFontSize,
            color = lightGray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .defaultPadding()
                .width(400.dp)
        )

        DefaultSpacer()

        Text(
            text = formatDate(lastRefreshTime.value),
            style = MaterialTheme.typography.bodyMedium,
            color = lightGray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(
                    Color.Black,
                    defaultRoundedCornerShape
                )
                .defaultPadding()
        )

        DefaultSpacer()

        Row {

            FillSpacer()

            Text(
                text = stringResource(Res.string.uiLeaderBoardRank),
                style = MaterialTheme.typography.bodyLarge,
                fontSize = contributorListFontSize,
                color = lightGray,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(48.dp)
            )

            DoubleSpacer()

            Text(
                text = stringResource(Res.string.uiLeaderBoardUsername),
                style = MaterialTheme.typography.bodyLarge,
                fontSize = contributorListFontSize,
                color = lightGray,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(160.dp)
            )

            DoubleSpacer()

            Text(
                text = stringResource(Res.string.uiLeaderBoardCount),
                style = MaterialTheme.typography.bodyLarge,
                fontSize = contributorListFontSize,
                color = lightGray,
                textAlign = TextAlign.End,
                modifier = Modifier.width(70.dp)
            )

            FillSpacer()
        }

        Box(
            modifier = Modifier
                .background(lightGray.copy(alpha = 0.5f))
                .width(360.dp)
                .height(2.dp)
        )

        val lazyListState = rememberLazyListState()

        Box {

            LazyColumn(
                state = lazyListState,
                verticalArrangement = Arrangement.spacedBy(doubleSpacing),
                modifier = Modifier.padding(doubleSpacing)
            ) {

                itemsIndexed(contributors) { index, contributor ->

                    val rank = index + 1

                    Row {

                        FillSpacer()

                        Text(
                            text = rank.toString(),
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = contributorListFontSize,
                            color = lightGray,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .width(48.dp)
                                .background(
                                    Color.Black,
                                    defaultRoundedCornerShape
                                )
                        )

                        DoubleSpacer()

                        Text(
                            text = contributor.username ?: "Anonymous",
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = contributorListFontSize,
                            color = if (contributor.username == null)
                                lightGray.copy(0.3F)
                            else
                                lightGray,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.width(160.dp)
                        )

                        DoubleSpacer()

                        Text(
                            text = contributor.mapCount.toString(),
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = contributorListFontSize,
                            color = lightGray,
                            textAlign = TextAlign.End,
                            modifier = Modifier.width(70.dp)
                        )

                        FillSpacer()
                    }
                }
            }

            VerticalScrollbar(
                adapter = rememberScrollbarAdapter(lazyListState),
                modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
                style = defaultScrollbarStyle().copy(
                    unhoverColor = lightGray.copy(alpha = 0.4f),
                    hoverColor = lightGray
                )
            )
        }
    }
}
