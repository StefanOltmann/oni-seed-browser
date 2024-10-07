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

package ui.filter

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ui.noRippleClickable
import ui.onHover
import ui.theme.DefaultSpacer
import ui.theme.defaultRoundedCornerShape

@Composable
fun FilterPanelEntry(
    onAsteroidFilterClicked: () -> Unit,
    onItemFilterClicked: () -> Unit,
    onConditionFilterClicked: () -> Unit,
    onDeleteClicked: () -> Unit
) {

    Row {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(48.dp)
                .border(1.dp, Color.White, defaultRoundedCornerShape)
        ) {

            DefaultSpacer()

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(40.dp)
                    .clickable { onAsteroidFilterClicked() }
            ) {

                Text(
                    text = "SUM",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(24.dp)
            )

            VerticalSeparator()

            DefaultSpacer()

            Box(
                modifier = Modifier
                    .width(200.dp)
                    .clickable { onItemFilterClicked() }
            ) {

                Text(
                    text = "Output: Water geyser",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(24.dp)
            )

            VerticalSeparator()

            DefaultSpacer()

            Box(
                modifier = Modifier
                    .width(70.dp)
                    .clickable { onConditionFilterClicked() }
            ) {

                Text(
                    text = "at least",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(24.dp)
            )

            VerticalSeparator()

            DefaultSpacer()

            val textFieldValue = remember {
                mutableStateOf(TextFieldValue(text = "0"))
            }

            BasicTextField(
                value = textFieldValue.value,
                onValueChange = {

                    if (it.text.all(Char::isDigit))
                        textFieldValue.value = it
                },
                cursorBrush = SolidColor(MaterialTheme.colorScheme.onBackground),
                singleLine = true,
                textStyle = MaterialTheme.typography.headlineSmall.copy(
                    color = MaterialTheme.colorScheme.onBackground
                ),
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.surface)
                    .width(60.dp)
            )
        }

        DefaultSpacer()

        val deleteButtonHovered = remember { mutableStateOf(false) }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(48.dp)
                .onHover(deleteButtonHovered)
                .noRippleClickable(onDeleteClicked)
        ) {

            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = null,
                tint = if (deleteButtonHovered.value)
                    Color.Red
                else
                    MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
private fun VerticalSeparator() {

    Box(
        modifier = Modifier
            .width(1.dp)
            .fillMaxHeight()
            .background(MaterialTheme.colorScheme.onBackground)
    )
}
