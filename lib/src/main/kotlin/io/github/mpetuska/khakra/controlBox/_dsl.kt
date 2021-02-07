package io.github.mpetuska.khakra.controlBox

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.ControlBox(
  noinline props: Builder<ControlBoxProps> = {},
  crossinline block: Builder<RElementBuilder<ControlBoxProps>> = {},
): ReactElement = KhakraComponent(ControlBox, props, block)
