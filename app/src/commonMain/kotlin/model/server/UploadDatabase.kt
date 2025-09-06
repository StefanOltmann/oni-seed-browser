package model.server

import kotlinx.serialization.Serializable

/**
 * This is the info we store into the database about the upload
 */
@Serializable
data class UploadDatabase(

    val userId: String,

    val installationId: String,

    val gameVersion: String,

    val fileHashes: Map<String, String>,

    val uploadDate: Long,

    val ipAddress: String,

    val coordinate: String
)
