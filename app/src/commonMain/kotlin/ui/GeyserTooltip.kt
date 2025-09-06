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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
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
import io.github.stefanoltmann.app.generated.resources.uiGeyserDetailTonsPerCycle
import io.github.stefanoltmann.app.generated.resources.uiStorageTankForDormancy
import model.GeyserType
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.model.stringResource
import ui.theme.DefaultSpacer
import ui.theme.HalfSpacer
import ui.theme.anthracite
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.doubleSpacing
import ui.theme.halfSpacing
import ui.theme.lightGray

@Composable
fun GeyserTooltip(
    geyserType: GeyserType,
    count: Int,
    avgEmitRate: Int,
    storageTankTons: Float?
) {

    GenericTooltip {

        Column {

            val avgEmitRateRating = geyserType.getAvgEmitRateRating(avgEmitRate)

            val avgEmitRateColor = if (geyserType == GeyserType.OIL_RESERVOIR)
                goodAvgEmitRateColor
            else
                getAvgEmitRateRatingColor(avgEmitRateRating)

            GeyserInfoHeaderRow(count, geyserType, avgEmitRate, avgEmitRateColor)

            if (geyserType != GeyserType.OIL_RESERVOIR) {

                AvgEmitRateScaleRow(geyserType, avgEmitRate, avgEmitRateColor)

                HalfSpacer()

                if (storageTankTons != null) {

                    HorizontalDivider(
                        modifier = Modifier
                            .offset(x = 8.dp)
                            .width(272.dp),
                        thickness = 1.dp,
                        color = lightGray
                    )

                    StorageTankRow(geyserType, storageTankTons)

                    DefaultSpacer()
                }
            }
        }
    }
}

@Composable
private fun GeyserInfoHeaderRow(
    count: Int,
    geyserType: GeyserType,
    avgEmitRate: Int,
    avgEmitRateColor: Color
) {

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
            painter = painterResource(geyserType.drawableResource),
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
            color = avgEmitRateColor
        )

        HalfSpacer()

        Text(
            text = stringResource(Res.string.uiGeyserDetailGramPerSecond),
            style = MaterialTheme.typography.bodyMedium,
            color = avgEmitRateColor
        )

        HalfSpacer()

        Text(
            text = "(" + calcTonsPerCycle(avgEmitRate).toString(decimals = 2) + " " +
                stringResource(Res.string.uiGeyserDetailTonsPerCycle) + ")",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground.copy(0.7F)
        )

        HalfSpacer()
    }
}

@Composable
private fun AvgEmitRateScaleRow(
    geyserType: GeyserType,
    avgEmitRate: Int,
    avgEmitRateColor: Color
) {

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
                    .background(anthracite, defaultRoundedCornerShape)
                    .height(8.dp)
                    .width(200.dp)
            )

            val percentLowAvg = (geyserType.lowAvgEmitRate - geyserType.minAvgEmitRate) * 100.0 /
                (geyserType.maxAvgEmitRate - geyserType.minAvgEmitRate)

            Box(
                modifier = Modifier
                    .background(
                        Color.Red.copy(alpha = 0.3F),
                        RoundedCornerShape(
                            topStart = 8.dp,
                            bottomStart = 8.dp
                        )
                    )
                    .height(8.dp)
                    .width((percentLowAvg * 2).dp)
            )

            val percentMeanAvg = (geyserType.meanAvgEmitRate - geyserType.minAvgEmitRate) * 100.0 /
                (geyserType.maxAvgEmitRate - geyserType.minAvgEmitRate)

            /*
             * Indicator in the bar where the mean average is
             */
            Box(
                modifier = Modifier
                    .offset(
                        x = (percentMeanAvg * 2).dp
                    )
                    .background(lightGray, TriangleShapeUp)
                    .size(8.dp)
            )

            val percentThisValue = (avgEmitRate - geyserType.minAvgEmitRate) * 100.0 /
                (geyserType.maxAvgEmitRate - geyserType.minAvgEmitRate)

            /*
             * Indicator above the bar where this value is.
             */
            Box(
                modifier = Modifier
                    .offset(
                        x = (percentThisValue * 2).dp,
                        y = -8.dp
                    )
                    .background(avgEmitRateColor, TriangleShapeDown)
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
}

@Composable
private fun StorageTankRow(
    geyserType: GeyserType,
    storageTankTons: Float
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = doubleSpacing)
    ) {

        Text(
            text = stringResource(Res.string.uiStorageTankForDormancy) + ": " +
                storageTankTons.toString(decimals = 2) + "t",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
    }
}

private object TriangleShapeDown : Shape {

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

private object TriangleShapeUp : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path().apply {
            moveTo(size.width / 2, 0f)
            lineTo(0f, size.height)
            lineTo(size.width, size.height)
            close()
        }

        return Outline.Generic(path)
    }
}
