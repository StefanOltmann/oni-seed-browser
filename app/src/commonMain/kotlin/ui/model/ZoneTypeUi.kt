package ui.model

import androidx.compose.ui.graphics.Color
import de.stefan_oltmann.oni.model.ZoneType
import de.stefan_oltmann.oni.model.ZoneType.Barren
import de.stefan_oltmann.oni.model.ZoneType.BoggyMarsh
import de.stefan_oltmann.oni.model.ZoneType.CarrotQuarry
import de.stefan_oltmann.oni.model.ZoneType.Forest
import de.stefan_oltmann.oni.model.ZoneType.FrozenWastes
import de.stefan_oltmann.oni.model.ZoneType.IceCaves
import de.stefan_oltmann.oni.model.ZoneType.MagmaCore
import de.stefan_oltmann.oni.model.ZoneType.Metallic
import de.stefan_oltmann.oni.model.ZoneType.Moo
import de.stefan_oltmann.oni.model.ZoneType.Ocean
import de.stefan_oltmann.oni.model.ZoneType.OilField
import de.stefan_oltmann.oni.model.ZoneType.PrehistoricGarden
import de.stefan_oltmann.oni.model.ZoneType.PrehistoricRaptor
import de.stefan_oltmann.oni.model.ZoneType.PrehistoricWetlands
import de.stefan_oltmann.oni.model.ZoneType.Radioactive
import de.stefan_oltmann.oni.model.ZoneType.Rust
import de.stefan_oltmann.oni.model.ZoneType.Sandstone
import de.stefan_oltmann.oni.model.ZoneType.Space
import de.stefan_oltmann.oni.model.ZoneType.SugarWoods
import de.stefan_oltmann.oni.model.ZoneType.Swamp
import de.stefan_oltmann.oni.model.ZoneType.ToxicJungle
import de.stefan_oltmann.oni.model.ZoneType.Wasteland
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
import org.jetbrains.compose.resources.StringResource

val ZoneType.stringResource: StringResource
    get() = when (this) {
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

val ZoneType.color: Color
    get() = when (this) {
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
