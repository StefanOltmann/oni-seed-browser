import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {

        var currentSize by remember { mutableStateOf(IntSize(0, 0)) }

        Column(
            Modifier
                .fillMaxSize()
                .onSizeChanged {
                    currentSize = it
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("Current size: " + currentSize)

        }
    }
}
