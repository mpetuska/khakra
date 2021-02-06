@file:JsModule("@chakra-ui/layout/dist/esm/wrap")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface WrapProps : HTMLChakraProps {
  /**
   * The space between the each child (even if it wraps)
   * @type SystemProps["margin"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
  /**
   * The `justify-content` value (for cross-axis alignment)
   * @type SystemProps["justifyContent"]
   */
  public var justify: dynamic
    get() = definedExternally
    set(value) = definedExternally
  /**
   * The `align-items` value (for main axis alignment)
   * @type SystemProps["alignItems"]
   */
  public var  align: dynamic
    get() = definedExternally
    set(value) = definedExternally
  /**
   * The `flex-direction` value
   * @type SystemProps["flexDirection"]
   */
  public var  direction: dynamic
    get() = definedExternally
    set(value) = definedExternally
  /**
   * If `true`, the children will be wrapped in a `WrapItem`
   */
  public var shouldWrapChildren: Boolean?
  get() = definedExternally
  set(value) = definedExternally
}

/**
 * Layout component used to stack elements that differ in length
 * and are liable to wrap.
 *
 * Common use cases:
 * - Buttons that appear together at the end of forms
 * - Lists of tags and chips
 *
 * @see Docs https://chakra-ui.com/docs/layout/wrap
 */
public external val Wrap: ComponentWithAs<WrapProps>

public external interface WrapItemProps : HTMLChakraProps

public external val WrapItem: ComponentWithAs<WrapItemProps>
