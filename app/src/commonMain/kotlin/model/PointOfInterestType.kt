/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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

/**
 * See https://oxygennotincluded.fandom.com/wiki/Planetoid_Clusters
 */
enum class PointOfInterestType(
    val id: String,
    val displayName: String
) {

    PRINTING_POD("Headquarters", "Printing Pod"),
    SUPPLY_TELEPORTER_INPUT("WarpConduitSender", "Supply Teleporter Input"),
    SUPPLY_TELEPORTER_OUTPUT("WarpConduitReceiver", "Supply Teleporter Output"),
    TELEPORTER_TRANSMITTER("WarpPortal", "Teleporter Transmitter"),
    TELEPORTER_RECEIVER("WarpReceiver", "Teleporter Receiver"),
    NEURAL_VACILLATOR("GeneShuffler", "Neural Vacillator"),
    ANTI_ENTROPY_THERMO_NULLIFIER("MassiveHeatSink", "Anti Entropy Thermo-Nullifier"),
    EXPERIMENT_52B("SapTree", "Experiment 52B"),
    ARTIFACT("GravitasPedestal", "Artifact"),
    CRASHED_SATELLITE("PropSurfaceSatellite1", "Crashed Satellite"),
    WRECKED_SATELLITE("PropSurfaceSatellite2", "Wrecked Satellite"),
    CRUSHED_SATELLITE("PropSurfaceSatellite3", "Crushed Satellite"),
    TEMPORAL_TEAR_OPENER("TemporalTearOpener", "Temporal Tear Opener")
    ;

    companion object {

        @Suppress("CyclomaticComplexMethod", "kotlin:S1479")
        fun of(id: String): PointOfInterestType {

            return PointOfInterestType.entries.find { it.id == id }
                ?: error("Unknown POI type: $id")
        }
    }
}
