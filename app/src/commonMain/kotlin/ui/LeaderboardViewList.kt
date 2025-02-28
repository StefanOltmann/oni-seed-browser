/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.produceState
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
import model.ContributorRank
import org.jetbrains.compose.resources.stringResource
import service.DefaultWebClient
import ui.theme.DefaultSpacer
import ui.theme.DoubleSpacer
import ui.theme.FillSpacer
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing
import ui.theme.lightGray

private val contributorListFontSize = 20.sp

@Composable
fun LeaderboardViewList(
    errorMessage: MutableState<String?>
) {

    val contributorRankingState = produceState(emptyList<ContributorRank>()) {

        try {

            value = DefaultWebClient.findContributorRanking()

        } catch (ex: Exception) {

            ex.printStackTrace()

            errorMessage.value = ex.stackTraceToString()
        }
    }

    val contributorRanking = contributorRankingState.value

    if (contributorRanking.isEmpty()) {

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

                items(contributorRanking) { rank ->

                    Row {

                        FillSpacer()

                        Text(
                            text = rank.rank.toString(),
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
                            text = rank.username,
                            style = MaterialTheme.typography.bodyLarge,
                            fontSize = contributorListFontSize,
                            color = lightGray,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.width(160.dp)
                        )

                        DoubleSpacer()

                        Text(
                            text = rank.mapCount.toString(),
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
