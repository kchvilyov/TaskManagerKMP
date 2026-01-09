rootProject.name = "TaskManagerKMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        // Заменяем google() на зеркало
        maven {
            url = uri("https://maven.aliyun.com/repository/google") // Alibaba mirror
            name = "Aliyun Google Mirror"
        }
        maven {
            url = uri("https://repo1.maven.org/maven2/") // Maven Central
            name = "MavenCentral"
        }
        gradlePluginPortal()
    }
}

// Это важно: не блокировать загрузку из внешних источников
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/google")
            name = "Aliyun Google Mirror"
        }
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":composeApp")
include(":server")
include(":shared")