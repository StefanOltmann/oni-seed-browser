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

package ui.theme

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Modern corner radius values
val minimalRoundedCornerShape = RoundedCornerShape(6.dp)
val defaultRoundedCornerShape = RoundedCornerShape(12.dp)
val largeRoundedCornerShape = RoundedCornerShape(16.dp)
val extraLargeRoundedCornerShape = RoundedCornerShape(24.dp)

// Enhanced spacing system for better visual hierarchy
val defaultSpacing = 8.dp
val doubleSpacing = defaultSpacing * 2
val tripleSpacing = defaultSpacing * 3
val halfSpacing = defaultSpacing / 2
val quarterSpacing = defaultSpacing / 4

// Component-specific spacing
val cardPadding = 16.dp
val buttonPadding = 12.dp
val sectionSpacing = 24.dp

fun Modifier.quarterPadding() = this.padding(quarterSpacing)
fun Modifier.halfPadding() = this.padding(halfSpacing)
fun Modifier.defaultPadding() = this.padding(defaultSpacing)
fun Modifier.cardPadding() = this.padding(cardPadding)
fun Modifier.buttonPadding() = this.padding(buttonPadding)

@Composable
fun QuarterSpacer() = Spacer(Modifier.size(quarterSpacing))

@Composable
fun HalfSpacer() = Spacer(Modifier.size(halfSpacing))

@Composable
fun DefaultSpacer() = Spacer(Modifier.size(defaultSpacing))

@Composable
fun DoubleSpacer() = Spacer(Modifier.size(doubleSpacing))

@Composable
fun TripleSpacer() = Spacer(Modifier.size(tripleSpacing))

@Composable
fun SectionSpacer() = Spacer(Modifier.size(sectionSpacing))

@Composable
fun ColumnScope.FillSpacer() = Spacer(Modifier.weight(1F))

@Composable
fun RowScope.FillSpacer() = Spacer(Modifier.weight(1F))
