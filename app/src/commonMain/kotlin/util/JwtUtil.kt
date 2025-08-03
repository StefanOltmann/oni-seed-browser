package util

import com.appstractive.jwt.JWT
import com.appstractive.jwt.from
import com.appstractive.jwt.signatures.rs256
import com.appstractive.jwt.subject
import com.appstractive.jwt.verify

private val JWT_PUBLIC_KEY =
    """
        -----BEGIN PUBLIC KEY-----
        MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAssCfiAkLu
        dGa1okEQ4tyy7S9zPlH0PKoG/nRLCXcV4PGBnApj8+jj63ZtcYL/v
        IkOcLp/FuFUqm0EGXFNzl2EpKCFSMGeJ9yVj4TjJNKaOUrVivj8xM
        8/M6emy4bJ5svpJ2XXW9olkiU/KJ+JflgACVjFUTYt2AetuOALGE4
        MY+9XelGwccXoyB+rklBtiGCvZxZm4UN/7Bvp7oqKJiW+xanFEpOB
        r9seK565FTxtbSLtIWs2apkvVri5RAoSP4mh1YUXhB/+LOGYwu4Tm
        01p5D9qfA3k3EQw2gk7DHJNzcc2MrLJufA1WuM7+9LEyuLFB6waly
        vylenVV56w7ugOQIDAQAB
        -----END PUBLIC KEY-----
    """.trimIndent()

suspend fun isTokenValid(token: String): Boolean {

    try {

        val jwt: JWT = JWT.from(token)

        val steamId = jwt.subject ?: jwt.claims["steamId"]

        val verified = jwt.verify {

            rs256 { pem(JWT_PUBLIC_KEY) }
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
