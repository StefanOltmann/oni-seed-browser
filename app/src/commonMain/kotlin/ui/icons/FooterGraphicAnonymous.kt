/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
 * https://stefan-oltmann.de/oni-seed-browser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

package ui.icons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FooterGraphicAnonymous: ImageVector
    get() {
        if (_FooterGraphicAnonymous != null) {
            return _FooterGraphicAnonymous!!
        }
        _FooterGraphicAnonymous = ImageVector.Builder(
            name = "FooterGraphic",
            defaultWidth = 310.dp,
            defaultHeight = 96.dp,
            viewportWidth = 310f,
            viewportHeight = 96f
        ).apply {
            group(translationX = -800f, translationY = 0f) {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE44857),
                        0f to Color(0xFFE44857),
                        0.5f to Color(0xFFC711E1),
                        1f to Color(0xFF7F52FF)
                    ),
                    start = Offset(862f, 19.5f),
                    end = Offset(803.7f, 77.9f)
                )
            ) {
                moveTo(862.1f, 77.9f)
                lineTo(803.7f, 77.9f)
                lineTo(803.7f, 19.6f)
                lineTo(862.1f, 19.6f)
                lineTo(832.9f, 48.7f)
                lineTo(862.1f, 77.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(932.7f, 19.4f)
                lineTo(921f, 19.4f)
                lineTo(895.7f, 46.4f)
                lineTo(895.7f, 19.6f)
                lineTo(886.4f, 19.6f)
                lineTo(886.4f, 77.9f)
                lineTo(895.7f, 77.9f)
                lineTo(895.7f, 49.7f)
                lineTo(921.1f, 77.9f)
                lineTo(933f, 77.9f)
                lineTo(906.1f, 47.7f)
                lineTo(932.7f, 19.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(964.3f, 37.1f)
                curveTo(961f, 35.3f, 957.2f, 34.2f, 953.1f, 34.2f)
                curveTo(948.9f, 34.2f, 945.1f, 35.1f, 941.8f, 37.1f)
                curveTo(938.5f, 39.1f, 935.8f, 41.7f, 933.9f, 45f)
                curveTo(932.1f, 48.5f, 931.2f, 52.3f, 931.2f, 56.5f)
                curveTo(931.2f, 60.7f, 932.1f, 64.7f, 933.9f, 68f)
                curveTo(935.8f, 71.3f, 938.3f, 74.1f, 941.8f, 75.9f)
                curveTo(945.1f, 77.7f, 948.9f, 78.8f, 953.1f, 78.8f)
                curveTo(957.3f, 78.8f, 961.2f, 77.9f, 964.5f, 75.9f)
                curveTo(967.8f, 74.1f, 970.3f, 71.3f, 972.2f, 68f)
                curveTo(974f, 64.6f, 974.9f, 60.7f, 974.9f, 56.5f)
                curveTo(974.9f, 52.3f, 973.8f, 48.5f, 972f, 45f)
                curveTo(970.2f, 41.7f, 967.6f, 38.9f, 964.3f, 37.1f)
                close()
                moveTo(963.6f, 64f)
                curveTo(962.5f, 66.2f, 961f, 67.8f, 959.2f, 68.9f)
                curveTo(957.4f, 70.2f, 955.2f, 70.7f, 952.8f, 70.7f)
                curveTo(950.4f, 70.7f, 948.2f, 70.2f, 946.2f, 68.9f)
                curveTo(944.4f, 67.6f, 942.9f, 66f, 941.8f, 64f)
                curveTo(940.7f, 61.8f, 940.4f, 59.4f, 940.4f, 56.7f)
                curveTo(940.4f, 53.9f, 940.9f, 51.4f, 942f, 49.3f)
                curveTo(943.1f, 47.1f, 944.6f, 45.5f, 946.4f, 44.4f)
                curveTo(948.2f, 43.1f, 950.4f, 42.6f, 953f, 42.6f)
                curveTo(955.4f, 42.6f, 957.6f, 43.1f, 959.4f, 44.4f)
                curveTo(961.2f, 45.7f, 962.7f, 47.3f, 963.8f, 49.3f)
                curveTo(964.9f, 51.5f, 965.2f, 53.9f, 965.2f, 56.7f)
                curveTo(965.2f, 59.4f, 964.7f, 61.8f, 963.6f, 64f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(993.9f, 24.5f)
                lineTo(984.8f, 24.5f)
                lineTo(984.8f, 31.8f)
                curveTo(984.8f, 32.9f, 984.6f, 33.8f, 983.9f, 34.4f)
                curveTo(983.3f, 34.9f, 982.4f, 35.3f, 981.3f, 35.3f)
                lineTo(976.9f, 35.3f)
                lineTo(976.9f, 43f)
                lineTo(984.6f, 43f)
                lineTo(984.6f, 66f)
                curveTo(984.6f, 68.4f, 985.2f, 70.6f, 986.1f, 72.4f)
                curveTo(987f, 74.2f, 988.5f, 75.7f, 990.3f, 76.6f)
                curveTo(992.1f, 77.7f, 994.1f, 78.1f, 996.7f, 78.1f)
                lineTo(1003.6f, 78.1f)
                lineTo(1003.6f, 70f)
                lineTo(998.5f, 70f)
                curveTo(997.2f, 70f, 996.1f, 69.7f, 995.2f, 68.6f)
                curveTo(994.5f, 67.7f, 993.9f, 66.4f, 993.9f, 64.9f)
                lineTo(993.9f, 43f)
                lineTo(1003.8f, 43f)
                lineTo(1003.8f, 35.3f)
                lineTo(993.9f, 35.3f)
                lineTo(993.9f, 24.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1010.8f, 17.2f)
                lineToRelative(9.1f, 0f)
                lineToRelative(0f, 60.7f)
                lineToRelative(-9.1f, 0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1030.3f, 17.4f)
                lineToRelative(9.3f, 0f)
                lineToRelative(0f, 9.5f)
                lineToRelative(-9.3f, 0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1030.3f, 35.3f)
                lineToRelative(9.1f, 0f)
                lineToRelative(0f, 42.8f)
                lineToRelative(-9.1f, 0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(1086.1f, 42.2f)
                curveTo(1084.9f, 39.7f, 1083f, 37.7f, 1080.7f, 36.4f)
                curveTo(1078.3f, 34.9f, 1075.5f, 34.2f, 1072.4f, 34.2f)
                curveTo(1069.1f, 34.2f, 1066.2f, 35.1f, 1063.6f, 36.6f)
                curveTo(1061.6f, 37.9f, 1060f, 39.7f, 1058.7f, 41.7f)
                lineTo(1058.7f, 35.1f)
                lineTo(1049.9f, 35.1f)
                lineTo(1049.9f, 77.9f)
                lineTo(1059.1f, 77.9f)
                lineTo(1059.1f, 53.9f)
                curveTo(1059.1f, 51.5f, 1059.4f, 49.5f, 1060.3f, 47.7f)
                curveTo(1061.3f, 45.9f, 1062.5f, 44.6f, 1064f, 43.5f)
                curveTo(1065.6f, 42.6f, 1067.5f, 42f, 1069.7f, 42f)
                curveTo(1071.7f, 42f, 1073.2f, 42.4f, 1074.6f, 43.3f)
                curveTo(1076.1f, 44.2f, 1077f, 45.3f, 1077.7f, 46.8f)
                curveTo(1078.5f, 48.2f, 1078.8f, 50.1f, 1078.8f, 52.1f)
                lineTo(1078.8f, 77.7f)
                lineTo(1088f, 77.7f)
                lineTo(1088f, 51f)
                curveTo(1088.2f, 47.7f, 1087.4f, 44.8f, 1086.1f, 42.2f)
                close()
            }
        }}.build()

        return _FooterGraphicAnonymous!!
    }

@Suppress("ObjectPropertyName")
private var _FooterGraphicAnonymous: ImageVector? = null
