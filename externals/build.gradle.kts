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
  api(npm("@chakra-ui/react", "1.1.0", generateExternals))
}
