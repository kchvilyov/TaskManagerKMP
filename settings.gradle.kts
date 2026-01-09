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
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
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

        // ✅ Правильная настройка репозитория для binaryen
        maven {
            url = uri("https://github.com/WebAssembly/binaryen/releases/download/")
            name = "GitHub Binaryen Releases"

            // Важно: указываем, что версия подставляется в URL напрямую
            content {
                // Ищем только артефакты с именем, начинающимся с "binaryen-"
                includeGroupByRegex("com\\.github\\.webassembly")
                // Можно добавить фильтр по версии, если нужно
            }

            // Gradle будет искать: https://github.com/.../download/<version>/binaryen-<version>.zip
            // Это не стандартный Maven layout
            layout("patterns") {
                artifact("[revision]/binaryen-[revision].zip")
            }
        }
    }
}

include(":composeApp")
include(":server")
include(":shared")