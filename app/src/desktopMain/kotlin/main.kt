import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        title = "ONI Seed Browser",
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
