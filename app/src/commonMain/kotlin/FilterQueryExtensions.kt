import de.stefan_oltmann.oni.model.filter.FilterQuery
import kotlin.io.encoding.Base64
import kotlinx.serialization.json.Json

fun FilterQuery.toBase64(): String {

    val json = Json.encodeToString(this)

    return Base64.UrlSafe.encode(json.encodeToByteArray())
}

fun createFilterQuery(base64: String): FilterQuery {

    val jsonBytes = Base64.UrlSafe.decode(base64)

    val json = jsonBytes.decodeToString()

    return Json.decodeFromString<FilterQuery>(json)
}
