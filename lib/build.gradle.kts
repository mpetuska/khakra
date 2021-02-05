plugins {
  kotlin("js")
  `maven-publish`
  signing
}

description = "Kotlin React bindings for ChakraUI"

kotlin {
  explicitApi()
  js {
    useCommonJs()
    binaries.library()
    browser()
  }
}

dependencies {
  api("org.jetbrains:kotlin-react:_")
  api("org.jetbrains:kotlin-react-dom:_")
  api("org.jetbrains:kotlin-styled:_")
  api(npm("@chakra-ui/react", "1.2.1"))
  api(npm("@chakra-ui/icons", "1.0.4"))
  api(npm("@emotion/react", "11.1.4"))
  api(npm("@emotion/styled", "11.0.0"))
  api(npm("framer-motion", "3.3.0"))

//  testImplementation("io.kotest:kotest-framework-engine:_")
//  testImplementation("io.kotest:kotest-assertions-core:_")
//  testImplementation("io.kotest:kotest-property:_")
}

tasks {
  withType<Zip>() {
    archiveBaseName by rootProject.name
    archiveAppendix by "js"
  }
}

publishing {
  publications {
    create<MavenPublication>("kotlinJs") {
      from(components["kotlin"])
      artifact(tasks.getByName<Zip>("jsSourcesJar"))
      artifactId = rootProject.name
    }
    withType<MavenPublication> {
      pom {
        name by rootProject.name
        url by "https://github.com/mpetuska/${rootProject.name}"
        description by project.description
        licenses {
          license {
            name by "The Apache License, Version 2.0"
            url by "https://www.apache.org/licenses/LICENSE-2.0.txt"
          }
        }
        developers {
          developer {
            id by "mpetuska"
            name by "Martynas Petuška"
            email.set("martynas.petuska@outlook.com")
          }
        }
        scm {
          connection by "scm:git:git@github.com:mpetuska/${rootProject.name}.git"
          developerConnection by "scm:git:ssh:mpetuska/${rootProject.name}.git"
          url by "https://github.com/mpetuska/${rootProject.name}"
          tag by Git.headCommitHash
        }
      }
    }
    repositories {
      fun conditionalRepository(name: String, config: MavenArtifactRepository.() -> Unit) {
        if ((checkAnyTrue("publish.all", "publish.$name") && checkNoneStarting("publish.skip")) &&
          checkNoneStarting("publish.skip.$name")
        ) {
          maven {
            this.name = name
            config()
          }
        }
      }
      conditionalRepository("GitHub") {
        url = uri("https://maven.pkg.github.com/mpetuska/${rootProject.name}")
        credentials {
          username = System.getenv("GH_USERNAME")
          password = System.getenv("GH_PASSWORD")
        }
      }
    }
  }
}

signing {
  if (false) { //TODO
    sign(publishing.publications["kotlinJS"])
  }
}
