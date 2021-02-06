package sandbox.previews.layout

import io.github.mpetuska.khakra.layout.*
import kotlinx.html.*
import react.dom.*
import sandbox.util.*


val AspectRatioPreview by Preview {
  SubPreview("Embed Video") {
    AspectRatio({
      maxW = "560px"
      ratio = 1
    }) {
      iframe {
        attrs {
          title = "naruto"
          src = "https://www.youtube.com/embed/QhBnZ6NPOY0"
          this["allowFullScreen"] = true
        }
      }
    }
  }

  SubPreview("Embed Maps") {
    AspectRatio({ ratio = 16 / 9 }) {
      iframe {
        attrs {
          src =
            "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3963.952912260219!2d3.375295414770757!3d6.5276316452784755!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x103b8b2ae68280c1%3A0xdc9e87a367c3d9cb!2sLagos!5e0!3m2!1sen!2sng!4v1567723392506!5m2!1sen!2sng"
          this["alt"] = "demo"
        }
      }
    }
  }
}
