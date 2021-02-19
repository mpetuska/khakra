package com.github.mpetuska.khakra.alert

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Alert(
  noinline props: Builder<AlertProps> = {},
  crossinline block: Builder<RElementBuilder<AlertProps>> = {},
): ReactElement = KhakraComponent(Alert, props, block)

@KhakraDSL
public inline fun RBuilder.AlertTitle(
  noinline props: Builder<AlertTitleProps> = {},
  crossinline block: Builder<RElementBuilder<AlertTitleProps>> = {},
): ReactElement = KhakraComponent(AlertTitle, props, block)

@KhakraDSL
public inline fun RBuilder.AlertDescription(
  noinline props: Builder<AlertDescriptionProps> = {},
  crossinline block: Builder<RElementBuilder<AlertDescriptionProps>> = {},
): ReactElement = KhakraComponent(AlertDescription, props, block)

@KhakraDSL
public inline fun RBuilder.AlertIcon(
  noinline props: Builder<AlertIconProps> = {},
  crossinline block: Builder<RElementBuilder<AlertIconProps>> = {},
): ReactElement = KhakraComponent(AlertIcon, props, block)
