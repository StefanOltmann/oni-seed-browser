import java.io.PrintWriter
import kotlin.time.measureTime
import kotlinx.io.buffered
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.io.decodeFromSource
import model.Cluster
import model.GeyserType

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

private val datafileRegex = Regex("data-[0-9]+.json")

/*
 * Work on the data export
 */
fun main() {

    val exportDataFolder = Path(System.getProperty("user.home") + "/Downloads/data")

    if (!SystemFileSystem.exists(exportDataFolder)) {
        println("Please create folder $exportDataFolder")
        return
    }

    println("Looking into folder $exportDataFolder")

    val printWriter = PrintWriter("build/export.csv")

    printWriter.println("geyser;avgEmitRate")
    // printWriter.println("cluster;asteroid;geyser;avgEmitRate")

    val time = measureTime {

        process(exportDataFolder) { cluster ->

            for (asteroid in cluster.asteroids) {

                for (geyser in asteroid.geysers) {

                    /* Skip oil reservoirs, because their output is fixed. */
                    if (geyser.id == GeyserType.OIL_RESERVOIR)
                        continue

                    printWriter.println("${geyser.id};${geyser.avgEmitRate}")

                    // printWriter.println("${cluster.cluster};${asteroid.id};${geyser.id};${geyser.avgEmitRate}")
                }
            }

            printWriter.flush()
        }

        printWriter.flush()
        printWriter.close()
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
        .filter { it.name.matches(datafileRegex) }
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
