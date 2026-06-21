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
val IconKeyboardArrowUp: ImageVector
    get() {
        if (_IconKeyboardArrowUp != null) {
            return _IconKeyboardArrowUp!!
        }
        _IconKeyboardArrowUp = ImageVector.Builder(
            name = "IconKeyboardArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(480f, 432f)
                lineTo(296f, 616f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -184f)
                close()
            }
        }.build()

        return _IconKeyboardArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _IconKeyboardArrowUp: ImageVector? = null
