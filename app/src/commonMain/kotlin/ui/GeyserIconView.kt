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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import model.Geyser
import model.GeyserType
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.theme.DefaultSpacer
import ui.theme.anthracite
import ui.theme.gray3
import ui.theme.halfPadding

/*
Only the first geyser is displayed, with a count of how many geysers there are if there are more than 1.
 */
@Composable
fun GeyserIconView(
    geysers: List<Geyser>,
    backgroundAlpha: Float,
    alwaysShowAvgEmitRateRatingIndicator: Boolean,
    showGeyserName: Boolean,
) {
    val firstGeyser = geysers.first()
    val geyserCount = geysers.size
    if (geyserCount >= 1) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(48.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        firstGeyser.id.emittedElementType.uiColor.copy(alpha = 0.1f).compositeOver(
                            if (firstGeyser.id.rating.isNegative())
                                badRatingBackground
                            else
                                gray3
                        ).copy(alpha = backgroundAlpha),
                        CircleShape
                    )
                    .border(
                        1.dp,
                        anthracite,
                        CircleShape
                    )
            ) {

                /*
             * For good geysers, show the amount in they produce
             * with a circular progress indicator.
             */
                if ((alwaysShowAvgEmitRateRatingIndicator || !firstGeyser.id.rating.isNegative()) && geyserCount == 1)
                    AvgEmitRateRatingIndicator(firstGeyser)

                Image(
                    painter = painterResource(getGeyserDrawable(firstGeyser.id)),
                    contentDescription = null,
                    alignment = Alignment.BottomCenter,
                    modifier = Modifier.halfPadding()
                )

                if (geyserCount > 1) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(20.dp)
                            .offset(y = 14.dp)
                            .background(
                                countBackground,
                                CircleShape
                            )
                    ) {

                        Text(
                            text = "$geyserCount",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.offset(y = -4.dp)
                        )
                    }
                }
            }

            if (showGeyserName) {

                DefaultSpacer()

                Text(
                    text = stringResource(firstGeyser.id.stringResource),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    /* Can span two lines */
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
