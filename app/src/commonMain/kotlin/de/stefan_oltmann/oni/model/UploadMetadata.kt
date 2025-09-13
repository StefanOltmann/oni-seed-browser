package de.stefan_oltmann.oni.model.server

import kotlinx.serialization.Serializable

/**
 * This is the info we store into the database about the upload.
 * This is data we may need for analytics on bad map reports.
 */
@Serializable
data class UploadMetadata(

    val userId: String,

    val installationId: String,

    val gameVersion: String,

    val fileHashes: Map<String, String>,

    val uploadDate: Long,

    val ipAddress: String,

    val coordinate: String
)
