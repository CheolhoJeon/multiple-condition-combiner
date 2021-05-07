import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    application
}

group = "me.jeoncheolho"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "12"
}

application {
    mainClassName = "MainKt"
}
