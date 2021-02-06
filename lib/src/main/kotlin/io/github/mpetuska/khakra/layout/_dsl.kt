package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
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
public inline fun RBuilder.Code(
  noinline props: Builder<CodeProps> = {},
  crossinline block: Builder<RElementBuilder<CodeProps>> = {},
): ReactElement = KhakraComponent(Code, props, block)

@KhakraDSL
public inline fun RBuilder.Container(
  noinline props: Builder<ContainerProps> = {},
  crossinline block: Builder<RElementBuilder<ContainerProps>> = {},
): ReactElement = KhakraComponent(Container, props, block)

@KhakraDSL
public inline fun RBuilder.Divider(
  noinline props: Builder<DividerProps> = {},
  crossinline block: Builder<RElementBuilder<DividerProps>> = {},
): ReactElement = KhakraComponent(Divider, props, block)

@KhakraDSL
public inline fun RBuilder.Flex(
  noinline props: Builder<FlexProps> = {},
  crossinline block: Builder<RElementBuilder<FlexProps>> = {},
): ReactElement = KhakraComponent(Flex, props, block)

@KhakraDSL
public inline fun RBuilder.Grid(
  noinline props: Builder<GridProps> = {},
  crossinline block: Builder<RElementBuilder<GridProps>> = {},
): ReactElement = KhakraComponent(Grid, props, block)

@KhakraDSL
public inline fun RBuilder.GridItem(
  noinline props: Builder<GridItemProps> = {},
  crossinline block: Builder<RElementBuilder<GridItemProps>> = {},
): ReactElement = KhakraComponent(GridItem, props, block)

@KhakraDSL
public inline fun RBuilder.Heading(
  noinline props: Builder<HeadingProps> = {},
  crossinline block: Builder<RElementBuilder<HeadingProps>> = {},
): ReactElement = KhakraComponent(Heading, props, block)

@KhakraDSL
public inline fun RBuilder.Kbd(
  noinline props: Builder<KbdProps> = {},
  crossinline block: Builder<RElementBuilder<KbdProps>> = {},
): ReactElement = KhakraComponent(Kbd, props, block)

@KhakraDSL
public inline fun RBuilder.Link(
  noinline props: Builder<LinkProps> = {},
  crossinline block: Builder<RElementBuilder<LinkProps>> = {},
): ReactElement = KhakraComponent(Link, props, block)

@KhakraDSL
public inline fun RBuilder.LinkOverlay(
  noinline props: Builder<LinkOverlayProps> = {},
  crossinline block: Builder<RElementBuilder<LinkOverlayProps>> = {},
): ReactElement = KhakraComponent(LinkOverlay, props, block)

@KhakraDSL
public inline fun RBuilder.LinkBox(
  noinline props: Builder<LinkBoxProps> = {},
  crossinline block: Builder<RElementBuilder<LinkBoxProps>> = {},
): ReactElement = KhakraComponent(LinkBox, props, block)

@KhakraDSL
public inline fun RBuilder.List(
  noinline props: Builder<ListProps> = {},
  crossinline block: Builder<RElementBuilder<ListProps>> = {},
): ReactElement = KhakraComponent(List, props, block)

@KhakraDSL
public inline fun RBuilder.OrderedList(
  noinline props: Builder<ListProps> = {},
  crossinline block: Builder<RElementBuilder<ListProps>> = {},
): ReactElement = KhakraComponent(OrderedList, props, block)

@KhakraDSL
public inline fun RBuilder.UnorderedList(
  noinline props: Builder<ListProps> = {},
  crossinline block: Builder<RElementBuilder<ListProps>> = {},
): ReactElement = KhakraComponent(UnorderedList, props, block)

@KhakraDSL
public inline fun RBuilder.ListItem(
  noinline props: Builder<ListItemProps> = {},
  crossinline block: Builder<RElementBuilder<ListItemProps>> = {},
): ReactElement = KhakraComponent(ListItem, props, block)

@KhakraDSL
public inline fun RBuilder.ListIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(ListIcon, props, block)

@KhakraDSL
public inline fun RBuilder.SimpleGrid(
  noinline props: Builder<SimpleGridProps> = {},
  crossinline block: Builder<RElementBuilder<SimpleGridProps>> = {},
): ReactElement = KhakraComponent(SimpleGrid, props, block)

@KhakraDSL
public inline fun RBuilder.Spacer(
  noinline props: Builder<SpacerProps> = {},
  crossinline block: Builder<RElementBuilder<SpacerProps>> = {},
): ReactElement = KhakraComponent(Spacer, props, block)

@KhakraDSL
public inline fun RBuilder.StackDivider(
  noinline props: Builder<StackDividerProps> = {},
  crossinline block: Builder<RElementBuilder<StackDividerProps>> = {},
): ReactElement = KhakraComponent(StackDivider, props, block)

@KhakraDSL
public inline fun RBuilder.Stack(
  noinline props: Builder<StackProps> = {},
  crossinline block: Builder<RElementBuilder<StackProps>> = {},
): ReactElement = KhakraComponent(Stack, props, block)

@KhakraDSL
public inline fun RBuilder.HStack(
  noinline props: Builder<StackProps> = {},
  crossinline block: Builder<RElementBuilder<StackProps>> = {},
): ReactElement = KhakraComponent(HStack, props, block)

@KhakraDSL
public inline fun RBuilder.VStack(
  noinline props: Builder<StackProps> = {},
  crossinline block: Builder<RElementBuilder<StackProps>> = {},
): ReactElement = KhakraComponent(VStack, props, block)

@KhakraDSL
public inline fun RBuilder.Text(
  noinline props: Builder<TextProps> = {},
  crossinline block: Builder<RElementBuilder<TextProps>> = {},
): ReactElement = KhakraComponent(Text, props, block)

@KhakraDSL
public inline fun RBuilder.Wrap(
  noinline props: Builder<WrapProps> = {},
  crossinline block: Builder<RElementBuilder<WrapProps>> = {},
): ReactElement = KhakraComponent(Wrap, props, block)

@KhakraDSL
public inline fun RBuilder.WrapItem(
  noinline props: Builder<WrapItemProps> = {},
  crossinline block: Builder<RElementBuilder<WrapItemProps>> = {},
): ReactElement = KhakraComponent(WrapItem, props, block)
