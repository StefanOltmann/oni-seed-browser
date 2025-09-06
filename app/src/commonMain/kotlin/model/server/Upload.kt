package model.server

import kotlinx.serialization.Serializable
import model.Cluster

/**
 * This is the format expected to be sent from the mod
 */
@Serializable
data class Upload(

    val userId: String,

    val installationId: String,

    val gameVersion: String,

    val fileHashes: Map<String, String>,

    @Deprecated("Call it 'cluster'")
    val world: Cluster? = null,

    val cluster: Cluster? = null
)
