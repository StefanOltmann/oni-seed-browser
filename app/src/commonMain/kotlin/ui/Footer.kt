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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.icons.KotlinLogo
import ui.theme.HalfSpacer
import ui.theme.lightGray

@Composable
fun Footer() {

    val uriHandler = LocalUriHandler.current

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .background(Color.Black)
    ) {

        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .clickable {
                    uriHandler.openUri("https://github.com/StefanOltmann/oni-seed-browser")
                }
        ) {

            Text(
                text = "made by Stefan Oltmann with",
                style = MaterialTheme.typography.bodyLarge,
                color = lightGray,
                lineHeight = 0.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .height(20.dp)
                    .offset(y = 2.dp)
            )

            HalfSpacer()

            Image(
                imageVector = KotlinLogo,
                contentDescription = null,
                modifier = Modifier
                    .height(14.dp)
                    .offset(y = -2.dp)
            )
        }
    }
}
