package io.github.mpetuska.khakra.tag

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Tag(
  noinline props: Builder<TagProps> = {},
  crossinline block: Builder<RElementBuilder<TagProps>> = {},
): ReactElement = KhakraComponent(Tag, props, block)

@KhakraDSL
public inline fun RBuilder.TagLabel(
  noinline props: Builder<TagLabelProps> = {},
  crossinline block: Builder<RElementBuilder<TagLabelProps>> = {},
): ReactElement = KhakraComponent(TagLabel, props, block)

@KhakraDSL
public inline fun RBuilder.TagLeftIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(TagLeftIcon, props, block)

@KhakraDSL
public inline fun RBuilder.TagRightIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(TagRightIcon, props, block)

@KhakraDSL
public inline fun RBuilder.TagCloseButton(
  noinline props: Builder<TagCloseButtonProps> = {},
  crossinline block: Builder<RElementBuilder<TagCloseButtonProps>> = {},
): ReactElement = KhakraComponent(TagCloseButton, props, block)
