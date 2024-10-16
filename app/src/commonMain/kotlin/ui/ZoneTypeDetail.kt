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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.ZoneType
import org.jetbrains.compose.resources.painterResource
import ui.theme.*

private val defaultHalfRoundedCornerShape = RoundedCornerShape(
    topStart = 6.dp,
    topEnd = 0.dp,
    bottomStart = 6.dp,
    bottomEnd = 0.dp
)

@Composable
fun ZoneTypeDetail(
    zoneType: ZoneType,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier
            .padding(horizontal = doubleSpacing)
            .background(
                cardColorBackground,
                defaultRoundedCornerShape
            )
            .border(
                0.dp,
                lightGrayTransparentBorderColor,
                defaultRoundedCornerShape
            )
            .fillMaxWidth()
            .then(modifier)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.halfPadding()
        ) {

            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(48.dp)
                    .background(
                        zoneType.color,
                        defaultHalfRoundedCornerShape
                    )
            )

            HalfSpacer()

            Image(
                painter = painterResource(getZoneTypeDrawable(zoneType)),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            DefaultSpacer()

            Text(
                text = zoneType.displayName,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}
