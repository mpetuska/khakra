package io.github.mpetuska.khakra.textarea

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Textarea(
  noinline props: Builder<TextareaProps> = {},
  crossinline block: Builder<RElementBuilder<TextareaProps>> = {},
): ReactElement = KhakraComponent(Textarea, props, block)
