/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de/oni-seed-browser
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
import io.minio.MinioClient
import io.minio.PutObjectArgs
import kotlin.time.measureTime
import kotlinx.io.buffered
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.io.decodeFromSource
import model.Cluster

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

        process(exportDataFolder) { cluster ->

            // TODO Do something with the data here

            val json = Json.encodeToString(cluster)

            val bytes = json.encodeToByteArray()

            val compressedBytes = zlibCompress(bytes)

            println("${bytes.size} bytes -> ${compressedBytes.size} bytes")

            val minioClient =
                MinioClient.builder()
                    .endpoint("http://s3.tebi.io")
                    .credentials("", "")
                    .build()

            minioClient.putObject(
                PutObjectArgs
                    .builder()
                    .bucket("oni")
                    .`object`("${cluster.coordinate}.json.zlib")
                    .stream(compressedBytes.inputStream(), compressedBytes.size.toLong(), -1)
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
