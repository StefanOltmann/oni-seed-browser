package theme

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val defaultRoundedCornerShape = RoundedCornerShape(8.dp)

val defaultSpacing = 8.dp
val doubleSpacing = defaultSpacing * 2
val halfSpacing = defaultSpacing / 2

fun Modifier.defaultPadding() = this.padding(defaultSpacing)

@Composable
fun HalfSpacer() = Spacer(Modifier.size(halfSpacing))

@Composable
fun DefaultSpacer() = Spacer(Modifier.size(defaultSpacing))

@Composable
fun DoubleSpacer() = Spacer(Modifier.size(doubleSpacing))

@Composable
fun ColumnScope.FillSpacer() = Spacer(Modifier.weight(1F))

@Composable
fun RowScope.FillSpacer() = Spacer(Modifier.weight(1F))
