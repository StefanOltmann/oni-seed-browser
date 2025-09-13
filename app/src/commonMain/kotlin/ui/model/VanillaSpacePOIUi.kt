package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiCarbonaceousAsteroid
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiChlorinePlanet
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDLC2CeresSpaceDestination
import io.github.stefanoltmann.app.generated.resources.vanillaSpacePoiDLC4PrehistoricSpaceDestination
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
import de.stefan_oltmann.oni.model.VanillaSpacePOI
import org.jetbrains.compose.resources.StringResource

val VanillaSpacePOI.stringResource: StringResource
    get() = when (this) {
        VanillaSpacePOI.CarbonaceousAsteroid -> Res.string.vanillaSpacePoiCarbonaceousAsteroid
        VanillaSpacePOI.ChlorinePlanet -> Res.string.vanillaSpacePoiChlorinePlanet
        VanillaSpacePOI.DLC2CeresSpaceDestination -> Res.string.vanillaSpacePoiDLC2CeresSpaceDestination
        VanillaSpacePOI.DLC4PrehistoricSpaceDestination -> Res.string.vanillaSpacePoiDLC4PrehistoricSpaceDestination
        VanillaSpacePOI.DustyMoon -> Res.string.vanillaSpacePoiDustyMoon
        VanillaSpacePOI.Earth -> Res.string.vanillaSpacePoiEarth
        VanillaSpacePOI.ForestPlanet -> Res.string.vanillaSpacePoiForestPlanet
        VanillaSpacePOI.GasGiant -> Res.string.vanillaSpacePoiGasGiant
        VanillaSpacePOI.GoldAsteroid -> Res.string.vanillaSpacePoiGoldAsteroid
        VanillaSpacePOI.HeliumGiant -> Res.string.vanillaSpacePoiHeliumGiant
        VanillaSpacePOI.IceGiant -> Res.string.vanillaSpacePoiIceGiant
        VanillaSpacePOI.IcyDwarf -> Res.string.vanillaSpacePoiIcyDwarf
        VanillaSpacePOI.MetallicAsteroid -> Res.string.vanillaSpacePoiMetallicAsteroid
        VanillaSpacePOI.OilyAsteriod -> Res.string.vanillaSpacePoiOilyAsteroid
        VanillaSpacePOI.OrganicDwarf -> Res.string.vanillaSpacePoiOrganicDwarf
        VanillaSpacePOI.RedDwarf -> Res.string.vanillaSpacePoiRedDwarf
        VanillaSpacePOI.RockyAsteroid -> Res.string.vanillaSpacePoiRockyAsteroid
        VanillaSpacePOI.RustPlanet -> Res.string.vanillaSpacePoiRustPlanet
        VanillaSpacePOI.SaltDesertPlanet -> Res.string.vanillaSpacePoiSaltDesertPlanet
        VanillaSpacePOI.SaltDwarf -> Res.string.vanillaSpacePoiSaltDwarf
        VanillaSpacePOI.Satellite -> Res.string.vanillaSpacePoiSatellite
        VanillaSpacePOI.ShinyPlanet -> Res.string.vanillaSpacePoiShinyPlanet
        VanillaSpacePOI.TerraPlanet -> Res.string.vanillaSpacePoiTerraPlanet
        VanillaSpacePOI.VolcanoPlanet -> Res.string.vanillaSpacePoiVolcanoPlanet
        VanillaSpacePOI.Wormhole -> Res.string.vanillaSpacePoiWormhole
    }
