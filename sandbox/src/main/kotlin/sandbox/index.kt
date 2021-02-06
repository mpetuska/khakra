package sandbox

import io.github.mpetuska.khakra.react.ChakraProvider
import kotlinx.browser.document
import react.dom.render
import sandbox.previews.accordion.accordion
import sandbox.previews.layout.layout

@DslMarker
annotation class KhakraPreview

fun main() {
  render(document.getElementById("root")) {
    ChakraProvider {
      accordion()
      layout()
    }
  }
}
