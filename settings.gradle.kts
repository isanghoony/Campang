pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Campang"

include(":app")
include(":benchmark")
include(":feature")
include(":lint")
include(":syns")
include(":syns:syns-test")
include(":syns:work")
include(":core")
include(":build-logic")
include(":build-logic:convention")
