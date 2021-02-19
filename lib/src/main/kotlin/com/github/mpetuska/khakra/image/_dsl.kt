package com.github.mpetuska.khakra.image

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Image(
  noinline props: Builder<ImageProps> = {},
  crossinline block: Builder<RElementBuilder<ImageProps>> = {},
): ReactElement = KhakraComponent(Image, props, block)
