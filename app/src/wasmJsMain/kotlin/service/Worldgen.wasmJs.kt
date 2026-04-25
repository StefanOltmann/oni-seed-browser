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

package service/*
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

import kotlin.js.Promise
import kotlinx.coroutines.await

/*
 * TODO FIXME Should be placed in a web worker for performance reasons.
 *  I just don't know how to do that with Kotlin/WASM.
 */

@OptIn(ExperimentalWasmJsInterop::class)
private fun jsImportModule(): Promise<JsAny> =
    js("import('./worldgen.mjs')")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsCallInit(module: JsAny): Promise<JsAny> =
    js("module.default.init()")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsCallVersion(module: JsAny): String =
    js("module.default.version()")

@Suppress("UNUSED", "UnusedParameter") // false positive
@OptIn(ExperimentalWasmJsInterop::class)
private fun jsCallGenerate(module: JsAny, coordinate: String): String =
    js("module.default.generate(coordinate)")

@OptIn(ExperimentalWasmJsInterop::class)
private var cachedModule: JsAny? = null

@OptIn(ExperimentalWasmJsInterop::class)
private suspend fun getModule(): JsAny =
    cachedModule ?: jsImportModule().await<JsAny>().also { cachedModule = it }

actual val worldgenSupported: Boolean = true

@OptIn(ExperimentalWasmJsInterop::class)
actual suspend fun worldgenInit() {
    val module = getModule()
    jsCallInit(module).await<JsAny>()
}

@OptIn(ExperimentalWasmJsInterop::class)
actual suspend fun worldgenVersion(): String {
    val module = getModule()
    return jsCallVersion(module)
}

@OptIn(ExperimentalWasmJsInterop::class)
actual suspend fun worldgenGenerate(coordinate: String): String {
    val module = getModule()
    return jsCallGenerate(module, coordinate)
}
