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

    /* Base game */
    BASE_TERRA(
        prefix = "SNDST-A",
        displayName = "Terra"
    ),
    BASE_OCEANIA(
        prefix = "OCAN-A",
        displayName = "Oceania"
    ),
    BASE_RIME(
        prefix = "S-FRZ",
        displayName = "Rime"
    ),
    BASE_VERDANTE(
        prefix = "LUSH-A",
        displayName = "Verdante"
    ),
    BASE_ARBORIA(
        prefix = "FRST-A",
        displayName = "Arboria"
    ),
    BASE_VOLCANEA(
        prefix = "VOLCA",
        displayName = "Volcanea"
    ),
    BASE_THE_BADLANDS(
        prefix = "BAD-A",
        displayName = "The Badlands"
    ),
    BASE_ARIDIO(
        prefix = "HTFST-A",
        displayName = "Aridio"
    ),
    BASE_OASISSE(
        prefix = "OASIS-A",
        displayName = "Oasisse"
    ),

    /* DLC */
    DLC_TERRA(
        prefix = "V-SNDST-C",
        displayName = "Terra"
    ),
    DLC_OCEANIA(
        prefix = "V-OCAN-C",
        displayName = "Oceania"
    ),
    DLC_SQUELCHY(
        prefix = "V-SWMP-C",
        displayName = "Squelchy"
    ),
    DLC_RIME(
        prefix = "V-SFRZ-C",
        displayName = "Rime"
    ),
    DLC_VERDANTE(
        prefix = "V-LUSH-C",
        displayName = "Verdante"
    ),
    DLC_ARBORIA(
        prefix = "V-FRST-C",
        displayName = "Arboria"
    ),
    DLC_VOLCANEA(
        prefix = "V-VOLCA-C",
        displayName = "Volcanea"
    ),
    DLC_THE_BADLANDS(
        prefix = "V-BAD-C",
        displayName = "The Badlands"
    ),
    DLC_ARIDIO(
        prefix = "V-HTFST-C",
        displayName = "Aridio"
    ),
    DLC_OASISSE(
        prefix = "V-OASIS-C",
        displayName = "Oasisse"
    ),
    DLC_TERRANIA(
        prefix = "SNDST-C",
        displayName = "Terrania"
    ),
    DLC_FOLIA(
        prefix = "FRST-C",
        displayName = "Folia"
    ),
    DLC_QUAGMIRIS(
        prefix = "SWMP-C",
        displayName = "Quagmiris"
    ),
    DLC_METALLIC_SWAMPY_MOONLET(
        prefix = "M-SWMP-C",
        displayName = "Metallic Swampy Moonlet"
    ),
    DLC_THE_DESOLANDS_MOONLET(
        prefix = "M-BAD-C",
        displayName = "The Desolands Moonlet"
    ),
    DLC_FROZEN_FOREST_MOONLET(
        prefix = "M-FRZ-C",
        displayName = "Frozen Forest Moonlet"
    ),
    DLC_FLIPPED_MOONLET(
        prefix = "M-FLIP-C",
        displayName = "Flipped Moonlet"
    ),
    DLC_RADIOACTIVE_OCEAN_MOONLET(
        prefix = "M-RAD-C",
        displayName = "Radioactive Ocean Moonlet"
    )
}
