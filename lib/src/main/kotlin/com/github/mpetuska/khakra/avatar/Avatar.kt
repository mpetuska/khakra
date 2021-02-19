@file:JsModule("@chakra-ui/avatar/dist/esm/avatar")

package com.github.mpetuska.khakra.avatar

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RClass
import react.ReactElement

public external interface AvatarOptionsBase {
  /**
   * The name of the person in the avatar.
   *
   * - if `src` has loaded, the name will be used as the `alt` attribute of the `img`
   * - If `src` is not loaded, the name will be used to create the initials
   */
  public var name: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Function to get the initials to display
   */
  public var getInitials: ((name: String) -> String)?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface AvatarOptions : AvatarOptionsBase {
  /**
   * If `true`, the `Avatar` will show a border around it.
   *
   * Best for a group of avatars
   */
  public var showBorder: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The badge at the bottom right corner of the avatar.
   *
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The image url of the `Avatar`
   */
  public var src: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * List of sources to use for different screen resolutions
   */
  public var srcSet: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Defines loading strategy
   *
   * type: `"eager" | "lazy"`
   */
  public var loading: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The border color of the avatar
   * @type SystemProps["borderColor"]
   */
  public var borderColor: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Function called when image failed to load
   */
  public var onError: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The default avatar used as fallback when `name`, and `src`
   * is not specified.
   * @type React.ReactElement
   */
  public var icon: ReactElement?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface AvatarBadgeProps : HTMLChakraProps

/**
 * AvatarBadge used to show extra badge to the top-right
 * or bottom-right corner of an avatar.
 */
public external val AvatarBadge: ComponentWithAs<AvatarBadgeProps>

public external interface AvatarNameProps : HTMLChakraProps, AvatarOptionsBase

/**
 * The avatar name container
 */
public external val AvatarName: RClass<AvatarNameProps>

public external val baseStyle: dynamic

public external interface AvatarProps
  : HTMLChakraProps,
  AvatarOptions,
  ThemingProps {
  override var borderColor: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Avatar component that renders an user avatar with
 * support for fallback avatar and name-only avatars
 */
public external val Avatar: ComponentWithAs<AvatarProps>
