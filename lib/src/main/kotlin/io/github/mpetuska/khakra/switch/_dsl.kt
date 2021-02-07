package io.github.mpetuska.khakra.switch

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Switch(
  noinline props: Builder<SwitchProps> = {},
  crossinline block: Builder<RElementBuilder<SwitchProps>> = {},
): ReactElement = KhakraComponent(Switch, props, block)
