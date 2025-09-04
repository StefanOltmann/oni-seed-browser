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
