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
val IconDiscord: ImageVector
    get() {
        if (_IconDiscord != null) {
            return _IconDiscord!!
        }
        _IconDiscord = ImageVector.Builder(
            name = "IconDiscord",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.317f, 4.37f)
                arcToRelative(19.791f, 19.791f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.885f, -1.515f)
                arcToRelative(0.074f, 0.074f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.079f, 0.037f)
                curveToRelative(-0.211f, 0.375f, -0.445f, 0.865f, -0.608f, 1.25f)
                curveToRelative(-1.845f, -0.276f, -3.68f, -0.276f, -5.487f, 0f)
                curveToRelative(-0.164f, -0.393f, -0.406f, -0.874f, -0.618f, -1.25f)
                arcToRelative(0.077f, 0.077f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.079f, -0.037f)
                arcToRelative(19.736f, 19.736f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.885f, 1.515f)
                arcToRelative(0.07f, 0.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.032f, 0.028f)
                curveTo(0.533f, 9.046f, -0.319f, 13.58f, 0.099f, 18.058f)
                arcToRelative(0.082f, 0.082f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.031f, 0.056f)
                curveToRelative(2.053f, 1.508f, 4.041f, 2.423f, 5.993f, 3.029f)
                arcToRelative(0.078f, 0.078f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.084f, -0.028f)
                curveToRelative(0.462f, -0.63f, 0.873f, -1.295f, 1.226f, -1.994f)
                arcToRelative(0.076f, 0.076f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.042f, -0.106f)
                curveToRelative(-0.653f, -0.248f, -1.274f, -0.549f, -1.872f, -0.892f)
                arcToRelative(0.077f, 0.077f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.008f, -0.128f)
                curveToRelative(0.126f, -0.094f, 0.252f, -0.192f, 0.372f, -0.291f)
                arcToRelative(0.074f, 0.074f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.078f, -0.01f)
                curveToRelative(3.928f, 1.793f, 8.18f, 1.793f, 12.061f, 0f)
                arcToRelative(0.074f, 0.074f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.079f, 0.009f)
                curveToRelative(0.12f, 0.099f, 0.246f, 0.198f, 0.373f, 0.292f)
                arcToRelative(0.077f, 0.077f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.007f, 0.128f)
                arcToRelative(12.299f, 12.299f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.873f, 0.891f)
                arcToRelative(0.077f, 0.077f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.041f, 0.107f)
                curveToRelative(0.36f, 0.698f, 0.772f, 1.363f, 1.225f, 1.993f)
                arcToRelative(0.076f, 0.076f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.084f, 0.029f)
                curveToRelative(1.961f, -0.607f, 3.95f, -1.522f, 6.002f, -3.029f)
                arcToRelative(0.077f, 0.077f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.031f, -0.055f)
                curveToRelative(0.5f, -5.177f, -0.838f, -9.674f, -3.549f, -13.66f)
                arcToRelative(0.061f, 0.061f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.031f, -0.029f)
                close()
                moveTo(8.02f, 15.331f)
                curveToRelative(-1.183f, 0f, -2.157f, -1.086f, -2.157f, -2.419f)
                curveToRelative(0f, -1.333f, 0.956f, -2.419f, 2.157f, -2.419f)
                curveToRelative(1.211f, 0f, 2.176f, 1.095f, 2.157f, 2.419f)
                curveToRelative(0f, 1.333f, -0.956f, 2.419f, -2.157f, 2.419f)
                close()
                moveTo(15.995f, 15.331f)
                curveToRelative(-1.183f, 0f, -2.157f, -1.086f, -2.157f, -2.419f)
                curveToRelative(0f, -1.333f, 0.955f, -2.419f, 2.157f, -2.419f)
                curveToRelative(1.211f, 0f, 2.176f, 1.095f, 2.157f, 2.419f)
                curveToRelative(0f, 1.333f, -0.946f, 2.419f, -2.157f, 2.419f)
                close()
            }
        }.build()

        return _IconDiscord!!
    }

@Suppress("ObjectPropertyName")
private var _IconDiscord: ImageVector? = null
