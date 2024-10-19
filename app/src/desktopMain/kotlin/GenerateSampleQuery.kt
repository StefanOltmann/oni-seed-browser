/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.AsteroidType
import model.ClusterType
import model.Dlc
import model.GeyserType
import model.WorldTrait
import model.filter.FilterCondition
import model.filter.FilterItemGeyserCount
import model.filter.FilterItemGeyserOutput
import model.filter.FilterItemSpaceDestinationCount
import model.filter.FilterItemWorldTrait
import model.filter.FilterQuery
import model.filter.FilterRule

fun main() {

    val hasWorldTraitGood = FilterItemWorldTrait(
        has = true,
        worldTrait = WorldTrait.FrozenCore
    )

    val firstRuleGroup = mutableListOf<FilterRule>()

    val firstRule = FilterRule(
        asteroid = AsteroidType.SandstoneDefault,
        worldTrait = hasWorldTraitGood,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = null
    )

    val firstRuleOr = FilterRule(
        asteroid = AsteroidType.WarpOilySwamp,
        worldTrait = hasWorldTraitGood,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = null
    )

    firstRuleGroup.add(firstRule)
    firstRuleGroup.add(firstRuleOr)

    val secondRule = FilterRule(
        asteroid = AsteroidType.SandstoneDefault,
        worldTrait = null,
        geyserCount = FilterItemGeyserCount(
            geyser = GeyserType.HYDROGEN,
            condition = FilterCondition.AT_LEAST,
            count = 1
        ),
        geyserOutput = null,
        spaceDestinationCount = null
    )

    val thirdRuleGroup = mutableListOf<FilterRule>()

    val thirdRule = FilterRule(
        asteroid = null,
        worldTrait = null,
        geyserCount = null,
        geyserOutput = FilterItemGeyserOutput(
            geyser = GeyserType.WATER,
            condition = FilterCondition.EXACTLY,
            outputInGramPerSecond = 1337
        ),
        spaceDestinationCount = null
    )

    val thirdRuleOr = FilterRule(
        asteroid = null,
        worldTrait = null,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = FilterItemSpaceDestinationCount(
            poi = "RockyAsteroid",
            condition = FilterCondition.AT_MOST,
            count = 5
        )
    )

    thirdRuleGroup.add(thirdRule)
    thirdRuleGroup.add(thirdRuleOr)

    val query = FilterQuery(

        cluster = ClusterType.BASE_TERRA,
        dlcs = listOf(Dlc.FrostyPlanet),
        rules = listOf(firstRuleGroup, listOf(secondRule), thirdRuleGroup)
    )

    val json = Json.encodeToString(query)

    println(json)
}
