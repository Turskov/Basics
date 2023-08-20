plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.testng:testng:7.1.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation(platform("org.junit.jupiter:junit-jupiter-params:5.9.1"))
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-api:5.9.1")
}

tasks.test {
    useJUnitPlatform()
}