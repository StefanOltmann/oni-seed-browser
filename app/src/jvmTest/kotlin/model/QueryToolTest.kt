package de.stefan_oltmann.oni.model

import kotlin.test.Test
import kotlin.test.assertEquals
import util.getQueryParameters

class QueryToolTest {

    private val sampleSearch =
        """?embedded=mni&filter=eyJjbHVzdGVyIjoiQkFELUEiLCJkbGNzIjpbIkJhc2VHYW1lIl0sInJ1bGVzIjpbXX0=&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTc2MDA0NjAxNCwiZXhwIjoxNzYwMDQ5NjE0fQ.sI2X7I4qmqahH5aQdK60PuFsIIpR-CqYF2mRDAyFEvg"""

    @Test
    fun testGetQueryParameters() {

        val actual = getQueryParameters(sampleSearch)

        assertEquals(
            expected = mapOf(
                "embedded" to "mni",
                "filter" to "eyJjbHVzdGVyIjoiQkFELUEiLCJkbGNzIjpbIkJhc2VHYW1lIl0sInJ1bGVzIjpbXX0=",
                "token" to "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTc2MDA0NjAxNCwiZXhwIjoxNzYwMDQ5NjE0fQ.sI2X7I4qmqahH5aQdK60PuFsIIpR-CqYF2mRDAyFEvg"
            ),
            actual = actual
        )

        println(actual)

    }

}
