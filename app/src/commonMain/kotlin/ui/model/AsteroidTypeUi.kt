package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.asteroidTypeBadlands
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresBaseGameShatteredAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresClassicAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresClassicShatteredAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeCeresSpacedOutAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestHot
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestLush
import io.github.stefanoltmann.app.generated.resources.asteroidTypeForestMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeIdealLandingSite
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMarshyMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumForestyWasteland
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumRadioactiveVanillaWarpPlanet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumSandySwamp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMediumSwampy
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMetalHeavyLandingSite
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniBadlands
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniBadlandsStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniBadlandsWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniFlipped
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniFlippedStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniFlippedWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniForestFrozen
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniForestFrozenStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniForestFrozenWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniMetallicSwampy
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniMetallicSwampyStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRadioactiveOcean
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRadioactiveOceanStart
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRadioactiveOceanWarp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniRegolithMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniShatteredGeoAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniShatteredStartAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMiniShatteredWarpAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMixingCeresAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMixingPrehistoricAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeMooMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeNiobiumMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOasis
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOceania
import io.github.stefanoltmann.app.generated.resources.asteroidTypeOilRichWarpTarget
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricClassicAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricShatteredBaseGameAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricShatteredClassicAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypePrehistoricSpacedOutAsteroid
import io.github.stefanoltmann.app.generated.resources.asteroidTypeRegolithMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSandstoneDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSandstoneFrozen
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSwampMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeSwampyLandingSite
import io.github.stefanoltmann.app.generated.resources.asteroidTypeTerraMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeTundraMoonlet
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaArboria
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaAridio
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaBadlands
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaForestDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaOasis
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaOceania
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaSandstoneDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaSandstoneFrozen
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaSwampDefault
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVanillaVolcanic
import io.github.stefanoltmann.app.generated.resources.asteroidTypeVolcanic
import io.github.stefanoltmann.app.generated.resources.asteroidTypeWarpOilySandySwamp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeWarpOilySwamp
import io.github.stefanoltmann.app.generated.resources.asteroidTypeWaterMoonlet
import model.AsteroidType
import model.AsteroidType.Badlands
import model.AsteroidType.CeresBaseGameAsteroid
import model.AsteroidType.CeresBaseGameShatteredAsteroid
import model.AsteroidType.CeresClassicAsteroid
import model.AsteroidType.CeresClassicShatteredAsteroid
import model.AsteroidType.CeresSpacedOutAsteroid
import model.AsteroidType.ForestDefault
import model.AsteroidType.ForestHot
import model.AsteroidType.ForestLush
import model.AsteroidType.ForestMoonlet
import model.AsteroidType.IdealLandingSite
import model.AsteroidType.MarshyMoonlet
import model.AsteroidType.MediumForestyRadioactiveVanillaWarpPlanet
import model.AsteroidType.MediumForestyWasteland
import model.AsteroidType.MediumRadioactiveVanillaWarpPlanet
import model.AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet
import model.AsteroidType.MediumSandySwamp
import model.AsteroidType.MediumSwampy
import model.AsteroidType.MetalHeavyLandingSite
import model.AsteroidType.MiniBadlands
import model.AsteroidType.MiniBadlandsStart
import model.AsteroidType.MiniBadlandsWarp
import model.AsteroidType.MiniFlipped
import model.AsteroidType.MiniFlippedStart
import model.AsteroidType.MiniFlippedWarp
import model.AsteroidType.MiniForestFrozen
import model.AsteroidType.MiniForestFrozenStart
import model.AsteroidType.MiniForestFrozenWarp
import model.AsteroidType.MiniMetallicSwampy
import model.AsteroidType.MiniMetallicSwampyStart
import model.AsteroidType.MiniRadioactiveOcean
import model.AsteroidType.MiniRadioactiveOceanStart
import model.AsteroidType.MiniRadioactiveOceanWarp
import model.AsteroidType.MiniRegolithMoonlet
import model.AsteroidType.MiniShatteredGeoAsteroid
import model.AsteroidType.MiniShatteredStartAsteroid
import model.AsteroidType.MiniShatteredWarpAsteroid
import model.AsteroidType.MixingCeresAsteroid
import model.AsteroidType.MixingPrehistoricAsteroid
import model.AsteroidType.MooMoonlet
import model.AsteroidType.NiobiumMoonlet
import model.AsteroidType.Oasis
import model.AsteroidType.Oceania
import model.AsteroidType.OilRichWarpTarget
import model.AsteroidType.PrehistoricBaseGameAsteroid
import model.AsteroidType.PrehistoricClassicAsteroid
import model.AsteroidType.PrehistoricShatteredBaseGameAsteroid
import model.AsteroidType.PrehistoricShatteredClassicAsteroid
import model.AsteroidType.PrehistoricSpacedOutAsteroid
import model.AsteroidType.RegolithMoonlet
import model.AsteroidType.SandstoneDefault
import model.AsteroidType.SandstoneFrozen
import model.AsteroidType.SwampMoonlet
import model.AsteroidType.SwampyLandingSite
import model.AsteroidType.TerraMoonlet
import model.AsteroidType.TundraMoonlet
import model.AsteroidType.VanillaArboria
import model.AsteroidType.VanillaAridio
import model.AsteroidType.VanillaBadlands
import model.AsteroidType.VanillaForestDefault
import model.AsteroidType.VanillaOasis
import model.AsteroidType.VanillaOceania
import model.AsteroidType.VanillaSandstoneDefault
import model.AsteroidType.VanillaSandstoneFrozen
import model.AsteroidType.VanillaSwampDefault
import model.AsteroidType.VanillaVolcanic
import model.AsteroidType.Volcanic
import model.AsteroidType.WarpOilySandySwamp
import model.AsteroidType.WarpOilySwamp
import model.AsteroidType.WaterMoonlet
import org.jetbrains.compose.resources.StringResource

val AsteroidType.stringResource: StringResource
    get() = when (this) {
        SandstoneDefault -> Res.string.asteroidTypeSandstoneDefault
        CeresBaseGameAsteroid -> Res.string.asteroidTypeCeresBaseGameAsteroid
        CeresBaseGameShatteredAsteroid -> Res.string.asteroidTypeCeresBaseGameShatteredAsteroid
        PrehistoricBaseGameAsteroid -> Res.string.asteroidTypePrehistoricBaseGameAsteroid
        Oceania -> Res.string.asteroidTypeOceania
        SandstoneFrozen -> Res.string.asteroidTypeSandstoneFrozen
        ForestLush -> Res.string.asteroidTypeForestLush
        ForestDefault -> Res.string.asteroidTypeForestDefault
        Volcanic -> Res.string.asteroidTypeVolcanic
        Badlands -> Res.string.asteroidTypeBadlands
        ForestHot -> Res.string.asteroidTypeForestHot
        Oasis -> Res.string.asteroidTypeOasis
        VanillaSandstoneDefault -> Res.string.asteroidTypeVanillaSandstoneDefault
        MediumRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumRadioactiveVanillaWarpPlanet
        CeresClassicAsteroid -> Res.string.asteroidTypeCeresClassicAsteroid
        PrehistoricClassicAsteroid -> Res.string.asteroidTypePrehistoricClassicAsteroid
        MediumSwampy -> Res.string.asteroidTypeMediumSwampy
        VanillaOceania -> Res.string.asteroidTypeVanillaOceania
        MediumForestyWasteland -> Res.string.asteroidTypeMediumForestyWasteland
        VanillaSwampDefault -> Res.string.asteroidTypeVanillaSwampDefault
        MediumForestyRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet
        VanillaSandstoneFrozen -> Res.string.asteroidTypeVanillaSandstoneFrozen
        VanillaForestDefault -> Res.string.asteroidTypeVanillaForestDefault
        MediumSandyRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet
        VanillaArboria -> Res.string.asteroidTypeVanillaArboria
        VanillaVolcanic -> Res.string.asteroidTypeVanillaVolcanic
        VanillaBadlands -> Res.string.asteroidTypeVanillaBadlands
        VanillaAridio -> Res.string.asteroidTypeVanillaAridio
        MediumSandySwamp -> Res.string.asteroidTypeMediumSandySwamp
        VanillaOasis -> Res.string.asteroidTypeVanillaOasis
        TerraMoonlet -> Res.string.asteroidTypeTerraMoonlet
        IdealLandingSite -> Res.string.asteroidTypeIdealLandingSite
        WarpOilySwamp -> Res.string.asteroidTypeWarpOilySwamp
        WarpOilySandySwamp -> Res.string.asteroidTypeWarpOilySandySwamp
        RegolithMoonlet -> Res.string.asteroidTypeRegolithMoonlet
        CeresSpacedOutAsteroid -> Res.string.asteroidTypeCeresSpacedOutAsteroid
        PrehistoricSpacedOutAsteroid -> Res.string.asteroidTypePrehistoricSpacedOutAsteroid
        SwampyLandingSite -> Res.string.asteroidTypeSwampyLandingSite
        OilRichWarpTarget -> Res.string.asteroidTypeOilRichWarpTarget
        ForestMoonlet -> Res.string.asteroidTypeForestMoonlet
        SwampMoonlet -> Res.string.asteroidTypeSwampMoonlet
        MetalHeavyLandingSite -> Res.string.asteroidTypeMetalHeavyLandingSite
        MiniBadlands -> Res.string.asteroidTypeMiniBadlands
        MiniMetallicSwampyStart -> Res.string.asteroidTypeMiniMetallicSwampyStart
        MiniForestFrozenWarp -> Res.string.asteroidTypeMiniForestFrozenWarp
        MiniFlipped -> Res.string.asteroidTypeMiniFlipped
        MiniRadioactiveOcean -> Res.string.asteroidTypeMiniRadioactiveOcean
        MiniBadlandsStart -> Res.string.asteroidTypeMiniBadlandsStart
        MiniRadioactiveOceanWarp -> Res.string.asteroidTypeMiniRadioactiveOceanWarp
        MiniMetallicSwampy -> Res.string.asteroidTypeMiniMetallicSwampy
        MiniForestFrozen -> Res.string.asteroidTypeMiniForestFrozen
        MiniBadlandsWarp -> Res.string.asteroidTypeMiniBadlandsWarp
        MiniForestFrozenStart -> Res.string.asteroidTypeMiniForestFrozenStart
        MiniFlippedStart -> Res.string.asteroidTypeMiniFlippedStart
        MiniRadioactiveOceanStart -> Res.string.asteroidTypeMiniRadioactiveOceanStart
        MiniFlippedWarp -> Res.string.asteroidTypeMiniFlippedWarp
        TundraMoonlet -> Res.string.asteroidTypeTundraMoonlet
        MarshyMoonlet -> Res.string.asteroidTypeMarshyMoonlet
        NiobiumMoonlet -> Res.string.asteroidTypeNiobiumMoonlet
        MooMoonlet -> Res.string.asteroidTypeMooMoonlet
        WaterMoonlet -> Res.string.asteroidTypeWaterMoonlet
        MiniRegolithMoonlet -> Res.string.asteroidTypeMiniRegolithMoonlet
        MixingCeresAsteroid -> Res.string.asteroidTypeMixingCeresAsteroid
        CeresClassicShatteredAsteroid -> Res.string.asteroidTypeCeresClassicShatteredAsteroid
        MiniShatteredStartAsteroid -> Res.string.asteroidTypeMiniShatteredStartAsteroid
        MiniShatteredWarpAsteroid -> Res.string.asteroidTypeMiniShatteredWarpAsteroid
        MiniShatteredGeoAsteroid -> Res.string.asteroidTypeMiniShatteredGeoAsteroid
        PrehistoricShatteredBaseGameAsteroid -> Res.string.asteroidTypePrehistoricShatteredBaseGameAsteroid
        PrehistoricShatteredClassicAsteroid -> Res.string.asteroidTypePrehistoricShatteredClassicAsteroid
        MixingPrehistoricAsteroid -> Res.string.asteroidTypeMixingPrehistoricAsteroid
    }
