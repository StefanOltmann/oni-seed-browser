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
val IconBookmarkOutline: ImageVector
    get() {
        if (_IconBookmarkOutline != null) {
            return _IconBookmarkOutline!!
        }
        _IconBookmarkOutline = ImageVector.Builder(
            name = "IconBookmarkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(200f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(640f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
                moveTo(280f, 718f)
                lineTo(480f, 632f)
                lineTo(680f, 718f)
                verticalLineToRelative(-518f)
                lineTo(280f, 200f)
                verticalLineToRelative(518f)
                close()
                moveTo(280f, 200f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
            }
        }.build()

        return _IconBookmarkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _IconBookmarkOutline: ImageVector? = null
