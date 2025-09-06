package model

enum class GameModeType {

    BASEGAME_STANDARD,
    BASEGAME_THELAB,
    SPACEDOUT_CLASSIC,
    SPACEDOUT_SPACEDOUT,
    SPACEDOUT_THELAB;

    fun doDlcSettingsAllowMode(currentDlc: List<Dlc>): Boolean {

        for (clusterType in ClusterType.entries)
            if (clusterType.gameMode == this && clusterType.dlcRequirementsFulfilled(currentDlc))
                return true

        return false
    }
}
