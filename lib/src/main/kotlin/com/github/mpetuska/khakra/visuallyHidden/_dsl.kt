package com.github.mpetuska.khakra.visuallyHidden

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.VisuallyHidden(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(VisuallyHidden, props, block)

@KhakraDSL
public inline fun RBuilder.VisuallyHiddenInput(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(VisuallyHiddenInput, props, block)
