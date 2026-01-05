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
val IconThumbsUp: ImageVector
    get() {
        if (_IconThumbsUp != null) {
            return _IconThumbsUp!!
        }
        _IconThumbsUp = ImageVector.Builder(
            name = "IconThumbsUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(720f, 840f)
                lineTo(280f, 840f)
                verticalLineToRelative(-520f)
                lineToRelative(280f, -280f)
                lineToRelative(50f, 50f)
                quadToRelative(7f, 7f, 11.5f, 19f)
                reflectiveQuadToRelative(4.5f, 23f)
                verticalLineToRelative(14f)
                lineToRelative(-44f, 174f)
                horizontalLineToRelative(258f)
                quadToRelative(32f, 0f, 56f, 24f)
                reflectiveQuadToRelative(24f, 56f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 7f, -2f, 15f)
                reflectiveQuadToRelative(-4f, 15f)
                lineTo(794f, 792f)
                quadToRelative(-9f, 20f, -30f, 34f)
                reflectiveQuadToRelative(-44f, 14f)
                close()
                moveTo(360f, 760f)
                horizontalLineToRelative(360f)
                lineToRelative(120f, -280f)
                verticalLineToRelative(-80f)
                lineTo(480f, 400f)
                lineToRelative(54f, -220f)
                lineToRelative(-174f, 174f)
                verticalLineToRelative(406f)
                close()
                moveTo(360f, 354f)
                verticalLineToRelative(406f)
                verticalLineToRelative(-406f)
                close()
                moveTo(280f, 320f)
                verticalLineToRelative(80f)
                lineTo(160f, 400f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                lineTo(80f, 840f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(200f)
                close()
            }
        }.build()

        return _IconThumbsUp!!
    }

@Suppress("ObjectPropertyName")
private var _IconThumbsUp: ImageVector? = null
