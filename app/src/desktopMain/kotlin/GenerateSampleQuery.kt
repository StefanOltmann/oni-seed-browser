import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.Cluster
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

    val firstRule = FilterRule(
        asteroidId = "SandstoneDefault",
        worldTrait = hasWorldTraitGood,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = null,
        orRules = listOf(

            FilterRule(
                asteroidId = "WarpOilySwamp",
                worldTrait = hasWorldTraitGood,
                geyserCount = null,
                geyserOutput = null,
                spaceDestinationCount = null,
                orRules = emptyList()
            )
        )
    )

    val secondRule = FilterRule(
        asteroidId = "SandstoneDefault",
        worldTrait = null,
        geyserCount = FilterItemGeyserCount(
            geyserId = GeyserType.HYDROGEN,
            condition = FilterCondition.AT_LEAST,
            count = 1
        ),
        geyserOutput = null,
        spaceDestinationCount = null,
        orRules = listOf()
    )

    val thirdRule = FilterRule(
        asteroidId = null,
        worldTrait = null,
        geyserCount = null,
        geyserOutput = FilterItemGeyserOutput(
            geyserId = GeyserType.WATER,
            condition = FilterCondition.EXACTLY,
            outputInKgPerSecond = 1337.0
        ),
        spaceDestinationCount = null,
        orRules = listOf(

            FilterRule(
                asteroidId = null,
                worldTrait = null,
                geyserCount = null,
                geyserOutput = null,
                spaceDestinationCount = FilterItemSpaceDestinationCount(
                    poi = "RockyAsteroid",
                    condition = FilterCondition.AT_MOST,
                    count = 5
                ),
                orRules = emptyList()
            )
        )
    )

    val query = FilterQuery(

        cluster = Cluster.BASE_TERRA,
        andRules = listOf(firstRule, secondRule, thirdRule)
    )

    val json = Json.encodeToString(query)

    println(json)
}
