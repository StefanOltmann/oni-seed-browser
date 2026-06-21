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
val IconKeyboardArrowDown: ImageVector
    get() {
        if (_IconKeyboardArrowDown != null) {
            return _IconKeyboardArrowDown!!
        }
        _IconKeyboardArrowDown = ImageVector.Builder(
            name = "IconKeyboardArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(480f, 616f)
                lineTo(240f, 376f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 184f)
                lineToRelative(184f, -184f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()

        return _IconKeyboardArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _IconKeyboardArrowDown: ImageVector? = null
