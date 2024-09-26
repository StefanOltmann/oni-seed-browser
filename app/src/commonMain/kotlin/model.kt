import kotlinx.serialization.Serializable;

@Serializable
data class Save(
    val seed: Long,
    val coordinates: String,
    val gameVersion: String,
    val worldId: String,
    val vanilla: Boolean,
    val spacedOut: Boolean,
    val frostyPlanet: Boolean,
    val worldTraits: List<String>,
    val createdAt: String,
    val updatedAt: String,
    val fileId: Int
)

@Serializable
data class SearchRequest(
    val selectedWorld: String,
    val worldTraits: List<String>,
    val page: Int,
    val vanilla: Boolean
)

@Serializable
data class SearchResponse(
    val saves: List<Save>,
    val page: Int,
    val pageSize: Int,
    val totalPages: Int,
    val totalResults: Int
)
