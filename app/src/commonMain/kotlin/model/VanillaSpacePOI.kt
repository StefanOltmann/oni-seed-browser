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
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiCarbonaceousAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiChlorinePlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDLC2CeresSpaceDestination
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDustyMoon
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiEarth
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiForestPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiGasGiant
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiGoldAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiHeliumGiant
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiIceGiant
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiIcyDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiMetallicAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiOilyAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiOrganicDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiRedDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiRockyAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiRustPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiSaltDesertPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiSaltDwarf
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiSatellite
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiShinyPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiTerraPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiVolcanoPlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiWormhole
import org.jetbrains.compose.resources.StringResource

enum class VanillaSpacePOI(
    val stringResource: StringResource
) {

    CarbonaceousAsteroid(Res.string.vanillaSpacePoiCarbonaceousAsteroid),
    ChlorinePlanet(Res.string.vanillaSpacePoiChlorinePlanet),
    DLC2CeresSpaceDestination(Res.string.vanillaSpacePoiDLC2CeresSpaceDestination),
    DustyMoon(Res.string.vanillaSpacePoiDustyMoon),
    Earth(Res.string.vanillaSpacePoiEarth),
    ForestPlanet(Res.string.vanillaSpacePoiForestPlanet),
    GasGiant(Res.string.vanillaSpacePoiGasGiant),
    GoldAsteroid(Res.string.vanillaSpacePoiGoldAsteroid),
    HeliumGiant(Res.string.vanillaSpacePoiHeliumGiant),
    IceGiant(Res.string.vanillaSpacePoiIceGiant),
    IcyDwarf(Res.string.vanillaSpacePoiIcyDwarf),
    MetallicAsteroid(Res.string.vanillaSpacePoiMetallicAsteroid),
    OilyAsteriod(Res.string.vanillaSpacePoiOilyAsteroid),
    OrganicDwarf(Res.string.vanillaSpacePoiOrganicDwarf),
    RedDwarf(Res.string.vanillaSpacePoiRedDwarf),
    RockyAsteroid(Res.string.vanillaSpacePoiRockyAsteroid),
    RustPlanet(Res.string.vanillaSpacePoiRustPlanet),
    SaltDesertPlanet(Res.string.vanillaSpacePoiSaltDesertPlanet),
    SaltDwarf(Res.string.vanillaSpacePoiSaltDwarf),
    Satellite(Res.string.vanillaSpacePoiSatellite),
    ShinyPlanet(Res.string.vanillaSpacePoiShinyPlanet),
    TerraPlanet(Res.string.vanillaSpacePoiTerraPlanet),
    VolcanoPlanet(Res.string.vanillaSpacePoiVolcanoPlanet),
    Wormhole(Res.string.vanillaSpacePoiWormhole)
}

