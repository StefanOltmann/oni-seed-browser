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
val IconLogout: ImageVector
    get() {
        if (_IconLogout != null) {
            return _IconLogout!!
        }
        _IconLogout = ImageVector.Builder(
            name = "IconLogout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                lineTo(200f, 200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                lineTo(200f, 840f)
                close()
                moveTo(640f, 680f)
                lineTo(585f, 622f)
                lineTo(687f, 520f)
                lineTo(360f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()

        return _IconLogout!!
    }

@Suppress("ObjectPropertyName")
private var _IconLogout: ImageVector? = null
