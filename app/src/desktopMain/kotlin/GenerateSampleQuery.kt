import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import model.AsteroidType
import model.Cluster
import model.GeyserType
import model.WorldTrait
import model.filter.FilterItemGeyserCount
import model.filter.FilterItemGeyserOutput
import model.filter.FilterItemSpaceDestinationCount
import model.filter.FilterItemWorldTrait
import model.filter.FilterNumericalRelation
import model.filter.FilterQuery
import model.filter.FilterRule

fun main() {

    val hasWorldTraitGood = FilterItemWorldTrait(
        has = true,
        worldTrait = WorldTrait.FrozenCore
    )

    val firstRule = FilterRule(
        asteroidId = AsteroidType.TERRA,
        worldTrait = hasWorldTraitGood,
        geyserCount = null,
        geyserOutput = null,
        spaceDestinationCount = null,
        orRules = listOf(

            FilterRule(
                asteroidId = AsteroidType.OILY_SWAMP,
                worldTrait = hasWorldTraitGood,
                geyserCount = null,
                geyserOutput = null,
                spaceDestinationCount = null,
                orRules = emptyList()
            )
        )
    )

    val secondRule = FilterRule(
        asteroidId = AsteroidType.TERRA,
        worldTrait = null,
        geyserCount = FilterItemGeyserCount(
            geyserId = GeyserType.HYDROGEN,
            numericalRelation = FilterNumericalRelation.AT_LEAST,
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
            numericalRelation = FilterNumericalRelation.EXACTLY,
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
                    numericalRelation = FilterNumericalRelation.AT_MOST,
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
