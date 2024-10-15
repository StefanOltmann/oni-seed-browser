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
    val displayName: String,
    val color: Color
) {

    /*
     * Ordered by how they should appear in the biome list.
     */

    /** Default starting area, should always come first. */
    Sandstone(3, "Sandstone", Color(0xFFF2BB47)),
    Barren(16, "Barren", Color(0xFF97752C)),

    Space(7, "Space", Color(0xFF242424)),

    FrozenWastes(0, "Tundra", Color(0xFF9DC9D6)),
    // CrystalCaverns(1, Color(0xFFAC72C1)),
    BoggyMarsh(2, "Marsh", Color(0xFF7B974B)),
    ToxicJungle(4, "Jungle", Color(0xFFCB95A3)),

    Ocean(8, "Ocean", Color(0xFF4C4CFF)),
    Rust(9, "Rust", Color(0xFFFFA007)),
    Forest(10, "Forest", Color(0xFF8EC039)),
    Radioactive(11, "Radioactive", Color(0xFF4AE458)),
    Swamp(12, "Swampy", Color(0xFFEB9B3F)),
    Wasteland(13, "Wasteland", Color(0xFFCC3636)),
    // RocketInterior(14, Color(0xFF9E48DF)),
    Metallic(15, "Metallic", Color(0xFFFFA007)),
    Moo(17, "Moo", Color(0xFF8EC039)),
    IceCaves(18, "Ice Cave", Color(0xFFABCFEA)),
    CarrotQuarry(19, "Cool Pool", Color(0xFFCDA2C7)),
    SugarWoods(20, "Nectar", Color(0xFFA2CDA4)),

    /* Most of the time right above the magma biome. */
    OilField(6, "Oily", Color(0xFF3F1C05)),

    /* Usually at the bottom of the map, so also listed at the bottom */
    MagmaCore(5, "Magma", Color(0xFFDE5A3B)),
}
