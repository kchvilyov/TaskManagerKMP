rootProject.name = "TaskManagerKMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/google")
            name = "Aliyun Google Mirror"
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/central")
            name = "Aliyun Maven Central"
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/google")
            name = "Aliyun Google Mirror"
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/central")
            name = "Aliyun Maven Central"
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":server")
include(":shared")