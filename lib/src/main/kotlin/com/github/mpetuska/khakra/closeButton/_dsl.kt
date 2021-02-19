package com.github.mpetuska.khakra.closeButton

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.CloseButton(
  noinline props: Builder<CloseButtonProps> = {},
  crossinline block: Builder<RElementBuilder<CloseButtonProps>> = {},
): ReactElement = KhakraComponent(CloseButton, props, block)
