package io.github.mpetuska.khakra.icon

import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.KhakraDSL
import react.*

@KhakraDSL
public inline fun RBuilder.Icon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(Icon, props, block)
