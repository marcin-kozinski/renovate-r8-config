pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        maven {
            name = "R8 releases"
            url = uri("https://storage.googleapis.com/r8-releases/raw")
        }
    }
}

rootProject.name = "renovate-r8-config"
