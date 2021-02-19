package com.github.mpetuska.khakra.react

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.ChakraProvider(
  noinline props: Builder<ChakraProviderProps> = {},
  crossinline block: Builder<RElementBuilder<ChakraProviderProps>> = {},
): ReactElement = KhakraComponent(ChakraProvider, props, block)
