package theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.economica_bold
import oni_seed_browser.app.generated.resources.economica_bold_italic
import oni_seed_browser.app.generated.resources.economica_italic
import oni_seed_browser.app.generated.resources.economica_regular
import org.jetbrains.compose.resources.Font

@Composable
fun EconomicaFontFamily(): FontFamily = FontFamily(
    Font(
        resource = Res.font.economica_regular,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.economica_bold,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.economica_italic,
        weight = FontWeight.Normal,
        style = FontStyle.Italic
    ),
    Font(
        resource = Res.font.economica_bold_italic,
        weight = FontWeight.Bold,
        style = FontStyle.Italic
    )
)

@Composable
fun AppTypography(): Typography =
    Typography(defaultFontFamily = EconomicaFontFamily())
