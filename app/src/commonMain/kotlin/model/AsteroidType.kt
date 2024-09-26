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

package model;

/**
 * See https://oxygennotincluded.fandom.com/wiki/Planetoid_Clusters
 */
enum class AsteroidType(
    val displayName: String
) {

    /*
     * Warning: Do not sort or delete items here!
     * Ordinals must be kept stable for use in database.
     */

    TERRA("Terra Asteroid"),
    OCEANIA("Oceania Asteroid"),
    RIME("Rime Asteroid"),
    VERDANTE("Verdante Asteroid"),
    ARBORIA("Arboria Asteroid"),
    VOLCANEA("Volcanea Astroid"),
    THE_BADLANDS("The Badlands Asteroid"),
    ARIDIO("Aridio Asteroid"),
    OASISSE("Oasisse Asteroid"),
    SQUELCHY("Squelchy Asteroid"),
    TERRANIA("Terrania Asteroid"),
    FOLIA("Folia Asteroid"),
    QUAGMIRIS("Quagmiris Asteroid"),
    METALLIC_SWAMPY("Metallic Swampy Asteroid"),
    THE_DESOLANDS("The Desolands Asteroid"),
    FROZEN_FOREST("Frozen Forest Asteroid"),
    FLIPPED("Flipped Asteroid"),
    RADIOACTIVE_OCEAN("Radioactive Ocean Asteroid"),
    RADIOACTIVE_SWAMP("Radioactive Swamp Asteroid"),
    GLOWOOD_WASTELAND("Glowood Wasteland Asteroid"),
    RADIOACTIVE_FOREST("Radioactive Forest Asteroid"),
    STINKO_SWAMP("Stinko Swamp Asteroid"),
    RADIOACTIVE_TERRA("Radioactive Terra Asteroid"),
    RADIOACTIVE_TERRABOG_ASTEROID("Radioactive Terrabog Asteroid"),
    OILY_SWAMP("Oily Swamp Asteroid"),
    RUSTY_OIL("Rusty Oil Asteroid"),
    IRRADIATED_FOREST("Irradiated Forest Asteroid"),
    IRRADIATED_SWAMPY("Irradiated Swampy Asteroid"),
    IRRADIATED_MARSH_ASTEROID("Irradiated Marsh Asteroid"),
    TUNDRA("Tundra Asteroid"),
    MARSHY("Marshy Asteroid"),
    SUPERCONDUCTIVE("Superconductive Asteroid"),
    MOO("Moo Asteroid"),
    WATER("Water Asteroid"),
    REGOLITH("Regolith Asteroid");
}
