plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.completize.core"
version = "1.0-SNAPSHOT"

allprojects {

    apply(plugin = "org.jetbrains.kotlin.jvm")

    dependencies {
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }

    kotlin {
        jvmToolchain(21)
        compilerOptions {
            freeCompilerArgs.addAll("-Xjsr305=strict")
        }
    }

}