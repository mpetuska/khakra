package com.github.mpetuska.khakra.textarea

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Textarea(
  noinline props: Builder<TextareaProps> = {},
  crossinline block: Builder<RElementBuilder<TextareaProps>> = {},
): ReactElement = KhakraComponent(Textarea, props, block)
