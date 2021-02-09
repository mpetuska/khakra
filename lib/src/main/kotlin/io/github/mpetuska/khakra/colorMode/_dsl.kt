package io.github.mpetuska.khakra.colorMode

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.colorMode(
  noinline props: Builder<colorModeProps> = {},
  crossinline block: Builder<RElementBuilder<colorModeProps>> = {},
): ReactElement = KhakraComponent(colorMode, props, block)
