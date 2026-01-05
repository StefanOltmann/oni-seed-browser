package de.stefan_oltmann.oni.model

import createFilterQuery
import de.stefan_oltmann.oni.model.filter.FilterQuery
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.serialization.json.Json
import toBase64

class FilterQueryEncodingTest {

    private val sampleJson = """
        {
           "cluster":"PRE-C",
           "dlcs":[
              "SpacedOut",
              "PrehistoricPlanet"
           ],
           "mode":"SPACEDOUT_SPACEDOUT",
           "remix":null,
           "rules":[
              [
                 {
                    "asteroid":"PrehistoricSpacedOutAsteroid",
                    "geyserCount":null,
                    "goodGeyserCount":null,
                    "worldTrait":{
                       "has":true,
                       "worldTrait":"MetalRich"
                    },
                    "zoneType":null
                 }
              ],
              [
                 {
                    "asteroid":"PrehistoricSpacedOutAsteroid",
                    "geyserCount":null,
                    "goodGeyserCount":{
                       "geyser":"methane",
                       "condition":"AT_LEAST",
                       "count":1
                    },
                    "worldTrait":null,
                    "zoneType":null
                 }
              ]
           ]
        }
    """.trimIndent()

    private val testQuery = Json.decodeFromString<FilterQuery>(sampleJson)

    @Test
    fun testRoundtrip() {

        val base64 = testQuery.toBase64()

        assertEquals(
            expected = "eyJjbHVzdGVyIjoiUFJFLUMiLCJkbGNzIjpbIlNwYWNlZE91dCIsIlByZWhpc3RvcmljUGxhbmV0Il0sIm1vZGUiOiJTUEFDRURPVVRfU1BBQ0VET1VUIiwicnVsZXMiOltbeyJhc3Rlcm9pZCI6IlByZWhpc3RvcmljU3BhY2VkT3V0QXN0ZXJvaWQiLCJ3b3JsZFRyYWl0Ijp7ImhhcyI6dHJ1ZSwid29ybGRUcmFpdCI6Ik1ldGFsUmljaCJ9fV0sW3siYXN0ZXJvaWQiOiJQcmVoaXN0b3JpY1NwYWNlZE91dEFzdGVyb2lkIiwiZ29vZEdleXNlckNvdW50Ijp7ImdleXNlciI6Im1ldGhhbmUiLCJjb25kaXRpb24iOiJBVF9MRUFTVCIsImNvdW50IjoxfX1dXX0=",
            actual = base64
        )

        val restoredQuery = createFilterQuery(base64)

        assertEquals(
            expected = testQuery,
            actual = restoredQuery
        )
    }
}
