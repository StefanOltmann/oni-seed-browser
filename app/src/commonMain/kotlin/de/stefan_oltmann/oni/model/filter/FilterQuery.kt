/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de
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

package de.stefan_oltmann.oni.model.filter

import de.stefan_oltmann.oni.model.AsteroidType
import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.Dlc
import de.stefan_oltmann.oni.model.GameModeType
import de.stefan_oltmann.oni.model.serializer.ClusterTypePrefixSerializer
import kotlinx.serialization.Serializable

@Serializable
data class FilterQuery(

    /*
     * Note: To restore the filter from local storage,
     * no fields should be marked as transient.
     */

    @Serializable(with = ClusterTypePrefixSerializer::class)
    val cluster: ClusterType?,

    val dlcs: List<Dlc>,

    val mode: GameModeType = GameModeType.BASEGAME_STANDARD,

    val remix: String? = null,

    /**
     * List of connected OR-rules.
     *
     * All rules in a list are connected with an OR-condition,
     * while all collections of rules lists are connected with AND.
     */
    val rules: List<List<FilterRule>>

) {

    fun cleanCopy(): FilterQuery {

        val newRules = mutableListOf<List<FilterRule>>()

        for (orRuleList in rules) {

            val newOrRules = mutableListOf<FilterRule>()

            for (orRule in orRuleList)
                if (orRule.hasItemSet() && orRule.hasValueSet())
                    newOrRules.add(orRule)

            newRules.add(newOrRules)
        }

        return copy(
            rules = newRules
        )
    }

    fun setAsteroid(rulesIndex: Int, ruleIndex: Int, asteroidType: AsteroidType): FilterQuery {

        val newRules = rules.toMutableList()

        val subRules = newRules[rulesIndex].toMutableList()

        newRules[rulesIndex] = subRules

        subRules[ruleIndex] = subRules[ruleIndex].copy(
            asteroid = asteroidType
        )

        return copy(
            rules = newRules
        )
    }

    fun setFilterItem(rulesIndex: Int, ruleIndex: Int, filterItem: FilterItem): FilterQuery {

        val newRules = rules.toMutableList()

        val subRules = newRules[rulesIndex].toMutableList()

        newRules[rulesIndex] = subRules

        subRules[ruleIndex] = subRules[ruleIndex].copy(
            geyserCount = filterItem as? FilterItemGeyserCount,
            goodGeyserCount = filterItem as? FilterItemGoodGeyserCount,
            worldTrait = filterItem as? FilterItemWorldTrait,
            zoneType = filterItem as? FilterItemZoneType
        )

        return copy(
            rules = newRules
        )
    }

    fun switchCondition(rulesIndex: Int, ruleIndex: Int): FilterQuery {

        val newRules = rules.toMutableList()

        val subRules = newRules[rulesIndex].toMutableList()

        newRules[rulesIndex] = subRules

        subRules[ruleIndex] = subRules[ruleIndex].switchCondition()

        return copy(
            rules = newRules
        )
    }

    fun setValue(rulesIndex: Int, ruleIndex: Int, value: Int?): FilterQuery {

        val newRules = rules.toMutableList()

        val subRules = newRules[rulesIndex].toMutableList()

        newRules[rulesIndex] = subRules

        val ruleAtIndex = subRules[ruleIndex]

        subRules[ruleIndex] = ruleAtIndex.copy(
            geyserCount = ruleAtIndex.geyserCount?.copy(
                count = value
            ),
            goodGeyserCount = ruleAtIndex.goodGeyserCount?.copy(
                count = value
            )
        )

        return copy(
            rules = newRules
        )
    }

    fun addEmptyAndRule(): FilterQuery {

        /* Can't add rules without selecting a Cluster first. */
        if (cluster == null)
            return this

        val newRules = rules.toMutableList()

        newRules.add(
            listOf(
                FilterRule(
                    asteroid = cluster.asteroidTypes.first(),
                    geyserCount = null,
                    goodGeyserCount = null,
                    worldTrait = null,
                    zoneType = null
                )
            )
        )

        return copy(
            rules = newRules
        )
    }

    fun addEmptyOrRule(rulesIndex: Int): FilterQuery {

        /* Can't add rules without selecting a Cluster first. */
        if (cluster == null)
            return this

        val rulesCopy = rules.toMutableList()

        val newRules = rules[rulesIndex].toMutableList()

        newRules.add(
            FilterRule(
                asteroid = cluster.asteroidTypes.first(),
                geyserCount = null,
                goodGeyserCount = null,
                worldTrait = null,
                zoneType = null
            )
        )

        rulesCopy[rulesIndex] = newRules

        return copy(
            rules = rulesCopy
        )
    }

    fun removeRule(rulesIndex: Int, ruleIndex: Int): FilterQuery {

        val newRules = mutableListOf<List<FilterRule>>()

        for ((index, list) in rules.withIndex()) {

            /*
             * If the rule is in the list, we need to add
             * a copy with the rule removed.
             */
            if (index == rulesIndex) {

                val listCopy = list.toMutableList()

                listCopy.removeAt(ruleIndex)

                /*
                 * Add the list, but only if it's not empty
                 * after removing the rule.
                 */
                if (listCopy.isNotEmpty())
                    newRules.add(listCopy)

            } else {

                /*
                 * Otherwise we copy the list as is.
                 */
                newRules.add(list)
            }
        }

        return copy(
            rules = newRules
        )
    }

    companion object {

        val EMPTY = FilterQuery(
            cluster = null,
            dlcs = listOf(Dlc.BaseGame),
            mode = GameModeType.BASEGAME_STANDARD,
            remix = null,
            rules = emptyList()
        )
    }
}
