package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation1
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation2
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation3
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation4
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation5
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation6
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation7
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation8
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiRussellsTeapot
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
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField1
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField2
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField3
import io.github.stefanoltmann.app.generated.resources.dlc4PrehistoricMixingField
import io.github.stefanoltmann.app.generated.resources.dlc4PrehistoricOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiCarbonAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiChlorineCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiDlc2CeresField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiDlc2CeresOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiForestyOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiFrozenOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiGasGiantCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiGildedAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiGlimmeringAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiHeliumCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiIceAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiInterstellarIceField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiInterstellarOcean
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiMetallicAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOilyAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOrganicMassField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOxidizedAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOxygenRichAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiRadioactiveAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiRadioactiveGasCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiRockyAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSaltyAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSandyOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSatelliteField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSwampyOreField
import io.github.stefanoltmann.app.generated.resources.temporalTear
import de.stefan_oltmann.oni.model.SpacedOutSpacePOI
import org.jetbrains.compose.resources.StringResource

val SpacedOutSpacePOI.stringResource: StringResource
    get() = when (this) {
        /* Asteroids */
        SpacedOutSpacePOI.SandstoneDefault -> Res.string.asteroidTypeSandstoneDefault
        SpacedOutSpacePOI.CeresBaseGameAsteroid -> Res.string.asteroidTypeCeresBaseGameAsteroid
        SpacedOutSpacePOI.CeresBaseGameShatteredAsteroid -> Res.string.asteroidTypeCeresBaseGameShatteredAsteroid
        SpacedOutSpacePOI.PrehistoricBaseGameAsteroid -> Res.string.asteroidTypePrehistoricBaseGameAsteroid
        SpacedOutSpacePOI.Oceania -> Res.string.asteroidTypeOceania
        SpacedOutSpacePOI.SandstoneFrozen -> Res.string.asteroidTypeSandstoneFrozen
        SpacedOutSpacePOI.ForestLush -> Res.string.asteroidTypeForestLush
        SpacedOutSpacePOI.ForestDefault -> Res.string.asteroidTypeForestDefault
        SpacedOutSpacePOI.Volcanic -> Res.string.asteroidTypeVolcanic
        SpacedOutSpacePOI.Badlands -> Res.string.asteroidTypeBadlands
        SpacedOutSpacePOI.ForestHot -> Res.string.asteroidTypeForestHot
        SpacedOutSpacePOI.Oasis -> Res.string.asteroidTypeOasis
        SpacedOutSpacePOI.VanillaSandstoneDefault -> Res.string.asteroidTypeVanillaSandstoneDefault
        SpacedOutSpacePOI.MediumRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumRadioactiveVanillaWarpPlanet
        SpacedOutSpacePOI.CeresClassicAsteroid -> Res.string.asteroidTypeCeresClassicAsteroid
        SpacedOutSpacePOI.PrehistoricClassicAsteroid -> Res.string.asteroidTypePrehistoricClassicAsteroid
        SpacedOutSpacePOI.MediumSwampy -> Res.string.asteroidTypeMediumSwampy
        SpacedOutSpacePOI.VanillaOceania -> Res.string.asteroidTypeVanillaOceania
        SpacedOutSpacePOI.MediumForestyWasteland -> Res.string.asteroidTypeMediumForestyWasteland
        SpacedOutSpacePOI.VanillaSwampDefault -> Res.string.asteroidTypeVanillaSwampDefault
        SpacedOutSpacePOI.MediumForestyRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumForestyRadioactiveVanillaWarpPlanet
        SpacedOutSpacePOI.VanillaSandstoneFrozen -> Res.string.asteroidTypeVanillaSandstoneFrozen
        SpacedOutSpacePOI.VanillaForestDefault -> Res.string.asteroidTypeVanillaForestDefault
        SpacedOutSpacePOI.MediumSandyRadioactiveVanillaWarpPlanet -> Res.string.asteroidTypeMediumSandyRadioactiveVanillaWarpPlanet
        SpacedOutSpacePOI.VanillaArboria -> Res.string.asteroidTypeVanillaArboria
        SpacedOutSpacePOI.VanillaVolcanic -> Res.string.asteroidTypeVanillaVolcanic
        SpacedOutSpacePOI.VanillaBadlands -> Res.string.asteroidTypeVanillaBadlands
        SpacedOutSpacePOI.VanillaAridio -> Res.string.asteroidTypeVanillaAridio
        SpacedOutSpacePOI.MediumSandySwamp -> Res.string.asteroidTypeMediumSandySwamp
        SpacedOutSpacePOI.VanillaOasis -> Res.string.asteroidTypeVanillaOasis
        SpacedOutSpacePOI.TerraMoonlet -> Res.string.asteroidTypeTerraMoonlet
        SpacedOutSpacePOI.IdealLandingSite -> Res.string.asteroidTypeIdealLandingSite
        SpacedOutSpacePOI.WarpOilySwamp -> Res.string.asteroidTypeWarpOilySwamp
        SpacedOutSpacePOI.WarpOilySandySwamp -> Res.string.asteroidTypeWarpOilySandySwamp
        SpacedOutSpacePOI.RegolithMoonlet -> Res.string.asteroidTypeRegolithMoonlet
        SpacedOutSpacePOI.CeresSpacedOutAsteroid -> Res.string.asteroidTypeCeresSpacedOutAsteroid
        SpacedOutSpacePOI.PrehistoricSpacedOutAsteroid -> Res.string.asteroidTypePrehistoricSpacedOutAsteroid
        SpacedOutSpacePOI.SwampyLandingSite -> Res.string.asteroidTypeSwampyLandingSite
        SpacedOutSpacePOI.OilRichWarpTarget -> Res.string.asteroidTypeOilRichWarpTarget
        SpacedOutSpacePOI.ForestMoonlet -> Res.string.asteroidTypeForestMoonlet
        SpacedOutSpacePOI.SwampMoonlet -> Res.string.asteroidTypeSwampMoonlet
        SpacedOutSpacePOI.MetalHeavyLandingSite -> Res.string.asteroidTypeMetalHeavyLandingSite
        SpacedOutSpacePOI.MiniBadlands -> Res.string.asteroidTypeMiniBadlands
        SpacedOutSpacePOI.MiniMetallicSwampyStart -> Res.string.asteroidTypeMiniMetallicSwampyStart
        SpacedOutSpacePOI.MiniForestFrozenWarp -> Res.string.asteroidTypeMiniForestFrozenWarp
        SpacedOutSpacePOI.MiniFlipped -> Res.string.asteroidTypeMiniFlipped
        SpacedOutSpacePOI.MiniRadioactiveOcean -> Res.string.asteroidTypeMiniRadioactiveOcean
        SpacedOutSpacePOI.MiniBadlandsStart -> Res.string.asteroidTypeMiniBadlandsStart
        SpacedOutSpacePOI.MiniRadioactiveOceanWarp -> Res.string.asteroidTypeMiniRadioactiveOceanWarp
        SpacedOutSpacePOI.MiniMetallicSwampy -> Res.string.asteroidTypeMiniMetallicSwampy
        SpacedOutSpacePOI.MiniForestFrozen -> Res.string.asteroidTypeMiniForestFrozen
        SpacedOutSpacePOI.MiniBadlandsWarp -> Res.string.asteroidTypeMiniBadlandsWarp
        SpacedOutSpacePOI.MiniForestFrozenStart -> Res.string.asteroidTypeMiniForestFrozenStart
        SpacedOutSpacePOI.MiniFlippedStart -> Res.string.asteroidTypeMiniFlippedStart
        SpacedOutSpacePOI.MiniRadioactiveOceanStart -> Res.string.asteroidTypeMiniRadioactiveOceanStart
        SpacedOutSpacePOI.MiniFlippedWarp -> Res.string.asteroidTypeMiniFlippedWarp
        SpacedOutSpacePOI.TundraMoonlet -> Res.string.asteroidTypeTundraMoonlet
        SpacedOutSpacePOI.MarshyMoonlet -> Res.string.asteroidTypeMarshyMoonlet
        SpacedOutSpacePOI.NiobiumMoonlet -> Res.string.asteroidTypeNiobiumMoonlet
        SpacedOutSpacePOI.MooMoonlet -> Res.string.asteroidTypeMooMoonlet
        SpacedOutSpacePOI.WaterMoonlet -> Res.string.asteroidTypeWaterMoonlet
        SpacedOutSpacePOI.MiniRegolithMoonlet -> Res.string.asteroidTypeMiniRegolithMoonlet
        SpacedOutSpacePOI.MixingCeresAsteroid -> Res.string.asteroidTypeMixingCeresAsteroid
        SpacedOutSpacePOI.CeresClassicShatteredAsteroid -> Res.string.asteroidTypeCeresClassicShatteredAsteroid
        SpacedOutSpacePOI.MiniShatteredStartAsteroid -> Res.string.asteroidTypeMiniShatteredStartAsteroid
        SpacedOutSpacePOI.MiniShatteredWarpAsteroid -> Res.string.asteroidTypeMiniShatteredWarpAsteroid
        SpacedOutSpacePOI.MiniShatteredGeoAsteroid -> Res.string.asteroidTypeMiniShatteredGeoAsteroid
        SpacedOutSpacePOI.PrehistoricShatteredBaseGameAsteroid -> Res.string.asteroidTypePrehistoricShatteredBaseGameAsteroid
        SpacedOutSpacePOI.PrehistoricShatteredClassicAsteroid -> Res.string.asteroidTypePrehistoricShatteredClassicAsteroid
        SpacedOutSpacePOI.MixingPrehistoricAsteroid -> Res.string.asteroidTypeMixingPrehistoricAsteroid
        /* Others */
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation1 -> Res.string.artifactSpacePoiGravitasSpaceStation1
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation2 -> Res.string.artifactSpacePoiGravitasSpaceStation2
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation3 -> Res.string.artifactSpacePoiGravitasSpaceStation3
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation4 -> Res.string.artifactSpacePoiGravitasSpaceStation4
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation5 -> Res.string.artifactSpacePoiGravitasSpaceStation5
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation6 -> Res.string.artifactSpacePoiGravitasSpaceStation6
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation7 -> Res.string.artifactSpacePoiGravitasSpaceStation7
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation8 -> Res.string.artifactSpacePoiGravitasSpaceStation8
        SpacedOutSpacePOI.ArtifactSpacePOI_RussellsTeapot -> Res.string.artifactSpacePoiRussellsTeapot
        SpacedOutSpacePOI.HarvestableSpacePOI_CarbonAsteroidField -> Res.string.harvestableSpacePoiCarbonAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_ChlorineCloud -> Res.string.harvestableSpacePoiChlorineCloud
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC2CeresField -> Res.string.harvestableSpacePoiDlc2CeresField
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC2CeresOreField -> Res.string.harvestableSpacePoiDlc2CeresOreField
        SpacedOutSpacePOI.HarvestableSpacePOI_ForestyOreField -> Res.string.harvestableSpacePoiForestyOreField
        SpacedOutSpacePOI.HarvestableSpacePOI_FrozenOreField -> Res.string.harvestableSpacePoiFrozenOreField
        SpacedOutSpacePOI.HarvestableSpacePOI_GasGiantCloud -> Res.string.harvestableSpacePoiGasGiantCloud
        SpacedOutSpacePOI.HarvestableSpacePOI_GildedAsteroidField -> Res.string.harvestableSpacePoiGildedAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_GlimmeringAsteroidField -> Res.string.harvestableSpacePoiGlimmeringAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_HeliumCloud -> Res.string.harvestableSpacePoiHeliumCloud
        SpacedOutSpacePOI.HarvestableSpacePOI_IceAsteroidField -> Res.string.harvestableSpacePoiIceAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_InterstellarIceField -> Res.string.harvestableSpacePoiInterstellarIceField
        SpacedOutSpacePOI.HarvestableSpacePOI_InterstellarOcean -> Res.string.harvestableSpacePoiInterstellarOcean
        SpacedOutSpacePOI.HarvestableSpacePOI_MetallicAsteroidField -> Res.string.harvestableSpacePoiMetallicAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_OilyAsteroidField -> Res.string.harvestableSpacePoiOilyAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_OrganicMassField -> Res.string.harvestableSpacePoiOrganicMassField
        SpacedOutSpacePOI.HarvestableSpacePOI_OxidizedAsteroidField -> Res.string.harvestableSpacePoiOxidizedAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_OxygenRichAsteroidField -> Res.string.harvestableSpacePoiOxygenRichAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_RadioactiveAsteroidField -> Res.string.harvestableSpacePoiRadioactiveAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_RadioactiveGasCloud -> Res.string.harvestableSpacePoiRadioactiveGasCloud
        SpacedOutSpacePOI.HarvestableSpacePOI_RockyAsteroidField -> Res.string.harvestableSpacePoiRockyAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_SaltyAsteroidField -> Res.string.harvestableSpacePoiSaltyAsteroidField
        SpacedOutSpacePOI.HarvestableSpacePOI_SandyOreField -> Res.string.harvestableSpacePoiSandyOreField
        SpacedOutSpacePOI.HarvestableSpacePOI_SatelliteField -> Res.string.harvestableSpacePoiSatelliteField
        SpacedOutSpacePOI.HarvestableSpacePOI_SwampyOreField -> Res.string.harvestableSpacePoiSwampyOreField
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC4PrehistoricMixingField -> Res.string.dlc4PrehistoricMixingField
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC4PrehistoricOreField -> Res.string.dlc4PrehistoricOreField
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC4ImpactorDebrisField1 -> Res.string.dlc4ImpactorDebrisField1
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC4ImpactorDebrisField2 -> Res.string.dlc4ImpactorDebrisField2
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC4ImpactorDebrisField3 -> Res.string.dlc4ImpactorDebrisField3
        SpacedOutSpacePOI.TemporalTear -> Res.string.temporalTear
    }
