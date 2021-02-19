package com.github.mpetuska.khakra.popover

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.closeButton.CloseButtonProps
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Popover(
  noinline props: Builder<PopoverProps> = {},
  crossinline block: Builder<RElementBuilder<PopoverProps>> = {},
): ReactElement = KhakraComponent(Popover, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverTrigger(
  noinline props: Builder<RProps> = {},
  crossinline block: Builder<RElementBuilder<RProps>> = {},
): ReactElement = KhakraComponent(PopoverTrigger, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverContent(
  noinline props: Builder<PopoverContentProps> = {},
  crossinline block: Builder<RElementBuilder<PopoverContentProps>> = {},
): ReactElement = KhakraComponent(PopoverContent, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverHeader(
  noinline props: Builder<PopoverHeaderProps> = {},
  crossinline block: Builder<RElementBuilder<PopoverHeaderProps>> = {},
): ReactElement = KhakraComponent(PopoverHeader, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverBody(
  noinline props: Builder<PopoverBodyProps> = {},
  crossinline block: Builder<RElementBuilder<PopoverBodyProps>> = {},
): ReactElement = KhakraComponent(PopoverBody, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverFooter(
  noinline props: Builder<PopoverFooterProps> = {},
  crossinline block: Builder<RElementBuilder<PopoverFooterProps>> = {},
): ReactElement = KhakraComponent(PopoverFooter, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverCloseButton(
  noinline props: Builder<CloseButtonProps> = {},
  crossinline block: Builder<RElementBuilder<CloseButtonProps>> = {},
): ReactElement = KhakraComponent(PopoverCloseButton, props, block)

@KhakraDSL
public inline fun RBuilder.PopoverArrow(
  noinline props: Builder<PopoverArrowProps> = {},
  crossinline block: Builder<RElementBuilder<PopoverArrowProps>> = {},
): ReactElement = KhakraComponent(PopoverArrow, props, block)
