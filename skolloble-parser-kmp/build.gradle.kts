import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.vanniktech.mavenPublish)
}

group = "io.github.muqhc"
version = "1.0.0"

kotlin {
    jvm()
    
    linuxX64()

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    pom {
        name = "Skolloble Parser KMP"
        description = "Skolloble Parser for kotlin multiplatform"

        url = "https://github.com/muqhc/skolloble-kmp/"

        licenses {
            license {
                name = "Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0"
            }
        }
        developers {
            developer {
                id = "muqhc"
                name = "Muqhc"
                url = "https://github.com/muqhc"
            }
        }
        scm {
            url = "https://github.com/muqhc/${rootProject.name}"
            connection = "scm:git:git://github.com/muqhc/${rootProject.name}.git"
            developerConnection = "scm:git:ssh://github.com:muqhc/${rootProject.name}.git"
        }
    }
}
