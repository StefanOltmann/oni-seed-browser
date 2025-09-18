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
package service

import js.buffer.toArrayBuffer
import js.buffer.toByteArray
import js.objects.unsafeJso
import js.typedarrays.toByteArray
import web.cache.Cache
import web.cache.caches
import web.cache.delete
import web.cache.match
import web.cache.open
import web.cache.put
import web.http.BodyInit
import web.http.Headers
import web.http.Response
import web.http.byteArray
import web.http.bytes

actual class DiskCache(
    val name: String
) {

    private var cache: Cache? = null

    suspend fun init() {

        if (cache != null)
            return

        this.cache = caches.open(name)
    }

    actual suspend fun load(key: String): Pair<ByteArray, Long>? {

        init()

        val response = cache?.match(key) ?: return null

        val lastModified = response.headers.get("x-cache-modified-time")?.toLongOrNull()
            ?: error("Missing 'x-cache-modified-time' header in cache response.")

        return response.byteArray() to lastModified
    }

    @OptIn(ExperimentalWasmJsInterop::class)
    actual suspend fun save(key: String, data: ByteArray, modifiedTime: Long) {

        init()

        cache?.put(
            url = key,
            response = Response(
                body = BodyInit(
                    value = data.toArrayBuffer()
                ),
                init = unsafeJso {
                    status = 200
                    headers = Headers().apply {
                        set("x-cache-modified-time", modifiedTime.toString())
                    }
                }
            )
        )
    }

    actual suspend fun delete(key: String) {
        cache?.delete(key)
    }

    actual suspend fun deleteAll() {
        caches.delete(name)
    }
}

actual val searchIndexDiskCache: DiskCache = DiskCache("oni-search-index")
actual val clusterDiskCache: DiskCache = DiskCache("oni-cluster")
