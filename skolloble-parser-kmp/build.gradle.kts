import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.vanniktech.mavenPublish)
    alias(libs.plugins.strumenta.antlrKotlin)
}

group = "io.github.muqhc"
version = "1.0.0"

kotlin {
    jvm()

    mingwX64()
    linuxX64()

    js {
        browser()
        nodejs()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        nodejs()
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("com.strumenta:antlr-kotlin-runtime:${libs.versions.strumentaAntlrKotlin.get()}")
            }
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

val generateKotlinGrammarSource = tasks.register<AntlrKotlinTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")

    // ANTLR .g4 files are under {example-project}/antlr
    // Only include *.g4 files. This allows tools (e.g., IDE plugins)
    // to generate temporary files inside the base path
    source = fileTree(layout.projectDirectory.dir("grammar/antlr")) {
        include("**/*.g4")
    }

    // We want the generated source files to have this package name
    val pkgName = "io.github.muqhc.skolloblekmp.parser.generated.antlr"
    packageName = pkgName

    // We want visitors alongside listeners.
    // The Kotlin target language is implicit, as is the file encoding (UTF-8)
    arguments = listOf("-visitor")

    val outDir = "src/commonMain/kotlin/${pkgName.replace(".", "/")}"
    outputDirectory =  layout.projectDirectory.dir(outDir).asFile
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


