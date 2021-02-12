package io.github.mpetuska.khakra.mediaQuery

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Hide(
  noinline props: Builder<ShowProps> = {},
  crossinline block: Builder<RElementBuilder<ShowProps>> = {},
): ReactElement = KhakraComponent(Hide, props, block)

@KhakraDSL
public inline fun RBuilder.Show(
  noinline props: Builder<ShowProps> = {},
  crossinline block: Builder<RElementBuilder<ShowProps>> = {},
): ReactElement = KhakraComponent(Show, props, block)
