package ui

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.gameModeBaseGameStandard
import io.github.stefanoltmann.app.generated.resources.gameModeSpacedOutClassic
import io.github.stefanoltmann.app.generated.resources.gameModeSpacedOutSpacedOut
import io.github.stefanoltmann.app.generated.resources.gameModeTheLab
import io.github.stefanoltmann.app.generated.resources.uiGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiGoodGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiWorldTrait
import io.github.stefanoltmann.app.generated.resources.uiZoneType
import model.filter.FilterItemType
import model.filter.GameModeType
import org.jetbrains.compose.resources.StringResource

fun getStringResource(filterItemType: FilterItemType): StringResource =
    when (filterItemType) {
        FilterItemType.WORLD_TRAIT -> Res.string.uiWorldTrait
        FilterItemType.ZONE_TYPE -> Res.string.uiZoneType
        FilterItemType.GEYSER_COUNT -> Res.string.uiGeyserCount
        FilterItemType.GOOD_GEYSER_COUNT -> Res.string.uiGoodGeyserCount
    }

fun getStringResource(gameModeType: GameModeType): StringResource =
    when (gameModeType) {
        GameModeType.BASEGAME_STANDARD -> Res.string.gameModeBaseGameStandard
        GameModeType.BASEGAME_THELAB -> Res.string.gameModeTheLab
        GameModeType.SPACEDOUT_CLASSIC -> Res.string.gameModeSpacedOutClassic
        GameModeType.SPACEDOUT_SPACEDOUT -> Res.string.gameModeSpacedOutSpacedOut
        GameModeType.SPACEDOUT_THELAB -> Res.string.gameModeTheLab
    }
