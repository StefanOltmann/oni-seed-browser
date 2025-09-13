package ui.model

import androidx.compose.ui.graphics.Color
import de.stefan_oltmann.oni.model.WorldTrait
import de.stefan_oltmann.oni.model.WorldTrait.BouldersLarge
import de.stefan_oltmann.oni.model.WorldTrait.BouldersMedium
import de.stefan_oltmann.oni.model.WorldTrait.BouldersMixed
import de.stefan_oltmann.oni.model.WorldTrait.BouldersSmall
import de.stefan_oltmann.oni.model.WorldTrait.CrashedSatellites
import de.stefan_oltmann.oni.model.WorldTrait.DeepOil
import de.stefan_oltmann.oni.model.WorldTrait.DistressSignal
import de.stefan_oltmann.oni.model.WorldTrait.FrozenCore
import de.stefan_oltmann.oni.model.WorldTrait.GeoActive
import de.stefan_oltmann.oni.model.WorldTrait.GeoDormant
import de.stefan_oltmann.oni.model.WorldTrait.Geodes
import de.stefan_oltmann.oni.model.WorldTrait.GlaciersLarge
import de.stefan_oltmann.oni.model.WorldTrait.IrregularOil
import de.stefan_oltmann.oni.model.WorldTrait.LushCore
import de.stefan_oltmann.oni.model.WorldTrait.MagmaVents
import de.stefan_oltmann.oni.model.WorldTrait.MetalCaves
import de.stefan_oltmann.oni.model.WorldTrait.MetalPoor
import de.stefan_oltmann.oni.model.WorldTrait.MetalRich
import de.stefan_oltmann.oni.model.WorldTrait.MisalignedStart
import de.stefan_oltmann.oni.model.WorldTrait.RadioactiveCrust
import de.stefan_oltmann.oni.model.WorldTrait.SlimeSplats
import de.stefan_oltmann.oni.model.WorldTrait.SubsurfaceOcean
import de.stefan_oltmann.oni.model.WorldTrait.Volcanoes
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersLarge
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersMedium
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersMixed
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersSmall
import io.github.stefanoltmann.app.generated.resources.worldTraitCrashedSatellites
import io.github.stefanoltmann.app.generated.resources.worldTraitDeepOil
import io.github.stefanoltmann.app.generated.resources.worldTraitDistressSignal
import io.github.stefanoltmann.app.generated.resources.worldTraitFrozenCore
import io.github.stefanoltmann.app.generated.resources.worldTraitGeoActive
import io.github.stefanoltmann.app.generated.resources.worldTraitGeoDormant
import io.github.stefanoltmann.app.generated.resources.worldTraitGeodes
import io.github.stefanoltmann.app.generated.resources.worldTraitGlaciersLarge
import io.github.stefanoltmann.app.generated.resources.worldTraitIrregularOil
import io.github.stefanoltmann.app.generated.resources.worldTraitLushCore
import io.github.stefanoltmann.app.generated.resources.worldTraitMagmaVents
import io.github.stefanoltmann.app.generated.resources.worldTraitMetalCaves
import io.github.stefanoltmann.app.generated.resources.worldTraitMetalPoor
import io.github.stefanoltmann.app.generated.resources.worldTraitMetalRich
import io.github.stefanoltmann.app.generated.resources.worldTraitMisalignedStart
import io.github.stefanoltmann.app.generated.resources.worldTraitRadioactiveCrust
import io.github.stefanoltmann.app.generated.resources.worldTraitSlimeSplats
import io.github.stefanoltmann.app.generated.resources.worldTraitSubsurfaceOcean
import io.github.stefanoltmann.app.generated.resources.worldTraitVolcanoes
import org.jetbrains.compose.resources.StringResource

val WorldTrait.stringResource: StringResource
    get() = when (this) {
        BouldersLarge -> Res.string.worldTraitBouldersLarge
        BouldersMedium -> Res.string.worldTraitBouldersMedium
        BouldersMixed -> Res.string.worldTraitBouldersMixed
        BouldersSmall -> Res.string.worldTraitBouldersSmall
        DeepOil -> Res.string.worldTraitDeepOil
        FrozenCore -> Res.string.worldTraitFrozenCore
        GeoActive -> Res.string.worldTraitGeoActive
        Geodes -> Res.string.worldTraitGeodes
        GeoDormant -> Res.string.worldTraitGeoDormant
        GlaciersLarge -> Res.string.worldTraitGlaciersLarge
        IrregularOil -> Res.string.worldTraitIrregularOil
        MagmaVents -> Res.string.worldTraitMagmaVents
        MetalPoor -> Res.string.worldTraitMetalPoor
        MetalRich -> Res.string.worldTraitMetalRich
        MisalignedStart -> Res.string.worldTraitMisalignedStart
        SlimeSplats -> Res.string.worldTraitSlimeSplats
        SubsurfaceOcean -> Res.string.worldTraitSubsurfaceOcean
        Volcanoes -> Res.string.worldTraitVolcanoes
        CrashedSatellites -> Res.string.worldTraitCrashedSatellites
        DistressSignal -> Res.string.worldTraitDistressSignal
        LushCore -> Res.string.worldTraitLushCore
        MetalCaves -> Res.string.worldTraitMetalCaves
        RadioactiveCrust -> Res.string.worldTraitRadioactiveCrust
    }

val WorldTrait.color: Color
    get() = when (this) {
        BouldersLarge, BouldersMedium, BouldersMixed, BouldersSmall -> Color(0xFFBDBDBD)
        DeepOil -> Color(0xFF6E6E6E)
        FrozenCore, GlaciersLarge -> Color(0xFFA1D6ED)
        GeoActive -> Color(0xFFECA649)
        Geodes -> Color(0xFFC47BF4)
        GeoDormant, DistressSignal -> Color(0xFF8895A1)
        IrregularOil -> Color(0xFF6C6C6C)
        MagmaVents, Volcanoes -> Color(0xFFE7544D)
        MetalPoor -> Color(0xFF8794A0)
        MetalRich, MetalCaves -> Color(0xFFD2AB4B)
        MisalignedStart -> Color(0xFFE7DC93)
        SlimeSplats -> Color(0xFF8EB542)
        SubsurfaceOcean -> Color(0xFF61CEF0)
        CrashedSatellites, RadioactiveCrust -> Color(0xFF7ED360)
        LushCore -> Color(0xFF66A052)
    }
