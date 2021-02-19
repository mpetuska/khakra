package com.github.mpetuska.khakra.checkbox

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Checkbox(
  noinline props: Builder<CheckboxProps> = {},
  crossinline block: Builder<RElementBuilder<CheckboxProps>> = {},
): ReactElement = KhakraComponent(Checkbox, props, block)

@KhakraDSL
public inline fun RBuilder.CheckboxGroup(
  noinline props: Builder<CheckboxGroupProps> = {},
  crossinline block: Builder<RElementBuilder<CheckboxGroupProps>> = {},
): ReactElement = KhakraComponent(CheckboxGroup, props, block)

@KhakraDSL
public inline fun RBuilder.CheckboxIcon(
  noinline props: Builder<CheckboxIconProps> = {},
  crossinline block: Builder<RElementBuilder<CheckboxIconProps>> = {},
): ReactElement = KhakraComponent(CheckboxIcon, props, block)
