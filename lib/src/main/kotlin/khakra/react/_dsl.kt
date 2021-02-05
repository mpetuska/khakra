package khakra.react

import khakra.*
import react.*

@KhakraDSL
public inline fun RBuilder.ChakraProvider(
  noinline props: Builder<ChakraProviderProps> = {},
  crossinline block: Builder<RElementBuilder<ChakraProviderProps>> = {},
): ReactElement = KhakraComponent(ChakraProvider, props, block)
