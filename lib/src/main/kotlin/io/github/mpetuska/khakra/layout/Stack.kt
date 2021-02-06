@file:JsModule("@chakra-ui/layout/dist/esm/stack")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ChakraComponent
import io.github.mpetuska.khakra.system.HTMLChakraProps
import react.ReactElement

public external interface StackOptions {
  /**
   * Shorthand for `alignItems` style prop
   * @type SystemProps["alignItems"]
   */
  public var align: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Shorthand for `justifyContent` style prop
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
   * The space between each stack item
   * @type SystemProps["margin"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The direction to stack the items.
   */
  public var direction: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, each stack item will show a divider
   * @type React.ReactElement
   */
  public var divider: ReactElement?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the children will be wrapped in a `Box` with
   * `display: inline-block`, and the `Box` will take the spacing props
   */
  public var shouldWrapChildren: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true` the items will be stacked horizontally.
   */
  public var isInline: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface StackDividerProps : HTMLChakraProps

public external val StackDivider: ChakraComponent<StackDividerProps>

public external interface StackProps : HTMLChakraProps, StackOptions


/**
 * Stacks help you easily create flexible and automatically distributed layouts
 *
 * You can stack elements in the horizontal or vertical direction,
 * and apply a space or/and divider between each element.
 *
 * It uses `display: flex` internally and renders a `div`.
 *
 * @see Docs https://chakra-ui.com/docs/layout/stack
 *
 */
public external val Stack: ChakraComponent<StackProps>

/**
 * A view that arranges its children in a horizontal line.
 */
public external val HStack: ChakraComponent<StackProps>

/**
 * A view that arranges its children in a vertical line.
 */
public external val VStack: ChakraComponent<StackProps>
