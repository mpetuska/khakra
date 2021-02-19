package com.github.mpetuska.khakra.input

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Input(
  noinline props: Builder<InputProps> = {},
  crossinline block: Builder<RElementBuilder<InputProps>> = {},
): ReactElement = KhakraComponent(Input, props, block)

@KhakraDSL
public inline fun RBuilder.InputAddon(
  noinline props: Builder<InputAddonProps> = {},
  crossinline block: Builder<RElementBuilder<InputAddonProps>> = {},
): ReactElement = KhakraComponent(InputAddon, props, block)

@KhakraDSL
public inline fun RBuilder.InputLeftAddon(
  noinline props: Builder<InputAddonProps> = {},
  crossinline block: Builder<RElementBuilder<InputAddonProps>> = {},
): ReactElement = KhakraComponent(InputLeftAddon, props, block)

@KhakraDSL
public inline fun RBuilder.InputRightAddon(
  noinline props: Builder<InputAddonProps> = {},
  crossinline block: Builder<RElementBuilder<InputAddonProps>> = {},
): ReactElement = KhakraComponent(InputRightAddon, props, block)

@KhakraDSL
public inline fun RBuilder.InputLeftElement(
  noinline props: Builder<InputElementProps> = {},
  crossinline block: Builder<RElementBuilder<InputElementProps>> = {},
): ReactElement = KhakraComponent(InputLeftElement, props, block)

@KhakraDSL
public inline fun RBuilder.InputRightElement(
  noinline props: Builder<InputElementProps> = {},
  crossinline block: Builder<RElementBuilder<InputElementProps>> = {},
): ReactElement = KhakraComponent(InputRightElement, props, block)

@KhakraDSL
public inline fun RBuilder.InputGroup(
  noinline props: Builder<InputGroupProps> = {},
  crossinline block: Builder<RElementBuilder<InputGroupProps>> = {},
): ReactElement = KhakraComponent(InputGroup, props, block)
