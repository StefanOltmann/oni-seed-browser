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
import de.stefan_oltmann.oni.model.AsteroidType
import de.stefan_oltmann.oni.model.AsteroidType.Badlands
import de.stefan_oltmann.oni.model.AsteroidType.CeresBaseGameAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.CeresBaseGameShatteredAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.CeresClassicAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.CeresClassicShatteredAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.CeresSpacedOutAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.ForestDefault
import de.stefan_oltmann.oni.model.AsteroidType.ForestHot
import de.stefan_oltmann.oni.model.AsteroidType.ForestLush
import de.stefan_oltmann.oni.model.AsteroidType.ForestMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.IdealLandingSite
import de.stefan_oltmann.oni.model.AsteroidType.MarshyMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.MediumForestyRadioactiveVanillaWarpPlanet
import de.stefan_oltmann.oni.model.AsteroidType.MediumForestyWasteland
import de.stefan_oltmann.oni.model.AsteroidType.MediumRadioactiveVanillaWarpPlanet
import de.stefan_oltmann.oni.model.AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet
import de.stefan_oltmann.oni.model.AsteroidType.MediumSandySwamp
import de.stefan_oltmann.oni.model.AsteroidType.MediumSwampy
import de.stefan_oltmann.oni.model.AsteroidType.MetalHeavyLandingSite
import de.stefan_oltmann.oni.model.AsteroidType.MiniBadlands
import de.stefan_oltmann.oni.model.AsteroidType.MiniBadlandsStart
import de.stefan_oltmann.oni.model.AsteroidType.MiniBadlandsWarp
import de.stefan_oltmann.oni.model.AsteroidType.MiniFlipped
import de.stefan_oltmann.oni.model.AsteroidType.MiniFlippedStart
import de.stefan_oltmann.oni.model.AsteroidType.MiniFlippedWarp
import de.stefan_oltmann.oni.model.AsteroidType.MiniForestFrozen
import de.stefan_oltmann.oni.model.AsteroidType.MiniForestFrozenStart
import de.stefan_oltmann.oni.model.AsteroidType.MiniForestFrozenWarp
import de.stefan_oltmann.oni.model.AsteroidType.MiniMetallicSwampy
import de.stefan_oltmann.oni.model.AsteroidType.MiniMetallicSwampyStart
import de.stefan_oltmann.oni.model.AsteroidType.MiniRadioactiveOcean
import de.stefan_oltmann.oni.model.AsteroidType.MiniRadioactiveOceanStart
import de.stefan_oltmann.oni.model.AsteroidType.MiniRadioactiveOceanWarp
import de.stefan_oltmann.oni.model.AsteroidType.MiniRegolithMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.MiniShatteredGeoAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.MiniShatteredStartAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.MiniShatteredWarpAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.MixingCeresAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.MixingPrehistoricAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.MooMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.NiobiumMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.Oasis
import de.stefan_oltmann.oni.model.AsteroidType.Oceania
import de.stefan_oltmann.oni.model.AsteroidType.OilRichWarpTarget
import de.stefan_oltmann.oni.model.AsteroidType.PrehistoricBaseGameAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.PrehistoricClassicAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.PrehistoricShatteredBaseGameAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.PrehistoricShatteredClassicAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.PrehistoricSpacedOutAsteroid
import de.stefan_oltmann.oni.model.AsteroidType.RegolithMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.SandstoneDefault
import de.stefan_oltmann.oni.model.AsteroidType.SandstoneFrozen
import de.stefan_oltmann.oni.model.AsteroidType.SwampMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.SwampyLandingSite
import de.stefan_oltmann.oni.model.AsteroidType.TerraMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.TundraMoonlet
import de.stefan_oltmann.oni.model.AsteroidType.VanillaArboria
import de.stefan_oltmann.oni.model.AsteroidType.VanillaAridio
import de.stefan_oltmann.oni.model.AsteroidType.VanillaBadlands
import de.stefan_oltmann.oni.model.AsteroidType.VanillaForestDefault
import de.stefan_oltmann.oni.model.AsteroidType.VanillaOasis
import de.stefan_oltmann.oni.model.AsteroidType.VanillaOceania
import de.stefan_oltmann.oni.model.AsteroidType.VanillaSandstoneDefault
import de.stefan_oltmann.oni.model.AsteroidType.VanillaSandstoneFrozen
import de.stefan_oltmann.oni.model.AsteroidType.VanillaSwampDefault
import de.stefan_oltmann.oni.model.AsteroidType.VanillaVolcanic
import de.stefan_oltmann.oni.model.AsteroidType.Volcanic
import de.stefan_oltmann.oni.model.AsteroidType.WarpOilySandySwamp
import de.stefan_oltmann.oni.model.AsteroidType.WarpOilySwamp
import de.stefan_oltmann.oni.model.AsteroidType.WaterMoonlet
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
