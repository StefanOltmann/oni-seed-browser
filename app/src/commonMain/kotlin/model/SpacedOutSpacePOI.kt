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

package model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation1
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation2
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation3
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation4
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation5
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation6
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation7
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiGravitasSpaceStation8
import io.github.stefanoltmann.app.generated.resources.artifactSpacePoiRussellsTeapot
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField1
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField2
import io.github.stefanoltmann.app.generated.resources.dlc4ImpactorDebrisField3
import io.github.stefanoltmann.app.generated.resources.dlc4PrehistoricMixingField
import io.github.stefanoltmann.app.generated.resources.dlc4PrehistoricOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiCarbonAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiChlorineCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiDlc2CeresField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiDlc2CeresOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiForestyOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiFrozenOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiGasGiantCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiGildedAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiGlimmeringAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiHeliumCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiIceAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiInterstellarIceField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiInterstellarOcean
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiMetallicAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOilyAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOrganicMassField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOxidizedAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiOxygenRichAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiRadioactiveAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiRadioactiveGasCloud
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiRockyAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSaltyAsteroidField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSandyOreField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSatelliteField
import io.github.stefanoltmann.app.generated.resources.harvestableSpacePoiSwampyOreField
import io.github.stefanoltmann.app.generated.resources.temporalTear
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
    DLC4PrehistoricMixingField(Res.string.dlc4PrehistoricMixingField),
    DLC4PrehistoricOreField(Res.string.dlc4PrehistoricOreField),
    DLC4ImpactorDebrisField1(Res.string.dlc4ImpactorDebrisField1),
    DLC4ImpactorDebrisField2(Res.string.dlc4ImpactorDebrisField2),
    DLC4ImpactorDebrisField3(Res.string.dlc4ImpactorDebrisField3),
    TemporalTear(Res.string.temporalTear)
}
