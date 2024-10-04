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

package ui

import androidx.compose.runtime.Composable
import model.AsteroidType
import model.Cluster
import model.GeyserType
import model.PointOfInterestType
import model.WorldTrait
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.asteroid_folia
import oni_seed_browser.app.generated.resources.asteroid_glowood_wasteland
import oni_seed_browser.app.generated.resources.asteroid_irradiated_forest
import oni_seed_browser.app.generated.resources.asteroid_irradiated_marsh
import oni_seed_browser.app.generated.resources.asteroid_irradiated_swampy
import oni_seed_browser.app.generated.resources.asteroid_marshy
import oni_seed_browser.app.generated.resources.asteroid_moo
import oni_seed_browser.app.generated.resources.asteroid_oily_swamp
import oni_seed_browser.app.generated.resources.asteroid_quagmiris
import oni_seed_browser.app.generated.resources.asteroid_radioactive_forest
import oni_seed_browser.app.generated.resources.asteroid_radioactive_swamp
import oni_seed_browser.app.generated.resources.asteroid_radioactive_terra
import oni_seed_browser.app.generated.resources.asteroid_radioactive_terrabog
import oni_seed_browser.app.generated.resources.asteroid_regolith
import oni_seed_browser.app.generated.resources.asteroid_rusty_oil
import oni_seed_browser.app.generated.resources.asteroid_spacedout_ceres
import oni_seed_browser.app.generated.resources.asteroid_spacedout_ceres_minor
import oni_seed_browser.app.generated.resources.asteroid_stinko_swamp
import oni_seed_browser.app.generated.resources.asteroid_superconductive
import oni_seed_browser.app.generated.resources.asteroid_terrania
import oni_seed_browser.app.generated.resources.asteroid_tundra
import oni_seed_browser.app.generated.resources.asteroid_water
import oni_seed_browser.app.generated.resources.building_anti_entropy_thermo_nullifier
import oni_seed_browser.app.generated.resources.building_neural_vacillator
import oni_seed_browser.app.generated.resources.building_printing_pod
import oni_seed_browser.app.generated.resources.building_sap_tree
import oni_seed_browser.app.generated.resources.building_supply_teleporter_input
import oni_seed_browser.app.generated.resources.building_supply_teleporter_output
import oni_seed_browser.app.generated.resources.building_teleporter_receiver
import oni_seed_browser.app.generated.resources.building_teleporter_transmitter
import oni_seed_browser.app.generated.resources.cluster_base_arboria
import oni_seed_browser.app.generated.resources.cluster_base_aridio
import oni_seed_browser.app.generated.resources.cluster_base_ceres
import oni_seed_browser.app.generated.resources.cluster_base_oasisse
import oni_seed_browser.app.generated.resources.cluster_base_oceania
import oni_seed_browser.app.generated.resources.cluster_base_rime
import oni_seed_browser.app.generated.resources.cluster_base_terra
import oni_seed_browser.app.generated.resources.cluster_base_the_badlands
import oni_seed_browser.app.generated.resources.cluster_base_verdante
import oni_seed_browser.app.generated.resources.cluster_base_volcanea
import oni_seed_browser.app.generated.resources.cluster_spacedout_arboria
import oni_seed_browser.app.generated.resources.cluster_spacedout_aridio
import oni_seed_browser.app.generated.resources.cluster_spacedout_flipped_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_folia
import oni_seed_browser.app.generated.resources.cluster_spacedout_frozen_forest_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_metallic_swampy_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_oasisse
import oni_seed_browser.app.generated.resources.cluster_spacedout_oceania
import oni_seed_browser.app.generated.resources.cluster_spacedout_quagmiris
import oni_seed_browser.app.generated.resources.cluster_spacedout_radioactive_ocean_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_rime
import oni_seed_browser.app.generated.resources.cluster_spacedout_squelchy
import oni_seed_browser.app.generated.resources.cluster_spacedout_terra
import oni_seed_browser.app.generated.resources.cluster_spacedout_terrania
import oni_seed_browser.app.generated.resources.cluster_spacedout_the_badlands
import oni_seed_browser.app.generated.resources.cluster_spacedout_the_desolands_moonlet
import oni_seed_browser.app.generated.resources.cluster_spacedout_verdante
import oni_seed_browser.app.generated.resources.cluster_spacedout_volcanea
import oni_seed_browser.app.generated.resources.geyser_aluminum_volcano
import oni_seed_browser.app.generated.resources.geyser_carbon_dioxide
import oni_seed_browser.app.generated.resources.geyser_carbon_dioxide_vent
import oni_seed_browser.app.generated.resources.geyser_chlorine_gas_vent
import oni_seed_browser.app.generated.resources.geyser_cobalt_volcano
import oni_seed_browser.app.generated.resources.geyser_cool_salt_slush_geyser
import oni_seed_browser.app.generated.resources.geyser_cool_slush_geyser
import oni_seed_browser.app.generated.resources.geyser_cool_steam_vent
import oni_seed_browser.app.generated.resources.geyser_copper_volcano
import oni_seed_browser.app.generated.resources.geyser_gold_volcano
import oni_seed_browser.app.generated.resources.geyser_hot_polluted_oxygen_vent
import oni_seed_browser.app.generated.resources.geyser_hydrogen_vent
import oni_seed_browser.app.generated.resources.geyser_infectious_polluted_oxygen_vent
import oni_seed_browser.app.generated.resources.geyser_iron_volcano
import oni_seed_browser.app.generated.resources.geyser_leaky_oil_fissure
import oni_seed_browser.app.generated.resources.geyser_liquid_sulfur_geyser
import oni_seed_browser.app.generated.resources.geyser_minor_volcano
import oni_seed_browser.app.generated.resources.geyser_natural_gas_geyser
import oni_seed_browser.app.generated.resources.geyser_niobium_volcano
import oni_seed_browser.app.generated.resources.geyser_oil_reservoir
import oni_seed_browser.app.generated.resources.geyser_polluted_water_vent
import oni_seed_browser.app.generated.resources.geyser_salt_water
import oni_seed_browser.app.generated.resources.geyser_steam_vent
import oni_seed_browser.app.generated.resources.geyser_tungsten_volcano
import oni_seed_browser.app.generated.resources.geyser_volcano
import oni_seed_browser.app.generated.resources.geyser_water
import oni_seed_browser.app.generated.resources.worldtrait_boulders_large
import oni_seed_browser.app.generated.resources.worldtrait_boulders_medium
import oni_seed_browser.app.generated.resources.worldtrait_boulders_mixed
import oni_seed_browser.app.generated.resources.worldtrait_boulders_small
import oni_seed_browser.app.generated.resources.worldtrait_crashed_satellites
import oni_seed_browser.app.generated.resources.worldtrait_deep_oil
import oni_seed_browser.app.generated.resources.worldtrait_distress_signal
import oni_seed_browser.app.generated.resources.worldtrait_frozen_core
import oni_seed_browser.app.generated.resources.worldtrait_geoactive
import oni_seed_browser.app.generated.resources.worldtrait_geodes
import oni_seed_browser.app.generated.resources.worldtrait_geodormant
import oni_seed_browser.app.generated.resources.worldtrait_glaciers_large
import oni_seed_browser.app.generated.resources.worldtrait_irregular_oil
import oni_seed_browser.app.generated.resources.worldtrait_lush_core
import oni_seed_browser.app.generated.resources.worldtrait_magma_vents
import oni_seed_browser.app.generated.resources.worldtrait_metal_caves
import oni_seed_browser.app.generated.resources.worldtrait_metal_poor
import oni_seed_browser.app.generated.resources.worldtrait_metal_rich
import oni_seed_browser.app.generated.resources.worldtrait_misaligned_start
import oni_seed_browser.app.generated.resources.worldtrait_radioactive_crust
import oni_seed_browser.app.generated.resources.worldtrait_slime_splats
import oni_seed_browser.app.generated.resources.worldtrait_subsurface_ocean
import oni_seed_browser.app.generated.resources.worldtrait_volcanoes
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
        GeyserType.SULFUR_GEYSER -> Res.drawable.geyser_liquid_sulfur_geyser
        GeyserType.TUNGSTEN_VOLCANO -> Res.drawable.geyser_tungsten_volcano
        GeyserType.NIOBIUM_VOLCANO -> Res.drawable.geyser_niobium_volcano
        GeyserType.OIL_WELL -> Res.drawable.geyser_oil_reservoir
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
    }

@Composable
fun getClusterDrawable(cluster: Cluster): DrawableResource =
    when (cluster) {
        Cluster.BASE_TERRA -> Res.drawable.cluster_base_terra
        Cluster.BASE_CERES -> Res.drawable.cluster_base_ceres
        Cluster.BASE_OCEANIA -> Res.drawable.cluster_base_oceania
        Cluster.BASE_RIME -> Res.drawable.cluster_base_rime
        Cluster.BASE_VERDANTE -> Res.drawable.cluster_base_verdante
        Cluster.BASE_ARBORIA -> Res.drawable.cluster_base_arboria
        Cluster.BASE_VOLCANEA -> Res.drawable.cluster_base_volcanea
        Cluster.BASE_THE_BADLANDS -> Res.drawable.cluster_base_the_badlands
        Cluster.BASE_ARIDIO -> Res.drawable.cluster_base_aridio
        Cluster.BASE_OASISSE -> Res.drawable.cluster_base_oasisse
        Cluster.DLC_TERRA -> Res.drawable.cluster_spacedout_terra
        Cluster.DLC_CERES -> Res.drawable.asteroid_spacedout_ceres
        Cluster.DLC_CERES_MINOR -> Res.drawable.asteroid_spacedout_ceres_minor
        Cluster.DLC_OCEANIA -> Res.drawable.cluster_spacedout_oceania
        Cluster.DLC_SQUELCHY -> Res.drawable.cluster_spacedout_squelchy
        Cluster.DLC_RIME -> Res.drawable.cluster_spacedout_rime
        Cluster.DLC_VERDANTE -> Res.drawable.cluster_spacedout_verdante
        Cluster.DLC_ARBORIA -> Res.drawable.cluster_spacedout_arboria
        Cluster.DLC_VOLCANEA -> Res.drawable.cluster_spacedout_volcanea
        Cluster.DLC_THE_BADLANDS -> Res.drawable.cluster_spacedout_the_badlands
        Cluster.DLC_ARIDIO -> Res.drawable.cluster_spacedout_aridio
        Cluster.DLC_OASISSE -> Res.drawable.cluster_spacedout_oasisse
        Cluster.DLC_TERRANIA -> Res.drawable.cluster_spacedout_terrania
        Cluster.DLC_FOLIA -> Res.drawable.cluster_spacedout_folia
        Cluster.DLC_QUAGMIRIS -> Res.drawable.cluster_spacedout_quagmiris
        Cluster.DLC_METALLIC_SWAMPY_MOONLET -> Res.drawable.cluster_spacedout_metallic_swampy_moonlet
        Cluster.DLC_THE_DESOLANDS_MOONLET -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        Cluster.DLC_FROZEN_FOREST_MOONLET -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        Cluster.DLC_FLIPPED_MOONLET -> Res.drawable.cluster_spacedout_flipped_moonlet
        Cluster.DLC_RADIOACTIVE_OCEAN_MOONLET -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
    }

@Composable
fun getAsteroidTypeDrawable(asteroidType: AsteroidType): DrawableResource =
    when (asteroidType) {

        AsteroidType.TERRA -> Res.drawable.cluster_base_terra
        AsteroidType.CERES -> Res.drawable.cluster_base_ceres
        AsteroidType.OCEANIA -> Res.drawable.cluster_base_oceania
        AsteroidType.RIME -> Res.drawable.cluster_base_rime
        AsteroidType.VERDANTE -> Res.drawable.cluster_base_verdante
        AsteroidType.ARBORIA -> Res.drawable.cluster_base_arboria
        AsteroidType.VOLCANEA -> Res.drawable.cluster_base_volcanea
        AsteroidType.THE_BADLANDS -> Res.drawable.cluster_base_the_badlands
        AsteroidType.ARIDIO -> Res.drawable.cluster_base_aridio
        AsteroidType.OASISSE -> Res.drawable.cluster_base_oasisse
        AsteroidType.SQUELCHY -> Res.drawable.cluster_spacedout_squelchy

        AsteroidType.TERRANIA -> Res.drawable.asteroid_terrania
        AsteroidType.CERES_VANILLA -> Res.drawable.asteroid_spacedout_ceres
        AsteroidType.CERES_MINOR -> Res.drawable.asteroid_spacedout_ceres_minor
        AsteroidType.FOLIA -> Res.drawable.asteroid_folia
        AsteroidType.QUAGMIRIS -> Res.drawable.asteroid_quagmiris
        AsteroidType.METALLIC_SWAMPY -> Res.drawable.cluster_spacedout_metallic_swampy_moonlet
        AsteroidType.THE_DESOLANDS -> Res.drawable.cluster_spacedout_the_desolands_moonlet
        AsteroidType.FROZEN_FOREST -> Res.drawable.cluster_spacedout_frozen_forest_moonlet
        AsteroidType.FLIPPED -> Res.drawable.cluster_spacedout_flipped_moonlet
        AsteroidType.RADIOACTIVE_OCEAN -> Res.drawable.cluster_spacedout_radioactive_ocean_moonlet
        AsteroidType.RADIOACTIVE_SWAMP -> Res.drawable.asteroid_radioactive_swamp
        AsteroidType.GLOWOOD_WASTELAND -> Res.drawable.asteroid_glowood_wasteland
        AsteroidType.RADIOACTIVE_FOREST -> Res.drawable.asteroid_radioactive_forest
        AsteroidType.STINKO_SWAMP -> Res.drawable.asteroid_stinko_swamp
        AsteroidType.RADIOACTIVE_TERRA -> Res.drawable.asteroid_radioactive_terra
        AsteroidType.RADIOACTIVE_TERRABOG_ASTEROID -> Res.drawable.asteroid_radioactive_terrabog
        AsteroidType.OILY_SWAMP -> Res.drawable.asteroid_oily_swamp
        AsteroidType.RUSTY_OIL -> Res.drawable.asteroid_rusty_oil
        AsteroidType.IRRADIATED_FOREST -> Res.drawable.asteroid_irradiated_forest
        AsteroidType.IRRADIATED_SWAMPY -> Res.drawable.asteroid_irradiated_swampy
        AsteroidType.IRRADIATED_MARSH_ASTEROID -> Res.drawable.asteroid_irradiated_marsh
        AsteroidType.TUNDRA -> Res.drawable.asteroid_tundra
        AsteroidType.MARSHY -> Res.drawable.asteroid_marshy
        AsteroidType.SUPERCONDUCTIVE -> Res.drawable.asteroid_superconductive
        AsteroidType.MOO -> Res.drawable.asteroid_moo
        AsteroidType.WATER -> Res.drawable.asteroid_water
        AsteroidType.REGOLITH -> Res.drawable.asteroid_regolith
    }
