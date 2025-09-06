/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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
 */

package ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color
import model.ZoneType
import model.ZoneType.Barren
import model.ZoneType.BoggyMarsh
import model.ZoneType.CarrotQuarry
import model.ZoneType.Forest
import model.ZoneType.FrozenWastes
import model.ZoneType.IceCaves
import model.ZoneType.MagmaCore
import model.ZoneType.Metallic
import model.ZoneType.Moo
import model.ZoneType.Ocean
import model.ZoneType.OilField
import model.ZoneType.PrehistoricGarden
import model.ZoneType.PrehistoricRaptor
import model.ZoneType.PrehistoricWetlands
import model.ZoneType.Radioactive
import model.ZoneType.Rust
import model.ZoneType.Sandstone
import model.ZoneType.Space
import model.ZoneType.SugarWoods
import model.ZoneType.Swamp
import model.ZoneType.ToxicJungle
import model.ZoneType.Wasteland

val lightGray = Color(0xFFF2F2F2)

val anthracite = Color(0xFF222529)
val surfaceColor = Color(0xFF383a3e)
val surfaceVariantColor = Color(0xFF424346)
val surfaceTint = Color(0xFF4d4d4d)

val gray3 = Color(0xFF545454)

//val darkRed = Color(0xFFA62D2D)
//val darkGreen = Color(0xFF437E3D)

val ctaColor = Color.Blue

val hoverColor = Color.Yellow

val lightGrayTransparentBorderColor = lightGray.copy(alpha = 0.5f)
val anthraticeTransparentBackgroundColor = anthracite.copy(alpha = 0.7f)

val cardColorBackground = surfaceTint.copy(alpha = 0.5f)

val appColorScheme = darkColorScheme(
    background = anthracite,
    surface = surfaceColor,
    onSurfaceVariant = surfaceVariantColor,
    surfaceTint = surfaceTint,
    primary = Color(0xFF72bcd4)
)

fun getZoneColor(zoneType: ZoneType): Color {
    return when (zoneType) {
        Sandstone -> Color(0xFFF2BB47)
        Barren -> Color(0xFF97752C)
        Space -> Color(0xFF242424)
        FrozenWastes -> Color(0xFF9DC9D6)
        BoggyMarsh -> Color(0xFF7B974B)
        ToxicJungle -> Color(0xFFCB95A3)
        Ocean -> Color(0xFF4C4CFF)
        Rust -> Color(0xFFFFA007)
        Forest -> Color(0xFF8EC039)
        Radioactive -> Color(0xFF4AE458)
        Swamp -> Color(0xFFEB9B3F)
        Wasteland -> Color(0xFFCC3636)
        Metallic -> Color(0xFFFFA007)
        Moo -> Color(0xFF8EC039)
        IceCaves -> Color(0xFFABCFEA)
        CarrotQuarry -> Color(0xFFCDA2C7)
        SugarWoods -> Color(0xFFA2CDA4)
        PrehistoricGarden -> Color(0xFF006127)
        PrehistoricRaptor -> Color(0xFF352F8C)
        PrehistoricWetlands -> Color(0xFF645906)
        OilField -> Color(0xFF52321D)
        MagmaCore -> Color(0xFFDE5A3B)
    }
}
