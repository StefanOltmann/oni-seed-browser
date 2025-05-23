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

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiGeyserOutput
import io.github.stefanoltmann.app.generated.resources.uiSpaceDestinationCount
import io.github.stefanoltmann.app.generated.resources.uiWorldTrait
import org.jetbrains.compose.resources.StringResource

enum class FilterItemType(
    val stringResource: StringResource
) {

    WORLD_TRAIT(Res.string.uiWorldTrait),
    GEYSER_COUNT(Res.string.uiGeyserCount),
    GEYSER_OUTPUT(Res.string.uiGeyserOutput),
    SPACE_DESTINATION_COUNT(Res.string.uiSpaceDestinationCount)
}
