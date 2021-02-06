package io.github.mpetuska.khakra.avatar

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.AvatarBadge(
  noinline props: Builder<AvatarBadgeProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarBadgeProps>> = {},
): ReactElement = KhakraComponent(AvatarBadge, props, block)

@KhakraDSL
public inline fun RBuilder.AvatarName(
  noinline props: Builder<AvatarNameProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarNameProps>> = {},
): ReactElement = KhakraComponent(AvatarName, props, block)

@KhakraDSL
public inline fun RBuilder.Avatar(
  noinline props: Builder<AvatarProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarProps>> = {},
): ReactElement = KhakraComponent(Avatar, props, block)

@KhakraDSL
public inline fun RBuilder.AvatarGroup(
  noinline props: Builder<AvatarGroupProps> = {},
  crossinline block: Builder<RElementBuilder<AvatarGroupProps>> = {},
): ReactElement = KhakraComponent(AvatarGroup, props, block)
