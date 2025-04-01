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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailGramPerSecond
import model.GeyserType
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.theme.HalfSpacer
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfSpacing
import ui.theme.lightGray

@Composable
fun GeyserTooltip(
    geyserType: GeyserType,
    count: Int,
    avgEmitRate: Int
) {

    GenericTooltip {

        Column {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = defaultSpacing)
            ) {

                if (count > 1) {

                    HalfSpacer()

                    Text(
                        text = count.toString() + "x",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )

                    HalfSpacer()
                }

                Image(
                    painter = painterResource(getGeyserDrawable(geyserType)),
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                )

                HalfSpacer()

                Text(
                    text = stringResource(geyserType.stringResource),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )

                HalfSpacer()

                Text(
                    text = "•",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )

                HalfSpacer()

                Text(
                    text = avgEmitRate.toString(),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )

                HalfSpacer()

                Text(
                    text = stringResource(Res.string.uiGeyserDetailGramPerSecond),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )

                HalfSpacer()
            }

            if (geyserType != GeyserType.OIL_RESERVOIR) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = halfSpacing)
                ) {

                    Text(
                        text = geyserType.minAvgEmitRate.toString(),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.width(40.dp).offset(y = -2.dp)
                    )

                    Box(
                        contentAlignment = Alignment.CenterStart
                    ) {

                        Box(
                            modifier = Modifier
                                .background(lightGray, defaultRoundedCornerShape)
                                .height(8.dp)
                                .width(200.dp)
                        )

                        val percent = avgEmitRate * 100.0 / geyserType.maxAvgEmitRate

                        /*
                         * Indicator above the bar where this value is.
                         */
                        Box(
                            modifier = Modifier
                                .offset(
                                    x = (percent * 2).dp,
                                    y = -8.dp
                                )
                                .background(Color.Red, TriangleShape)
                                .size(8.dp)
                        )
                    }

                    Text(
                        text = geyserType.maxAvgEmitRate.toString(),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.width(40.dp).offset(y = -2.dp)
                    )
                }

                HalfSpacer()
            }
        }
    }
}

private object TriangleShape : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path().apply {
            moveTo(size.width / 2, size.height)
            lineTo(0f, 0f)
            lineTo(size.width, 0f)
            close()
        }

        return Outline.Generic(path)
    }
}
