plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.5.2"
}

dependencies {
    implementation(fileTree("lib/ctrl-h.jar"))
    implementation("com.google.code.gson:gson:2.8.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.8.2")
    implementation("com.google.guava:guava:18.0")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
//java {
//    sourceCompatibility = JavaVersion.VERSION_16
//    targetCompatibility = JavaVersion.VERSION_16
//}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set("2021.2")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
        options.encoding = "UTF-8"
    }

    patchPluginXml {
        sinceBuild.set("212")
        untilBuild.set("222.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
