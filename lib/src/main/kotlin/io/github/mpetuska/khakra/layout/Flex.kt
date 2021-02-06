@file:JsModule("@chakra-ui/layout/dist/esm/flex")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps

public external interface FlexOptions {

  /**
   * Shorthand for `alignItems` style prop
   *
   * @type SystemProps["alignItems"]
   */
  public var align: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `justifyContent` style prop
   *
   * @type SystemProps["justifyContent"]
   */
  public var justify: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `flexWrap` style prop
   * @type SystemProps["flexWrap"]
   */
  public var wrap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `flexDirection` style prop
   * @type SystemProps["flexDirection"]
   */
  public var direction: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `flexBasis` style prop
   * @type SystemProps["flexBasis"]
   */
  public var basis: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `flexGrow` style prop
   * @type SystemProps["flexGrow"]
   */
  public var grow: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `flexShrink` style prop
   * @type SystemProps["flexShrink"]
   */
  public var shrink: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface FlexProps : HTMLChakraProps, FlexOptions

/**
 * React component used to create flexbox layouts.
 *
 * It renders a `div` with `display: flex` and
 * comes with helpful style shorthand.
 *
 * @see Docs https://chakra-ui.com/docs/layout/flex
 */
public external val Flex: ComponentWithAs<FlexProps>
