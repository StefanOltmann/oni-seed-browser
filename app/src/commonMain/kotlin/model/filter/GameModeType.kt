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
    val nameStringResource: StringResource
) {

    BASEGAME_STANDARD(
        nameStringResource = Res.string.gameModeBaseGameStandard
    ),
    BASEGAME_THELAB(
        nameStringResource = Res.string.gameModeTheLab
    ),
    SPACEDOUT_CLASSIC(
        nameStringResource = Res.string.gameModeSpacedOutClassic
    ),
    SPACEDOUT_SPACEDOUT(
        nameStringResource = Res.string.gameModeSpacedOutSpacedOut
    ),
    SPACEDOUT_THELAB(
        nameStringResource = Res.string.gameModeTheLab
    );

    fun doDlcSettingsAllowMode(currentDlc: List<Dlc>): Boolean {

        for (clusterType in ClusterType.entries)
            if (clusterType.gameMode == this && clusterType.dlcRequirementsFulfilled(currentDlc))
                return true

        return false
    }
}
