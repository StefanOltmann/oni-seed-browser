package ui

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
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseArboria
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseAridio
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseBlastedCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseOasisse
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseOceania
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseRelica
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseRelicaLab
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseRime
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseTerra
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseTheBadlands
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseVerdante
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseVolcanea
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcArboria
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcAridio
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcBlastedCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcCeresMantle
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcCeresMinor
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcFlippedMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcFolia
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcFrozenForestMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcMetallicSwampyMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcOasisse
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcOceania
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcQuagmiris
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRadioactiveOceanMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRelica
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRelicaLab
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRelicaMinor
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRime
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcSquelchy
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTerra
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTerrania
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTheBadlands
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTheDesolandsMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcVerdante
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcVolcanea
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField1
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField2
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField3
import io.github.stefanoltmann.app.generated.resources.dlc4PrehistoricMixingField
import io.github.stefanoltmann.app.generated.resources.dlc4PrehistoricOreField
import io.github.stefanoltmann.app.generated.resources.gameModeBaseGameStandard
import io.github.stefanoltmann.app.generated.resources.gameModeSpacedOutClassic
import io.github.stefanoltmann.app.generated.resources.gameModeSpacedOutSpacedOut
import io.github.stefanoltmann.app.generated.resources.gameModeTheLab
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
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeAntiEntropyThermoNullifier
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeArtifact
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeCeresTechUnlock
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeCrashedSatellite
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeCrushedSatellite
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeCryotank3000
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeExperiment52B
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeGeothermalControllerEntity
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeGeothermalVentEntity
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeNeuralVacillator
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypePrintingPod
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypePropFacilityStatue
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeSupplyTeleporterInput
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeSupplyTeleporterOutput
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeTeleporterReceiver
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeTeleporterTransmitter
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeTemporalTearOpener
import io.github.stefanoltmann.app.generated.resources.pointOfInterestTypeWreckedSatellite
import io.github.stefanoltmann.app.generated.resources.temporalTear
import io.github.stefanoltmann.app.generated.resources.uiGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiGoodGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiWorldTrait
import io.github.stefanoltmann.app.generated.resources.uiZoneType
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiCarbonaceousAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiChlorinePlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDLC2CeresSpaceDestination
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDLC4PrehistoricSpaceDestination
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDustyMoon
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiEarth
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiForestPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiGasGiant
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiGoldAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiHeliumGiant
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiIceGiant
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiIcyDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiMetallicAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiOilyAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiOrganicDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiRedDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiRockyAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiRustPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiSaltDesertPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiSaltDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiSatellite
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiShinyPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiTerraPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiVolcanoPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiWormhole
import model.ClusterType
import model.PointOfInterestType
import model.SpacedOutSpacePOI
import model.VanillaSpacePOI
import model.filter.FilterItemType
import model.filter.GameModeType
import org.jetbrains.compose.resources.StringResource

fun getStringResource(filterItemType: FilterItemType): StringResource =
    when (filterItemType) {
        FilterItemType.WORLD_TRAIT -> Res.string.uiWorldTrait
        FilterItemType.ZONE_TYPE -> Res.string.uiZoneType
        FilterItemType.GEYSER_COUNT -> Res.string.uiGeyserCount
        FilterItemType.GOOD_GEYSER_COUNT -> Res.string.uiGoodGeyserCount
    }

fun getStringResource(gameModeType: GameModeType): StringResource =
    when (gameModeType) {
        GameModeType.BASEGAME_STANDARD -> Res.string.gameModeBaseGameStandard
        GameModeType.BASEGAME_THELAB -> Res.string.gameModeTheLab
        GameModeType.SPACEDOUT_CLASSIC -> Res.string.gameModeSpacedOutClassic
        GameModeType.SPACEDOUT_SPACEDOUT -> Res.string.gameModeSpacedOutSpacedOut
        GameModeType.SPACEDOUT_THELAB -> Res.string.gameModeTheLab
    }

fun getStringResource(clusterType: ClusterType): StringResource =
    when (clusterType) {
        ClusterType.BASE_TERRA -> Res.string.clusterTypeBaseTerra
        ClusterType.BASE_CERES -> Res.string.clusterTypeBaseCeres
        ClusterType.BASE_BLASTED_CERES -> Res.string.clusterTypeBaseBlastedCeres
        ClusterType.BASE_RELICA -> Res.string.clusterTypeBaseRelica
        ClusterType.BASE_RELICA_LAB -> Res.string.clusterTypeBaseRelicaLab
        ClusterType.BASE_OCEANIA -> Res.string.clusterTypeBaseOceania
        ClusterType.BASE_RIME -> Res.string.clusterTypeBaseRime
        ClusterType.BASE_VERDANTE -> Res.string.clusterTypeBaseVerdante
        ClusterType.BASE_ARBORIA -> Res.string.clusterTypeBaseArboria
        ClusterType.BASE_VOLCANEA -> Res.string.clusterTypeBaseVolcanea
        ClusterType.BASE_THE_BADLANDS -> Res.string.clusterTypeBaseTheBadlands
        ClusterType.BASE_ARIDIO -> Res.string.clusterTypeBaseAridio
        ClusterType.BASE_OASISSE -> Res.string.clusterTypeBaseOasisse
        ClusterType.DLC_TERRA -> Res.string.clusterTypeDlcTerra
        ClusterType.DLC_CERES -> Res.string.clusterTypeDlcCeres
        ClusterType.DLC_BLASTED_CERES -> Res.string.clusterTypeDlcBlastedCeres
        ClusterType.DLC_RELICA -> Res.string.clusterTypeDlcRelica
        ClusterType.DLC_RELICA_LAB -> Res.string.clusterTypeDlcRelicaLab
        ClusterType.DLC_OCEANIA -> Res.string.clusterTypeDlcOceania
        ClusterType.DLC_SQUELCHY -> Res.string.clusterTypeDlcSquelchy
        ClusterType.DLC_RIME -> Res.string.clusterTypeDlcRime
        ClusterType.DLC_VERDANTE -> Res.string.clusterTypeDlcVerdante
        ClusterType.DLC_ARBORIA -> Res.string.clusterTypeDlcArboria
        ClusterType.DLC_VOLCANEA -> Res.string.clusterTypeDlcVolcanea
        ClusterType.DLC_THE_BADLANDS -> Res.string.clusterTypeDlcTheBadlands
        ClusterType.DLC_ARIDIO -> Res.string.clusterTypeDlcAridio
        ClusterType.DLC_OASISSE -> Res.string.clusterTypeDlcOasisse
        ClusterType.DLC_TERRANIA -> Res.string.clusterTypeDlcTerrania
        ClusterType.DLC_CERES_MINOR -> Res.string.clusterTypeDlcCeresMinor
        ClusterType.DLC_RELICA_MINOR -> Res.string.clusterTypeDlcRelicaMinor
        ClusterType.DLC_FOLIA -> Res.string.clusterTypeDlcFolia
        ClusterType.DLC_QUAGMIRIS -> Res.string.clusterTypeDlcQuagmiris
        ClusterType.DLC_METALLIC_SWAMPY_MOONLET -> Res.string.clusterTypeDlcMetallicSwampyMoonlet
        ClusterType.DLC_THE_DESOLANDS_MOONLET -> Res.string.clusterTypeDlcTheDesolandsMoonlet
        ClusterType.DLC_FROZEN_FOREST_MOONLET -> Res.string.clusterTypeDlcFrozenForestMoonlet
        ClusterType.DLC_FLIPPED_MOONLET -> Res.string.clusterTypeDlcFlippedMoonlet
        ClusterType.DLC_RADIOACTIVE_OCEAN_MOONLET -> Res.string.clusterTypeDlcRadioactiveOceanMoonlet
        ClusterType.DLC_CERES_MANTLE -> Res.string.clusterTypeDlcCeresMantle
    }

fun getStringResource(pointOfInterestType: PointOfInterestType): StringResource =
    when (pointOfInterestType) {
        PointOfInterestType.PRINTING_POD -> Res.string.pointOfInterestTypePrintingPod
        PointOfInterestType.SUPPLY_TELEPORTER_INPUT -> Res.string.pointOfInterestTypeSupplyTeleporterInput
        PointOfInterestType.SUPPLY_TELEPORTER_OUTPUT -> Res.string.pointOfInterestTypeSupplyTeleporterOutput
        PointOfInterestType.TELEPORTER_TRANSMITTER -> Res.string.pointOfInterestTypeTeleporterTransmitter
        PointOfInterestType.TELEPORTER_RECEIVER -> Res.string.pointOfInterestTypeTeleporterReceiver
        PointOfInterestType.NEURAL_VACILLATOR -> Res.string.pointOfInterestTypeNeuralVacillator
        PointOfInterestType.ANTI_ENTROPY_THERMO_NULLIFIER -> Res.string.pointOfInterestTypeAntiEntropyThermoNullifier
        PointOfInterestType.EXPERIMENT_52B -> Res.string.pointOfInterestTypeExperiment52B
        PointOfInterestType.ARTIFACT -> Res.string.pointOfInterestTypeArtifact
        PointOfInterestType.CRASHED_SATELLITE -> Res.string.pointOfInterestTypeCrashedSatellite
        PointOfInterestType.WRECKED_SATELLITE -> Res.string.pointOfInterestTypeWreckedSatellite
        PointOfInterestType.CRUSHED_SATELLITE -> Res.string.pointOfInterestTypeCrushedSatellite
        PointOfInterestType.TEMPORAL_TEAR_OPENER -> Res.string.pointOfInterestTypeTemporalTearOpener
        PointOfInterestType.CRYOTANK -> Res.string.pointOfInterestTypeCryotank3000
        PointOfInterestType.PropFacilityStatue -> Res.string.pointOfInterestTypePropFacilityStatue
        PointOfInterestType.GeothermalVentEntity -> Res.string.pointOfInterestTypeGeothermalVentEntity
        PointOfInterestType.GeothermalControllerEntity -> Res.string.pointOfInterestTypeGeothermalControllerEntity
        PointOfInterestType.POICeresTechUnlock -> Res.string.pointOfInterestTypeCeresTechUnlock
    }

fun getStringResource(vanillaSpacePOI: VanillaSpacePOI): StringResource =
    when (vanillaSpacePOI) {
        VanillaSpacePOI.CarbonaceousAsteroid -> Res.string.vanillaSpacePoiCarbonaceousAsteroid
        VanillaSpacePOI.ChlorinePlanet -> Res.string.vanillaSpacePoiChlorinePlanet
        VanillaSpacePOI.DLC2CeresSpaceDestination -> Res.string.vanillaSpacePoiDLC2CeresSpaceDestination
        VanillaSpacePOI.DLC4PrehistoricSpaceDestination -> Res.string.vanillaSpacePoiDLC4PrehistoricSpaceDestination
        VanillaSpacePOI.DustyMoon -> Res.string.vanillaSpacePoiDustyMoon
        VanillaSpacePOI.Earth -> Res.string.vanillaSpacePoiEarth
        VanillaSpacePOI.ForestPlanet -> Res.string.vanillaSpacePoiForestPlanet
        VanillaSpacePOI.GasGiant -> Res.string.vanillaSpacePoiGasGiant
        VanillaSpacePOI.GoldAsteroid -> Res.string.vanillaSpacePoiGoldAsteroid
        VanillaSpacePOI.HeliumGiant -> Res.string.vanillaSpacePoiHeliumGiant
        VanillaSpacePOI.IceGiant -> Res.string.vanillaSpacePoiIceGiant
        VanillaSpacePOI.IcyDwarf -> Res.string.vanillaSpacePoiIcyDwarf
        VanillaSpacePOI.MetallicAsteroid -> Res.string.vanillaSpacePoiMetallicAsteroid
        VanillaSpacePOI.OilyAsteriod -> Res.string.vanillaSpacePoiOilyAsteroid
        VanillaSpacePOI.OrganicDwarf -> Res.string.vanillaSpacePoiOrganicDwarf
        VanillaSpacePOI.RedDwarf -> Res.string.vanillaSpacePoiRedDwarf
        VanillaSpacePOI.RockyAsteroid -> Res.string.vanillaSpacePoiRockyAsteroid
        VanillaSpacePOI.RustPlanet -> Res.string.vanillaSpacePoiRustPlanet
        VanillaSpacePOI.SaltDesertPlanet -> Res.string.vanillaSpacePoiSaltDesertPlanet
        VanillaSpacePOI.SaltDwarf -> Res.string.vanillaSpacePoiSaltDwarf
        VanillaSpacePOI.Satellite -> Res.string.vanillaSpacePoiSatellite
        VanillaSpacePOI.ShinyPlanet -> Res.string.vanillaSpacePoiShinyPlanet
        VanillaSpacePOI.TerraPlanet -> Res.string.vanillaSpacePoiTerraPlanet
        VanillaSpacePOI.VolcanoPlanet -> Res.string.vanillaSpacePoiVolcanoPlanet
        VanillaSpacePOI.Wormhole -> Res.string.vanillaSpacePoiWormhole
    }

fun getStringResource(spacedOutSpacePOI: SpacedOutSpacePOI): StringResource =
    when (spacedOutSpacePOI) {
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
        SpacedOutSpacePOI.DLC4PrehistoricMixingField -> Res.string.dlc4PrehistoricMixingField
        SpacedOutSpacePOI.DLC4PrehistoricOreField -> Res.string.dlc4PrehistoricOreField
        SpacedOutSpacePOI.DLC4ImpactorDebrisField1 -> Res.string.dlc4ImpactorDebrisField1
        SpacedOutSpacePOI.DLC4ImpactorDebrisField2 -> Res.string.dlc4ImpactorDebrisField2
        SpacedOutSpacePOI.DLC4ImpactorDebrisField3 -> Res.string.dlc4ImpactorDebrisField3
        SpacedOutSpacePOI.TemporalTear -> Res.string.temporalTear
    }
