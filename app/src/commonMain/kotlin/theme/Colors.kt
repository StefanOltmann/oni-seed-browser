package theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val white = Color(0xFFFFFFFF)

val anthracite = Color(0xFF222529)
val surfaceColor = Color(0xFF383a3e)
val surfaceVariantColor = Color(0xFF424346)

val darkRed = Color(0xFFA62D2D)
val darkGreen = Color(0xFF437E3D)

val ctaColor = Color(0xFF72bcd4)

val appColorScheme = darkColorScheme(
    background = anthracite,
    surface = surfaceColor,
    onSurfaceVariant = surfaceVariantColor,
    primary = Color(0xFF72bcd4)
)
