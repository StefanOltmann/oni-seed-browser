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
import model.SpacedOutSpacePOI
import org.jetbrains.compose.resources.StringResource

val SpacedOutSpacePOI.stringResource: StringResource
    get() = when (this) {
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
