import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinSerialization)
    id("me.qoomon.git-versioning") version "6.4.3"
    id("dev.hydraulic.conveyor") version "1.12"
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

    jvm()

    jvmToolchain(jdkVersion = 17)

    if (buildTarget != "desktop") {

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
    }

    sourceSets {

        sourceSets["commonMain"].kotlin.srcDirs(
            file("build/generated/src/commonMain/kotlin/")
        )

        commonMain.dependencies {

            /* Compose UI */
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)

            /* Icons */
            implementation("org.jetbrains.compose.material:material-icons-core:1.7.3")

            /* REST */
            implementation(libs.ktor.core)
            implementation(libs.ktor.contentnegotiation)
            implementation(libs.ktor.encoding)
            implementation(libs.ktor.json)
            implementation(libs.ktor.protobuf)

            /* Settings */
            implementation(libs.multiplatformSettings)

            /* Date formatting */
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.7.1")

            /* Cryptography (JWT) */
            implementation("com.appstractive:jwt-kt:1.2.1")
            implementation("com.appstractive:jwt-ecdsa-kt:1.2.1")
        }

        commonTest.dependencies {

            /* Unit Tests */
            implementation(libs.kotlin.test)
        }

        jvmMain.dependencies {

            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
            implementation(libs.ktor.java)

            implementation("io.minio:minio:8.5.17")
        }

        if (buildTarget != "desktop") {

            wasmJsMain.dependencies {

                implementation(libs.ktor.js)

                implementation("org.jetbrains.kotlin-wrappers:kotlin-browser:2025.8.20")

                /* Cryptography (JWT) */
                implementation("dev.whyoleg.cryptography:cryptography-provider-webcrypto:0.4.0")
                implementation("com.appstractive:jwt-kt-wasm-js:1.1.0")
            }
        }
    }
}

compose.desktop {

    application {

        mainClass = "MainKt"

        nativeDistributions {

            includeAllModules = true

            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)

            packageName = "ONI Seed Browser"

            if (version.toString().matches(Regex("^\\d+\\.\\d+\\.\\d+$")))
                packageVersion = version.toString()
            else
                packageVersion = "1.0.0"
        }
    }
}

dependencies {

    /*
     * Workaround for a bug in Hydraulic Conveyor 18:
     * It does not support wasmJS target.
     */
    if (buildTarget == "desktop") {

        linuxAmd64(compose.desktop.linux_x64)
        macAmd64(compose.desktop.macos_x64)
        macAarch64(compose.desktop.macos_arm64)
        windowsAmd64(compose.desktop.windows_x64)
    }
}

// region write version
if (buildTarget != "desktop") {

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

// region Work around temporary Compose bugs.
configurations.all {
    attributes {
        // https://github.com/JetBrains/compose-jb/issues/1404#issuecomment-1146894731
        attribute(Attribute.of("ui", String::class.java), "awt")
    }
}
// endregion

