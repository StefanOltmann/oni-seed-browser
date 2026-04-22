import kotlinx.coroutines.await
import kotlin.js.Promise

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
private fun jsCallGenerate(module: JsAny, coordinate: String): String =
    js("module.default.generate(coordinate)")

@OptIn(ExperimentalWasmJsInterop::class)
private var cachedModule: JsAny? = null

@OptIn(ExperimentalWasmJsInterop::class)
private suspend fun getModule(): JsAny =
    cachedModule ?: jsImportModule().await<JsAny>().also { cachedModule = it }

@OptIn(ExperimentalWasmJsInterop::class)
suspend fun worldgenInit() {
    val module = getModule()
    jsCallInit(module).await<JsAny>()
}

@OptIn(ExperimentalWasmJsInterop::class)
suspend fun worldgenGenerate(coordinate: String): String {
    val module = getModule()
    return jsCallGenerate(module, coordinate)
}
