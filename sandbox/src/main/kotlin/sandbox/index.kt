package sandbox

import khakra.react.*
import kotlinx.browser.*
import react.dom.*
import sandbox.renders.*
import sandbox.renders.layout.*

@DslMarker
annotation class KhakraPreview

fun main() {
  render(document.getElementById("root")) {
    ChakraProvider {
      layout()
      AccordionPreview()
    }
  }
}
