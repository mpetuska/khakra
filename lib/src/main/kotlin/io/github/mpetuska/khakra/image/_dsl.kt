package io.github.mpetuska.khakra.image

import io.github.mpetuska.khakra.*
import react.*

@KhakraDSL
public inline fun RBuilder.Image(
  noinline props: Builder<ImageProps> = {},
  crossinline block: Builder<RElementBuilder<ImageProps>> = {},
): ReactElement = KhakraComponent(Image, props, block)
