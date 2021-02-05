plugins {
  id("org.jlleitschuh.gradle.ktlint")
}

allprojects {
  group = "io.github.mpetuska"
  repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
  }
}
