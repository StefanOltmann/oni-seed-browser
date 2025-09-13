package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.gameModeBaseGameStandard
import io.github.stefanoltmann.app.generated.resources.gameModeSpacedOutClassic
import io.github.stefanoltmann.app.generated.resources.gameModeSpacedOutSpacedOut
import io.github.stefanoltmann.app.generated.resources.gameModeTheLab
import de.stefan_oltmann.oni.model.GameModeType
import org.jetbrains.compose.resources.StringResource

val GameModeType.stringResource: StringResource
    get() = when (this) {
        GameModeType.BASEGAME_STANDARD -> Res.string.gameModeBaseGameStandard
        GameModeType.BASEGAME_THELAB -> Res.string.gameModeTheLab
        GameModeType.SPACEDOUT_CLASSIC -> Res.string.gameModeSpacedOutClassic
        GameModeType.SPACEDOUT_SPACEDOUT -> Res.string.gameModeSpacedOutSpacedOut
        GameModeType.SPACEDOUT_THELAB -> Res.string.gameModeTheLab
    }
