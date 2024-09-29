package theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.liberation_sans_bold
import oni_seed_browser.app.generated.resources.liberation_sans_bold_italic
import oni_seed_browser.app.generated.resources.liberation_sans_italic
import oni_seed_browser.app.generated.resources.liberation_sans_regular
import org.jetbrains.compose.resources.Font

@Composable
fun LiberationSansFontFamily(): FontFamily = FontFamily(
    Font(
        resource = Res.font.liberation_sans_regular,
        weight = FontWeight.Normal,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.liberation_sans_bold,
        weight = FontWeight.Bold,
        style = FontStyle.Normal
    ),
    Font(
        resource = Res.font.liberation_sans_italic,
        weight = FontWeight.Normal,
        style = FontStyle.Italic
    ),
    Font(
        resource = Res.font.liberation_sans_bold_italic,
        weight = FontWeight.Bold,
        style = FontStyle.Italic
    )
)

@Composable
fun AppTypography(): Typography =
    Typography(defaultFontFamily = LiberationSansFontFamily())
