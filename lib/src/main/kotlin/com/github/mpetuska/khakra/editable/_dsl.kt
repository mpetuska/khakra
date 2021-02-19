package com.github.mpetuska.khakra.editable

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Editable(
  noinline props: Builder<EditableProps> = {},
  crossinline block: Builder<RElementBuilder<EditableProps>> = {},
): ReactElement = KhakraComponent(Editable, props, block)

@KhakraDSL
public inline fun RBuilder.EditablePreview(
  noinline props: Builder<EditablePreviewProps> = {},
  crossinline block: Builder<RElementBuilder<EditablePreviewProps>> = {},
): ReactElement = KhakraComponent(EditablePreview, props, block)

@KhakraDSL
public inline fun RBuilder.EditableInput(
  noinline props: Builder<EditableInputProps> = {},
  crossinline block: Builder<RElementBuilder<EditableInputProps>> = {},
): ReactElement = KhakraComponent(EditableInput, props, block)
