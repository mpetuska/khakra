@file:JsModule("@chakra-ui/layout/dist/esm/simple-grid")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs

public external interface SimpleGridOptions {
  /**
   * The width at which child elements will break into columns. Pass a number for pixel values or a string for any other valid CSS length.
   */
  public var minChildWidth: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The number of columns
   */
  public var columns: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The gap between the grid items
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The column gap between the grid items
   */
  public var spacingX: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The row gap between the grid items
   */
  public var spacingY: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface SimpleGridProps : GridProps, SimpleGridOptions

/**
 * SimpleGrid
 *
 * React component make that providers a simpler interface, and
 * make its easy to create responsive grid layouts.
 *
 * @see Docs https://chakra-ui.com/docs/layout/simple-grid
 */
public external val SimpleGrid: ComponentWithAs<SimpleGridProps>
