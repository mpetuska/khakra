package khakra.image

import khakra.*
import react.*

@KhakraDSL
public inline fun RBuilder.Image(
  noinline props: Builder<ImageProps> = {},
  crossinline block: Builder<RElementBuilder<ImageProps>> = {},
): ReactElement = KhakraComponent(Image, props, block)
