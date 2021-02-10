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

val generateExternals = project.properties["generateExternals"]?.toString()?.toBoolean() ?: false
dependencies {
  api(npm("@chakra-ui/react", "1.2.1", generateExternals))
  api(npm("@chakra-ui/icons", "1.0.4", generateExternals))
  api(npm("@emotion/react", "11.1.4", generateExternals))
  api(npm("@emotion/styled", "11.0.0", generateExternals))
  api(npm("framer-motion", "3.3.0", generateExternals))
}
