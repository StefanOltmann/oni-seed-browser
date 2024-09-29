package theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val anthracite = Color(0xFF222529)
val surfaceColor = Color(0xFF383a3e)
val surfaceVariantColor = Color(0xFF424346)

val appColorScheme = darkColorScheme(
    background = anthracite,
    surface = surfaceColor,
    onSurfaceVariant = surfaceVariantColor
)
