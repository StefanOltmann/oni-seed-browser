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
val IconBookmarks: ImageVector
    get() {
        if (_IconBookmarks != null) {
            return _IconBookmarks!!
        }
        _IconBookmarks = ImageVector.Builder(
            name = "IconBookmarks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(160f, 880f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 240f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 320f)
                verticalLineToRelative(560f)
                lineTo(400f, 760f)
                lineTo(160f, 880f)
                close()
                moveTo(240f, 759f)
                lineTo(400f, 673f)
                lineTo(560f, 759f)
                verticalLineToRelative(-439f)
                lineTo(240f, 320f)
                verticalLineToRelative(439f)
                close()
                moveTo(720f, 720f)
                verticalLineToRelative(-560f)
                lineTo(280f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 320f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-320f)
                close()
            }
        }.build()

        return _IconBookmarks!!
    }

@Suppress("ObjectPropertyName")
private var _IconBookmarks: ImageVector? = null
