import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.git.versioning)
}

group = "io.github.stefanoltmann"
version = "1.0.0"

gitVersioning.apply {

    refs {
        tag("(?<version>.*)") {
            version = "\${ref.version}"
        }
    }

    rev {
        version = "\${commit.short}"
    }
}

val buildTarget: String? = System.getenv("BUILD_TARGET")

kotlin {

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {

        outputModuleName = "app"

        browser {

            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path

            commonWebpackConfig {
                outputFileName = "app.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside the browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }

        binaries.executable()
    }

    sourceSets {

        sourceSets["commonMain"].kotlin.srcDirs(
            file("build/generated/src/commonMain/kotlin/")
        )

        commonMain.dependencies {

            implementation(libs.oniSeedBrowserModel)

            /* Compose UI */
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)

            /* Icons */
            implementation(libs.compose.material.icons.core)

            /* REST */
            implementation(libs.ktor.core)
            implementation(libs.ktor.contentnegotiation)
            implementation(libs.ktor.encoding)
            implementation(libs.ktor.json)
            implementation(libs.ktor.protobuf)

            /* Settings */
            implementation(libs.multiplatformSettings)

            /* Date formatting */
            implementation(libs.kotlinx.datetime)

            /* Cryptography (JWT) */
            implementation(libs.jwt.kt)
            implementation(libs.jwt.ecdsa.kt)

            implementation(libs.ktor.js)

            implementation(libs.kotlin.browser)

            /* Cryptography (JWT) */
            implementation(libs.cryptography.provider.webcrypto)
            implementation(libs.jwt.kt.wasm.js)

            /*
             * ONI Worldgen worldgen reverse-engineered in Rust
             *
             * https://www.npmjs.com/package/@tigin-backwards/oxygen-not-included-worldgen-node
             */
            implementation(npm("@tigin-backwards/oxygen-not-included-worldgen", "2.0.1"))
        }

        commonTest.dependencies {

            /* Unit Tests */
            implementation(libs.kotlin.test)
        }
    }
}

// region write version
tasks.register("writeVersionFileToWasm") {

    description = "Writes the project version into the wasmJs distribution directory."

    val outputFile = layout.buildDirectory.file("dist/wasmJs/productionExecutable/version.txt")
    outputs.file(outputFile)

    doLast {
        val versionFile = outputFile.get().asFile
        versionFile.parentFile.mkdirs()
        versionFile.writeText(project.version.toString())
    }
}

tasks.named("wasmJsBrowserDistribution") {
    finalizedBy(tasks.named("writeVersionFileToWasm"))
}
// endregion

// region BuildInfo.kt
project.afterEvaluate {

    logger.lifecycle("Generate BuildInfo.kt")

    val outputDir = layout.buildDirectory.file("generated/src/commonMain/kotlin").get().asFile

    outputDir.mkdirs()

    outputDir.resolve("BuildInfo.kt").printWriter().use { writer ->

        writer.println("const val APP_VERSION: String = \"$version\"")

        writer.flush()
    }
}
// endregion

// region AppApiKeys.kt
project.afterEvaluate {

    logger.lifecycle("Generate AppApiKeys.kt")

    val outputDir = layout.buildDirectory.file("generated/src/commonMain/kotlin").get().asFile

    outputDir.mkdirs()

    outputDir.resolve("AppApiKeys.kt").printWriter().use { writer ->

        val apiKey = System.getenv("MNI_API_KEY_BROWSER")

        writer.println("const val MNI_API_KEY_BROWSER: String = \"$apiKey\"")

        writer.flush()
    }
}
// endregion
