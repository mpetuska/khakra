@file:JsModule("@chakra-ui/icon/dist/esm/create-icon")

package io.github.mpetuska.khakra.icon

import io.github.mpetuska.khakra.system.ComponentWithAs

public external interface CreateIconOptions {
  /**
   * The icon `svg` viewBox
   * @default "0 0 24 24"
   */
  public var viewBox: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `svg` path or group element
   *
   * type: `React.ReactElement | React.ReactElement[]`
   */
  public var path: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If the has a single path, simply copy the path's `d` attribute
   */
  public var d: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The display name useful in the dev tools
   */
  public var displayName: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Default props automatically passed to the component; overwriteable
   */
  public var defaultProps: IconProps?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun createIcon(options: CreateIconOptions): ComponentWithAs<IconProps>
