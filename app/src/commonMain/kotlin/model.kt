import kotlinx.serialization.Serializable
import model.World

@Serializable
data class SearchRequest(
    val selectedWorld: String,
    val worldTraits: List<String>,
    val page: Int,
    val vanilla: Boolean
)

@Serializable
data class SearchResponse(
    val page: Int,
    val pageSize: Int,
    val totalPages: Int,
    val totalResults: Int,
    val worlds: List<World>
)
