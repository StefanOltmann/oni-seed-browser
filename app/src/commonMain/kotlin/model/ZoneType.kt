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
import io.github.stefanoltmann.app.generated.resources.zoneTypePrehistoricGarden
import io.github.stefanoltmann.app.generated.resources.zoneTypePrehistoricRaptor
import io.github.stefanoltmann.app.generated.resources.zoneTypePrehistoricWetlands
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
    val color: Color
) {
    /*
     * Ordered by how they should appear in the biome list.
     */

    /** Default starting area should always come first. */
    Sandstone(3, Color(0xFFF2BB47)),
    Barren(16, Color(0xFF97752C)),

    Space(7, Color(0xFF242424)),

    FrozenWastes(0, Color(0xFF9DC9D6)),

    // CrystalCaverns(1, Color(0xFFAC72C1)),
    BoggyMarsh(2, Color(0xFF7B974B)),
    ToxicJungle(4, Color(0xFFCB95A3)),

    Ocean(8, Color(0xFF4C4CFF)),
    Rust(9, Color(0xFFFFA007)),
    Forest(10, Color(0xFF8EC039)),
    Radioactive(11, Color(0xFF4AE458)),
    Swamp(12, Color(0xFFEB9B3F)),
    Wasteland(13, Color(0xFFCC3636)),

    // RocketInterior(14, Color(0xFF9E48DF)),
    Metallic(15, Color(0xFFFFA007)),
    Moo(17, Color(0xFF8EC039)),

    /* Ceres */
    IceCaves(18, Color(0xFFABCFEA)),
    CarrotQuarry(19, Color(0xFFCDA2C7)),
    SugarWoods(20, Color(0xFFA2CDA4)),

    /* Relica */
    PrehistoricGarden(21, Color(0xFF006127)),
    PrehistoricRaptor(22, Color(0xFF352F8C)),
    PrehistoricWetlands(23, Color(0xFF645906)),

    /* Most of the time right above the magma biome. */
    OilField(6, Color(0xFF52321D)),

    /* Usually at the bottom of the map, so also listed at the bottom */
    MagmaCore(5, Color(0xFFDE5A3B));

    fun getStringResource(): StringResource {
        return when (this) {
            Sandstone -> Res.string.zoneTypeSandstone
            Barren -> Res.string.zoneTypeBarren
            Space -> Res.string.zoneTypeSpace
            FrozenWastes -> Res.string.zoneTypeFrozenWastes
            BoggyMarsh -> Res.string.zoneTypeBoggyMarsh
            ToxicJungle -> Res.string.zoneTypeToxicJungle
            Ocean -> Res.string.zoneTypeOcean
            Rust -> Res.string.zoneTypeRust
            Forest -> Res.string.zoneTypeForest
            Radioactive -> Res.string.zoneTypeRadioactive
            Swamp -> Res.string.zoneTypeSwamp
            Wasteland -> Res.string.zoneTypeWasteland
            Metallic -> Res.string.zoneTypeMetallic
            Moo -> Res.string.zoneTypeMoo
            IceCaves -> Res.string.zoneTypeIceCaves
            CarrotQuarry -> Res.string.zoneTypeCarrotQuarry
            SugarWoods -> Res.string.zoneTypeSugarWoods
            PrehistoricGarden -> Res.string.zoneTypePrehistoricGarden
            PrehistoricRaptor -> Res.string.zoneTypePrehistoricRaptor
            PrehistoricWetlands -> Res.string.zoneTypePrehistoricWetlands
            OilField -> Res.string.zoneTypeOilField
            MagmaCore -> Res.string.zoneTypeMagmaCore
        }
    }
}
