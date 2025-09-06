package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
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
import model.PointOfInterestType
import org.jetbrains.compose.resources.StringResource

val PointOfInterestType.stringResource: StringResource
    get() = when (this) {
        PointOfInterestType.Headquarters -> Res.string.pointOfInterestTypePrintingPod
        PointOfInterestType.WarpConduitSender -> Res.string.pointOfInterestTypeSupplyTeleporterInput
        PointOfInterestType.WarpConduitReceiver -> Res.string.pointOfInterestTypeSupplyTeleporterOutput
        PointOfInterestType.WarpPortal -> Res.string.pointOfInterestTypeTeleporterTransmitter
        PointOfInterestType.WarpReceiver -> Res.string.pointOfInterestTypeTeleporterReceiver
        PointOfInterestType.GeneShuffler -> Res.string.pointOfInterestTypeNeuralVacillator
        PointOfInterestType.MassiveHeatSink -> Res.string.pointOfInterestTypeAntiEntropyThermoNullifier
        PointOfInterestType.SapTree -> Res.string.pointOfInterestTypeExperiment52B
        PointOfInterestType.GravitasPedestal -> Res.string.pointOfInterestTypeArtifact
        PointOfInterestType.PropSurfaceSatellite1 -> Res.string.pointOfInterestTypeCrashedSatellite
        PointOfInterestType.PropSurfaceSatellite2 -> Res.string.pointOfInterestTypeWreckedSatellite
        PointOfInterestType.PropSurfaceSatellite3 -> Res.string.pointOfInterestTypeCrushedSatellite
        PointOfInterestType.TemporalTearOpener -> Res.string.pointOfInterestTypeTemporalTearOpener
        PointOfInterestType.CryoTank -> Res.string.pointOfInterestTypeCryotank3000
        PointOfInterestType.PropFacilityStatue -> Res.string.pointOfInterestTypePropFacilityStatue
        PointOfInterestType.GeothermalVentEntity -> Res.string.pointOfInterestTypeGeothermalVentEntity
        PointOfInterestType.GeothermalControllerEntity -> Res.string.pointOfInterestTypeGeothermalControllerEntity
        PointOfInterestType.POICeresTechUnlock -> Res.string.pointOfInterestTypeCeresTechUnlock
    }
