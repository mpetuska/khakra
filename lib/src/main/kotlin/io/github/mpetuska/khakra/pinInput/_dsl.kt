package io.github.mpetuska.khakra.pinInput

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProviderProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.PinInput(
  noinline props: Builder<PinInputProps> = {},
  crossinline block: Builder<RElementBuilder<PinInputProps>> = {},
): ReactElement = KhakraComponent(PinInput, props, block)

@KhakraDSL
public inline fun RBuilder.PinInputField(
  noinline props: Builder<PinInputFieldProps> = {},
  crossinline block: Builder<RElementBuilder<PinInputFieldProps>> = {},
): ReactElement = KhakraComponent(PinInputField, props, block)

@KhakraDSL
public inline fun RBuilder.PinInputProvider(
  noinline props: Builder<RProviderProps<PinInputContext>> = {},
  crossinline block: Builder<RElementBuilder<RProviderProps<PinInputContext>>> = {},
): ReactElement = KhakraComponent(PinInputProvider, props, block)
