package ui.icons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KotlinLogo: ImageVector
    get() {
        if (_KotlinLogo != null) {
            return _KotlinLogo!!
        }
        _KotlinLogo = ImageVector.Builder(
            name = "KotlinLogo",
            defaultWidth = 2435.dp,
            defaultHeight = 528.dp,
            viewportWidth = 2435f,
            viewportHeight = 528f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE44857),
                        0.5f to Color(0xFFC711E1),
                        1f to Color(0xFF7F52FF)
                    ),
                    start = Offset(499.7f, 20.3f),
                    end = Offset(0.1f, 520f)
                )
            ) {
                moveTo(499.8f, 519.9f)
                lineToRelative(-499.8f, 0f)
                lineToRelative(0f, -499.5f)
                lineToRelative(499.8f, 0f)
                lineToRelative(-249.9f, 249.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1104.6f, 18.8f)
                lineToRelative(-100.3f, 0f)
                lineToRelative(-216.2f, 231.9f)
                lineToRelative(0f, -230.3f)
                lineToRelative(-79.9f, 0f)
                lineToRelative(0f, 499.5f)
                lineToRelative(79.9f, 0f)
                lineToRelative(0f, -241.3f)
                lineToRelative(217.8f, 241.3f)
                lineToRelative(101.8f, 0f)
                lineToRelative(-230.3f, -258.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1375.6f, 170.8f)
                curveToRelative(-28.2f, -15.7f, -61.1f, -25.1f, -95.6f, -25.1f)
                curveToRelative(-36f, 0f, -68.9f, 7.8f, -97.1f, 25.1f)
                curveToRelative(-28.2f, 17.3f, -51.7f, 39.2f, -67.4f, 67.4f)
                curveToRelative(-15.7f, 29.8f, -23.5f, 62.7f, -23.5f, 98.7f)
                reflectiveCurveToRelative(7.8f, 70.5f, 23.5f, 98.7f)
                reflectiveCurveToRelative(37.6f, 51.7f, 67.4f, 67.4f)
                curveToRelative(28.2f, 15.7f, 61.1f, 25.1f, 97.1f, 25.1f)
                curveToRelative(36f, 0f, 68.9f, -7.8f, 97.1f, -25.1f)
                curveToRelative(28.2f, -15.7f, 50.1f, -39.2f, 65.8f, -67.4f)
                curveToRelative(15.7f, -29.8f, 23.5f, -62.7f, 23.5f, -98.7f)
                reflectiveCurveToRelative(-9.4f, -68.9f, -25.1f, -98.7f)
                curveTo(1425.8f, 209.9f, 1403.8f, 186.4f, 1375.6f, 170.8f)
                close()
                moveTo(1369.4f, 400.8f)
                curveToRelative(-9.4f, 18.8f, -21.9f, 32.9f, -37.6f, 42.3f)
                curveToRelative(-15.7f, 11f, -34.5f, 15.7f, -54.8f, 15.7f)
                curveToRelative(-20.3f, 0f, -39.2f, -4.7f, -56.4f, -15.7f)
                curveToRelative(-15.7f, -11f, -28.2f, -25.1f, -37.6f, -42.3f)
                curveToRelative(-9.4f, -18.8f, -12.5f, -39.2f, -12.5f, -62.7f)
                reflectiveCurveToRelative(4.7f, -45.4f, 14.1f, -62.7f)
                curveToRelative(9.4f, -18.8f, 21.9f, -32.9f, 37.6f, -42.3f)
                curveToRelative(15.7f, -11f, 34.5f, -15.7f, 56.4f, -15.7f)
                curveToRelative(20.4f, 0f, 39.2f, 4.7f, 54.8f, 15.7f)
                curveToRelative(15.7f, 11f, 28.2f, 25.1f, 37.6f, 42.3f)
                curveToRelative(9.4f, 18.8f, 12.5f, 39.2f, 12.5f, 62.7f)
                reflectiveCurveTo(1378.8f, 382f, 1369.4f, 400.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1627.9f, 62.7f)
                horizontalLineToRelative(-76.8f)
                verticalLineToRelative(62.7f)
                curveToRelative(0f, 9.4f, -1.6f, 17.2f, -7.8f, 21.9f)
                curveToRelative(-4.7f, 4.7f, -12.5f, 7.8f, -21.9f, 7.8f)
                horizontalLineToRelative(-37.6f)
                verticalLineToRelative(65.8f)
                horizontalLineToRelative(65.8f)
                verticalLineToRelative(197.4f)
                curveToRelative(0f, 20.4f, 4.7f, 39.2f, 12.5f, 54.8f)
                curveToRelative(7.8f, 15.7f, 20.4f, 28.2f, 36f, 36f)
                curveToRelative(15.7f, 9.4f, 32.9f, 12.5f, 54.8f, 12.5f)
                horizontalLineToRelative(59.5f)
                verticalLineToRelative(-68.9f)
                horizontalLineToRelative(-43.9f)
                curveToRelative(-11f, 0f, -20.4f, -3.1f, -28.2f, -12.5f)
                curveToRelative(-6.3f, -7.8f, -11f, -18.8f, -11f, -31.3f)
                verticalLineToRelative(-188f)
                horizontalLineToRelative(84.6f)
                verticalLineToRelative(-65.8f)
                horizontalLineToRelative(-84.6f)
                verticalLineTo(62.7f)
                horizontalLineTo(1627.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1773.6f, 0f)
                horizontalLineToRelative(78.3f)
                verticalLineToRelative(519.9f)
                horizontalLineToRelative(-78.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1941.2f, 1.6f)
                horizontalLineToRelative(79.9f)
                verticalLineToRelative(81.5f)
                horizontalLineToRelative(-79.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1941.2f, 155.1f)
                horizontalLineToRelative(78.3f)
                verticalLineToRelative(366.3f)
                horizontalLineToRelative(-78.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(2419.1f, 214.6f)
                curveToRelative(-11f, -21.9f, -26.6f, -39.2f, -47f, -50.1f)
                curveToRelative(-20.4f, -12.5f, -43.9f, -18.8f, -70.5f, -18.8f)
                curveToRelative(-28.2f, 0f, -53.3f, 7.8f, -75.2f, 20.4f)
                curveToRelative(-17.2f, 11f, -31.3f, 26.6f, -42.3f, 43.9f)
                verticalLineToRelative(-56.4f)
                horizontalLineToRelative(-75.2f)
                verticalLineToRelative(366.3f)
                horizontalLineToRelative(78.3f)
                verticalLineTo(314.6f)
                curveToRelative(0f, -20.4f, 3.1f, -37.6f, 11f, -53.3f)
                curveToRelative(7.8f, -15.7f, 18.8f, -26.6f, 31.3f, -36f)
                curveToRelative(14.1f, -7.8f, 29.8f, -12.5f, 48.6f, -12.5f)
                curveToRelative(17.2f, 0f, 29.8f, 3.1f, 42.3f, 11f)
                curveToRelative(12.5f, 7.9f, 20.4f, 17.2f, 26.6f, 29.8f)
                curveToRelative(6.3f, 12.5f, 9.4f, 28.2f, 9.4f, 45.4f)
                verticalLineToRelative(219.3f)
                horizontalLineToRelative(78.3f)
                verticalLineTo(289.6f)
                curveTo(2436.4f, 261.6f, 2430.2f, 236.6f, 2419.1f, 214.6f)
                close()
            }
        }.build()

        return _KotlinLogo!!
    }

@Suppress("ObjectPropertyName")
private var _KotlinLogo: ImageVector? = null
