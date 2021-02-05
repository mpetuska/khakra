package sandbox

import khakra.accordion.*
import khakra.layout.*
import khakra.react.*
import kotlinx.browser.*
import react.dom.*

fun main() {
  render(document.getElementById("root")) {
    ChakraProvider {
      Box({bg="tomato"}) {
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
  }
}
