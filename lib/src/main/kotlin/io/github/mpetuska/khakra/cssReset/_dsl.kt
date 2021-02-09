package io.github.mpetuska.khakra.cssReset

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.CSSReset(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(CSSReset, props, block)
