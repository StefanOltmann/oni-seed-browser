plugins {
    alias(libs.plugins.detekt)
}

apply(plugin = "io.gitlab.arturbosch.detekt")

detekt {
    source.from("app/src", "build.gradle.kts")
    allRules = true
    config.setFrom("$projectDir/detekt.yml")
    parallel = true
    ignoreFailures = true
    autoCorrect = true
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:${libs.versions.detekt.get()}")
}
