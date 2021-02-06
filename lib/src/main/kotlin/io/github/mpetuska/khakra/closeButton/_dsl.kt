package io.github.mpetuska.khakra.closeButton

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.CloseButton(
  noinline props: Builder<CloseButtonProps> = {},
  crossinline block: Builder<RElementBuilder<CloseButtonProps>> = {},
): ReactElement = KhakraComponent(CloseButton, props, block)
