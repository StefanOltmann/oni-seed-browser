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

@Suppress("UNUSED")
@Serializable
enum class Cluster(
    val prefix: String,
    val displayName: String
) {

    /** Terra */
    BASE_TERRA(
        prefix = "SNDST-A",
        displayName = "Terra"
    ),

    /** Ceres */
    BASE_CERES(
        prefix = "CER-A",
        displayName = "Ceres"
    ),

    /** Oceania */
    BASE_OCEANIA(
        prefix = "OCAN-A",
        displayName = "Oceania"
    ),

    /** Rime */
    BASE_RIME(
        prefix = "S-FRZ",
        displayName = "Rime"
    ),

    /** Verdante */
    BASE_VERDANTE(
        prefix = "LUSH-A",
        displayName = "Verdante"
    ),

    /** Arboria */
    BASE_ARBORIA(
        prefix = "FRST-A",
        displayName = "Arboria"
    ),

    /** Volcanea */
    BASE_VOLCANEA(
        prefix = "VOLCA",
        displayName = "Volcanea"
    ),

    /** The Badlands */
    BASE_THE_BADLANDS(
        prefix = "BAD-A",
        displayName = "The Badlands"
    ),

    /** Aridio */
    BASE_ARIDIO(
        prefix = "HTFST-A",
        displayName = "Aridio"
    ),

    /** Oasisse */
    BASE_OASISSE(
        prefix = "OASIS-A",
        displayName = "Oasisse"
    ),

    /** Terra */
    DLC_TERRA(
        prefix = "V-SNDST-C",
        displayName = "Terra"
    ),

    /** Ceres */
    DLC_CERES(
        prefix = "V-CER-C",
        displayName = "Ceres"
    ),

    /** Oceania */
    DLC_OCEANIA(
        prefix = "V-OCAN-C",
        displayName = "Oceania"
    ),

    /** Squelchy */
    DLC_SQUELCHY(
        prefix = "V-SWMP-C",
        displayName = "Squelchy"
    ),

    /** Rime */
    DLC_RIME(
        prefix = "V-SFRZ-C",
        displayName = "Rime"
    ),

    /** Verdante */
    DLC_VERDANTE(
        prefix = "V-LUSH-C",
        displayName = "Verdante"
    ),

    /** Arboria */
    DLC_ARBORIA(
        prefix = "V-FRST-C",
        displayName = "Arboria"
    ),

    /** Volcanea */
    DLC_VOLCANEA(
        prefix = "V-VOLCA-C",
        displayName = "Volcanea"
    ),

    /** The Badlands */
    DLC_THE_BADLANDS(
        prefix = "V-BAD-C",
        displayName = "The Badlands"
    ),

    /** Aridio */
    DLC_ARIDIO(
        prefix = "V-HTFST-C",
        displayName = "Aridio"
    ),

    /** Oasisse */
    DLC_OASISSE(
        prefix = "V-OASIS-C",
        displayName = "Oasisse"
    ),

    /** Terrania */
    DLC_TERRANIA(
        prefix = "SNDST-C",
        displayName = "Terrania"
    ),

    /** Ceres Minor */
    DLC_CERES_MINOR(
        prefix = "CER-C",
        displayName = "Ceres Minor"
    ),

    /** Folia */
    DLC_FOLIA(
        prefix = "FRST-C",
        displayName = "Folia"
    ),

    /** Quagmiris */
    DLC_QUAGMIRIS(
        prefix = "SWMP-C",
        displayName = "Quagmiris"
    ),

    /** Metallic Swampy Moonlet */
    DLC_METALLIC_SWAMPY_MOONLET(
        prefix = "M-SWMP-C",
        displayName = "Metallic Swampy Moonlet"
    ),

    /** The Desolands Moonlet */
    DLC_THE_DESOLANDS_MOONLET(
        prefix = "M-BAD-C",
        displayName = "The Desolands Moonlet"
    ),

    /** Frozen Forest Moonlet */
    DLC_FROZEN_FOREST_MOONLET(
        prefix = "M-FRZ-C",
        displayName = "Frozen Forest Moonlet"
    ),

    /** Flipped Moonlet */
    DLC_FLIPPED_MOONLET(
        prefix = "M-FLIP-C",
        displayName = "Flipped Moonlet"
    ),

    /** Radioactive Ocean Moonlet */
    DLC_RADIOACTIVE_OCEAN_MOONLET(
        prefix = "M-RAD-C",
        displayName = "Radioactive Ocean Moonlet"
    );

    fun isFrostyPlanet(): Boolean =
        this == BASE_CERES || this == DLC_CERES || this == DLC_CERES_MINOR

    companion object {

        val baseGameCluster = listOf(
            BASE_TERRA, BASE_CERES, BASE_OCEANIA, BASE_RIME, BASE_VERDANTE, BASE_ARBORIA,
            BASE_VOLCANEA, BASE_THE_BADLANDS, BASE_ARIDIO, BASE_OASISSE
        )

        val spacedOutCluster = listOf(
            DLC_TERRA, DLC_CERES, DLC_OCEANIA, DLC_SQUELCHY, DLC_RIME, DLC_VERDANTE,
            DLC_ARBORIA, DLC_VOLCANEA, DLC_THE_BADLANDS, DLC_ARIDIO, DLC_OASISSE,
            DLC_TERRANIA, DLC_CERES_MINOR, DLC_FOLIA, DLC_QUAGMIRIS,
            DLC_METALLIC_SWAMPY_MOONLET, DLC_THE_DESOLANDS_MOONLET,
            DLC_FROZEN_FOREST_MOONLET, DLC_FLIPPED_MOONLET, DLC_RADIOACTIVE_OCEAN_MOONLET
        )
    }
}
