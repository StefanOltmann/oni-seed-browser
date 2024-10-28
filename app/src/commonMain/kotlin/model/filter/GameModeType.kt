package model.filter

import model.ClusterType
import model.Dlc
import oni_seed_browser.app.generated.resources.Res
import oni_seed_browser.app.generated.resources.gameModeBaseGameStandard
import oni_seed_browser.app.generated.resources.gameModeSpacedOutClassic
import oni_seed_browser.app.generated.resources.gameModeSpacedOutSpacedOut
import oni_seed_browser.app.generated.resources.gameModeTheLab
import org.jetbrains.compose.resources.StringResource

enum class GameModeType(
    val nameStringResource: StringResource,
    val requiredDlcs: List<Dlc>
) {
    BASEGAME_STANDARD(
        nameStringResource = Res.string.gameModeBaseGameStandard,
        listOf(Dlc.BaseGame)
    ),
    BASEGAME_THELAB(
        nameStringResource = Res.string.gameModeTheLab,
        listOf(Dlc.BaseGame)
    ),
    SPACEDOUT_CLASSIC(
        nameStringResource = Res.string.gameModeSpacedOutClassic,
        listOf(Dlc.SpacedOut)
    ),
    SPACEDOUT_SPACEDOUT(
        nameStringResource = Res.string.gameModeSpacedOutSpacedOut,
        listOf(Dlc.SpacedOut)
    ),
    SPACEDOUT_THELAB(
        nameStringResource = Res.string.gameModeTheLab,
        listOf(Dlc.SpacedOut)
    );

    fun dlcRequirementsFulfilled(requirements: List<Dlc>): Boolean =
        requirements.containsAll(requiredDlcs);


    fun doDlcSettingsAllowMode(currentDlc: List<Dlc>): Boolean {
        for (clusterType in ClusterType.entries) {
            if (clusterType.gameMode == this && clusterType.dlcRequirementsFulfilled(currentDlc))
                return true;
        }
        return false;
    }

}
