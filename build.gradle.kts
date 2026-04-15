plugins {
    id("java")
    id("application")
}

group = "me.dio"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

application {
    mainClass.set("me.dio.collections.core.ProcessadorEducacional")
}

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5 con BOM para consistencia de versiones
    testImplementation(platform("org.junit:junit-bom:5.11.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    
    // Necesario para que Gradle 9+ pueda lanzar tests en Java 25
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    
    // Fluent Assertions
    testImplementation("org.assertj:assertj-core:3.26.3")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

// Otimizações para OpenJ9 / IBM Semeru
tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "-XX:+IgnoreUnrecognizedVMOptions",
        "-Xshareclasses",
        "-Xscmx128m",
        "-Xquickstart"
    )
}
