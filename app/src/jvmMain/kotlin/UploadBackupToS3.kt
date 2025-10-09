/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import de.stefan_oltmann.oni.model.Cluster
import io.minio.ListObjectsArgs
import io.minio.MinioClient
import io.minio.PutObjectArgs
import java.io.ByteArrayOutputStream
import java.util.zip.GZIPOutputStream
import kotlin.time.measureTime
import kotlinx.io.buffered
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.io.decodeFromSource

/*
 * Work on the data export
 */
fun main() {

    val exportDataFolder = Path("D:/onidata")

    if (!SystemFileSystem.exists(exportDataFolder)) {
        println("Please create folder $exportDataFolder")
        return
    }

    val time = measureTime {

        val minioClient =
            MinioClient.builder()
                .endpoint("http://minio:9000")
                .credentials("", "")
                .build()

        val objects = minioClient.listObjects(
            ListObjectsArgs.builder()
                .bucket("oni")
                .build()
        )

        val existingNames = mutableSetOf<String>()

        for (result in objects) {

            val item = result.get()

            existingNames.add(item.objectName())
        }

        // println("Existing names: ${existingNames.size}")

        process(exportDataFolder) { cluster ->

            val name = "${cluster.coordinate}.json.gz"

            if (existingNames.contains(name)) {
                println("Skipping $name")
                return@process
            }

            val json = Json.encodeToString(cluster)

            val bytes = json.encodeToByteArray()

            val gzippedBytes = ByteArrayOutputStream().use { byteStream ->

                GZIPOutputStream(byteStream).use { gzipStream ->
                    gzipStream.write(bytes)
                    gzipStream.finish()
                }
                byteStream.toByteArray()
            }

            println("${bytes.size} bytes -> ${gzippedBytes.size} bytes")

            minioClient.putObject(
                PutObjectArgs
                    .builder()
                    .bucket("oni")
                    .`object`(name)
                    .headers(
                        mapOf(
                            "Content-Type" to "application/json",
                            "Content-Encoding" to "gzip"
                        )
                    )
                    .stream(gzippedBytes.inputStream(), gzippedBytes.size.toLong(), -1)
                    .build()
            )
        }
    }

    println("Operation took $time")
}

@OptIn(ExperimentalSerializationApi::class)
private fun process(
    exportDataFolder: Path,
    doWork: (Cluster) -> Unit
) {

    val dataFiles = SystemFileSystem
        .list(exportDataFolder)
        .filter { it.name.endsWith(".json") }
        .sortedBy { it.name }

    for (file in dataFiles) {

        println("Processing $file ...")

        SystemFileSystem.source(file).buffered().use { source ->

            val clustersInFile = Json.decodeFromSource<List<Cluster>>(source)

            for (cluster in clustersInFile)
                doWork(cluster)

            System.gc()
        }
    }
}
