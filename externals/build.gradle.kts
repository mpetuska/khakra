plugins {
  kotlin("js")
}

kotlin {
  js {
    useCommonJs()
    binaries.library()
    browser()
  }
}

val generateExternals = project.properties["generateExternals"]?.toString()?.toBoolean() ?: true
dependencies {
  api(npm("@chakra-ui/live-region", "1.0.3", generateExternals))
}
