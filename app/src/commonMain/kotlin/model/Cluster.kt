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

import kotlinx.serialization.Serializable

@Serializable
enum class Cluster(
    val displayName: String,
    val clusterId: String,
    val prefix: String
) {

    /*
     * Warning: Do not sort or delete items here!
     * Ordinals must be kept stable for use in database.
     */

    /* Base game */
    BASE_TERRA(
        displayName = "Terra",
        clusterId = "clusters/SandstoneDefault",
        prefix = "SNDST-A"
    ),
    BASE_OCEANIA(
        displayName = "Oceania",
        clusterId = "clusters/Oceania",
        prefix = "OCAN-A"
    ),
    BASE_RIME(
        displayName = "Rime",
        clusterId = "clusters/SandstoneFrozen",
        prefix = "S-FRZ"
    ),
    BASE_VERDANTE(
        displayName = "Verdante",
        clusterId = "clusters/ForestLush",
        prefix = "LUSH-A"
    ),
    BASE_Arboria(
        displayName = "Arboria",
        clusterId = "clusters/ForestDefault",
        prefix = "FRST-A"
    ),
    BASE_VOLCANEA(
        displayName = "Volcanea",
        clusterId = "clusters/Volcanic",
        prefix = "VOLCA"
    ),
    BASE_THE_BADLANDS(
        displayName = "The Badlands",
        clusterId = "clusters/Badlands",
        prefix = "BAD-A"
    ),
    BASE_ARIDIO(
        displayName = "Aridio",
        clusterId = "clusters/ForestHot",
        prefix = "HTFST-A"
    ),
    BASE_OASISSE(
        displayName = "Oasisse",
        clusterId = "clusters/Oasis",
        prefix = "OASIS-A"
    ),

    /* DLC */
    DLC_TERRA(
        displayName = "Terra",
        clusterId = "expansion1::clusters/VanillaSandstoneCluster",
        prefix = "V-SNDST-C"
    ),
    DLC_OCEANIA(
        displayName = "Oceania",
        clusterId = "expansion1::clusters/VanillaOceaniaCluster",
        prefix = "V-OCAN-C"
    ),
    DLC_SQUELCHY(
        displayName = "Squelchy",
        clusterId = "expansion1::clusters/VanillaSwampCluster",
        prefix = "V-SWMP-C"
    ),
    DLC_RIME(
        displayName = "Rime",
        clusterId = "expansion1::clusters/VanillaSandstoneFrozenCluster",
        prefix = "V-SFRZ-C"
    ),
    DLC_VERDANTE(
        displayName = "Verdante",
        clusterId = "expansion1::clusters/VanillaForestCluster",
        prefix = "V-LUSH-C"
    ),
    DLC_ARBORIA(
        displayName = "Arboria",
        clusterId = "expansion1::clusters/VanillaArboriaCluster",
        prefix = "V-FRST-C"
    ),
    DLC_VOLCANEA(
        displayName = "Volcanea",
        clusterId = "expansion1::clusters/VanillaVolcanicCluster",
        prefix = "V-VOLCA-C"
    ),
    DLC_THE_BADLANDS(
        displayName = "The Badlands",
        clusterId = "expansion1::clusters/VanillaBadlandsCluster",
        prefix = "V-BAD-C"
    ),
    DLC_ARIDIO(
        displayName = "Aridio",
        clusterId = "expansion1::clusters/VanillaAridioCluster",
        prefix = "V-HTFST-C"
    ),
    DLC_OASISSE(
        displayName = "Oasisse",
        clusterId = "expansion1::clusters/VanillaOasisCluster",
        prefix = "V-OASIS-C"
    ),
    DLC_TERRANIA(
        displayName = "Terrania",
        clusterId = "expansion1::clusters/SandstoneStartCluster",
        prefix = "SNDST-C"
    ),
    DLC_FOLIA(
        displayName = "Folia",
        clusterId = "expansion1::clusters/ForestStartCluster",
        prefix = "FRST-C"
    ),
    DLC_QUAGMIRIS(
        displayName = "Quagmiris",
        clusterId = "expansion1::clusters/SwampStartCluster",
        prefix = "SWMP-C"
    ),
    DLC_METALLIC_SWAMPY_MOONLET(
        displayName = "Metallic Swampy Moonlet",
        clusterId = "expansion1::clusters/MiniClusterMetallicSwampyStart",
        prefix = "M-SWMP-C"
    ),
    DLC_THE_DESOLANDS_MOONLET(
        displayName = "The Desolands Moonlet",
        clusterId = "expansion1::clusters/MiniClusterBadlandsStart",
        prefix = "M-BAD-C"
    ),
    DLC_FROZEN_FOREST_MOONLET(
        displayName = "Frozen Forest Moonlet",
        clusterId = "expansion1::clusters/MiniClusterForestFrozenStart",
        prefix = "M-FRZ-C"
    ),
    DLC_FLIPPED_MOONLET(
        displayName = "Flipped Moonlet",
        clusterId = "expansion1::clusters/MiniClusterFlippedStart",
        prefix = "M-FLIP-C"
    ),
    DLC_RADIOACTIVE_OCEAN_MOONLET(
        displayName = "Radioactive Ocean Moonlet",
        clusterId = "expansion1::clusters/MiniClusterRadioactiveOceanStart",
        prefix = "M-RAD-C"
    )
}
