/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import model.Geyser
import org.jetbrains.compose.resources.painterResource
import ui.theme.*
import kotlin.math.pow
import kotlin.math.roundToInt

@Composable
fun GeyserDetail(
    geyser: Geyser,
    modifier: Modifier = Modifier
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(horizontal = doubleSpacing)
            .background(
                if (geyser.id.rating.isNegative())
                    geyser.id.rating.color.copy(alpha = 0.2F)
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

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(48.dp)
            ) {

                DefaultSpacer()

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(48.dp)
                        .background(
                            gray3.copy(alpha = 0.2F),
                            CircleShape
                        )
                ) {

                    Image(
                        painter = painterResource(getGeyserDrawable(geyser.id)),
                        contentDescription = null,
                        modifier = Modifier.size(48.dp)
                    )
                }

                DefaultSpacer()

                Text(
                    text = geyser.id.displayName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Row(
                verticalAlignment = Alignment.Bottom
            ) {

                Text(
                    text = "${geyser.avgEmitRate} g/s",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = " on average",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Row {

                Text(
                    text = "Emits ",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = "${geyser.emitRate} g/s",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = " for ",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = "${geyser.eruptionTime}s",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = " in ",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = "${geyser.eruptionTime + geyser.idleTime}s",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Row {

                Text(
                    text = "Active for ",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = "${geyser.activeCycles.toString(1)} cycles",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = " in ",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Text(
                    text = "${(geyser.activeCycles + geyser.dormancyCycles).toString(1)} cycles",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }
    }
}

private fun Float.toString(numOfDec: Int): String {
    val integerDigits = this.toInt()
    val floatDigits = ((this - integerDigits) * 10f.pow(numOfDec)).roundToInt()
    return "${integerDigits}.${floatDigits}"
}
