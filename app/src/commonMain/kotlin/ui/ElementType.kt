/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

package ui

import androidx.compose.ui.graphics.Color
import kotlinx.serialization.Serializable

@Suppress("UNUSED")
@Serializable
enum class ElementType(
    val substanceName: String,

    /** Color **/
    val color: Color,
    val conduitColor: Color,
    val uiColor: Color,

    /** Element Index **/
    val elementIdx: Int
) {

    CRUSHED_ICE(
        substanceName = "Crushed Ice",
        color = Color(215, 250, 255, 255),
        conduitColor = Color(215, 250, 255, 255),
        uiColor = Color(97, 219, 255, 231),
        elementIdx = 0
    ),

    DIAMOND(
        substanceName = "Diamond",
        color = Color(203, 197, 233, 255),
        conduitColor = Color(203, 197, 233, 255),
        uiColor = Color(203, 197, 233, 255),
        elementIdx = 1
    ),

    AEROGEL(
        substanceName = "Aerogel",
        color = Color(0, 0, 0, 0),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(0, 217, 255, 255),
        elementIdx = 2
    ),

    ISORESIN(
        substanceName = "Isoresin",
        color = Color(255, 163, 0, 255),
        conduitColor = Color(255, 163, 0, 255),
        uiColor = Color(255, 163, 0, 255),
        elementIdx = 3
    ),

    SUCROSE(
        substanceName = "Sucrose",
        color = Color(229, 255, 218, 255),
        conduitColor = Color(108, 112, 64, 255),
        uiColor = Color(255, 255, 255, 255),
        elementIdx = 4
    ),

    PHOSPHATE_NODULES(
        substanceName = "Phosphate Nodules",
        color = Color(166, 79, 121, 255),
        conduitColor = Color(166, 79, 121, 255),
        uiColor = Color(195, 41, 115, 255),
        elementIdx = 5
    ),

    ALGAE(
        substanceName = "Algae",
        color = Color(53, 140, 54, 255),
        conduitColor = Color(53, 140, 54, 255),
        uiColor = Color(0, 255, 47, 255),
        elementIdx = 6
    ),

    BRACKWAX(
        substanceName = "Brackwax",
        color = Color(150, 218, 226, 0),
        conduitColor = Color(150, 218, 226, 255),
        uiColor = Color(0, 229, 255, 255),
        elementIdx = 7
    ),

    NIOBIUM(
        substanceName = "Niobium",
        color = Color(52, 130, 91, 0),
        conduitColor = Color(52, 130, 91, 255),
        uiColor = Color(94, 253, 173, 255),
        elementIdx = 8
    ),

    FROZEN_BRACKENE(
        substanceName = "Frozen Brackene",
        color = Color(134, 255, 164, 255),
        conduitColor = Color(204, 238, 232, 255),
        uiColor = Color(204, 238, 232, 255),
        elementIdx = 9
    ),

    COPPER_ORE(
        substanceName = "Copper Ore",
        color = Color(169, 94, 99, 255),
        conduitColor = Color(172, 96, 101, 255),
        uiColor = Color(217, 91, 99, 255),
        elementIdx = 10
    ),

    COPPER(
        substanceName = "Copper",
        color = Color(219, 84, 40, 255),
        conduitColor = Color(219, 84, 40, 255),
        uiColor = Color(255, 156, 8, 255),
        elementIdx = 11
    ),

    CRUSHED_ROCK(
        substanceName = "Crushed Rock",
        color = Color(178, 178, 178, 255),
        conduitColor = Color(178, 178, 178, 255),
        uiColor = Color(140, 140, 140, 255),
        elementIdx = 12
    ),

    INSULITE(
        substanceName = "Insulite",
        color = Color(255, 0, 207, 255),
        conduitColor = Color(255, 0, 207, 255),
        uiColor = Color(255, 0, 207, 255),
        elementIdx = 13
    ),

    TALLOW(
        substanceName = "Tallow",
        color = Color(255, 227, 0, 0),
        conduitColor = Color(255, 155, 0, 255),
        uiColor = Color(255, 207, 0, 255),
        elementIdx = 14
    ),

    YELLOWCAKE(
        substanceName = "Yellowcake",
        color = Color(255, 240, 0, 255),
        conduitColor = Color(255, 240, 0, 255),
        uiColor = Color(255, 240, 0, 255),
        elementIdx = 15
    ),

    BRINE_ICE(
        substanceName = "Brine Ice",
        color = Color(255, 255, 255, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(0, 238, 255, 255),
        elementIdx = 16
    ),

    SOLID_VISCO_GEL(
        substanceName = "Solid Visco-Gel",
        color = Color(79, 16, 183, 255),
        conduitColor = Color(79, 16, 183, 255),
        uiColor = Color(79, 16, 183, 255),
        elementIdx = 17
    ),

    CERAMIC(
        substanceName = "Ceramic",
        color = Color(236, 214, 174, 255),
        conduitColor = Color(236, 214, 174, 255),
        uiColor = Color(236, 214, 174, 255),
        elementIdx = 18
    ),

    COBALT_ORE(
        substanceName = "Cobalt Ore",
        color = Color(0, 33, 236, 255),
        conduitColor = Color(0, 33, 236, 255),
        uiColor = Color(0, 33, 236, 255),
        elementIdx = 19
    ),

    FERTILIZER(
        substanceName = "Fertilizer",
        color = Color(61, 104, 122, 0),
        conduitColor = Color(61, 104, 122, 255),
        uiColor = Color(42, 173, 229, 255),
        elementIdx = 20
    ),

    SOLID_CRUDE_OIL(
        substanceName = "Solid Crude Oil",
        color = Color(19, 19, 19, 255),
        conduitColor = Color(25, 26, 26, 255),
        uiColor = Color(0, 0, 0, 255),
        elementIdx = 21
    ),

    WOLFRAMITE(
        substanceName = "Wolframite",
        color = Color(164, 182, 186, 255),
        conduitColor = Color(24, 147, 171, 255),
        uiColor = Color(137, 183, 255, 255),
        elementIdx = 22
    ),

    SLIME(
        substanceName = "Slime",
        color = Color(86, 113, 40, 255),
        conduitColor = Color(86, 113, 40, 255),
        uiColor = Color(144, 214, 92, 255),
        elementIdx = 23
    ),

    PLASTIC(
        substanceName = "Plastic",
        color = Color(150, 218, 226, 0),
        conduitColor = Color(150, 218, 226, 255),
        uiColor = Color(0, 229, 255, 255),
        elementIdx = 24
    ),

    SOLID_NAPHTHA(
        substanceName = "Solid Naphtha",
        color = Color(204, 204, 204, 255),
        conduitColor = Color(185, 185, 184, 255),
        uiColor = Color(214, 197, 183, 255),
        elementIdx = 25
    ),

    TUNGSTEN(
        substanceName = "Tungsten",
        color = Color(123, 126, 132, 0),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 247, 0, 255),
        elementIdx = 26
    ),

    SAND_CEMENT(
        substanceName = "Sand Cement",
        color = Color(219, 203, 187, 255),
        conduitColor = Color(171, 166, 160, 255),
        uiColor = Color(204, 174, 130, 255),
        elementIdx = 27
    ),

    REFINED_CARBON(
        substanceName = "Refined Carbon",
        color = Color(89, 89, 89, 255),
        conduitColor = Color(130, 130, 130, 255),
        uiColor = Color(67, 67, 67, 255),
        elementIdx = 28
    ),

    STEEL(
        substanceName = "Steel",
        color = Color(91, 121, 143, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(81, 82, 43, 255),
        elementIdx = 29
    ),

    PHOSPHORITE(
        substanceName = "Phosphorite",
        color = Color(166, 79, 121, 255),
        conduitColor = Color(166, 79, 121, 255),
        uiColor = Color(200, 61, 128, 255),
        elementIdx = 30
    ),

    SOLID_HYDROGEN(
        substanceName = "Solid Hydrogen",
        color = Color(161, 56, 132, 0),
        conduitColor = Color(231, 29, 175, 255),
        uiColor = Color(103, 5, 76, 161),
        elementIdx = 31
    ),

    BLEACH_STONE(
        substanceName = "Bleach Stone",
        color = Color(223, 245, 255, 255),
        conduitColor = Color(223, 245, 255, 255),
        uiColor = Color(0, 161, 255, 255),
        elementIdx = 32
    ),

    LEAD(
        substanceName = "Lead",
        color = Color(250, 178, 20, 255),
        conduitColor = Color(250, 178, 20, 255),
        uiColor = Color(255, 201, 26, 255),
        elementIdx = 33
    ),

    SULFUR(
        substanceName = "Sulfur",
        color = Color(255, 255, 0, 255),
        conduitColor = Color(255, 255, 0, 255),
        uiColor = Color(255, 255, 0, 255),
        elementIdx = 34
    ),

    LIME(
        substanceName = "Lime",
        color = Color(195, 198, 193, 255),
        conduitColor = Color(184, 186, 181, 255),
        uiColor = Color(255, 255, 255, 255),
        elementIdx = 35
    ),

    SOLID_SYNTHESIS_GAS(
        substanceName = "Solid Synthesis Gas",
        color = Color(255, 112, 69, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 0, 30, 255),
        elementIdx = 36
    ),

    SOLID_CHLORINE(
        substanceName = "Solid Chlorine",
        color = Color(197, 233, 71, 255),
        conduitColor = Color(197, 233, 71, 255),
        uiColor = Color(162, 221, 16, 255),
        elementIdx = 37
    ),

    SOLID_MERCURY(
        substanceName = "Mercury",
        color = Color(87, 101, 153, 255),
        conduitColor = Color(94, 110, 169, 255),
        uiColor = Color(49, 72, 176, 215),
        elementIdx = 38
    ),

    SOLID_NUCLEAR_WASTE(
        substanceName = "Solid Nuclear Waste",
        color = Color(145, 221, 91, 255),
        conduitColor = Color(145, 221, 91, 255),
        uiColor = Color(129, 176, 0, 255),
        elementIdx = 39
    ),

    OBSIDIAN(
        substanceName = "Obsidian",
        color = Color(47, 53, 60, 255),
        conduitColor = Color(66, 72, 81, 255),
        uiColor = Color(19, 20, 24, 255),
        elementIdx = 40
    ),

    SOLID_PETROLEUM(
        substanceName = "Solid Petroleum",
        color = Color(156, 141, 11, 255),
        conduitColor = Color(156, 141, 11, 255),
        uiColor = Color(229, 233, 10, 255),
        elementIdx = 41
    ),

    SOLID_SUPER_COOLANT(
        substanceName = "Solid Super Coolant",
        color = Color(55, 173, 147, 255),
        conduitColor = Color(55, 173, 147, 255),
        uiColor = Color(55, 173, 147, 255),
        elementIdx = 42
    ),

    IGNEOUS_ROCK(
        substanceName = "Igneous Rock",
        color = Color(107, 113, 128, 255),
        conduitColor = Color(107, 113, 128, 255),
        uiColor = Color(118, 118, 118, 255),
        elementIdx = 43
    ),

    ENRICHED_URANIUM(
        substanceName = "Enriched Uranium",
        color = Color(145, 221, 91, 255),
        conduitColor = Color(145, 221, 91, 255),
        uiColor = Color(129, 176, 0, 255),
        elementIdx = 44
    ),

    BRICK(
        substanceName = "Brick",
        color = Color(161, 73, 52, 255),
        conduitColor = Color(161, 73, 52, 255),
        uiColor = Color(250, 35, 0, 255),
        elementIdx = 45
    ),

    GOLD(
        substanceName = "Gold",
        color = Color(250, 178, 20, 255),
        conduitColor = Color(250, 178, 20, 255),
        uiColor = Color(255, 201, 26, 255),
        elementIdx = 46
    ),

    RUST(
        substanceName = "Rust",
        color = Color(122, 73, 62, 255),
        conduitColor = Color(122, 73, 62, 255),
        uiColor = Color(188, 80, 79, 255),
        elementIdx = 47
    ),

    SOLID_GUNK(
        substanceName = "Solid Gunk",
        color = Color(81, 35, 96, 255),
        conduitColor = Color(81, 35, 96, 255),
        uiColor = Color(81, 35, 96, 255),
        elementIdx = 48
    ),

    FROZEN_PHYTO_OIL(
        substanceName = "Frozen Phyto Oil",
        color = Color(152, 168, 47, 255),
        conduitColor = Color(152, 168, 47, 255),
        uiColor = Color(152, 168, 47, 255),
        elementIdx = 49
    ),

    CORIUM(
        substanceName = "Corium",
        color = Color(7, 96, 22, 255),
        conduitColor = Color(7, 96, 22, 255),
        uiColor = Color(7, 96, 22, 255),
        elementIdx = 50
    ),

    REFINED_PHOSPHORUS(
        substanceName = "Refined Phosphorus",
        color = Color(166, 79, 121, 255),
        conduitColor = Color(166, 79, 121, 255),
        uiColor = Color(200, 61, 128, 255),
        elementIdx = 51
    ),

    GRANITE(
        substanceName = "Granite",
        color = Color(147, 154, 159, 255),
        conduitColor = Color(147, 154, 159, 255),
        uiColor = Color(67, 67, 67, 51),
        elementIdx = 52
    ),

    RADIUM(
        substanceName = "Radium",
        color = Color(145, 221, 91, 255),
        conduitColor = Color(145, 221, 91, 255),
        uiColor = Color(129, 176, 0, 255),
        elementIdx = 53
    ),

    WOOD(
        substanceName = "Wood",
        color = Color(140, 107, 74, 255),
        conduitColor = Color(91, 59, 27, 255),
        uiColor = Color(101, 71, 41, 255),
        elementIdx = 54
    ),

    ELECTRUM(
        substanceName = "Electrum",
        color = Color(97, 121, 176, 255),
        conduitColor = Color(97, 121, 176, 255),
        uiColor = Color(52, 110, 243, 255),
        elementIdx = 55
    ),

    SOLID_CARBON_DIOXIDE(
        substanceName = "Solid Carbon Dioxide",
        color = Color(85, 90, 96, 255),
        conduitColor = Color(108, 125, 144, 255),
        uiColor = Color(31, 31, 31, 255),
        elementIdx = 56
    ),

    COBALT(
        substanceName = "Cobalt",
        color = Color(0, 33, 236, 255),
        conduitColor = Color(0, 33, 236, 255),
        uiColor = Color(0, 33, 236, 255),
        elementIdx = 57
    ),

    CARBON_FIBER(
        substanceName = "Carbon Fiber",
        color = Color(48, 48, 48, 0),
        conduitColor = Color(55, 55, 55, 255),
        uiColor = Color(96, 96, 96, 255),
        elementIdx = 58
    ),

    URANIUM_ORE(
        substanceName = "Uranium Ore",
        color = Color(145, 221, 91, 255),
        conduitColor = Color(145, 221, 91, 255),
        uiColor = Color(129, 176, 0, 255),
        elementIdx = 59
    ),

    SOLID_PROPANE(
        substanceName = "Solid Propane",
        color = Color(39, 94, 255, 255),
        conduitColor = Color(64, 80, 236, 255),
        uiColor = Color(121, 144, 209, 255),
        elementIdx = 60
    ),

    ALUMINUM_ORE(
        substanceName = "Aluminum Ore",
        color = Color(122, 73, 62, 255),
        conduitColor = Color(122, 73, 62, 255),
        uiColor = Color(204, 67, 36, 255),
        elementIdx = 61
    ),

    SEDIMENTARY_ROCK(
        substanceName = "Sedimentary Rock",
        color = Color(109, 119, 140, 255),
        conduitColor = Color(106, 118, 137, 255),
        uiColor = Color(70, 114, 204, 255),
        elementIdx = 62
    ),

    FULLERENE(
        substanceName = "Fullerene",
        color = Color(112, 102, 113, 255),
        conduitColor = Color(112, 102, 113, 255),
        uiColor = Color(63, 63, 63, 255),
        elementIdx = 63
    ),

    GOLD_AMALGAM(
        substanceName = "Gold Amalgam",
        color = Color(250, 178, 20, 255),
        conduitColor = Color(250, 178, 20, 255),
        uiColor = Color(255, 201, 26, 255),
        elementIdx = 64
    ),

    SALT(
        substanceName = "Salt",
        color = Color(255, 241, 218, 1),
        conduitColor = Color(112, 95, 64, 255),
        uiColor = Color(255, 255, 255, 255),
        elementIdx = 65
    ),

    SAND(
        substanceName = "Sand",
        color = Color(214, 181, 148, 255),
        conduitColor = Color(168, 148, 128, 255),
        uiColor = Color(207, 140, 42, 255),
        elementIdx = 66
    ),

    SNOW(
        substanceName = "Snow",
        color = Color(218, 245, 250, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(180, 209, 255, 255),
        elementIdx = 67
    ),

    SANDSTONE(
        substanceName = "Sandstone",
        color = Color(153, 124, 100, 255),
        conduitColor = Color(151, 120, 95, 255),
        uiColor = Color(152, 130, 53, 255),
        elementIdx = 68
    ),

    GLASS(
        substanceName = "Glass",
        color = Color(223, 255, 254, 0),
        conduitColor = Color(223, 255, 254, 255),
        uiColor = Color(57, 255, 213, 255),
        elementIdx = 69
    ),

    CLAY(
        substanceName = "Clay",
        color = Color(159, 168, 83, 255),
        conduitColor = Color(159, 168, 83, 255),
        uiColor = Color(153, 156, 85, 255),
        elementIdx = 70
    ),

    POLLUTED_DIRT(
        substanceName = "Polluted Dirt",
        color = Color(255, 255, 255, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(34, 99, 0, 255),
        elementIdx = 71
    ),

    ICE(
        substanceName = "Ice",
        color = Color(255, 255, 255, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(0, 238, 255, 255),
        elementIdx = 72
    ),

    GRAPHITE(
        substanceName = "Graphite",
        color = Color(0, 0, 0, 255),
        conduitColor = Color(0, 0, 0, 255),
        uiColor = Color(67, 67, 67, 255),
        elementIdx = 73
    ),

    POLLUTED_MUD(
        substanceName = "Polluted Mud",
        color = Color(32, 82, 2, 255),
        conduitColor = Color(32, 82, 2, 255),
        uiColor = Color(32, 82, 2, 255),
        elementIdx = 74
    ),

    MUD(
        substanceName = "Mud",
        color = Color(99, 42, 24, 255),
        conduitColor = Color(99, 42, 24, 255),
        uiColor = Color(99, 42, 24, 255),
        elementIdx = 75
    ),

    COAL(
        substanceName = "Coal",
        color = Color(128, 115, 130, 255),
        conduitColor = Color(128, 115, 130, 255),
        uiColor = Color(195, 167, 209, 255),
        elementIdx = 76
    ),

    SOLID_OXYGEN(
        substanceName = "Solid Oxygen",
        color = Color(120, 200, 195, 255),
        conduitColor = Color(0, 231, 218, 255),
        uiColor = Color(89, 234, 226, 255),
        elementIdx = 77
    ),

    GENETIC_OOZE(
        substanceName = "Genetic Ooze",
        color = Color(191, 188, 73, 0),
        conduitColor = Color(143, 140, 73, 255),
        uiColor = Color(71, 69, 6, 255),
        elementIdx = 78
    ),

    DEPLETED_URANIUM(
        substanceName = "Depleted Uranium",
        color = Color(145, 221, 91, 255),
        conduitColor = Color(145, 221, 91, 255),
        uiColor = Color(129, 176, 0, 255),
        elementIdx = 79
    ),

    ABYSSALITE(
        substanceName = "Abyssalite",
        color = Color(94, 73, 110, 243),
        conduitColor = Color(82, 64, 96, 255),
        uiColor = Color(50, 49, 77, 255),
        elementIdx = 80
    ),

    SOLID_METHANE(
        substanceName = "Solid Methane",
        color = Color(227, 154, 68, 0),
        conduitColor = Color(227, 153, 65, 255),
        uiColor = Color(137, 110, 34, 255),
        elementIdx = 81
    ),

    PLASTIUM(
        substanceName = "Plastium",
        color = Color(98, 203, 255, 0),
        conduitColor = Color(0, 138, 207, 255),
        uiColor = Color(0, 138, 207, 255),
        elementIdx = 82
    ),

    OXYLITE(
        substanceName = "Oxylite",
        color = Color(4, 132, 134, 255),
        conduitColor = Color(4, 132, 134, 255),
        uiColor = Color(4, 132, 134, 255),
        elementIdx = 83
    ),

    MAFIC_ROCK(
        substanceName = "Mafic Rock",
        color = Color(80, 76, 84, 0),
        conduitColor = Color(80, 76, 84, 255),
        uiColor = Color(163, 158, 173, 255),
        elementIdx = 84
    ),

    IRON(
        substanceName = "Iron",
        color = Color(137, 45, 11, 255),
        conduitColor = Color(137, 45, 11, 255),
        uiColor = Color(204, 67, 36, 255),
        elementIdx = 85
    ),

    REGOLITH(
        substanceName = "Regolith",
        color = Color(156, 150, 167, 0),
        conduitColor = Color(161, 154, 172, 255),
        uiColor = Color(149, 118, 173, 255),
        elementIdx = 86
    ),

    SOLID_RESIN(
        substanceName = "Solid Resin",
        color = Color(156, 95, 18, 255),
        conduitColor = Color(156, 95, 18, 255),
        uiColor = Color(156, 95, 18, 255),
        elementIdx = 87
    ),

    BUILDING_SLAB(
        substanceName = "Building Slab",
        color = Color(83, 90, 106, 0),
        conduitColor = Color(71, 82, 106, 255),
        uiColor = Color(122, 140, 180, 255),
        elementIdx = 88
    ),

    BITUMEN(
        substanceName = "Bitumen",
        color = Color(60, 55, 55, 255),
        conduitColor = Color(60, 55, 55, 255),
        uiColor = Color(77, 77, 77, 255),
        elementIdx = 89
    ),

    PACKED_SNOW(
        substanceName = "Packed Snow",
        color = Color(218, 245, 250, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(180, 209, 255, 255),
        elementIdx = 90
    ),

    THERMIUM(
        substanceName = "Thermium",
        color = Color(210, 157, 168, 255),
        conduitColor = Color(210, 157, 168, 255),
        uiColor = Color(210, 157, 168, 255),
        elementIdx = 91
    ),

    IRON_ORE(
        substanceName = "Iron Ore",
        color = Color(122, 73, 62, 255),
        conduitColor = Color(122, 73, 62, 255),
        uiColor = Color(204, 67, 36, 255),
        elementIdx = 92
    ),

    DIRT(
        substanceName = "Dirt",
        color = Color(96, 82, 67, 255),
        conduitColor = Color(96, 82, 67, 255),
        uiColor = Color(171, 125, 0, 255),
        elementIdx = 93
    ),

    CEMENT(
        substanceName = "Cement",
        color = Color(202, 202, 202, 255),
        conduitColor = Color(202, 202, 202, 255),
        uiColor = Color(149, 149, 149, 255),
        elementIdx = 94
    ),

    POLLUTED_ICE(
        substanceName = "Polluted Ice",
        color = Color(155, 195, 200, 255),
        conduitColor = Color(155, 195, 200, 255),
        uiColor = Color(126, 204, 214, 255),
        elementIdx = 95
    ),

    CEMENT_MIX(
        substanceName = "Cement Mix",
        color = Color(200, 200, 200, 0),
        conduitColor = Color(200, 200, 200, 255),
        uiColor = Color(161, 161, 161, 255),
        elementIdx = 96
    ),

    FOSSIL(
        substanceName = "Fossil",
        color = Color(122, 103, 72, 1),
        conduitColor = Color(112, 95, 64, 255),
        uiColor = Color(255, 50, 0, 255),
        elementIdx = 97
    ),

    NEUTRONIUM(
        substanceName = "Neutronium",
        color = Color(255, 255, 255, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 0, 255, 255),
        elementIdx = 98
    ),

    CINNABAR_ORE(
        substanceName = "Cinnabar Ore",
        color = Color(255, 78, 31, 255),
        conduitColor = Color(219, 72, 40, 255),
        uiColor = Color(255, 78, 31, 255),
        elementIdx = 99
    ),

    SOLID_ETHANOL(
        substanceName = "Solid Ethanol",
        color = Color(0, 255, 202, 255),
        conduitColor = Color(0, 255, 202, 255),
        uiColor = Color(0, 255, 106, 255),
        elementIdx = 100
    ),

    PYRITE(
        substanceName = "Pyrite",
        color = Color(167, 142, 52, 255),
        conduitColor = Color(167, 142, 52, 255),
        uiColor = Color(255, 163, 13, 255),
        elementIdx = 101
    ),

    ALUMINUM(
        substanceName = "Aluminum",
        color = Color(149, 163, 171, 255),
        conduitColor = Color(127, 181, 202, 255),
        uiColor = Color(127, 181, 202, 255),
        elementIdx = 102
    ),

    LIQUID_HELIUM(
        substanceName = "Helium",
        color = Color(216, 48, 48, 0),
        conduitColor = Color(242, 71, 71, 0),
        uiColor = Color(148, 138, 183, 255),
        elementIdx = 103
    ),

    LIQUID_OXYGEN(
        substanceName = "Liquid Oxygen",
        color = Color(146, 222, 255, 255),
        conduitColor = Color(105, 219, 249, 255),
        uiColor = Color(87, 154, 169, 255),
        elementIdx = 104
    ),

    VISCO_GEL_FLUID(
        substanceName = "Visco-Gel Fluid",
        color = Color(79, 16, 183, 255),
        conduitColor = Color(79, 16, 183, 255),
        uiColor = Color(79, 16, 183, 255),
        elementIdx = 105
    ),

    MOLTEN_ALUMINUM(
        substanceName = "Molten Aluminum",
        color = Color(188, 188, 188, 255),
        conduitColor = Color(168, 168, 168, 255),
        uiColor = Color(95, 152, 173, 255),
        elementIdx = 106
    ),

    MOLTEN_LEAD(
        substanceName = "Molten Lead",
        color = Color(250, 178, 20, 255),
        conduitColor = Color(255, 101, 0, 255),
        uiColor = Color(241, 83, 0, 255),
        elementIdx = 107
    ),

    LIQUID_CARBON_DIOXIDE(
        substanceName = "Liquid Carbon Dioxide",
        color = Color(13, 13, 13, 255),
        conduitColor = Color(70, 67, 71, 255),
        uiColor = Color(135, 142, 183, 255),
        elementIdx = 108
    ),

    CRUDE_OIL(
        substanceName = "Crude Oil",
        color = Color(0, 0, 0, 255),
        conduitColor = Color(0, 0, 0, 255),
        uiColor = Color(48, 18, 101, 255),
        elementIdx = 109
    ),

    MOLTEN_GLASS(
        substanceName = "Molten Glass",
        color = Color(182, 255, 250, 0),
        conduitColor = Color(182, 255, 250, 255),
        uiColor = Color(121, 230, 255, 255),
        elementIdx = 110
    ),

    LIQUID_SULFUR(
        substanceName = "Liquid Sulfur",
        color = Color(255, 255, 0, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 255, 0, 255),
        elementIdx = 111
    ),

    MOLTEN_GOLD(
        substanceName = "Molten Gold",
        color = Color(255, 101, 0, 255),
        conduitColor = Color(255, 101, 0, 255),
        uiColor = Color(241, 83, 0, 255),
        elementIdx = 112
    ),

    MAGMA(
        substanceName = "Magma",
        color = Color(255, 26, 0, 255),
        conduitColor = Color(227, 56, 37, 255),
        uiColor = Color(174, 0, 0, 255),
        elementIdx = 113
    ),

    LIQUID_CHLORINE(
        substanceName = "Liquid Chlorine",
        color = Color(145, 229, 66, 255),
        conduitColor = Color(144, 208, 92, 255),
        uiColor = Color(58, 195, 48, 255),
        elementIdx = 114
    ),

    LIQUID_HYDROGEN(
        substanceName = "Liquid Hydrogen",
        color = Color(216, 84, 141, 0),
        conduitColor = Color(214, 116, 147, 0),
        uiColor = Color(255, 0, 110, 255),
        elementIdx = 115
    ),

    LIQUID_RESIN(
        substanceName = "Liquid Resin",
        color = Color(204, 139, 24, 255),
        conduitColor = Color(204, 139, 24, 255),
        uiColor = Color(204, 139, 24, 255),
        elementIdx = 116
    ),

    GUNK(
        substanceName = "Gunk",
        color = Color(81, 35, 96, 255),
        conduitColor = Color(81, 35, 96, 255),
        uiColor = Color(81, 35, 96, 255),
        elementIdx = 117
    ),

    LIQUID_PROPANE(
        substanceName = "Liquid Propane",
        color = Color(41, 60, 255, 255),
        conduitColor = Color(64, 80, 236, 255),
        uiColor = Color(110, 149, 179, 255),
        elementIdx = 118
    ),

    MOLTEN_TUNGSTEN(
        substanceName = "Molten Tungsten",
        color = Color(192, 44, 41, 255),
        conduitColor = Color(188, 26, 66, 255),
        uiColor = Color(229, 41, 14, 255),
        elementIdx = 119
    ),

    PETROLEUM(
        substanceName = "Petroleum",
        color = Color(255, 195, 37, 255),
        conduitColor = Color(255, 195, 37, 255),
        uiColor = Color(255, 195, 37, 255),
        elementIdx = 120
    ),

    MOLTEN_SALT(
        substanceName = "Molten Salt",
        color = Color(255, 0, 33, 255),
        conduitColor = Color(217, 115, 85, 255),
        uiColor = Color(245, 137, 112, 255),
        elementIdx = 121
    ),

    MOLTEN_COBALT(
        substanceName = "Molten Cobalt",
        color = Color(0, 29, 206, 255),
        conduitColor = Color(0, 29, 206, 255),
        uiColor = Color(0, 29, 206, 255),
        elementIdx = 122
    ),

    BRINE(
        substanceName = "Brine",
        color = Color(255, 255, 255, 87),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(173, 233, 229, 255),
        elementIdx = 123
    ),

    LIQUID_NUCLEAR_WASTE(
        substanceName = "Liquid Nuclear Waste",
        color = Color(145, 221, 91, 255),
        conduitColor = Color(145, 221, 91, 255),
        uiColor = Color(129, 176, 0, 255),
        elementIdx = 124
    ),

    SUPER_COOLANT(
        substanceName = "Super Coolant",
        color = Color(55, 173, 147, 255),
        conduitColor = Color(55, 173, 147, 255),
        uiColor = Color(55, 173, 147, 255),
        elementIdx = 125
    ),

    ETHANOL(
        substanceName = "Ethanol",
        color = Color(0, 255, 202, 255),
        conduitColor = Color(0, 255, 202, 255),
        uiColor = Color(0, 255, 106, 255),
        elementIdx = 126
    ),

    PHYTO_OIL(
        substanceName = "Phyto Oil",
        color = Color(152, 168, 47, 255),
        conduitColor = Color(152, 168, 47, 255),
        uiColor = Color(152, 168, 47, 255),
        elementIdx = 127
    ),

    BRACKENE(
        substanceName = "Brackene",
        color = Color(134, 255, 164, 255),
        conduitColor = Color(204, 238, 232, 255),
        uiColor = Color(204, 238, 232, 255),
        elementIdx = 128
    ),

    LIQUID_METHANE(
        substanceName = "Liquid Methane",
        color = Color(255, 110, 15, 0),
        conduitColor = Color(189, 93, 29, 0),
        uiColor = Color(255, 157, 0, 255),
        elementIdx = 129
    ),

    MOLTEN_IRON(
        substanceName = "Molten Iron",
        color = Color(84, 29, 9, 255),
        conduitColor = Color(103, 63, 49, 255),
        uiColor = Color(95, 152, 173, 255),
        elementIdx = 130
    ),

    LIQUID_CARBON(
        substanceName = "Liquid Carbon",
        color = Color(55, 34, 40, 255),
        conduitColor = Color(55, 34, 40, 255),
        uiColor = Color(128, 128, 128, 255),
        elementIdx = 131
    ),

    MOLTEN_SYNTHESIS_GAS(
        substanceName = "Molten Synthesis Gas",
        color = Color(255, 112, 69, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(0, 255, 116, 255),
        elementIdx = 132
    ),

    NECTAR(
        substanceName = "Nectar",
        color = Color(229, 226, 179, 0),
        conduitColor = Color(215, 217, 202, 255),
        uiColor = Color(255, 255, 255, 255),
        elementIdx = 133
    ),

    LIQUID_NAPHTHA(
        substanceName = "Liquid Naphtha",
        color = Color(0, 0, 0, 0),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(176, 0, 255, 255),
        elementIdx = 134
    ),

    LIQUID_SUCROSE(
        substanceName = "Liquid Sucrose",
        color = Color(135, 104, 36, 0),
        conduitColor = Color(241, 158, 164, 255),
        uiColor = Color(255, 255, 255, 255),
        elementIdx = 135
    ),

    LIQUID_PHOSPHORUS(
        substanceName = "Liquid Phosphorus",
        color = Color(62, 20, 37, 255),
        conduitColor = Color(60, 25, 45, 255),
        uiColor = Color(144, 139, 183, 255),
        elementIdx = 136
    ),

    MOLTEN_STEEL(
        substanceName = "Molten Steel",
        color = Color(161, 16, 72, 255),
        conduitColor = Color(221, 3, 39, 255),
        uiColor = Color(238, 44, 81, 255),
        elementIdx = 137
    ),

    MOLTEN_NIOBIUM(
        substanceName = "Molten Niobium",
        color = Color(52, 130, 91, 255),
        conduitColor = Color(52, 130, 91, 255),
        uiColor = Color(94, 253, 173, 255),
        elementIdx = 138
    ),

    MERCURY(
        substanceName = "Mercury",
        color = Color(105, 139, 180, 255),
        conduitColor = Color(62, 123, 195, 255),
        uiColor = Color(115, 147, 180, 255),
        elementIdx = 139
    ),

    POLLUTED_WATER(
        substanceName = "Polluted Water",
        color = Color(191, 188, 73, 255),
        conduitColor = Color(143, 140, 73, 192),
        uiColor = Color(71, 69, 6, 255),
        elementIdx = 140
    ),

    WATER(
        substanceName = "Water",
        color = Color(85, 190, 210, 255),
        conduitColor = Color(49, 146, 165, 255),
        uiColor = Color(0, 99, 255, 255),
        elementIdx = 141
    ),

    SALT_WATER(
        substanceName = "Salt Water",
        color = Color(206, 210, 236, 255),
        conduitColor = Color(206, 210, 236, 255),
        uiColor = Color(206, 210, 236, 255),
        elementIdx = 142
    ),

    LIQUID_URANIUM(
        substanceName = "Liquid Uranium",
        color = Color(204, 233, 71, 255),
        conduitColor = Color(197, 233, 71, 255),
        uiColor = Color(162, 221, 16, 255),
        elementIdx = 143
    ),

    MOLTEN_COPPER(
        substanceName = "Molten Copper",
        color = Color(224, 57, 14, 255),
        conduitColor = Color(224, 57, 14, 255),
        uiColor = Color(224, 57, 14, 255),
        elementIdx = 144
    ),

    SULFUR_GAS(
        substanceName = "Sulfur Gas",
        color = Color(255, 255, 0, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 255, 0, 255),
        elementIdx = 145
    ),

    SALT_GAS(
        substanceName = "Salt Gas",
        color = Color(255, 196, 155, 255),
        conduitColor = Color(226, 158, 150, 255),
        uiColor = Color(255, 255, 255, 255),
        elementIdx = 146
    ),

    PROPANE_GAS(
        substanceName = "Propane Gas",
        color = Color(39, 94, 255, 255),
        conduitColor = Color(64, 80, 236, 255),
        uiColor = Color(121, 144, 209, 255),
        elementIdx = 147
    ),

    NIOBIUM_GAS(
        substanceName = "Niobium Gas",
        color = Color(52, 130, 91, 255),
        conduitColor = Color(52, 130, 91, 255),
        uiColor = Color(94, 253, 173, 255),
        elementIdx = 148
    ),

    HELIUM(
        substanceName = "Helium",
        color = Color(206, 44, 44, 0),
        conduitColor = Color(242, 71, 71, 0),
        uiColor = Color(200, 159, 185, 255),
        elementIdx = 149
    ),

    OXYGEN(
        substanceName = "Oxygen",
        color = Color(46, 192, 231, 133),
        conduitColor = Color(105, 219, 249, 255),
        uiColor = Color(183, 255, 255, 255),
        elementIdx = 150
    ),

    COBALT_GAS(
        substanceName = "Cobalt Gas",
        color = Color(0, 33, 236, 255),
        conduitColor = Color(0, 33, 236, 255),
        uiColor = Color(0, 33, 236, 255),
        elementIdx = 151
    ),

    STEEL_GAS(
        substanceName = "Steel Gas",
        color = Color(56, 33, 25, 255),
        conduitColor = Color(103, 63, 49, 255),
        uiColor = Color(203, 158, 178, 255),
        elementIdx = 152
    ),

    CHLORINE_GAS(
        substanceName = "Chlorine Gas",
        color = Color(149, 219, 92, 255),
        conduitColor = Color(144, 208, 92, 255),
        uiColor = Color(4, 167, 120, 255),
        elementIdx = 153
    ),

    HYDROGEN_GAS(
        substanceName = "Hydrogen Gas",
        color = Color(233, 99, 141, 0),
        conduitColor = Color(214, 116, 147, 0),
        uiColor = Color(197, 31, 139, 255),
        elementIdx = 154
    ),

    SOUR_GAS(
        substanceName = "Sour Gas",
        color = Color(118, 36, 93, 255),
        conduitColor = Color(118, 36, 93, 255),
        uiColor = Color(118, 36, 93, 255),
        elementIdx = 155
    ),

    STEAM(
        substanceName = "Steam",
        color = Color(133, 200, 226, 255),
        conduitColor = Color(174, 207, 255, 255),
        uiColor = Color(133, 201, 227, 255),
        elementIdx = 156
    ),

    NATURAL_GAS(
        substanceName = "Natural Gas",
        color = Color(255, 110, 15, 0),
        conduitColor = Color(189, 93, 29, 0),
        uiColor = Color(255, 110, 15, 255),
        elementIdx = 157
    ),

    MERCURY_GAS(
        substanceName = "Mercury Gas",
        color = Color(81, 127, 180, 255),
        conduitColor = Color(81, 127, 180, 255),
        uiColor = Color(77, 109, 202, 255),
        elementIdx = 158
    ),

    GOLD_GAS(
        substanceName = "Gold Gas",
        color = Color(217, 167, 17, 255),
        conduitColor = Color(217, 167, 17, 255),
        uiColor = Color(255, 226, 141, 255),
        elementIdx = 159
    ),

    ETHANOL_GAS(
        substanceName = "Ethanol Gas",
        color = Color(0, 255, 202, 255),
        conduitColor = Color(0, 255, 202, 255),
        uiColor = Color(0, 255, 106, 255),
        elementIdx = 160
    ),

    ROCK_GAS(
        substanceName = "Rock Gas",
        color = Color(140, 127, 126, 255),
        conduitColor = Color(226, 158, 150, 255),
        uiColor = Color(178, 178, 178, 255),
        elementIdx = 161
    ),

    CARBON_GAS(
        substanceName = "Carbon Gas",
        color = Color(19, 12, 39, 255),
        conduitColor = Color(43, 36, 66, 255),
        uiColor = Color(186, 162, 198, 255),
        elementIdx = 162
    ),

    SUPER_COOLANT_GAS(
        substanceName = "Super Coolant Gas",
        color = Color(55, 173, 147, 255),
        conduitColor = Color(55, 173, 147, 255),
        uiColor = Color(55, 173, 147, 255),
        elementIdx = 163
    ),

    ALUMINUM_GAS(
        substanceName = "Aluminum Gas",
        color = Color(255, 255, 255, 255),
        conduitColor = Color(207, 207, 207, 255),
        uiColor = Color(209, 237, 248, 255),
        elementIdx = 164
    ),

    TUNGSTEN_GAS(
        substanceName = "Tungsten Gas",
        color = Color(56, 33, 25, 255),
        conduitColor = Color(103, 63, 49, 255),
        uiColor = Color(255, 0, 125, 255),
        elementIdx = 165
    ),

    POLLUTED_OXYGEN(
        substanceName = "Polluted Oxygen",
        color = Color(116, 113, 43, 192),
        conduitColor = Color(83, 118, 102, 192),
        uiColor = Color(34, 79, 64, 255),
        elementIdx = 166
    ),

    LEAD_GAS(
        substanceName = "Lead Gas",
        color = Color(217, 167, 17, 255),
        conduitColor = Color(217, 167, 17, 255),
        uiColor = Color(255, 226, 141, 255),
        elementIdx = 167
    ),

    NUCLEAR_FALLOUT(
        substanceName = "Nuclear Fallout",
        color = Color(0, 255, 44, 0),
        conduitColor = Color(63, 255, 0, 255),
        uiColor = Color(0, 255, 44, 255),
        elementIdx = 168
    ),

    SYNTHESIS_GAS(
        substanceName = "Synthesis Gas",
        color = Color(255, 112, 69, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(243, 255, 0, 255),
        elementIdx = 169
    ),

    IRON_GAS(
        substanceName = "Iron Gas",
        color = Color(122, 73, 62, 255),
        conduitColor = Color(122, 73, 62, 255),
        uiColor = Color(204, 67, 36, 255),
        elementIdx = 170
    ),

    PHOSPHORUS_GAS(
        substanceName = "Phosphorus Gas",
        color = Color(200, 61, 128, 115),
        conduitColor = Color(200, 61, 128, 255),
        uiColor = Color(166, 79, 121, 255),
        elementIdx = 171
    ),

    CARBON_DIOXIDE(
        substanceName = "Carbon Dioxide",
        color = Color(30, 30, 30, 255),
        conduitColor = Color(30, 30, 30, 255),
        uiColor = Color(0, 0, 0, 255),
        elementIdx = 172
    ),

    COPPER_GAS(
        substanceName = "Copper Gas",
        color = Color(219, 84, 40, 255),
        conduitColor = Color(219, 84, 40, 255),
        uiColor = Color(255, 156, 8, 255),
        elementIdx = 173
    ),

    VOID(
        substanceName = "Void",
        color = Color(225, 220, 139, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 255, 0, 255),
        elementIdx = 174
    ),

    COMPOSITION(
        substanceName = "Composition",
        color = Color(0, 0, 0, 0),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(255, 0, 9, 255),
        elementIdx = 175
    ),

    VACUUM(
        substanceName = "Vacuum",
        color = Color(255, 255, 255, 255),
        conduitColor = Color(255, 255, 255, 255),
        uiColor = Color(120, 91, 137, 255),
        elementIdx = 176
    )

}
