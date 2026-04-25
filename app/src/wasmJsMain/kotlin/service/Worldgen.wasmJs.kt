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

import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlinx.coroutines.suspendCancellableCoroutine

@OptIn(ExperimentalWasmJsInterop::class)
private fun jsCreateWorker(): JsAny =
    js("new Worker(new URL('./worldgen.worker.mjs', import.meta.url), { type: 'module' })")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsPostMessageWithCoordinate(worker: JsAny, id: Int, type: String, coordinate: String): Unit =
    js("worker.postMessage({ id: id, type: type, payload: { coordinate: coordinate } })")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsPostMessageNoPayload(worker: JsAny, id: Int, type: String): Unit =
    js("worker.postMessage({ id: id, type: type, payload: null })")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsSetOnMessage(worker: JsAny, callback: (JsAny) -> Unit): Unit =
    js("worker.onmessage = function(event) { callback(event.data) }")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsGetId(data: JsAny): Int =
    js("data.id")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsGetType(data: JsAny): String =
    js("data.type")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsGetResult(data: JsAny): String? =
    js("data.result ?? null")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsGetError(data: JsAny): String =
    js("data.error ?? 'Unknown error'")

@OptIn(ExperimentalWasmJsInterop::class)
private val worker: JsAny by lazy { jsCreateWorker() }

private var nextId = 0
private val pendingCallbacks = mutableMapOf<Int, (Result<String?>) -> Unit>()
private var isListening = false

@OptIn(ExperimentalWasmJsInterop::class)
private fun ensureListening() {
    jsSetOnMessage(worker) { data ->

        val id = jsGetId(data)
        val type = jsGetType(data)

        val callback = pendingCallbacks.remove(id) ?: return@jsSetOnMessage

        if (type == "error")
            callback(Result.failure(Exception(jsGetError(data))))
        else
            callback(Result.success(jsGetResult(data)))
    }
}

@OptIn(ExperimentalWasmJsInterop::class)
private suspend fun sendMessage(type: String, coordinate: String? = null): String? =
    suspendCancellableCoroutine { cont ->
        if (!isListening) {
            ensureListening()
            isListening = true
        }
        val id = nextId++
        pendingCallbacks[id] = { result ->
            result.fold(
                onSuccess = { cont.resume(it) },
                onFailure = { cont.resumeWithException(it) }
            )
        }
        if (coordinate != null)
            jsPostMessageWithCoordinate(worker, id, type, coordinate)
        else
            jsPostMessageNoPayload(worker, id, type)
    }

actual val worldgenSupported: Boolean = true

actual suspend fun worldgenInit() {
    sendMessage("init")
}

actual suspend fun worldgenVersion(): String =
    sendMessage("version") ?: ""

actual suspend fun worldgenGenerate(coordinate: String): String =
    sendMessage("generate", coordinate) ?: ""
