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

import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation1
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation2
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation3
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation4
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation5
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation6
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation7
import oni_seed_browser.app.generated.resources.artifactSpacePoiGravitasSpaceStation8
import oni_seed_browser.app.generated.resources.artifactSpacePoiRussellsTeapot
import oni_seed_browser.app.generated.resources.harvestableSpacePoiCarbonAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiChlorineCloud
import oni_seed_browser.app.generated.resources.harvestableSpacePoiDlc2CeresField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiDlc2CeresOreField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiForestyOreField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiFrozenOreField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiGasGiantCloud
import oni_seed_browser.app.generated.resources.harvestableSpacePoiGildedAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiGlimmeringAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiHeliumCloud
import oni_seed_browser.app.generated.resources.harvestableSpacePoiIceAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiInterstellarIceField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiInterstellarOcean
import oni_seed_browser.app.generated.resources.harvestableSpacePoiMetallicAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiOilyAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiOrganicMassField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiOxidizedAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiOxygenRichAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiRadioactiveAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiRadioactiveGasCloud
import oni_seed_browser.app.generated.resources.harvestableSpacePoiRockyAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiSaltyAsteroidField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiSandyOreField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiSatelliteField
import oni_seed_browser.app.generated.resources.harvestableSpacePoiSwampyOreField
import oni_seed_browser.app.generated.resources.temporalTear
import org.jetbrains.compose.resources.StringResource

@Suppress("all")
enum class SpacedOutSpacePOI(
    val stringResource: StringResource
) {

    ArtifactSpacePOI_GravitasSpaceStation1(Res.string.artifactSpacePoiGravitasSpaceStation1),
    ArtifactSpacePOI_GravitasSpaceStation2(Res.string.artifactSpacePoiGravitasSpaceStation2),
    ArtifactSpacePOI_GravitasSpaceStation3(Res.string.artifactSpacePoiGravitasSpaceStation3),
    ArtifactSpacePOI_GravitasSpaceStation4(Res.string.artifactSpacePoiGravitasSpaceStation4),
    ArtifactSpacePOI_GravitasSpaceStation5(Res.string.artifactSpacePoiGravitasSpaceStation5),
    ArtifactSpacePOI_GravitasSpaceStation6(Res.string.artifactSpacePoiGravitasSpaceStation6),
    ArtifactSpacePOI_GravitasSpaceStation7(Res.string.artifactSpacePoiGravitasSpaceStation7),
    ArtifactSpacePOI_GravitasSpaceStation8(Res.string.artifactSpacePoiGravitasSpaceStation8),
    ArtifactSpacePOI_RussellsTeapot(Res.string.artifactSpacePoiRussellsTeapot),
    HarvestableSpacePOI_CarbonAsteroidField(Res.string.harvestableSpacePoiCarbonAsteroidField),
    HarvestableSpacePOI_ChlorineCloud(Res.string.harvestableSpacePoiChlorineCloud),
    HarvestableSpacePOI_DLC2CeresField(Res.string.harvestableSpacePoiDlc2CeresField),
    HarvestableSpacePOI_DLC2CeresOreField(Res.string.harvestableSpacePoiDlc2CeresOreField),
    HarvestableSpacePOI_ForestyOreField(Res.string.harvestableSpacePoiForestyOreField),
    HarvestableSpacePOI_FrozenOreField(Res.string.harvestableSpacePoiFrozenOreField),
    HarvestableSpacePOI_GasGiantCloud(Res.string.harvestableSpacePoiGasGiantCloud),
    HarvestableSpacePOI_GildedAsteroidField(Res.string.harvestableSpacePoiGildedAsteroidField),
    HarvestableSpacePOI_GlimmeringAsteroidField(Res.string.harvestableSpacePoiGlimmeringAsteroidField),
    HarvestableSpacePOI_HeliumCloud(Res.string.harvestableSpacePoiHeliumCloud),
    HarvestableSpacePOI_IceAsteroidField(Res.string.harvestableSpacePoiIceAsteroidField),
    HarvestableSpacePOI_InterstellarIceField(Res.string.harvestableSpacePoiInterstellarIceField),
    HarvestableSpacePOI_InterstellarOcean(Res.string.harvestableSpacePoiInterstellarOcean),
    HarvestableSpacePOI_MetallicAsteroidField(Res.string.harvestableSpacePoiMetallicAsteroidField),
    HarvestableSpacePOI_OilyAsteroidField(Res.string.harvestableSpacePoiOilyAsteroidField),
    HarvestableSpacePOI_OrganicMassField(Res.string.harvestableSpacePoiOrganicMassField),
    HarvestableSpacePOI_OxidizedAsteroidField(Res.string.harvestableSpacePoiOxidizedAsteroidField),
    HarvestableSpacePOI_OxygenRichAsteroidField(Res.string.harvestableSpacePoiOxygenRichAsteroidField),
    HarvestableSpacePOI_RadioactiveAsteroidField(Res.string.harvestableSpacePoiRadioactiveAsteroidField),
    HarvestableSpacePOI_RadioactiveGasCloud(Res.string.harvestableSpacePoiRadioactiveGasCloud),
    HarvestableSpacePOI_RockyAsteroidField(Res.string.harvestableSpacePoiRockyAsteroidField),
    HarvestableSpacePOI_SaltyAsteroidField(Res.string.harvestableSpacePoiSaltyAsteroidField),
    HarvestableSpacePOI_SandyOreField(Res.string.harvestableSpacePoiSandyOreField),
    HarvestableSpacePOI_SatelliteField(Res.string.harvestableSpacePoiSatelliteField),
    HarvestableSpacePOI_SwampyOreField(Res.string.harvestableSpacePoiSwampyOreField),
    TemporalTear(Res.string.temporalTear)
}
