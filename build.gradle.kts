plugins {
    id("java-library")
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.3"
    id("maven-publish")
}

group = "br.unioste.esi.os"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.0")

    implementation("org.postgresql:postgresql:42.6.0")
    implementation("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
}

tasks.bootJar { enabled = false }
tasks.jar { enabled = true }



publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "br.unioste.esi.os"
            artifactId = "endereco"
            version = "1.0-SNAPSHOT"
        }
    }
    repositories {
        mavenLocal()
    }
}