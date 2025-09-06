/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de
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
    val id: String
) {

    PRINTING_POD("Headquarters"),
    SUPPLY_TELEPORTER_INPUT("WarpConduitSender"),
    SUPPLY_TELEPORTER_OUTPUT("WarpConduitReceiver"),
    TELEPORTER_TRANSMITTER("WarpPortal"),
    TELEPORTER_RECEIVER("WarpReceiver"),
    NEURAL_VACILLATOR("GeneShuffler"),
    ANTI_ENTROPY_THERMO_NULLIFIER("MassiveHeatSink"),
    EXPERIMENT_52B("SapTree"),
    ARTIFACT("GravitasPedestal"),
    CRASHED_SATELLITE("PropSurfaceSatellite1"),
    WRECKED_SATELLITE("PropSurfaceSatellite2"),
    CRUSHED_SATELLITE("PropSurfaceSatellite3"),
    TEMPORAL_TEAR_OPENER("TemporalTearOpener"),
    CRYOTANK("CryoTank"),
    PropFacilityStatue("PropFacilityStatue"),
    GeothermalVentEntity("GeothermalVentEntity"),
    GeothermalControllerEntity("GeothermalControllerEntity"),
    POICeresTechUnlock("POICeresTechUnlock");

    companion object {

        @Suppress("CyclomaticComplexMethod", "kotlin:S1479")
        fun of(id: String): PointOfInterestType {

            return PointOfInterestType.entries.find { it.id == id }
                ?: error("Unknown POI type: $id")
        }
    }
}
