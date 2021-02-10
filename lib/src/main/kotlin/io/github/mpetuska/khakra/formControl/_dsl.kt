package io.github.mpetuska.khakra.formControl

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.FormControl(
  noinline props: Builder<FormControlProps> = {},
  crossinline block: Builder<RElementBuilder<FormControlProps>> = {},
): ReactElement = KhakraComponent(FormControl, props, block)
