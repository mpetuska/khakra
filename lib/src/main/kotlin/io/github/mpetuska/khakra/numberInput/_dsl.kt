package io.github.mpetuska.khakra.numberInput

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.TriangleDownIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(TriangleDownIcon, props, block)

@KhakraDSL
public inline fun RBuilder.TriangleUpIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(TriangleUpIcon, props, block)

@KhakraDSL
public inline fun RBuilder.NumberInput(
  noinline props: Builder<NumberInputProps> = {},
  crossinline block: Builder<RElementBuilder<NumberInputProps>> = {},
): ReactElement = KhakraComponent(NumberInput, props, block)

@KhakraDSL
public inline fun RBuilder.NumberInputStepper(
  noinline props: Builder<NumberInputStepperProps> = {},
  crossinline block: Builder<RElementBuilder<NumberInputStepperProps>> = {},
): ReactElement = KhakraComponent(NumberInputStepper, props, block)

@KhakraDSL
public inline fun RBuilder.NumberInputField(
  noinline props: Builder<NumberInputFieldProps> = {},
  crossinline block: Builder<RElementBuilder<NumberInputFieldProps>> = {},
): ReactElement = KhakraComponent(NumberInputField, props, block)

@KhakraDSL
public inline fun RBuilder.StyledStepper(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(StyledStepper, props, block)

@KhakraDSL
public inline fun RBuilder.NumberDecrementStepper(
  noinline props: Builder<NumberDecrementStepperProps> = {},
  crossinline block: Builder<RElementBuilder<NumberDecrementStepperProps>> = {},
): ReactElement = KhakraComponent(NumberDecrementStepper, props, block)

@KhakraDSL
public inline fun RBuilder.NumberIncrementStepper(
  noinline props: Builder<NumberIncrementStepperProps> = {},
  crossinline block: Builder<RElementBuilder<NumberIncrementStepperProps>> = {},
): ReactElement = KhakraComponent(NumberIncrementStepper, props, block)
