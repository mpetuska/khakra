@file:JsModule("@chakra-ui/layout/dist/esm/grid")

package com.github.mpetuska.khakra.layout

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps

public external interface GridOptions {
  /**
   * Short hand prop for `gridTemplateColumns`
   * @type SystemProps["gridTemplateColumns"]
   */
  public var templateColumns: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridGap`
   * @type SystemProps["gridGap"]
   */
  public var gap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridRowGap`
   * @type SystemProps["gridRowGap"]
   */
  public var rowGap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridColumnGap`
   * @type SystemProps["gridColumnGap"]
   */
  public var columnGap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridAutoFlow`
   * @type SystemProps["gridAutoFlow"]
   */
  public var autoFlow: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridAutoRows`
   * @type SystemProps["gridAutoRows"]
   */
  public var autoRows: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridAutoColumns`
   * @type SystemProps["gridAutoColumns"]
   */
  public var autoColumns: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridTemplateRows`
   * @type SystemProps["gridTemplateRows"]
   */
  public var templateRows: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridTemplateAreas`
   * @type SystemProps["gridTemplateAreas"]
   */
  public var templateAreas: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridArea`
   * @type SystemProps["gridArea"]
   */
  public var area: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridColumn`
   * @type SystemProps["gridColumn"]
   */
  public var column: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `gridRow`
   * @type SystemProps["gridRow"]
   */
  public var row: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface GridProps : HTMLChakraProps, GridOptions

/**
 * React component used to create grid layouts.
 *
 * It renders a `div` with `display: grid` and
 * comes with helpful style shorthand.
 *
 * @see Docs https://chakra-ui.com/docs/layout/grid
 */
public external val Grid: ComponentWithAs<GridProps>

public external interface GridItemProps : BoxProps {
  /**
   * The number of columns the grid item should `span`.
   * @type ResponsiveValue<number | "auto">
   */
  public var colSpan: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The column number the grid item should start.
   * @type ResponsiveValue<number | "auto">
   */
  public var colStart: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * @type ResponsiveValue<number | "auto">
   */
  public var colEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * @type ResponsiveValue<number | "auto">
   */
  public var rowStart: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * @type ResponsiveValue<number | "auto">
   */
  public var rowEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * @type ResponsiveValue<number | "auto">
   */
  public var rowSpan: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val GridItem: ComponentWithAs<GridItemProps>

