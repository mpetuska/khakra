@file:JsModule("@chakra-ui/layout/dist/esm/box")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.*
import react.*

public external interface BoxProps : HTMLChakraProps

/**
 * Box is the most abstract component on top of which other chakra
 * components are built. It renders a `div` element by default.
 *
 * @see Docs https://chakra-ui.com/docs/layout/box
 */
public external val Box: ChakraComponent<BoxProps>

public external interface SquareProps : BoxProps {
  /**
   * The size (width and height) of the square
   */
  public var size: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the content will be centered in the square
   */
  public var centerContent: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val Square: ChakraComponent<SquareProps>
public external val Circle: ChakraComponent<SquareProps>
