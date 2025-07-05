package ui

import ALTERNATIVE_MAP_VIEWER_URL
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiShowInAlternativeViewer
import model.AsteroidType
import org.jetbrains.compose.resources.stringResource
import ui.icons.IconExternalLink
import ui.theme.HalfSpacer
import ui.theme.hoverColor

@Composable
fun AlternativeMapViewerLinkBox(
    coordinate: String,
    asteroidType: AsteroidType
) {

    val uriHandler = LocalUriHandler.current

    val openHovered = remember { mutableStateOf(false) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .onHover(openHovered)
            .height(24.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .noRippleClickable {
                uriHandler.openUri(
                    ALTERNATIVE_MAP_VIEWER_URL
                        + "?coord=" + coordinate
                        + "&asteroid=" + asteroidType.name
                )
            }
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = stringResource(Res.string.uiShowInAlternativeViewer),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                color = if (openHovered.value)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
            )

            HalfSpacer()

            Icon(
                imageVector = IconExternalLink,
                contentDescription = null,
                tint = if (openHovered.value)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .onHover(openHovered)
                    .size(16.dp)
            )
        }
    }
}
