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
