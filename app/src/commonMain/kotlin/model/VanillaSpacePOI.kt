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

import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.vanillaSpacePoiCarbonaceousAsteroid
import oni_seed_browser.app.generated.resources.vanillaSpacePoiChlorinePlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiDLC2CeresSpaceDestination
import oni_seed_browser.app.generated.resources.vanillaSpacePoiDustyMoon
import oni_seed_browser.app.generated.resources.vanillaSpacePoiEarth
import oni_seed_browser.app.generated.resources.vanillaSpacePoiForestPlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiGasGiant
import oni_seed_browser.app.generated.resources.vanillaSpacePoiGoldAsteroid
import oni_seed_browser.app.generated.resources.vanillaSpacePoiHeliumGiant
import oni_seed_browser.app.generated.resources.vanillaSpacePoiIceGiant
import oni_seed_browser.app.generated.resources.vanillaSpacePoiIcyDwarf
import oni_seed_browser.app.generated.resources.vanillaSpacePoiMetallicAsteroid
import oni_seed_browser.app.generated.resources.vanillaSpacePoiOilyAsteroid
import oni_seed_browser.app.generated.resources.vanillaSpacePoiOrganicDwarf
import oni_seed_browser.app.generated.resources.vanillaSpacePoiRedDwarf
import oni_seed_browser.app.generated.resources.vanillaSpacePoiRockyAsteroid
import oni_seed_browser.app.generated.resources.vanillaSpacePoiRustPlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiSaltDesertPlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiSaltDwarf
import oni_seed_browser.app.generated.resources.vanillaSpacePoiSatellite
import oni_seed_browser.app.generated.resources.vanillaSpacePoiShinyPlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiTerraPlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiVolcanoPlanet
import oni_seed_browser.app.generated.resources.vanillaSpacePoiWormhole
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

