package io.github.mpetuska.khakra.react

import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.KhakraDSL
import react.*

@KhakraDSL
public inline fun RBuilder.ChakraProvider(
  noinline props: Builder<ChakraProviderProps> = {},
  crossinline block: Builder<RElementBuilder<ChakraProviderProps>> = {},
): ReactElement = KhakraComponent(ChakraProvider, props, block)
