@file:JsModule("@chakra-ui/avatar/dist/esm/avatar-group")

package io.github.mpetuska.khakra.avatar

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface AvatarGroupOptions {
  /**
   * The children of the avatar group.
   *
   * Ideally should be `Avatar` and `MoreIndicator` components
   *
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The space between the avatars in the group.
   * @type SystemProps["margin"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The maximum number of visible avatars
   */
  public var max: Int?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface AvatarGroupProps : AvatarGroupOptions, HTMLChakraProps, ThemingProps

/**
 * AvatarGroup displays a number of avatars grouped together in a stack.
 */
public external val AvatarGroup: ComponentWithAs<AvatarGroupProps>
