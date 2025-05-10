package ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/*
 * Taken from https://github.com/google/material-design-icons
 * Licensed under Apache 2.0 License
 */
val IconArrowUp: ImageVector
    get() {
        if (_IconArrowUp != null) {
            return _IconArrowUp!!
        }
        _IconArrowUp = ImageVector.Builder(
            name = "IconArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(440f, 800f)
                verticalLineToRelative(-487f)
                lineTo(216f, 537f)
                lineToRelative(-56f, -57f)
                lineToRelative(320f, -320f)
                lineToRelative(320f, 320f)
                lineToRelative(-56f, 57f)
                lineToRelative(-224f, -224f)
                verticalLineToRelative(487f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()

        return _IconArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _IconArrowUp: ImageVector? = null
