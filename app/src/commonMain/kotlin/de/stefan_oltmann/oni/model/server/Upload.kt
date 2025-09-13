package de.stefan_oltmann.oni.model.server

import kotlinx.serialization.Serializable
import de.stefan_oltmann.oni.model.server.upload.UploadCluster

/**
 * This is the format expected to be sent from the mod
 */
@Serializable
data class Upload(

    val userId: String,

    val installationId: String,

    val gameVersion: String,

    val fileHashes: Map<String, String>,

    val cluster: UploadCluster

)
