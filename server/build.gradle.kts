plugins {
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlinJvm)
    application
}

repositories {
    // Удалено: объявлено в settings.gradle.kts
}

dependencies {
    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    implementation(libs.ktor.serverContentNegotiation)
    implementation(libs.ktor.serialization)
    implementation(libs.kotlinx.coroutinesCore)
    implementation(libs.logback)
    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.test)
}

application {
    mainClass.set("ru.kchvilyov.xwiki.faq.ApplicationKt")
}

ktor {
    docker {
        localImageName.set("server")
        imageTag.set("latest")
    }
}