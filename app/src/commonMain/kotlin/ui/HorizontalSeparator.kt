package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.theme.defaultPadding

@Composable
fun HorizontalSeparator(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier
            .defaultPadding()
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
            .height(2.dp)
            .then(modifier)
    )
}
