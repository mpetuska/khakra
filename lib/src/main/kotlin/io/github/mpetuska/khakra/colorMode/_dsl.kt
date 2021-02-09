package io.github.mpetuska.khakra.colorMode

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.ColorModeProvider(
  noinline props: Builder<ColorModeProviderProps> = {},
  crossinline block: Builder<RElementBuilder<ColorModeProviderProps>> = {},
): ReactElement = KhakraComponent(ColorModeProvider, props, block)

@KhakraDSL
public inline fun RBuilder.DarkMode(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(DarkMode, props, block)

@KhakraDSL
public inline fun RBuilder.LightMode(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(LightMode, props, block)

@KhakraDSL
public inline fun RBuilder.ColorModeScript(
  noinline props: Builder<ColorModeScriptProps> = {},
  crossinline block: Builder<RElementBuilder<ColorModeScriptProps>> = {},
): ReactElement = KhakraComponent(ColorModeScript, props, block)
