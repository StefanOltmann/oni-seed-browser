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
import org.jetbrains.compose.resources.StringResource

/**
 * See https://oxygennotincluded.fandom.com/wiki/Planetoid_Clusters
 */
enum class PointOfInterestType(
    val id: String,
    val stringResource: StringResource
) {
    PRINTING_POD("Headquarters", Res.string.pointOfInterestTypePrintingPod),
    SUPPLY_TELEPORTER_INPUT("WarpConduitSender", Res.string.pointOfInterestTypeSupplyTeleporterInput),
    SUPPLY_TELEPORTER_OUTPUT("WarpConduitReceiver", Res.string.pointOfInterestTypeSupplyTeleporterOutput),
    TELEPORTER_TRANSMITTER("WarpPortal", Res.string.pointOfInterestTypeTeleporterTransmitter),
    TELEPORTER_RECEIVER("WarpReceiver", Res.string.pointOfInterestTypeTeleporterReceiver),
    NEURAL_VACILLATOR("GeneShuffler", Res.string.pointOfInterestTypeNeuralVacillator),
    ANTI_ENTROPY_THERMO_NULLIFIER("MassiveHeatSink", Res.string.pointOfInterestTypeAntiEntropyThermoNullifier),
    EXPERIMENT_52B("SapTree", Res.string.pointOfInterestTypeExperiment52B),
    ARTIFACT("GravitasPedestal", Res.string.pointOfInterestTypeArtifact),
    CRASHED_SATELLITE("PropSurfaceSatellite1", Res.string.pointOfInterestTypeCrashedSatellite),
    WRECKED_SATELLITE("PropSurfaceSatellite2", Res.string.pointOfInterestTypeWreckedSatellite),
    CRUSHED_SATELLITE("PropSurfaceSatellite3", Res.string.pointOfInterestTypeCrushedSatellite),
    TEMPORAL_TEAR_OPENER("TemporalTearOpener", Res.string.pointOfInterestTypeTemporalTearOpener),
    CRYOTANK("CryoTank", Res.string.pointOfInterestTypeCryotank3000),
    PropFacilityStatue("PropFacilityStatue", Res.string.pointOfInterestTypePropFacilityStatue),
    GeothermalVentEntity("GeothermalVentEntity", Res.string.pointOfInterestTypeGeothermalVentEntity),
    GeothermalControllerEntity("GeothermalControllerEntity", Res.string.pointOfInterestTypeGeothermalControllerEntity),
    POICeresTechUnlock("POICeresTechUnlock", Res.string.pointOfInterestTypeCeresTechUnlock);

    companion object {

        @Suppress("CyclomaticComplexMethod", "kotlin:S1479")
        fun of(id: String): PointOfInterestType {

            return PointOfInterestType.entries.find { it.id == id }
                ?: error("Unknown POI type: $id")
        }
    }
}
