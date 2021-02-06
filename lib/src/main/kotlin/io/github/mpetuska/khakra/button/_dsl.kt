package io.github.mpetuska.khakra.button

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.system.HTMLChakraProps
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

/**
 * A11y: A label that describes the button
 */
public var IconButtonProps.ariaLabel: String?
  get() = asDynamic()["aria-label"].unsafeCast<String>()
  set(value) {
    asDynamic()["aria-label"] = value
  }

@KhakraDSL
public inline fun RBuilder.Button(
  noinline props: Builder<ButtonProps> = {},
  crossinline block: Builder<RElementBuilder<ButtonProps>> = {},
): ReactElement = KhakraComponent(Button, props, block)

@KhakraDSL
public inline fun RBuilder.ButtonIcon(
  noinline props: Builder<HTMLChakraProps> = {},
  crossinline block: Builder<RElementBuilder<HTMLChakraProps>> = {},
): ReactElement = KhakraComponent(ButtonIcon, props, block)

@KhakraDSL
public inline fun RBuilder.ButtonSpinner(
  noinline props: Builder<ButtonSpinnerProps> = {},
  crossinline block: Builder<RElementBuilder<ButtonSpinnerProps>> = {},
): ReactElement = KhakraComponent(ButtonSpinner, props, block)

@KhakraDSL
public inline fun RBuilder.ButtonGroup(
  noinline props: Builder<ButtonGroupProps> = {},
  crossinline block: Builder<RElementBuilder<ButtonGroupProps>> = {},
): ReactElement = KhakraComponent(ButtonGroup, props, block)

@KhakraDSL
public inline fun RBuilder.IconButton(
  noinline props: Builder<IconButtonProps> = {},
  crossinline block: Builder<RElementBuilder<IconButtonProps>> = {},
): ReactElement = KhakraComponent(IconButton, props, block)
