plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-core-jvm:2.0.0")
    implementation("io.ktor:ktor-server-netty-jvm:2.0.0")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:2.0.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:2.0.0")
    testImplementation("io.ktor:ktor-server-tests-jvm:2.0.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.10")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))  // Use Java 17
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))  // Set the Kotlin JVM target to match Java 17
    }
}

tasks.test {
    useJUnitPlatform()
}