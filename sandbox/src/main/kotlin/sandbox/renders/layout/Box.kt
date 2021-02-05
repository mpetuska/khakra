package sandbox.renders.layout

import khakra.icons.*
import khakra.image.*
import khakra.layout.*
import sandbox.util.*

val BoxPreview by Preview {
  SubPreview("Red background") {
    Box({ bg = "tomato"; w = "100%"; p = 4; color = "white" }) {
      +"I'm red"
    }
  }
  
  SubPreview("Using 'as' prop") {
    Box({
      `as` = "button"
      borderRadius = "md"
      bg = "tomato"
      color = "white"
      px = 4
      h = 8
    }) { +"Button" }
  }
  
  SubPreview("AirBnb example") {
    Box({
      maxW = "sm"
      borderWidth = "1px"
      borderRadius = "lg"
      overflow = "hidden"
    }) {
      Image({
        src = "https://bit.ly/2Z4KKcF"
        alt = "Rear view of modern home with pool"
      })
      Box({ p = 6 }) {
        Badge({
          borderRadius = "full"
          px = "2"
          colorScheme = "teal"
        }) {
          +"New"
        }
        Box({
          color = "gray.500"
          fontWeight = "semibold"
          letterSpacing = "wide"
          fontSize = "xs"
          textTransform = "uppercase"
          ml = 2
        }) {
          +"3 beds • 2 baths"
        }
        Box({
          mt = "1"
          fontWeight = "semibold"
          `as` = "h4"
          lineHeight = "tight"
          isTruncated = true
        }) {
          +"Modern home in city center in the heart of historic Los Angeles"
        }
        Box {
          +"$1,900.00"
          Box({
            `as` = "span"
            color = "gray.600"
            fontSize = "sm"
          }) {
            +"/ wk"
          }
        }
        Box({
          d = "flex"
          mt = "2"
          alignItems = "center"
        }) {
          repeat(5) {
            StarIcon({
              key = "$it"
              color = if (it < 3) "teal.500" else "gray.300"
            })
          }
          Box({
            `as` = "span"
            ml = "2"
            color = "gray.600"
            fontSize = "sm"
          }) {
            +"34 reviews"
          }
        }
      }
    }
  }
}
