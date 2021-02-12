package io.github.mpetuska.khakra.mediaQuery

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.MediaQuery(
  noinline props: Builder<MediaQueryProps> = {},
  crossinline block: Builder<RElementBuilder<MediaQueryProps>> = {},
): ReactElement = KhakraComponent(MediaQuery, props, block)
