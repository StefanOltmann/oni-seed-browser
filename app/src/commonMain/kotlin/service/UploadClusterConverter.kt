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

package service

import de.stefan_oltmann.oni.model.Cluster
import de.stefan_oltmann.oni.model.server.upload.UploadAsteroid
import de.stefan_oltmann.oni.model.server.upload.UploadCluster
import de.stefan_oltmann.oni.model.server.upload.UploadGeyser
import de.stefan_oltmann.oni.model.server.upload.UploadPointOfInterest
import de.stefan_oltmann.oni.model.server.upload.UploadStarMapEntrySpacedOut
import de.stefan_oltmann.oni.model.server.upload.UploadStarMapEntryVanilla

object UploadClusterConverter {

    fun convert(cluster: Cluster): UploadCluster =
        UploadCluster(
            coordinate = cluster.coordinate,
            gameVersion = cluster.gameVersion,
            cluster = cluster.cluster,
            asteroids = cluster.asteroids.map { asteroid ->
                UploadAsteroid(
                    id = asteroid.id,
                    sizeX = asteroid.sizeX,
                    sizeY = asteroid.sizeY,
                    worldTraits = asteroid.getEffectiveWorldTraits(),
                    biomePaths = asteroid.biomePaths,
                    pointsOfInterest = asteroid.pointsOfInterest.map { pointOfInterest ->
                        UploadPointOfInterest(
                            id = pointOfInterest.id,
                            x = pointOfInterest.x,
                            y = pointOfInterest.y
                        )
                    },
                    geysers = asteroid.geysers.map { geyser ->
                        UploadGeyser(
                            id = geyser.id,
                            x = geyser.x,
                            y = geyser.y,
                            emitRate = geyser.emitRate,
                            avgEmitRate = geyser.avgEmitRate,
                            idleTime = geyser.idleTime,
                            eruptionTime = geyser.eruptionTime,
                            dormancyCycles = geyser.dormancyCyclesRounded,
                            activeCycles = geyser.activeCyclesRounded
                        )
                    }
                )
            },
            starMapEntriesVanilla = cluster.starMapEntriesVanilla
                .map { entry ->
                    UploadStarMapEntryVanilla(
                        id = entry.id,
                        distance = entry.distance
                    )
                }
                .takeIf { it.isNotEmpty() },
            starMapEntriesSpacedOut = cluster.starMapEntriesSpacedOut
                .map { entry ->
                    UploadStarMapEntrySpacedOut(
                        id = entry.id,
                        q = entry.q,
                        r = entry.r
                    )
                }
                .takeIf { it.isNotEmpty() }
        )
}
