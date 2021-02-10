package io.github.mpetuska.khakra.select

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.ReactElement


@KhakraDSL
public inline fun RBuilder.SelectField(
  noinline props: Builder<SelectFieldProps> = {},
  crossinline block: Builder<RElementBuilder<SelectFieldProps>> = {},
): ReactElement = KhakraComponent(SelectField, props, block)

@KhakraDSL
public inline fun RBuilder.Select(
  noinline props: Builder<SelectProps> = {},
  crossinline block: Builder<RElementBuilder<SelectProps>> = {},
): ReactElement = KhakraComponent(Select, props, block)

@KhakraDSL
public inline fun RBuilder.DefaultIcon(
  noinline props: Builder<dynamic> = {},
  crossinline block: Builder<RElementBuilder<dynamic>> = {},
): ReactElement = KhakraComponent(DefaultIcon, props, block)
