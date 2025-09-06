package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.logo_frosty_planet_banner
import io.github.stefanoltmann.app.generated.resources.logo_oni
import io.github.stefanoltmann.app.generated.resources.logo_prehistoric_planet_banner
import io.github.stefanoltmann.app.generated.resources.logo_spaced_out
import model.Dlc
import org.jetbrains.compose.resources.DrawableResource

val Dlc.icon: DrawableResource
    get() = when (this) {
        Dlc.BaseGame -> Res.drawable.logo_oni
        Dlc.SpacedOut -> Res.drawable.logo_spaced_out
        Dlc.FrostyPlanet -> Res.drawable.logo_frosty_planet_banner
        Dlc.BionicBooster -> Res.drawable.logo_frosty_planet_banner
        Dlc.PrehistoricPlanet -> Res.drawable.logo_prehistoric_planet_banner
    }
