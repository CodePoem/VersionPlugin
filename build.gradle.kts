import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.72"
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "0.15.0"
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    }
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
}

// repositories, dependencies, etc...
val compileKotlin: KotlinCompile by tasks
val compileTestKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

java {
    withJavadocJar()
    withSourcesJar()
}

gradlePlugin {
    plugins {
        create("versionPlugin") {
            id = "io.github.codepoem.version"
            implementationClass = "com.vdreamers.version.VersionPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/CodePoem/VersionPlugin"
    vcsUrl = "https://github.com/CodePoem/VersionPlugin"
    (plugins)  {
        // versionPlugin
        "versionPlugin" {
            displayName = "VersionPlugin"
            description = "Android version plugin"
            tags = listOf("android", "version")
            version = "1.0.0"
        }

    }
    mavenCoordinates {
        groupId = "io.github.codepoem"
        artifactId = "version"
        version = "1.0.0"
    }
}