import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.Cluster
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
        asteroidId = "SandstoneDefault",
        worldTrait = hasWorldTraitGood,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = null
    )

    val firstRuleOr = FilterRule(
        asteroidId = "WarpOilySwamp",
        worldTrait = hasWorldTraitGood,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = null
    )

    firstRuleGroup.add(firstRule)
    firstRuleGroup.add(firstRuleOr)

    val secondRule = FilterRule(
        asteroidId = "SandstoneDefault",
        worldTrait = null,
        geyserCount = FilterItemGeyserCount(
            geyserId = GeyserType.HYDROGEN,
            condition = FilterCondition.AT_LEAST,
            count = 1
        ),
        geyserOutput = null,
        spaceDestinationCount = null
    )

    val thirdRuleGroup = mutableListOf<FilterRule>()

    val thirdRule = FilterRule(
        asteroidId = null,
        worldTrait = null,
        geyserCount = null,
        geyserOutput = FilterItemGeyserOutput(
            geyserId = GeyserType.WATER,
            condition = FilterCondition.EXACTLY,
            outputInKgPerSecond = 1337.0
        ),
        spaceDestinationCount = null
    )

    val thirdRuleOr = FilterRule(
        asteroidId = null,
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

        cluster = Cluster.BASE_TERRA,
        dlcs = listOf(Dlc.FrostyPlanet),
        rules = listOf(firstRuleGroup, listOf(secondRule), thirdRuleGroup)
    )

    val json = Json.encodeToString(query)

    println(json)
}
