plugins {
  kotlin("js")
  `maven-publish`
}

kotlin {
  js {
    useCommonJs()
    binaries.executable()
    browser {
      commonWebpackConfig {
        cssSupport.enabled = true
        devServer = devServer?.copy(
          port = 3000
        )
      }
    }
  }
}

val chakraVersion = "1.2.1"
dependencies {
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
  implementation(project(":lib"))
}
