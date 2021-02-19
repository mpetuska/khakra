package com.github.mpetuska.khakra.controlBox

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.ControlBox(
  noinline props: Builder<ControlBoxProps> = {},
  crossinline block: Builder<RElementBuilder<ControlBoxProps>> = {},
): ReactElement = KhakraComponent(ControlBox, props, block)
