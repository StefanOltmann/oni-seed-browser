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
val IconProductHunt: ImageVector
    get() {
        if (_IconProductHunt != null) {
            return _IconProductHunt!!
        }
        _IconProductHunt = ImageVector.Builder(
            name = "IconProductHunt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.604f, 8.4f)
                horizontalLineToRelative(-3.405f)
                lineTo(10.199f, 12f)
                horizontalLineToRelative(3.405f)
                curveToRelative(0.995f, 0f, 1.801f, -0.806f, 1.801f, -1.801f)
                curveToRelative(0f, -0.993f, -0.805f, -1.799f, -1.801f, -1.799f)
                close()
                moveTo(12f, 0f)
                curveTo(5.372f, 0f, 0f, 5.372f, 0f, 12f)
                reflectiveCurveToRelative(5.372f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.372f, 12f, -12f)
                reflectiveCurveTo(18.628f, 0f, 12f, 0f)
                close()
                moveTo(13.604f, 14.4f)
                horizontalLineToRelative(-3.405f)
                lineTo(10.199f, 18f)
                lineTo(7.801f, 18f)
                lineTo(7.801f, 6f)
                horizontalLineToRelative(5.804f)
                curveToRelative(2.319f, 0f, 4.2f, 1.88f, 4.2f, 4.199f)
                curveToRelative(0f, 2.321f, -1.881f, 4.201f, -4.201f, 4.201f)
                close()
            }
        }.build()

        return _IconProductHunt!!
    }

@Suppress("ObjectPropertyName")
private var _IconProductHunt: ImageVector? = null
