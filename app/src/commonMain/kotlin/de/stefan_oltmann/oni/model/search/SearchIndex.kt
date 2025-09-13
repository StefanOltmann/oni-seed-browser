package de.stefan_oltmann.oni.model.search

import de.stefan_oltmann.oni.model.Cluster
import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.GeyserType
import de.stefan_oltmann.oni.model.WorldTrait
import de.stefan_oltmann.oni.model.ZoneType
import de.stefan_oltmann.oni.model.filter.FilterCondition
import de.stefan_oltmann.oni.model.filter.FilterQuery
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
class SearchIndex(

    @ProtoNumber(1)
    val clusterType: ClusterType,

    @ProtoNumber(2)
    val timestamp: Long

) {

    @ProtoNumber(3)
    private val _summaries: MutableList<ClusterSummaryCompact> = mutableListOf()

    @Transient
    val summaries: List<ClusterSummaryCompact> = _summaries

    /**
     * Sorts the search index for consistent query results.
     */
    fun sort() = summaries.sortedBy { it.seed }

    /**
     * Adds a cluster to the search index.
     */
    fun add(cluster: Cluster) {

        if (cluster.cluster != clusterType)
            error("Cluster must be $clusterType, but is ${cluster.cluster}")

        _summaries.add(ClusterSummaryCompact.create(cluster))
    }

    /**
     * Finds matching cluster summaries for the given filter query.
     * Notes:
     * - FilterQuery compares TOTAL geyser output; compact index stores AVERAGE per geyser type,
     *   so we compute total = avgOutput * count for comparisons.
     * - AND-of-OR semantics: each inner list is OR-connected; the outer list is AND-connected.
     */
    fun match(
        filterQuery: FilterQuery
    ): List<String> {

        /* Cluster type must match this index; otherwise nothing can match */
        if (filterQuery.cluster != clusterType)
            error("Cluster type mismatch: ${filterQuery.cluster} != $clusterType.")

        return summaries.filter { clusterSummary ->

            val effectiveRemix = clusterSummary.remix ?: "0"

            /*
             * Check if the cluster's remix matches, if set.
             */
            if (filterQuery.remix != null && filterQuery.remix != effectiveRemix)
                return@filter false

            /*
             * If there are no filter rules, we have a match.
             */
            if (filterQuery.rules.isEmpty())
                return@filter true

            /*
             * The outer loop iterates through groups that are connected by AND.
             * A cluster summary must satisfy ALL of these groups to be a match.
             */
            for (orRules in filterQuery.rules) {

                /*
                 * Ignore empty OR-rules. Should not happen.
                 */
                if (orRules.isEmpty())
                    continue

                /*
                 * For each group, we check if ANY rule within it matches (OR logic).
                 * We start by assuming no rules in the group have matched yet.
                 */
                var groupMatches = false

                for (orRule in orRules) {

                    /*
                     * Find the requested asteroid summary by enum name or ignore this rule.
                     * Due to mixing the wanted Asteroid may not be found in this cluster summary.
                     */
                    val asteroidSummary = clusterSummary.asteroidSummaries.firstOrNull {
                        it.id == orRule.asteroid
                    } ?: continue

                    val matchesRule = when {

                        orRule.geyserCount != null -> {

                            val item = orRule.geyserCount

                            val geyserTypeName = item.geyser

                            val geyserType = GeyserType.entries.find { it == geyserTypeName }
                                ?: error("Geyser type not found for $geyserTypeName.")

                            val index = geyserType.ordinal

                            val count = if (index < asteroidSummary.geyserCounts.size)
                                asteroidSummary.geyserCounts[index].toInt()
                            else
                                0

                            val expected = item.count ?: 0

                            when (item.condition) {
                                FilterCondition.EXACTLY -> count == expected
                                FilterCondition.AT_LEAST -> if (expected == 0) count > 0 else count >= expected
                                FilterCondition.AT_MOST -> count <= expected
                            }
                        }

                        orRule.goodGeyserCount != null -> {

                            val item = orRule.goodGeyserCount

                            val geyserTypeName = item.geyser

                            val geyserType = GeyserType.entries.find { it == geyserTypeName }
                                ?: error("Geyser type not found for $geyserTypeName.")

                            val index = geyserType.ordinal

                            val goodCount = if (index < asteroidSummary.goodGeyserCounts.size)
                                asteroidSummary.goodGeyserCounts[index].toInt()
                            else
                                0

                            val expected = item.count ?: 0

                            when (item.condition) {
                                FilterCondition.EXACTLY -> goodCount == expected
                                FilterCondition.AT_LEAST -> if (expected == 0) goodCount > 0 else goodCount >= expected
                                FilterCondition.AT_MOST -> goodCount <= expected
                            }
                        }

                        orRule.worldTrait != null -> {

                            val item = orRule.worldTrait

                            val hasTrait = WorldTrait.has(asteroidSummary.worldTraitsBitMask, item.worldTrait)

                            if (item.has)
                                hasTrait
                            else
                                !hasTrait
                        }

                        orRule.zoneType != null -> {

                            val item = orRule.zoneType

                            val hasZoneType = ZoneType.has(asteroidSummary.zoneTypesBitMask, item.zoneType)

                            if (item.has)
                                hasZoneType
                            else
                                !hasZoneType
                        }

                        /* Outdated rules result in mismatches. */
                        else ->
                            false
                    }

                    /* If we find just one matching rule, this group is satisfied (OR logic). */
                    if (matchesRule) {

                        groupMatches = true

                        /* No need to check other rules in this group. */
                        break
                    }
                }

                /*
                 * If, after checking all rules, no match was found in the group,
                 * the whole cluster fails the filter (AND logic).
                 */
                if (!groupMatches)
                    return@filter false
            }

            /* If the cluster summary has survived all the AND groups, it's a match. */
            true

        }.map {
            clusterType.prefix + "-" + it.seed + "-0-0-" + (it.remix ?: "0")
        }
    }
}
