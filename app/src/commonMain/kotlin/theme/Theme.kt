package theme

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

fun Modifier.defaultPadding() = this.padding(defaultSpacing)

@Composable
fun DefaultSpacer() = Spacer(Modifier.size(defaultSpacing))
