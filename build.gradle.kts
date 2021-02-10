plugins {
  id("org.jlleitschuh.gradle.ktlint") version "_"
}

allprojects {
  group = "io.github.mpetuska"
  repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
  }
}
