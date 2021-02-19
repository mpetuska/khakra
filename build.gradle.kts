plugins {
  id("org.jlleitschuh.gradle.ktlint") version "_"
}

allprojects {
  version = properties["version"] ?: "0.0.0"
  group = properties["group"] ?: "com.github.mpetuska"
  repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
  }
}
