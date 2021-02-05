package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.KhakraDSL
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.AspectRatio(
  noinline props: Builder<AspectRatioProps> = {},
  crossinline block: Builder<RElementBuilder<AspectRatioProps>> = {},
): ReactElement = KhakraComponent(AspectRatio, props, block)

@KhakraDSL
public inline fun RBuilder.Badge(
  noinline props: Builder<BadgeProps> = {},
  crossinline block: Builder<RElementBuilder<BadgeProps>> = {},
): ReactElement = KhakraComponent(Badge, props, block)

@KhakraDSL
public inline fun RBuilder.Box(
  noinline props: Builder<BoxProps> = {},
  crossinline block: Builder<RElementBuilder<BoxProps>> = {},
): ReactElement = KhakraComponent(Box, props, block)

@KhakraDSL
public inline fun RBuilder.Square(
  noinline props: Builder<SquareProps> = {},
  crossinline block: Builder<RElementBuilder<SquareProps>> = {},
): ReactElement = KhakraComponent(Square, props, block)

@KhakraDSL
public inline fun RBuilder.Circle(
  noinline props: Builder<SquareProps> = {},
  crossinline block: Builder<RElementBuilder<SquareProps>> = {},
): ReactElement = KhakraComponent(Circle, props, block)

@KhakraDSL
public inline fun RBuilder.Center(
  noinline props: Builder<CenterProps> = {},
  crossinline block: Builder<RElementBuilder<CenterProps>> = {},
): ReactElement = KhakraComponent(Center, props, block)

@KhakraDSL
public inline fun RBuilder.AbsoluteCenter(
  noinline props: Builder<AbsoluteCenterProps> = {},
  crossinline block: Builder<RElementBuilder<AbsoluteCenterProps>> = {},
): ReactElement = KhakraComponent(AbsoluteCenter, props, block)

@KhakraDSL
public inline fun RBuilder.Container(
  noinline props: Builder<ContainerProps> = {},
  crossinline block: Builder<RElementBuilder<ContainerProps>> = {},
): ReactElement = KhakraComponent(Container, props, block)

@KhakraDSL
public inline fun RBuilder.Flex(
  noinline props: Builder<FlexProps> = {},
  crossinline block: Builder<RElementBuilder<FlexProps>> = {},
): ReactElement = KhakraComponent(Flex, props, block)
