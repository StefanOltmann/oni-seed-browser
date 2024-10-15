/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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

package model

import androidx.compose.ui.graphics.Color
import kotlinx.serialization.Serializable

@Suppress("UNUSED")
@Serializable
enum class ZoneType(
    val id: Int,
    val color: Color
) {

    FrozenWastes(0, Color(0xFF9DC9D6)),
    // CrystalCaverns(1, Color(0xFFAC72C1)),
    BoggyMarsh(2, Color(0xFF7B974B)),
    Sandstone(3, Color(0xFFF2BB47)),
    ToxicJungle(4, Color(0xFFCB95A3)),
    MagmaCore(5, Color(0xFFDE5A3B)),
    OilField(6, Color(0xFF3F1C05)),
    Space(7, Color(0xFF242424)),
    Ocean(8, Color(0xFFD39898)),
    Rust(9, Color(0xFFFFA007)),
    Forest(10, Color(0xFF8EC039)),
    Radioactive(11, Color(0xFF4AE458)),
    Swamp(12, Color(0xFFEB9B3F)),
    Wasteland(13, Color(0xFFCC3636)),

    // RocketInterior(14, Color(0xFF9E48DF)),
    Metallic(15, Color(0xFFFFA007)),
    Barren(16, Color(0xFFF2BB47)),
    Moo(17, Color(0xFF8EC039)),
    IceCaves(18, Color(0xFFABCFEA)),
    CarrotQuarry(19, Color(0xFFCDA2C7)),
    SugarWoods(20, Color(0xFFA2CDA4))
}
