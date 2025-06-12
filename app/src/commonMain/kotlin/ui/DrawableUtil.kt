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

package ui

import androidx.compose.runtime.Composable
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.asteroid_blasted_ceres
import io.github.stefanoltmann.app.generated.resources.asteroid_blasted_ceres_spaced_out
import io.github.stefanoltmann.app.generated.resources.asteroid_glowood_wasteland
import io.github.stefanoltmann.app.generated.resources.asteroid_irradiated_forest
import io.github.stefanoltmann.app.generated.resources.asteroid_irradiated_marsh
import io.github.stefanoltmann.app.generated.resources.asteroid_irradiated_swampy
import io.github.stefanoltmann.app.generated.resources.asteroid_marshy
import io.github.stefanoltmann.app.generated.resources.asteroid_mini_shattered_geo
import io.github.stefanoltmann.app.generated.resources.asteroid_mini_shattered_start
import io.github.stefanoltmann.app.generated.resources.asteroid_mini_shattered_warp
import io.github.stefanoltmann.app.generated.resources.asteroid_mixing_ceres
import io.github.stefanoltmann.app.generated.resources.asteroid_moo
import io.github.stefanoltmann.app.generated.resources.asteroid_oily_swamp
import io.github.stefanoltmann.app.generated.resources.asteroid_radioactive_forest
import io.github.stefanoltmann.app.generated.resources.asteroid_radioactive_swamp
import io.github.stefanoltmann.app.generated.resources.asteroid_radioactive_terra
import io.github.stefanoltmann.app.generated.resources.asteroid_radioactive_terrabog
import io.github.stefanoltmann.app.generated.resources.asteroid_regolith
import io.github.stefanoltmann.app.generated.resources.asteroid_rusty_oil
import io.github.stefanoltmann.app.generated.resources.asteroid_spacedout_ceres
import io.github.stefanoltmann.app.generated.resources.asteroid_spacedout_ceres_minor
import io.github.stefanoltmann.app.generated.resources.asteroid_stinko_swamp
import io.github.stefanoltmann.app.generated.resources.asteroid_superconductive
import io.github.stefanoltmann.app.generated.resources.asteroid_tundra
import io.github.stefanoltmann.app.generated.resources.asteroid_water
import io.github.stefanoltmann.app.generated.resources.biome_barren
import io.github.stefanoltmann.app.generated.resources.biome_carrot_quarry
import io.github.stefanoltmann.app.generated.resources.biome_forest
import io.github.stefanoltmann.app.generated.resources.biome_frozen
import io.github.stefanoltmann.app.generated.resources.biome_icecaves
import io.github.stefanoltmann.app.generated.resources.biome_jungle
import io.github.stefanoltmann.app.generated.resources.biome_magma
import io.github.stefanoltmann.app.generated.resources.biome_marsh
import io.github.stefanoltmann.app.generated.resources.biome_metallic
import io.github.stefanoltmann.app.generated.resources.biome_moo
import io.github.stefanoltmann.app.generated.resources.biome_ocean
import io.github.stefanoltmann.app.generated.resources.biome_oil
import io.github.stefanoltmann.app.generated.resources.biome_radioactive
import io.github.stefanoltmann.app.generated.resources.biome_rust
import io.github.stefanoltmann.app.generated.resources.biome_sandstone
import io.github.stefanoltmann.app.generated.resources.biome_space
import io.github.stefanoltmann.app.generated.resources.biome_sugarwoods
import io.github.stefanoltmann.app.generated.resources.biome_swamp
import io.github.stefanoltmann.app.generated.resources.biome_wasteland
import io.github.stefanoltmann.app.generated.resources.building_anti_entropy_thermo_nullifier
import io.github.stefanoltmann.app.generated.resources.building_cryotank
import io.github.stefanoltmann.app.generated.resources.building_neural_vacillator
import io.github.stefanoltmann.app.generated.resources.building_printing_pod
import io.github.stefanoltmann.app.generated.resources.building_sap_tree
import io.github.stefanoltmann.app.generated.resources.building_supply_teleporter_input
import io.github.stefanoltmann.app.generated.resources.building_supply_teleporter_output
import io.github.stefanoltmann.app.generated.resources.building_teleporter_receiver
import io.github.stefanoltmann.app.generated.resources.building_teleporter_transmitter
import io.github.stefanoltmann.app.generated.resources.building_temporal_tear_opener
import io.github.stefanoltmann.app.generated.resources.cluster_base_arboria
import io.github.stefanoltmann.app.generated.resources.cluster_base_aridio
import io.github.stefanoltmann.app.generated.resources.cluster_base_ceres
import io.github.stefanoltmann.app.generated.resources.cluster_base_oasisse
import io.github.stefanoltmann.app.generated.resources.cluster_base_oceania
import io.github.stefanoltmann.app.generated.resources.cluster_base_rime
import io.github.stefanoltmann.app.generated.resources.cluster_base_terra
import io.github.stefanoltmann.app.generated.resources.cluster_base_the_badlands
import io.github.stefanoltmann.app.generated.resources.cluster_base_verdante
import io.github.stefanoltmann.app.generated.resources.cluster_base_volcanea
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_arboria
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_aridio
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_ceres
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_ceres_mantle
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_ceres_minor
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_flipped_moonlet
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_folia
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_frozen_forest_moonlet
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_metallic_swampy_moonlet
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_oasisse
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_oceania
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_quagmiris
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_radioactive_ocean_moonlet
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_rime
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_squelchy
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_terra
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_terrania
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_the_badlands
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_the_desolands_moonlet
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_verdante
import io.github.stefanoltmann.app.generated.resources.cluster_spacedout_volcanea
import io.github.stefanoltmann.app.generated.resources.gamemode_basegame_standard
import io.github.stefanoltmann.app.generated.resources.gamemode_basegame_thelab
import io.github.stefanoltmann.app.generated.resources.gamemode_spacedout_classic
import io.github.stefanoltmann.app.generated.resources.gamemode_spacedout_spacedout
import io.github.stefanoltmann.app.generated.resources.gamemode_spacedout_thelab
import io.github.stefanoltmann.app.generated.resources.geyser_aluminum_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_carbon_dioxide
import io.github.stefanoltmann.app.generated.resources.geyser_carbon_dioxide_vent
import io.github.stefanoltmann.app.generated.resources.geyser_chlorine_gas_vent
import io.github.stefanoltmann.app.generated.resources.geyser_cobalt_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_cool_salt_slush_geyser
import io.github.stefanoltmann.app.generated.resources.geyser_cool_slush_geyser
import io.github.stefanoltmann.app.generated.resources.geyser_cool_steam_vent
import io.github.stefanoltmann.app.generated.resources.geyser_copper_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_gold_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_hot_polluted_oxygen_vent
import io.github.stefanoltmann.app.generated.resources.geyser_hydrogen_vent
import io.github.stefanoltmann.app.generated.resources.geyser_infectious_polluted_oxygen_vent
import io.github.stefanoltmann.app.generated.resources.geyser_iron_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_leaky_oil_fissure
import io.github.stefanoltmann.app.generated.resources.geyser_liquid_sulfur_geyser
import io.github.stefanoltmann.app.generated.resources.geyser_minor_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_natural_gas_geyser
import io.github.stefanoltmann.app.generated.resources.geyser_niobium_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_oil_reservoir
import io.github.stefanoltmann.app.generated.resources.geyser_polluted_water_vent
import io.github.stefanoltmann.app.generated.resources.geyser_salt_water
import io.github.stefanoltmann.app.generated.resources.geyser_steam_vent
import io.github.stefanoltmann.app.generated.resources.geyser_tungsten_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_volcano
import io.github.stefanoltmann.app.generated.resources.geyser_water
import io.github.stefanoltmann.app.generated.resources.poi_artifact_outline
import io.github.stefanoltmann.app.generated.resources.poi_ceres_tech_unlock
import io.github.stefanoltmann.app.generated.resources.poi_crashed_satellite
import io.github.stefanoltmann.app.generated.resources.poi_crushed_satellite
import io.github.stefanoltmann.app.generated.resources.poi_geothermal_controller_entity
import io.github.stefanoltmann.app.generated.resources.poi_geothermal_vent_entity
import io.github.stefanoltmann.app.generated.resources.poi_prop_facility_statue
import io.github.stefanoltmann.app.generated.resources.poi_wrecked_satellite
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_1
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_2
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_3
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_4
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_5
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_6
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_7
import io.github.stefanoltmann.app.generated.resources.spacepoi_artifact_8
import io.github.stefanoltmann.app.generated.resources.spacepoi_carbon_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_ceres_debris_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_ceres_starting_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_chlorine_cloud
import io.github.stefanoltmann.app.generated.resources.spacepoi_foresty_ore_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_frozen_ore_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_gas_giant_cloud
import io.github.stefanoltmann.app.generated.resources.spacepoi_gilded_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_glimmering_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_helium_cloud
import io.github.stefanoltmann.app.generated.resources.spacepoi_ice_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_interstellar_ice_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_interstellar_ocean
import io.github.stefanoltmann.app.generated.resources.spacepoi_metallic_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_oily_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_organic_mass_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_oxidized_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_oxygen_rich_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_radioactive_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_radioactive_gas_cloud
import io.github.stefanoltmann.app.generated.resources.spacepoi_rocky_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_russells_teapot
import io.github.stefanoltmann.app.generated.resources.spacepoi_salty_asteroid_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_sandy_ore_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_satellite_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_swampy_ore_field
import io.github.stefanoltmann.app.generated.resources.spacepoi_temporal_tear
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_carbonaceous_asteroid
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_chlorine_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_dlc2_ceres_space_destination
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_dusty_moon
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_earth
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_forest_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_gas_giant
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_gold_asteroid
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_helium_giant
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_ice_giant
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_icy_dwarf
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_metallic_asteroid
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_oily_asteriod
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_organic_dwarf
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_red_dwarf
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_rocky_asteroid
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_rust_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_salt_desert_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_salt_dwarf
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_satellite
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_shiny_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_terra_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_volcano_planet
import io.github.stefanoltmann.app.generated.resources.vanilla_spacepoi_wormhole
import io.github.stefanoltmann.app.generated.resources.worldtrait_boulders_large
import io.github.stefanoltmann.app.generated.resources.worldtrait_boulders_medium
import io.github.stefanoltmann.app.generated.resources.worldtrait_boulders_mixed
import io.github.stefanoltmann.app.generated.resources.worldtrait_boulders_small
import io.github.stefanoltmann.app.generated.resources.worldtrait_crashed_satellites
import io.github.stefanoltmann.app.generated.resources.worldtrait_deep_oil
import io.github.stefanoltmann.app.generated.resources.worldtrait_distress_signal
import io.github.stefanoltmann.app.generated.resources.worldtrait_frozen_core
import io.github.stefanoltmann.app.generated.resources.worldtrait_geoactive
import io.github.stefanoltmann.app.generated.resources.worldtrait_geodes
import io.github.stefanoltmann.app.generated.resources.worldtrait_geodormant
import io.github.stefanoltmann.app.generated.resources.worldtrait_glaciers_large
import io.github.stefanoltmann.app.generated.resources.worldtrait_irregular_oil
import io.github.stefanoltmann.app.generated.resources.worldtrait_lush_core
import io.github.stefanoltmann.app.generated.resources.worldtrait_magma_vents
import io.github.stefanoltmann.app.generated.resources.worldtrait_metal_caves
import io.github.stefanoltmann.app.generated.resources.worldtrait_metal_poor
import io.github.stefanoltmann.app.generated.resources.worldtrait_metal_rich
import io.github.stefanoltmann.app.generated.resources.worldtrait_misaligned_start
import io.github.stefanoltmann.app.generated.resources.worldtrait_radioactive_crust
import io.github.stefanoltmann.app.generated.resources.worldtrait_slime_splats
import io.github.stefanoltmann.app.generated.resources.worldtrait_subsurface_ocean
import io.github.stefanoltmann.app.generated.resources.worldtrait_volcanoes
import model.AsteroidType
import model.ClusterType
import model.GeyserType
import model.PointOfInterestType
import model.SpacedOutSpacePOI
import model.VanillaSpacePOI
import model.WorldTrait
import model.ZoneType
import model.filter.GameModeType
import org.jetbrains.compose.resources.DrawableResource

fun getWorldTraitDrawable(worldTrait: WorldTrait): DrawableResource =
    when (worldTrait) {
        WorldTrait.BouldersLarge -> Res.drawable.worldtrait_boulders_large
        WorldTrait.BouldersMedium -> Res.drawable.worldtrait_boulders_medium
        WorldTrait.BouldersMixed -> Res.drawable.worldtrait_boulders_mixed
        WorldTrait.BouldersSmall -> Res.drawable.worldtrait_boulders_small
        WorldTrait.DeepOil -> Res.drawable.worldtrait_deep_oil
        WorldTrait.FrozenCore -> Res.drawable.worldtrait_frozen_core
        WorldTrait.GeoActive -> Res.drawable.worldtrait_geoactive
        WorldTrait.Geodes -> Res.drawable.worldtrait_geodes
        WorldTrait.GeoDormant -> Res.drawable.worldtrait_geodormant
        WorldTrait.GlaciersLarge -> Res.drawable.worldtrait_glaciers_large
        WorldTrait.IrregularOil -> Res.drawable.worldtrait_irregular_oil
        WorldTrait.MagmaVents -> Res.drawable.worldtrait_magma_vents
        WorldTrait.MetalPoor -> Res.drawable.worldtrait_metal_poor
        WorldTrait.MetalRich -> Res.drawable.worldtrait_metal_rich
        WorldTrait.MisalignedStart -> Res.drawable.worldtrait_misaligned_start
        WorldTrait.SlimeSplats -> Res.drawable.worldtrait_slime_splats
        WorldTrait.SubsurfaceOcean -> Res.drawable.worldtrait_subsurface_ocean
        WorldTrait.Volcanoes -> Res.drawable.worldtrait_volcanoes
        WorldTrait.CrashedSatellites -> Res.drawable.worldtrait_crashed_satellites
        WorldTrait.DistressSignal -> Res.drawable.worldtrait_distress_signal
        WorldTrait.LushCore -> Res.drawable.worldtrait_lush_core
        WorldTrait.MetalCaves -> Res.drawable.worldtrait_metal_caves
        WorldTrait.RadioactiveCrust -> Res.drawable.worldtrait_radioactive_crust
    }

fun getGeyserDrawable(geyserType: GeyserType): DrawableResource =
    when (geyserType) {
        GeyserType.COOL_STEAM -> Res.drawable.geyser_cool_steam_vent
        GeyserType.HOT_STEAM -> Res.drawable.geyser_steam_vent
        GeyserType.WATER -> Res.drawable.geyser_water
        GeyserType.COOL_SLUSH_WATER -> Res.drawable.geyser_cool_slush_geyser
        GeyserType.POLLUTED_WATER -> Res.drawable.geyser_polluted_water_vent
        GeyserType.COOL_SALT_WATER -> Res.drawable.geyser_cool_salt_slush_geyser
        GeyserType.HOT_SALT_WATER -> Res.drawable.geyser_salt_water
        GeyserType.MINOR_VOLCANO -> Res.drawable.geyser_minor_volcano
        GeyserType.VOLCANO -> Res.drawable.geyser_volcano
        GeyserType.LIQUID_CO2 -> Res.drawable.geyser_carbon_dioxide
        GeyserType.HOT_CO2 -> Res.drawable.geyser_carbon_dioxide_vent
        GeyserType.HYDROGEN -> Res.drawable.geyser_hydrogen_vent
        GeyserType.HOT_POLLUTED_O2 -> Res.drawable.geyser_hot_polluted_oxygen_vent
        GeyserType.INFECTIOUS_POLLUTED_O2 -> Res.drawable.geyser_infectious_polluted_oxygen_vent
        GeyserType.CHLORINE -> Res.drawable.geyser_chlorine_gas_vent
        GeyserType.NATURAL_GAS -> Res.drawable.geyser_natural_gas_geyser
        GeyserType.COPPER_VOLCANO -> Res.drawable.geyser_copper_volcano
        GeyserType.IRON_VOLCANO -> Res.drawable.geyser_iron_volcano
        GeyserType.GOLD_VOLCANO -> Res.drawable.geyser_gold_volcano
        GeyserType.LEAKY_OIL_FISSURE -> Res.drawable.geyser_leaky_oil_fissure
        GeyserType.ALUMINIUM_VOLCANO -> Res.drawable.geyser_aluminum_volcano
        GeyserType.COBALT_VOLCANO -> Res.drawable.geyser_cobalt_volcano
        GeyserType.LIQUID_SULFUR_GEYSER -> Res.drawable.geyser_liquid_sulfur_geyser
        GeyserType.TUNGSTEN_VOLCANO -> Res.drawable.geyser_tungsten_volcano
        GeyserType.NIOBIUM_VOLCANO -> Res.drawable.geyser_niobium_volcano
        GeyserType.OIL_RESERVOIR -> Res.drawable.geyser_oil_reservoir
    }

fun getPointOfInterestDrawable(pointOfInterestType: PointOfInterestType): DrawableResource =
    when (pointOfInterestType) {
        PointOfInterestType.PRINTING_POD -> Res.drawable.building_printing_pod
        PointOfInterestType.SUPPLY_TELEPORTER_INPUT -> Res.drawable.building_supply_teleporter_input
        PointOfInterestType.SUPPLY_TELEPORTER_OUTPUT -> Res.drawable.building_supply_teleporter_output
        PointOfInterestType.TELEPORTER_TRANSMITTER -> Res.drawable.building_teleporter_transmitter
        PointOfInterestType.TELEPORTER_RECEIVER -> Res.drawable.building_teleporter_receiver
        PointOfInterestType.NEURAL_VACILLATOR -> Res.drawable.building_neural_vacillator
        PointOfInterestType.ANTI_ENTROPY_THERMO_NULLIFIER -> Res.drawable.building_anti_entropy_thermo_nullifier
        PointOfInterestType.EXPERIMENT_52B -> Res.drawable.building_sap_tree
        PointOfInterestType.ARTIFACT -> Res.drawable.poi_artifact_outline
        PointOfInterestType.CRASHED_SATELLITE -> Res.drawable.poi_crashed_satellite
        PointOfInterestType.WRECKED_SATELLITE -> Res.drawable.poi_wrecked_satellite
        PointOfInterestType.CRUSHED_SATELLITE -> Res.drawable.poi_crushed_satellite
        PointOfInterestType.TEMPORAL_TEAR_OPENER -> Res.drawable.building_temporal_tear_opener
        PointOfInterestType.CRYOTANK -> Res.drawable.building_cryotank
        PointOfInterestType.PropFacilityStatue -> Res.drawable.poi_prop_facility_statue
        PointOfInterestType.GeothermalVentEntity -> Res.drawable.poi_geothermal_vent_entity
        PointOfInterestType.GeothermalControllerEntity -> Res.drawable.poi_geothermal_controller_entity
        PointOfInterestType.POICeresTechUnlock -> Res.drawable.poi_ceres_tech_unlock
    }

@Composable
fun getClusterDrawable(clusterType: ClusterType): DrawableResource =
    when (clusterType) {
        ClusterType.BASE_TERRA -> Res.drawable.cluster_base_terra
        ClusterType.BASE_CERES -> Res.drawable.cluster_base_ceres
        ClusterType.BASE_RELICA -> TODO()
        ClusterType.BASE_RELICA_LAB -> TODO()
        ClusterType.BASE_BLASTED_CERES -> Res.drawable.asteroid_blasted_ceres
        ClusterType.BASE_OCEANIA -> Res.drawable.cluster_base_oceania
        ClusterType.BASE_RIME -> Res.drawable.cluster_base_rime
        ClusterType.BASE_VERDANTE -> Res.drawable.cluster_base_verdante
        ClusterType.BASE_ARBORIA -> Res.drawable.cluster_base_arboria
        ClusterType.BASE_VOLCANEA -> Res.drawable.cluster_base_volcanea
        ClusterType.BASE_THE_BADLANDS -> Res.drawable.cluster_base_the_badlands
        ClusterType.BASE_ARIDIO -> Res.drawable.cluster_base_aridio
        ClusterType.BASE_OASISSE -> Res.drawable.cluster_base_oasisse
        ClusterType.DLC_TERRA -> Res.drawable.cluster_spacedout_terra
        ClusterType.DLC_CERES -> Res.drawable.asteroid_spacedout_ceres
        ClusterType.DLC_RELICA -> TODO()
        ClusterType.DLC_RELICA_LAB -> TODO()
        ClusterType.DLC_BLASTED_CERES -> Res.drawable.asteroid_blasted_ceres_spaced_out
        ClusterType.DLC_CERES_MINOR -> Res.drawable.asteroid_spacedout_ceres_minor
        ClusterType.DLC_RELICA_MINOR -> TODO()
        ClusterType.DLC_OCEANIA -> Res.drawable.cluster_spacedout_oceania
        ClusterType.DLC_SQUELCHY -> Res.drawable.cluster_spacedout_squelchy
        ClusterType.DLC_RIME -> Res.drawable.cluster_spacedout_rime
        ClusterType.DLC_VERDANTE -> Res.drawable.cluster_spacedout_verdante
        ClusterType.DLC_ARBORIA -> Res.drawable.cluster_spacedout_arboria
        ClusterType.DLC_VOLCANEA -> Res.drawable.cluster_spacedout_volcanea
        ClusterType.DLC_THE_BADLANDS -> Res.drawable.cluster_spacedout_the_badlands
        ClusterType.DLC_ARIDIO -> Res.drawable.cluster_spacedout_aridio
        ClusterType.DLC_OASISSE -> Res.drawable.cluster_spacedout_oasisse
        ClusterType.DLC_TERRANIA -> Res.drawable.cluster_spacedout_terrania
        ClusterType.DLC_FOLIA -> Res.drawable.cluster_spacedout_folia
        ClusterType.DLC_QUAGMIRIS -> Res.drawable.cluster_spacedout_quagmiris
        ClusterType.DLC_METALLIC_SWAMPY_MOONLET -> Res.drawable.cluster_spacedout_metallic_swampy_moonlet
        ClusterType.DLC_THE_DESOLANDS_MOONLET -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        ClusterType.DLC_FROZEN_FOREST_MOONLET -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        ClusterType.DLC_FLIPPED_MOONLET -> Res.drawable.cluster_spacedout_flipped_moonlet
        ClusterType.DLC_RADIOACTIVE_OCEAN_MOONLET -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
        ClusterType.DLC_CERES_MANTLE -> Res.drawable.cluster_spacedout_ceres_mantle
    }

@Composable
fun getAsteroidTypeDrawable(asteroidType: AsteroidType): DrawableResource =
    when (asteroidType) {
        AsteroidType.TerraMoonlet -> Res.drawable.cluster_spacedout_terrania
        AsteroidType.IdealLandingSite -> Res.drawable.asteroid_irradiated_forest
        AsteroidType.WarpOilySwamp -> Res.drawable.asteroid_oily_swamp
        AsteroidType.TundraMoonlet -> Res.drawable.asteroid_tundra
        AsteroidType.MarshyMoonlet -> Res.drawable.asteroid_marshy
        AsteroidType.MooMoonlet -> Res.drawable.asteroid_moo
        AsteroidType.WaterMoonlet -> Res.drawable.asteroid_water
        AsteroidType.NiobiumMoonlet -> Res.drawable.asteroid_superconductive
        AsteroidType.RegolithMoonlet -> Res.drawable.asteroid_regolith
        AsteroidType.MiniBadlandsStart -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        AsteroidType.MiniRadioactiveOceanWarp -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
        AsteroidType.MiniMetallicSwampy -> Res.drawable.cluster_spacedout_metallic_swampy_moonlet
        AsteroidType.MiniForestFrozen -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        AsteroidType.MiniFlipped -> Res.drawable.cluster_spacedout_flipped_moonlet
        AsteroidType.SandstoneDefault -> Res.drawable.cluster_base_terra
        AsteroidType.Badlands -> Res.drawable.cluster_base_the_badlands
        AsteroidType.MiniBadlandsWarp -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        AsteroidType.MiniForestFrozenStart -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        AsteroidType.MiniRadioactiveOcean -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
        AsteroidType.SwampMoonlet -> Res.drawable.cluster_spacedout_quagmiris
        AsteroidType.MetalHeavyLandingSite -> Res.drawable.asteroid_irradiated_marsh
        AsteroidType.OilRichWarpTarget -> Res.drawable.asteroid_rusty_oil
        AsteroidType.VanillaForestDefault -> Res.drawable.cluster_spacedout_verdante
        AsteroidType.MediumSandyRadioactiveVanillaWarpPlanet -> Res.drawable.asteroid_radioactive_terra
        AsteroidType.MiniRegolithMoonlet -> Res.drawable.asteroid_regolith
        AsteroidType.VanillaSandstoneDefault -> Res.drawable.cluster_spacedout_terra
        AsteroidType.MediumRadioactiveVanillaWarpPlanet -> Res.drawable.asteroid_radioactive_swamp
        AsteroidType.VanillaSwampDefault -> Res.drawable.cluster_spacedout_squelchy
        AsteroidType.MediumForestyRadioactiveVanillaWarpPlanet -> Res.drawable.asteroid_radioactive_forest
        AsteroidType.VanillaOceania -> Res.drawable.cluster_spacedout_oceania
        AsteroidType.MediumForestyWasteland -> Res.drawable.asteroid_glowood_wasteland
        AsteroidType.MiniBadlands -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        AsteroidType.MiniRadioactiveOceanStart -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
        AsteroidType.MiniFlippedWarp -> Res.drawable.cluster_spacedout_flipped_moonlet
        AsteroidType.VanillaAridio -> Res.drawable.cluster_spacedout_aridio
        AsteroidType.MediumSandySwamp -> Res.drawable.asteroid_radioactive_terrabog
        AsteroidType.VanillaVolcanic -> Res.drawable.cluster_spacedout_volcanea
        AsteroidType.MiniFlippedStart -> Res.drawable.cluster_spacedout_flipped_moonlet
        AsteroidType.VanillaArboria -> Res.drawable.cluster_spacedout_arboria
        AsteroidType.VanillaSandstoneFrozen -> Res.drawable.cluster_spacedout_rime
        AsteroidType.MediumSwampy -> Res.drawable.asteroid_stinko_swamp
        AsteroidType.MiniMetallicSwampyStart -> Res.drawable.cluster_spacedout_metallic_swampy_moonlet
        AsteroidType.MiniForestFrozenWarp -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        AsteroidType.ForestMoonlet -> Res.drawable.cluster_spacedout_folia
        AsteroidType.SwampyLandingSite -> Res.drawable.asteroid_irradiated_swampy
        AsteroidType.VanillaBadlands -> Res.drawable.cluster_spacedout_the_badlands
        AsteroidType.ForestLush -> Res.drawable.cluster_base_verdante
        AsteroidType.Oceania -> Res.drawable.cluster_base_oceania
        AsteroidType.ForestDefault -> Res.drawable.cluster_base_arboria
        AsteroidType.ForestHot -> Res.drawable.cluster_base_aridio
        AsteroidType.SandstoneFrozen -> Res.drawable.cluster_base_rime
        AsteroidType.Oasis -> Res.drawable.cluster_base_oasisse
        AsteroidType.CeresSpacedOutAsteroid -> Res.drawable.cluster_spacedout_ceres_minor
        AsteroidType.CeresClassicAsteroid -> Res.drawable.cluster_spacedout_ceres
        AsteroidType.CeresBaseGameAsteroid -> Res.drawable.cluster_base_ceres
        AsteroidType.Volcanic -> Res.drawable.cluster_base_volcanea
        AsteroidType.VanillaOasis -> Res.drawable.cluster_spacedout_oasisse
        AsteroidType.MixingCeresAsteroid -> Res.drawable.asteroid_mixing_ceres
        AsteroidType.CeresClassicShatteredAsteroid -> Res.drawable.asteroid_blasted_ceres_spaced_out
        AsteroidType.CeresBaseGameShatteredAsteroid -> Res.drawable.asteroid_blasted_ceres
        AsteroidType.MiniShatteredStartAsteroid -> Res.drawable.asteroid_mini_shattered_start
        AsteroidType.MiniShatteredWarpAsteroid -> Res.drawable.asteroid_mini_shattered_warp
        AsteroidType.MiniShatteredGeoAsteroid -> Res.drawable.asteroid_mini_shattered_geo
        AsteroidType.WarpOilySandySwamp -> TODO()
        AsteroidType.PrehistoricBaseGameAsteroid -> TODO()
        AsteroidType.PrehistoricClassicAsteroid -> TODO()
        AsteroidType.PrehistoricSpacedOutAsteroid -> TODO()
        AsteroidType.PrehistoricShatteredBaseGameAsteroid -> TODO()
        AsteroidType.PrehistoricShatteredClassicAsteroid -> TODO()
        AsteroidType.MixingPrehistoricAsteroid -> TODO()
    }

@Composable
fun getSpacedOutSpacePOIDrawable(spacedOutSpacePOI: SpacedOutSpacePOI): DrawableResource =
    when (spacedOutSpacePOI) {
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation1 -> Res.drawable.spacepoi_artifact_1
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation2 -> Res.drawable.spacepoi_artifact_2
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation3 -> Res.drawable.spacepoi_artifact_3
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation4 -> Res.drawable.spacepoi_artifact_4
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation5 -> Res.drawable.spacepoi_artifact_5
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation6 -> Res.drawable.spacepoi_artifact_6
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation7 -> Res.drawable.spacepoi_artifact_7
        SpacedOutSpacePOI.ArtifactSpacePOI_GravitasSpaceStation8 -> Res.drawable.spacepoi_artifact_8
        SpacedOutSpacePOI.ArtifactSpacePOI_RussellsTeapot -> Res.drawable.spacepoi_russells_teapot
        SpacedOutSpacePOI.HarvestableSpacePOI_CarbonAsteroidField -> Res.drawable.spacepoi_carbon_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_ChlorineCloud -> Res.drawable.spacepoi_chlorine_cloud
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC2CeresField -> Res.drawable.spacepoi_ceres_debris_field
        SpacedOutSpacePOI.HarvestableSpacePOI_DLC2CeresOreField -> Res.drawable.spacepoi_ceres_starting_field
        SpacedOutSpacePOI.HarvestableSpacePOI_ForestyOreField -> Res.drawable.spacepoi_foresty_ore_field
        SpacedOutSpacePOI.HarvestableSpacePOI_FrozenOreField -> Res.drawable.spacepoi_frozen_ore_field
        SpacedOutSpacePOI.HarvestableSpacePOI_GasGiantCloud -> Res.drawable.spacepoi_gas_giant_cloud
        SpacedOutSpacePOI.HarvestableSpacePOI_GildedAsteroidField -> Res.drawable.spacepoi_gilded_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_GlimmeringAsteroidField -> Res.drawable.spacepoi_glimmering_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_HeliumCloud -> Res.drawable.spacepoi_helium_cloud
        SpacedOutSpacePOI.HarvestableSpacePOI_IceAsteroidField -> Res.drawable.spacepoi_ice_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_InterstellarIceField -> Res.drawable.spacepoi_interstellar_ice_field
        SpacedOutSpacePOI.HarvestableSpacePOI_InterstellarOcean -> Res.drawable.spacepoi_interstellar_ocean
        SpacedOutSpacePOI.HarvestableSpacePOI_MetallicAsteroidField -> Res.drawable.spacepoi_metallic_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_OilyAsteroidField -> Res.drawable.spacepoi_oily_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_OrganicMassField -> Res.drawable.spacepoi_organic_mass_field
        SpacedOutSpacePOI.HarvestableSpacePOI_OxidizedAsteroidField -> Res.drawable.spacepoi_oxidized_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_OxygenRichAsteroidField -> Res.drawable.spacepoi_oxygen_rich_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_RadioactiveAsteroidField -> Res.drawable.spacepoi_radioactive_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_RadioactiveGasCloud -> Res.drawable.spacepoi_radioactive_gas_cloud
        SpacedOutSpacePOI.HarvestableSpacePOI_RockyAsteroidField -> Res.drawable.spacepoi_rocky_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_SaltyAsteroidField -> Res.drawable.spacepoi_salty_asteroid_field
        SpacedOutSpacePOI.HarvestableSpacePOI_SandyOreField -> Res.drawable.spacepoi_sandy_ore_field
        SpacedOutSpacePOI.HarvestableSpacePOI_SatelliteField -> Res.drawable.spacepoi_satellite_field
        SpacedOutSpacePOI.HarvestableSpacePOI_SwampyOreField -> Res.drawable.spacepoi_swampy_ore_field
        SpacedOutSpacePOI.TemporalTear -> Res.drawable.spacepoi_temporal_tear
    }

@Composable
fun getVanillaSpacePOIDrawable(vanillaSpacePOI: VanillaSpacePOI): DrawableResource =
    when (vanillaSpacePOI) {
        VanillaSpacePOI.CarbonaceousAsteroid -> Res.drawable.vanilla_spacepoi_carbonaceous_asteroid
        VanillaSpacePOI.ChlorinePlanet -> Res.drawable.vanilla_spacepoi_chlorine_planet
        VanillaSpacePOI.DLC2CeresSpaceDestination -> Res.drawable.vanilla_spacepoi_dlc2_ceres_space_destination
        VanillaSpacePOI.DustyMoon -> Res.drawable.vanilla_spacepoi_dusty_moon
        VanillaSpacePOI.Earth -> Res.drawable.vanilla_spacepoi_earth
        VanillaSpacePOI.ForestPlanet -> Res.drawable.vanilla_spacepoi_forest_planet
        VanillaSpacePOI.GasGiant -> Res.drawable.vanilla_spacepoi_gas_giant
        VanillaSpacePOI.GoldAsteroid -> Res.drawable.vanilla_spacepoi_gold_asteroid
        VanillaSpacePOI.HeliumGiant -> Res.drawable.vanilla_spacepoi_helium_giant
        VanillaSpacePOI.IceGiant -> Res.drawable.vanilla_spacepoi_ice_giant
        VanillaSpacePOI.IcyDwarf -> Res.drawable.vanilla_spacepoi_icy_dwarf
        VanillaSpacePOI.MetallicAsteroid -> Res.drawable.vanilla_spacepoi_metallic_asteroid
        VanillaSpacePOI.OilyAsteriod -> Res.drawable.vanilla_spacepoi_oily_asteriod
        VanillaSpacePOI.OrganicDwarf -> Res.drawable.vanilla_spacepoi_organic_dwarf
        VanillaSpacePOI.RedDwarf -> Res.drawable.vanilla_spacepoi_red_dwarf
        VanillaSpacePOI.RockyAsteroid -> Res.drawable.vanilla_spacepoi_rocky_asteroid
        VanillaSpacePOI.RustPlanet -> Res.drawable.vanilla_spacepoi_rust_planet
        VanillaSpacePOI.SaltDesertPlanet -> Res.drawable.vanilla_spacepoi_salt_desert_planet
        VanillaSpacePOI.SaltDwarf -> Res.drawable.vanilla_spacepoi_salt_dwarf
        VanillaSpacePOI.Satellite -> Res.drawable.vanilla_spacepoi_satellite
        VanillaSpacePOI.ShinyPlanet -> Res.drawable.vanilla_spacepoi_shiny_planet
        VanillaSpacePOI.TerraPlanet -> Res.drawable.vanilla_spacepoi_terra_planet
        VanillaSpacePOI.VolcanoPlanet -> Res.drawable.vanilla_spacepoi_volcano_planet
        VanillaSpacePOI.Wormhole -> Res.drawable.vanilla_spacepoi_wormhole
    }

@Composable
fun getZoneTypeDrawable(zoneType: ZoneType): DrawableResource =
    when (zoneType) {
        ZoneType.FrozenWastes -> Res.drawable.biome_frozen
        ZoneType.BoggyMarsh -> Res.drawable.biome_marsh
        ZoneType.Sandstone -> Res.drawable.biome_sandstone
        ZoneType.ToxicJungle -> Res.drawable.biome_jungle
        ZoneType.MagmaCore -> Res.drawable.biome_magma
        ZoneType.OilField -> Res.drawable.biome_oil
        ZoneType.Space -> Res.drawable.biome_space
        ZoneType.Ocean -> Res.drawable.biome_ocean
        ZoneType.Rust -> Res.drawable.biome_rust
        ZoneType.Forest -> Res.drawable.biome_forest
        ZoneType.Radioactive -> Res.drawable.biome_radioactive
        ZoneType.Swamp -> Res.drawable.biome_swamp
        ZoneType.Wasteland -> Res.drawable.biome_wasteland
        ZoneType.Metallic -> Res.drawable.biome_metallic
        ZoneType.Barren -> Res.drawable.biome_barren
        ZoneType.Moo -> Res.drawable.biome_moo
        ZoneType.IceCaves -> Res.drawable.biome_icecaves
        ZoneType.CarrotQuarry -> Res.drawable.biome_carrot_quarry
        ZoneType.SugarWoods -> Res.drawable.biome_sugarwoods
    }

@Composable
fun getGameModeDrawable(gameModeType: GameModeType): DrawableResource =
    when (gameModeType) {
        GameModeType.BASEGAME_STANDARD -> Res.drawable.gamemode_basegame_standard
        GameModeType.BASEGAME_THELAB -> Res.drawable.gamemode_basegame_thelab
        GameModeType.SPACEDOUT_CLASSIC -> Res.drawable.gamemode_spacedout_classic
        GameModeType.SPACEDOUT_SPACEDOUT -> Res.drawable.gamemode_spacedout_spacedout
        GameModeType.SPACEDOUT_THELAB -> Res.drawable.gamemode_spacedout_thelab
    }
