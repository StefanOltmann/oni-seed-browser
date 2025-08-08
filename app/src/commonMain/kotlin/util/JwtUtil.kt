package util

import com.appstractive.jwt.JWT
import com.appstractive.jwt.from
import com.appstractive.jwt.signatures.es256
import com.appstractive.jwt.subject
import com.appstractive.jwt.verify

private val JWT_PUBLIC_KEY =
    """
        -----BEGIN PUBLIC KEY-----
        MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEBHeRvXUxh4O12jjfoGNN/naxqfXboyYY7Ma+pkALk2hk9PYPhVoHk5Ar03k94kyhE9v0i1AEVLXN9WuSqE5+eA==
        -----END PUBLIC KEY-----
    """.trimIndent()

suspend fun isTokenValid(token: String): Boolean {

    try {

        val jwt: JWT = JWT.from(token)

        val steamId = jwt.subject ?: jwt.claims["steamId"]

        val verified = jwt.verify {

            es256 { pem(JWT_PUBLIC_KEY) }
        }

        if (verified)
            println("Steam ID: $steamId (verified)")
        else
            println("Steam ID unverified due to invalid JWT.")

        return verified

    } catch (ex: Exception) {

        ex.printStackTrace()

        return false
    }
}
