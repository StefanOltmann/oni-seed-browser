package model

import testBiomePaths

import kotlin.test.Test
import kotlin.test.assertEquals

class BiomePathsTest {

    /**
     * String should be the same after loading and re-saving
     */
    @Test
    fun testParseAndSerialize() {

        val biomePaths = BiomePaths.parse(testBiomePaths)

        val actual = biomePaths.serialize()

        assertEquals(testBiomePaths, actual)
    }
}
