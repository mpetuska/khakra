package com.github.mpetuska.khakra.spinner

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Spinner(
  noinline props: Builder<SpinnerProps> = {},
  crossinline block: Builder<RElementBuilder<SpinnerProps>> = {},
): ReactElement = KhakraComponent(Spinner, props, block)
