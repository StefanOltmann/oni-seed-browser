package ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/**
 * Taken from https://github.com/simple-icons/simple-icons
 * Licensed under MIT
 */
val IconGitHubSponsors: ImageVector
    get() {
        if (_IconGitHubSponsors != null) {
            return _IconGitHubSponsors!!
        }
        _IconGitHubSponsors = ImageVector.Builder(
            name = "IconGitHubSponsors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.625f, 1.499f)
                curveToRelative(-2.32f, 0f, -4.354f, 1.203f, -5.625f, 3.03f)
                curveToRelative(-1.271f, -1.827f, -3.305f, -3.03f, -5.625f, -3.03f)
                curveTo(3.129f, 1.499f, 0f, 4.253f, 0f, 8.249f)
                curveToRelative(0f, 4.275f, 3.068f, 7.847f, 5.828f, 10.227f)
                arcToRelative(33.14f, 33.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.616f, 3.876f)
                lineToRelative(0.028f, 0.017f)
                lineToRelative(0.008f, 0.003f)
                lineToRelative(-0.001f, 0.003f)
                curveToRelative(0.163f, 0.085f, 0.342f, 0.126f, 0.521f, 0.125f)
                curveToRelative(0.179f, 0.001f, 0.358f, -0.041f, 0.521f, -0.125f)
                lineToRelative(-0.001f, -0.003f)
                lineToRelative(0.008f, -0.003f)
                lineToRelative(0.028f, -0.017f)
                arcToRelative(33.14f, 33.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.616f, -3.876f)
                curveTo(20.932f, 16.096f, 24f, 12.524f, 24f, 8.249f)
                curveToRelative(0f, -3.996f, -3.129f, -6.75f, -6.375f, -6.75f)
                close()
                moveTo(16.706f, 16.774f)
                arcToRelative(30.766f, 30.766f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.703f, 3.316f)
                lineToRelative(-0.004f, -0.002f)
                lineToRelative(-0.004f, 0.002f)
                arcToRelative(30.955f, 30.955f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.703f, -3.316f)
                curveToRelative(-2.677f, -2.307f, -5.047f, -5.298f, -5.047f, -8.523f)
                curveToRelative(0f, -2.754f, 2.121f, -4.5f, 4.125f, -4.5f)
                curveToRelative(2.06f, 0f, 3.914f, 1.479f, 4.544f, 3.684f)
                curveToRelative(0.143f, 0.495f, 0.596f, 0.797f, 1.086f, 0.796f)
                curveToRelative(0.49f, 0.001f, 0.943f, -0.302f, 1.085f, -0.796f)
                curveToRelative(0.63f, -2.205f, 2.484f, -3.684f, 4.544f, -3.684f)
                curveToRelative(2.004f, 0f, 4.125f, 1.746f, 4.125f, 4.5f)
                curveToRelative(0f, 3.225f, -2.37f, 6.216f, -5.048f, 8.523f)
                close()
            }
        }.build()

        return _IconGitHubSponsors!!
    }

@Suppress("ObjectPropertyName")
private var _IconGitHubSponsors: ImageVector? = null
