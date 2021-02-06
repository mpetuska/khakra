package io.github.mpetuska.khakra.avatar

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Avatar(
  noinline props: Builder<AvatarProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarProps>> = {},
): ReactElement = KhakraComponent(Avatar, props, block)

@KhakraDSL
public inline fun RBuilder.AvatarTitle(
  noinline props: Builder<AvatarTitleProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarTitleProps>> = {},
): ReactElement = KhakraComponent(AvatarTitle, props, block)

@KhakraDSL
public inline fun RBuilder.AvatarDescription(
  noinline props: Builder<AvatarDescriptionProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarDescriptionProps>> = {},
): ReactElement = KhakraComponent(AvatarDescription, props, block)

@KhakraDSL
public inline fun RBuilder.AvatarIcon(
  noinline props: Builder<AvatarIconProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarIconProps>> = {},
): ReactElement = KhakraComponent(AvatarIcon, props, block)
