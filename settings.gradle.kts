pluginManagement {
    buildscript {
        repositories {
            maven {
                name = "R8 releases"
                url = uri("https://storage.googleapis.com/r8-releases/raw")
            }
        }
        dependencies {
            classpath("com.android.tools:r8:8.8.18")
        }
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "renovate-r8-config"
