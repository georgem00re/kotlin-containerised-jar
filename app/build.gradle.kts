import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.9.0"
    application

    // This plugin allows us to run ./gradlew shadowJar
    // which generates a 'fat' JAR file in ./app/libs/.
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass.set("org.example.MainKt")
}

tasks.withType<ShadowJar> {
    archiveFileName.set("something.jar")
}
