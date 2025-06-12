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

package model

import androidx.compose.ui.graphics.Color
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.zoneTypeBarren
import io.github.stefanoltmann.app.generated.resources.zoneTypeBoggyMarsh
import io.github.stefanoltmann.app.generated.resources.zoneTypeCarrotQuarry
import io.github.stefanoltmann.app.generated.resources.zoneTypeForest
import io.github.stefanoltmann.app.generated.resources.zoneTypeFrozenWastes
import io.github.stefanoltmann.app.generated.resources.zoneTypeIceCaves
import io.github.stefanoltmann.app.generated.resources.zoneTypeMagmaCore
import io.github.stefanoltmann.app.generated.resources.zoneTypeMetallic
import io.github.stefanoltmann.app.generated.resources.zoneTypeMoo
import io.github.stefanoltmann.app.generated.resources.zoneTypeOcean
import io.github.stefanoltmann.app.generated.resources.zoneTypeOilField
import io.github.stefanoltmann.app.generated.resources.zoneTypeRadioactive
import io.github.stefanoltmann.app.generated.resources.zoneTypeRust
import io.github.stefanoltmann.app.generated.resources.zoneTypeSandstone
import io.github.stefanoltmann.app.generated.resources.zoneTypeSpace
import io.github.stefanoltmann.app.generated.resources.zoneTypeSugarWoods
import io.github.stefanoltmann.app.generated.resources.zoneTypeSwamp
import io.github.stefanoltmann.app.generated.resources.zoneTypeToxicJungle
import io.github.stefanoltmann.app.generated.resources.zoneTypeWasteland
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

@Suppress("UNUSED")
@Serializable
enum class ZoneType(
    val id: Int,
    val stringResource: StringResource,
    val color: Color
) {
    /*
     * Ordered by how they should appear in the biome list.
     */

    /** Default starting area, should always come first. */
    Sandstone(3, Res.string.zoneTypeSandstone, Color(0xFFF2BB47)),
    Barren(16, Res.string.zoneTypeBarren, Color(0xFF97752C)),

    Space(7, Res.string.zoneTypeSpace, Color(0xFF242424)),

    FrozenWastes(0, Res.string.zoneTypeFrozenWastes, Color(0xFF9DC9D6)),

    // CrystalCaverns(1Res.string. zoneType//(0xFFAC72C1)),
    BoggyMarsh(2, Res.string.zoneTypeBoggyMarsh, Color(0xFF7B974B)),
    ToxicJungle(4, Res.string.zoneTypeToxicJungle, Color(0xFFCB95A3)),

    Ocean(8, Res.string.zoneTypeOcean, Color(0xFF4C4CFF)),
    Rust(9, Res.string.zoneTypeRust, Color(0xFFFFA007)),
    Forest(10, Res.string.zoneTypeForest, Color(0xFF8EC039)),
    Radioactive(11, Res.string.zoneTypeRadioactive, Color(0xFF4AE458)),
    Swamp(12, Res.string.zoneTypeSwamp, Color(0xFFEB9B3F)),
    Wasteland(13, Res.string.zoneTypeWasteland, Color(0xFFCC3636)),

    // RocketInterior(1Res.string. zoneType//,Color(0xFF9E48DF)),
    Metallic(15, Res.string.zoneTypeMetallic, Color(0xFFFFA007)),
    Moo(17, Res.string.zoneTypeMoo, Color(0xFF8EC039)),
    IceCaves(18, Res.string.zoneTypeIceCaves, Color(0xFFABCFEA)),
    CarrotQuarry(19, Res.string.zoneTypeCarrotQuarry, Color(0xFFCDA2C7)),
    SugarWoods(20, Res.string.zoneTypeSugarWoods, Color(0xFFA2CDA4)),

//    PrehistoricGarden,
//    PrehistoricRaptor,
//    PrehistoricWetlands

    /* Most of the time right above the magma biome. */
    OilField(6, Res.string.zoneTypeOilField, Color(0xFF52321D)),

    /* Usually at the bottom of the map, so also listed at the bottom */
    MagmaCore(5, Res.string.zoneTypeMagmaCore, Color(0xFFDE5A3B)),
}
