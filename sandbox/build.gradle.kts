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
          port = 3000,
          open = false
        )
      }
    }
  }
}

dependencies {
  implementation(project(":lib"))
}
