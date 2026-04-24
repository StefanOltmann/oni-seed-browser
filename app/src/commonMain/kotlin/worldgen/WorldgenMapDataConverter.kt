/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
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
package worldgen

import de.stefan_oltmann.oni.model.Asteroid
import de.stefan_oltmann.oni.model.AsteroidType
import de.stefan_oltmann.oni.model.Cluster
import de.stefan_oltmann.oni.model.ClusterType
import de.stefan_oltmann.oni.model.Geyser
import de.stefan_oltmann.oni.model.GeyserType
import de.stefan_oltmann.oni.model.PointOfInterest
import de.stefan_oltmann.oni.model.PointOfInterestType
import de.stefan_oltmann.oni.model.SpacedOutSpacePOI
import de.stefan_oltmann.oni.model.StarMapEntrySpacedOut
import de.stefan_oltmann.oni.model.StarMapEntryVanilla
import de.stefan_oltmann.oni.model.VanillaSpacePOI
import de.stefan_oltmann.oni.model.WorldTrait
import de.stefan_oltmann.oni.model.ZoneType
import kotlin.math.round

object WorldgenMapDataConverter {

    fun convert(mapData: WorldgenMapData): Cluster {

        val clusterType = parseClusterType(mapData.clusterId)

        /*
         * Create a map of the regular POIs like harvestable, etc.
         */
        val starMapPOIEntries = mapData.starmapPois.map { entry ->
            StarMapEntrySpacedOut(
                id = parseSpacedOutSpacePOI(entry.poiType),
                q = entry.q.toByte(),
                r = entry.r.toByte()
            )
        }

        /*
         * Create a map of the asteroids.
         */
        val starMapAsteroidEntries = mapData.starmap.mapIndexed { index, entry ->

            val asteroid = mapData.worlds[index]

            val cleanName = asteroid.name.substringAfter("worlds/")

            val asteroidId = SpacedOutSpacePOI.entries.find { it.name == cleanName }
                ?: error("Unknown asteroid type: ${asteroid.name}")

            StarMapEntrySpacedOut(
                id = asteroidId,
                q = entry.q.toByte(),
                r = entry.r.toByte()
            )
        }

        val starMapEntriesSpacedOut = starMapPOIEntries + starMapAsteroidEntries

        val asteroids = mapData.worlds.mapIndexed { index, worldMapData ->

            val worldTraits = worldMapData.worldTraits.map { traitString ->
                parseWorldTrait(traitString)
            }

            /*
             * The worldgen does flip the Y axis, so we need to invert it.
             */
            val worldHeight = worldMapData.height.toShort()

            val biomePaths = buildBiomePaths(
                biomeCells = worldMapData.biomeCells,
                worldHeight = worldHeight
            )

            /* Find the relevant POIs. We use mapNotNull() to filter out the ones not interesting for us. */
            val otherEntitiesPois = worldMapData.otherEntities.mapNotNull { entity ->
                parsePointOfInterest(
                    tag = entity.tag,
                    x = entity.x,
                    y = worldHeight - entity.y
                )
            }

            val buildingPois = worldMapData.buildings.mapNotNull { entity ->
                parsePointOfInterest(
                    tag = entity.tag,
                    x = entity.x,
                    y = worldHeight - entity.y
                )
            }

            Asteroid(
                id = parseAsteroidType(worldMapData.name),
                sizeX = worldMapData.width.toShort(),
                sizeY = worldHeight,
                worldTraitsBitmask = WorldTrait.toMask(worldTraits),
                biomePaths = biomePaths,
                pointsOfInterest = otherEntitiesPois + buildingPois,
                geysers = worldMapData.geysers.map { geyserSpawn ->
                    convertGeyser(
                        geyserSpawn = geyserSpawn,
                        worldHeight = worldHeight
                    )
                }
            )
        }

        return Cluster(
            coordinate = mapData.coordinate,
            uploaderSteamIdHash = "",
            uploaderAuthenticated = false,
            uploadDate = 0,
            gameVersion = 0,
            cluster = clusterType,
            asteroids = asteroids,
            starMapEntriesVanilla = mapData.vanillaStarmap.map { entry ->
                StarMapEntryVanilla(
                    id = parseVanillaSpacePOI(entry.type),
                    distance = entry.distance.toByte()
                )
            },
            starMapEntriesSpacedOut = starMapEntriesSpacedOut
        )
    }

    private fun parseClusterType(clusterId: String): ClusterType {

        val idPart = clusterId.substringAfterLast("/")

        return when (idPart) {
            "TerraStart" -> ClusterType.BASE_TERRA
            "CeresStart" -> ClusterType.BASE_CERES
            "CeresSpacedOutCluster" -> ClusterType.DLC_CERES_MINOR
            "ArboriaStart" -> ClusterType.BASE_ARBORIA
            "ArboriaSpacedOutCluster" -> ClusterType.DLC_ARBORIA
            "RimeStart" -> ClusterType.BASE_RIME
            "RimeSpacedOutCluster" -> ClusterType.DLC_RIME
            "VerdanteStart" -> ClusterType.BASE_VERDANTE
            "VerdanteSpacedOutCluster" -> ClusterType.DLC_VERDANTE
            "OceaniaStart" -> ClusterType.BASE_OCEANIA
            "OceaniaSpacedOutCluster" -> ClusterType.DLC_OCEANIA
            "VolcaneaStart" -> ClusterType.BASE_VOLCANEA
            "VolcaneaSpacedOutCluster" -> ClusterType.DLC_VOLCANEA
            "BadlandsStart" -> ClusterType.BASE_THE_BADLANDS
            "BadlandsSpacedOutCluster" -> ClusterType.DLC_THE_BADLANDS
            "AridioStart" -> ClusterType.BASE_ARIDIO
            "AridioSpacedOutCluster" -> ClusterType.DLC_ARIDIO
            "OasisseStart" -> ClusterType.BASE_OASISSE
            "OasisseSpacedOutCluster" -> ClusterType.DLC_OASISSE
            "TerraSpacedOutCluster" -> ClusterType.DLC_TERRA
            "RelicaStart" -> ClusterType.BASE_RELICA
            "RelicaSpacedOutCluster" -> ClusterType.DLC_RELICA
            else -> error("Unknown cluster type: $clusterId")
        }
    }

    private fun parseAsteroidType(name: String): AsteroidType {

        val clanedName = name.substringAfter("worlds/")

        return AsteroidType.entries.find { it.name == clanedName }
            ?: error("Unknown asteroid type: $name")
    }

    private fun buildBiomePaths(
        biomeCells: List<BiomeCell>,
        worldHeight: Short
    ): String {

        val zoneToPoints = mutableMapOf<String, MutableList<String>>()

        for (cell in biomeCells) {

            val zoneType = parseZoneType(cell.type)
            val zoneName = zoneType.name

            val polyCoords = cell.poly
            val pointsBuilder = StringBuilder()

            for (index in polyCoords.indices step 2) {

                if (index > 0)
                    pointsBuilder.append(" ")

                val x = polyCoords[index].toInt()
                val y = worldHeight - polyCoords[index + 1].toInt()

                pointsBuilder.append("$x,$y")
            }

            zoneToPoints.getOrPut(zoneName) { mutableListOf() }.add(pointsBuilder.toString())
        }

        val result = StringBuilder()

        var firstZone = true

        for ((zoneName, pointsList) in zoneToPoints) {

            if (!firstZone)
                result.append("\n")

            firstZone = false
            result.append(zoneName)
            result.append(":")
            var firstEntry = true

            for (points in pointsList) {

                if (!firstEntry)
                    result.append(";")

                firstEntry = false
                result.append(points)
            }
        }

        return result.toString()
    }

    private fun parseZoneType(type: String): ZoneType {

        return when (type) {

            "subworlds/space/Space" -> ZoneType.Space
            "subworlds/space/SpaceNoBorder" -> ZoneType.Space

            else -> return ZoneType.Barren // FIXME We need a proper mapping
            // else -> error("Unknown zone type: $type")
        }
    }

    private fun parseWorldTrait(trait: String): WorldTrait {

        val cleanedTraitString = trait.substringAfter("traits/")

        return WorldTrait.entries.find { it.name == cleanedTraitString }
            ?: error("Unknown world trait: $trait")
    }

    private fun convertGeyser(
        geyserSpawn: GeyserSpawn,
        worldHeight: Short
    ): Geyser {

        val geyserType = parseGeyserType(geyserSpawn.type)

        val scaledRate = geyserSpawn.scaledRate ?: 0.0
        val scaledIterLen = geyserSpawn.scaledIterLen ?: 0.0
        val scaledIterPct = geyserSpawn.scaledIterPct ?: 0.0
        val scaledYearLen = geyserSpawn.scaledYearLen ?: 0.0
        val scaledYearPct = geyserSpawn.scaledYearPct ?: 0.0

        val iterationLength = scaledIterLen
        val iterationPercent = scaledIterPct.coerceIn(0.0, 1.0).toFloat()
        val onDuration = (iterationLength * iterationPercent).toFloat()
        val offDuration = (iterationLength * (1f - iterationPercent)).toFloat()

        val massPerCycle = scaledRate
        val emitRateNum1 = (600.0 / iterationLength).toFloat()
        val emitRateNum2 = (massPerCycle / emitRateNum1).toFloat()

        /* Guard against onDuration == 0 (permanently-dormant geyser) to avoid Infinity. */
        val emitRate = if (onDuration > 0f) (emitRateNum2 / onDuration).toFloat() else 0f

        val yearLength = scaledYearLen
        val yearPercent = scaledYearPct.coerceIn(0.0, 1.0).toFloat()
        val yearOnDuration = (yearLength * yearPercent).toFloat()
        val yearOffDuration = (yearLength * (1f - yearPercent)).toFloat()

        val avgEmitRate = ((yearOnDuration / iterationLength) * (emitRate * onDuration) / yearLength).toFloat()

        return Geyser(
            id = geyserType,
            x = geyserSpawn.x.toShort(),
            y = (worldHeight - geyserSpawn.y).toShort(),
            emitRate = round(emitRate * 1000).toInt(),
            avgEmitRate = round(avgEmitRate * 1000).toInt().toShort(),
            idleTime = round(offDuration).toInt().toShort(),
            eruptionTime = round(onDuration).toInt().toShort(),
            dormancyCyclesRounded = round(yearOffDuration / 600f).toInt().toShort(),
            activeCyclesRounded = round(yearOnDuration / 600f).toInt().toShort()
        )
    }

    private fun parseGeyserType(type: String): GeyserType =
        GeyserType.entries.find { it.type == type } ?: error("Unknown geyser type: $type")

    private fun parsePointOfInterest(tag: String, x: Int, y: Int): PointOfInterest? {

        val poiType = PointOfInterestType.entries.find { it.name == tag }
            ?: return null

        return PointOfInterest(
            id = poiType,
            x = x.toShort(),
            y = y.toShort()
        )
    }

    private fun parseVanillaSpacePOI(type: String): VanillaSpacePOI =
        VanillaSpacePOI.entries.find { it.name == type }
            ?: error("Unknown VanillaSpacePOI: $type")

    private fun parseSpacedOutSpacePOI(type: String): SpacedOutSpacePOI =
        SpacedOutSpacePOI.entries.find { it.name == type }
            ?: error("Unknown SpacedOutSpacePOI: $type")
}
