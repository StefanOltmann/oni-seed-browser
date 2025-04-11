import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.pluginCompose)
    alias(libs.plugins.kotlinSerialization)
    id("me.qoomon.git-versioning") version "6.4.3"
    id("dev.hydraulic.conveyor") version "1.12"
}

group = "io.github.stefanoltmann"
version = "1.0.0"

gitVersioning.apply {

    refs {
        tag("v(?<version>.*)") {
            version = "\${ref.version}"
        }
    }
}

kotlin {

    jvm()

    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs {

        moduleName = "app"

        browser {
            commonWebpackConfig {
                outputFileName = "app.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(project.rootDir.path)
                        add(project.projectDir.path)
                    }
                }
            }
        }

        binaries.executable()
    }

    sourceSets {

        val jvmMain by getting

        jvmMain.dependencies {

            implementation(compose.desktop.currentOs)

            implementation(libs.ktor.java)
        }

        val wasmJsMain by getting

        wasmJsMain.dependencies {

            implementation(libs.ktor.js)

            /* Cryptography (JWT) */
            implementation("dev.whyoleg.cryptography:cryptography-provider-webcrypto:0.4.0")
            implementation("com.appstractive:jwt-kt-wasm-js:1.1.0")
            implementation("com.appstractive:jwt-rsa-kt:1.1.0")
        }

        commonMain.dependencies {

            /* Compose UI */
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)

            /* REST */
            implementation(libs.ktor.core)
            implementation(libs.ktor.contentnegotiation)
            implementation(libs.ktor.encoding)
            implementation(libs.ktor.json)
            implementation(libs.ktor.cbor)

            /* Settings */
            implementation(libs.multiplatformSettings)
        }

        commonTest.dependencies {

            /* Unit Tests */
            implementation(libs.kotlin.test)
        }
    }
}

compose.desktop {

    application {

        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "de.stefan-oltmann.oni-seed-browser"
            packageVersion = version.toString()
        }
    }
}

//dependencies {
//
//    /* Conveyor */
//    linuxAmd64(compose.desktop.linux_x64)
//    macAmd64(compose.desktop.macos_x64)
//    macAarch64(compose.desktop.macos_arm64)
//    windowsAmd64(compose.desktop.windows_x64)
//}
