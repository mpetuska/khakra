plugins {
  kotlin("js")
  `maven-publish`
}

kotlin {
  explicitApi()
  js {
    binaries.library()
    browser()
  }
}

val chakraVersion = "1.2.1"
dependencies {
  api(platform("org.jetbrains.kotlin:kotlin-bom"))
  api("org.jetbrains:kotlin-react:_")
  api("org.jetbrains:kotlin-react-dom:_")
  api("org.jetbrains:kotlin-styled:_")
  api(npm("@chakra-ui/react", chakraVersion))
  api(npm("@emotion/react", "11.1.4"))
  api(npm("@emotion/styled", "11.0.0"))
  api(npm("framer-motion", "3.3.0"))

//  testImplementation("io.kotest:kotest-framework-engine:_")
//  testImplementation("io.kotest:kotest-assertions-core:_")
//  testImplementation("io.kotest:kotest-property:_")
}
