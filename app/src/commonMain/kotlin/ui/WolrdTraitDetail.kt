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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.WorldTrait
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.theme.cardColorBackground
import ui.theme.defaultRoundedCornerShape
import ui.theme.doubleSpacing

@Composable
fun WorlTraitDetail(
    worldTrait: WorldTrait
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                horizontal = doubleSpacing
            )
            .background(
                cardColorBackground,
                defaultRoundedCornerShape
            )
            .border(
                2.dp,
                worldTrait.rating.color,
                defaultRoundedCornerShape
            )
            .fillMaxWidth()
            .height(50.dp)
    ) {

        Image(
            painter = painterResource(getWorldTraitDrawable(worldTrait)),
            contentDescription = null,
            modifier = Modifier
                .padding(horizontal = doubleSpacing)
                .size(24.dp)
        )

        Text(
            text = stringResource(worldTrait.stringResource),
            style = MaterialTheme.typography.headlineSmall,
            color = worldTrait.color,
            modifier = Modifier.offset(y = -2.dp)
        )
    }
}
