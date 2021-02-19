package com.github.mpetuska.khakra.icon

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Icon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(Icon, props, block)
