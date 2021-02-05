package sandbox.util

import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.layout.*
import react.*
import react.dom.*
import sandbox.*
import kotlin.properties.*
import kotlin.reflect.*

private val boxStyle: Builder<BoxProps> = {
  padding = 2
  margin = 1
  borderWidth = "2px"
  borderRadius = "lg"
  overflow = "hidden"
}

@KhakraPreview
fun Preview(
  name: String,
  props: Builder<BoxProps> = {},
  canvas: Builder<RBuilder>,
): Builder<RBuilder> = @KhakraPreview {
  Box({
    maxW = "md"
    boxStyle()
    props()
  }) {
    Box({
      paddingBottom = 2
      paddingLeft = 2
      paddingRight = 2
    }) {
      h2 { +name }
    }
    canvas()
  }
}

@KhakraPreview
class Preview(
  private val props: Builder<BoxProps> = {},
  private val canvas: Builder<RBuilder>,
) : ReadOnlyProperty<Any?, @KhakraPreview Builder<RBuilder>> {
  private var state: Builder<RBuilder>? = null
  override fun getValue(thisRef: Any?, property: KProperty<*>): Builder<RBuilder> =
    state ?: Preview(property.name.removeSuffix("Preview"), props, canvas).also { state = it }
}

@KhakraPreview
fun RBuilder.SubPreview(
  description: String,
  props: Builder<BoxProps> = {},
  canvas: Builder<RBuilder>,
) {
  Box({
    boxStyle();
    props()
  }) {
    Box({
      paddingBottom = 2
//      paddingLeft = 2
//      paddingRight = 2
    }) {
      h4 { +description }
    }
    Box({ }, canvas)
  }
}
