plugins {
  kotlin("js")
}

kotlin {
  js {
    useCommonJs()
    binaries.executable()
    browser{
      commonWebpackConfig {
        cssSupport.enabled = true
      }
    }
  }
}

val chakraVersion = "1.2.1"
dependencies {
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
  implementation(project(":lib"))
}
