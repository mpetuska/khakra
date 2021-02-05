package sandbox.renders

import io.github.mpetuska.khakra.accordion.*
import sandbox.util.*

val AccordionPreview by Preview {
  SubPreview("Basic") {
    Accordion({
      allowMultiple = true
      defaultIndex = arrayOf(0)
    }) {
      AccordionItem {
        AccordionButton {
          AccordionIcon()
        }
        AccordionPanel {
          +"""
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim
            veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
            commodo consequat.
          """.trimIndent()
        }
      }
      AccordionItem {
        AccordionButton {
          AccordionIcon()
        }
        AccordionPanel {
          +"""
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim
            veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
            commodo consequat.
          """.trimIndent()
        }
      }
    }
  }
}
