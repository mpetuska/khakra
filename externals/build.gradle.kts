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

dependencies {
  val npmModule = project.properties["externalModule"]?.toString()?.split(":")
  if (npmModule != null && npmModule.size == 2) {
    api(npm(npmModule[0], npmModule[1], true))
  }
}
