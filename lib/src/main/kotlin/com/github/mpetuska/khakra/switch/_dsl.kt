package com.github.mpetuska.khakra.switch

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Switch(
  noinline props: Builder<SwitchProps> = {},
  crossinline block: Builder<RElementBuilder<SwitchProps>> = {},
): ReactElement = KhakraComponent(Switch, props, block)
