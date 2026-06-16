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

import de.stefan_oltmann.oni.model.filter.FilterQuery
import de.stefan_oltmann.oni.model.search.SearchIndex
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.json
import io.ktor.serialization.kotlinx.protobuf.protobuf
import kotlin.time.measureTimedValue
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

const val DATA_URL = "https://stefan-oltmann.de/oni-seed-browser/data"

const val COUNT_URL = "$DATA_URL/count"

const val SEARCH_INDEX_URL = "$DATA_URL/index"

private val json = Json {
    ignoreUnknownKeys = false
    encodeDefaults = true
}

object DefaultWebClient : WebClient {

    @OptIn(ExperimentalSerializationApi::class)
    private val httpClient = HttpClient {

        install(ContentNegotiation) {
            json(json)
            protobuf()
        }

        install(ContentEncoding) {
            gzip(1.0f)
        }
    }

    private var currentSearchIndex: SearchIndex? = null

    override suspend fun countSeeds(): Long? {

        try {

            val response = httpClient.get(COUNT_URL) {
                accept(ContentType.Text.Plain)
            }

            if (response.status != HttpStatusCode.OK)
                return null

            val seedCount: String? = response.body()

            println("[WEBCLIENT] Seed count: $seedCount")

            return seedCount?.toLongOrNull()

        } catch (ex: CancellationException) {
            throw ex
        } catch (ex: Throwable) {
            println("Did not receive counts: ${ex.message}")
        }

        return null
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun search(filterQuery: FilterQuery): List<String> =
        withContext(Dispatchers.Default) {

            val cluster = filterQuery.cluster ?: return@withContext emptyList()

            val (results, time) = measureTimedValue {

                if (currentSearchIndex?.clusterType == cluster)
                    return@measureTimedValue currentSearchIndex!!.match(filterQuery)

                val searchIndex = findSearchIndex(cluster)

                currentSearchIndex = searchIndex

                return@measureTimedValue searchIndex.match(filterQuery)
            }

            println("[WEBCLIENT] Search took $time")

            return@withContext results
        }
}
