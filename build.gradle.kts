plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.completize.core"
version = "1.0-SNAPSHOT"

allprojects {

    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }

    kotlin {
        jvmToolchain(21)
    }

}