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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailActiveDetails
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailCycles
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailEmitDetails
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailGramPerSecond
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailOnAverage
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailSecondsShort
import model.Geyser
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.theme.DefaultSpacer
import ui.theme.HalfSpacer
import ui.theme.cardColorBackground
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing
import ui.theme.gray3
import ui.theme.halfPadding
import ui.theme.lightGrayTransparentBorderColor

private val boldSpanStyle = SpanStyle(fontWeight = FontWeight.Bold)

@Composable
fun GeyserDetail(
    geyser: Geyser,
    modifier: Modifier = Modifier,
    compactLayout: Boolean
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(horizontal = doubleSpacing)
            .background(
                if (geyser.id.rating.isNegative())
                    badRatingBackground
                else
                    cardColorBackground,
                defaultRoundedCornerShape
            )
            .border(
                0.dp,
                lightGrayTransparentBorderColor,
                defaultRoundedCornerShape
            )
            .fillMaxWidth()
            .height(160.dp)
            .then(modifier)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HalfSpacer()

            GeyserIconView(
                geysers = listOf(geyser),
                backgroundAlpha = 1.0F,
                alwaysShowAvgEmitRateRatingIndicator = true,
                showGeyserName = !compactLayout
            )

            if (compactLayout) {

                Row(
                    verticalAlignment = Alignment.Bottom
                ) {

                    Text(
                        text = "${geyser.avgEmitRate} " + stringResource(Res.string.uiGeyserDetailGramPerSecond),
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Row(
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = " " + stringResource(Res.string.uiGeyserDetailOnAverage),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }

            } else {

                Row(
                    verticalAlignment = Alignment.Bottom
                ) {

                    Text(
                        text = "${geyser.avgEmitRate} " + stringResource(Res.string.uiGeyserDetailGramPerSecond),
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )

                    Text(
                        text = " " + stringResource(Res.string.uiGeyserDetailOnAverage),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }

                Row {

                    val template = stringResource(Res.string.uiGeyserDetailEmitDetails)

                    val secondsText = stringResource(Res.string.uiGeyserDetailSecondsShort)
                    val gramPerSecondText = stringResource(Res.string.uiGeyserDetailGramPerSecond)

                    val formattedText = buildAnnotatedString {

                        var currentIndex = 0

                        val regex = "\\{(emitRate|eruptionTime|overallTime)\\}".toRegex()

                        regex.findAll(template).forEach { match ->

                            val placeholder = match.groupValues[1]
                            val startIndex = match.range.first

                            append(template.substring(currentIndex, startIndex))

                            pushStyle(boldSpanStyle)
                            when (placeholder) {

                                "emitRate" ->
                                    append("${geyser.emitRate} $gramPerSecondText")

                                "eruptionTime" ->
                                    append("${geyser.eruptionTime}$secondsText")

                                "overallTime" ->
                                    append("${geyser.overallTime}$secondsText")
                            }
                            pop()

                            currentIndex = match.range.last + 1
                        }

                        append(template.substring(currentIndex))
                    }

                    Text(
                        text = formattedText,
                        style = if (Locale.current.language == "zh")
                            MaterialTheme.typography.bodySmall
                        else
                            MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }

                Row {

                    val template = stringResource(Res.string.uiGeyserDetailActiveDetails)

                    val cyclesText = stringResource(Res.string.uiGeyserDetailCycles)

                    val formattedText = buildAnnotatedString {

                        var currentIndex = 0

                        val regex = "\\{(activeCycles|overallCycles)\\}".toRegex()

                        regex.findAll(template).forEach { match ->

                            val placeholder = match.groupValues[1]
                            val startIndex = match.range.first

                            append(template.substring(currentIndex, startIndex))

                            pushStyle(boldSpanStyle)
                            when (placeholder) {

                                "activeCycles" ->
                                    append("${geyser.activeCycles.toString(1)} $cyclesText")

                                "overallCycles" ->
                                    append("${(geyser.activeCycles + geyser.dormancyCycles).toString(1)} $cyclesText")
                            }
                            pop()

                            currentIndex = match.range.last + 1
                        }

                        append(template.substring(currentIndex))
                    }

                    Text(
                        text = formattedText,
                        style = if (Locale.current.language == "zh")
                            MaterialTheme.typography.bodySmall
                        else
                            MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
        }
    }
}
