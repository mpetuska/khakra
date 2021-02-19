@file:JsModule("@chakra-ui/styled-system/dist/esm/config/grid")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

public external interface GridProps : RProps {
  /**
   * The CSS `grid-gap` property.
   *
   * It defines the gaps (gutters) between rows and columns
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap)
   */
  public var gridGap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-column-gap` property.
   *
   * It defines the size of the gap (gutter) between an element's columns.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
   */
  public var gridColumnGap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-row-gap` property.
   *
   * It defines the size of the gap (gutter) between an element's grid rows.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
   */
  public var gridRowGap: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-column` property.
   *
   * It specifies a grid item’s start position within the grid column by
   * contributing a line, a span, or nothing (automatic) to its grid placement
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start)
   */
  public var gridColumnStart: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-row-start` property
   *
   * It specifies a grid item’s start position within the grid row by
   * contributing a line, a span, or nothing (automatic) to its grid placement,
   * thereby specifying the `inline-start` edge of its grid area.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start)
   */
  public var gridRowStart: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-row-end` property
   *
   * It specifies a grid item’s end position within the grid row by
   * contributing a line, a span, or nothing (automatic) to its grid placement,
   * thereby specifying the `inline-end` edge of its grid area.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end)
   */
  public var gridRowEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-template` property.
   *
   * It is a shorthand property for defining grid columns, rows, and areas.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template)
   */
  public var gridTemplate: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-column` property
   *
   * It specifies a grid item’s end position within the grid column by
   * contributing a line, a span, or nothing (automatic) to its grid placement,
   * thereby specifying the block-end edge of its grid area.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end)
   */
  public var gridColumnEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-column` property.
   *
   * It specifies a grid item's size and location within a grid column
   * by contributing a line, a span, or nothing (automatic) to its grid placement,
   * thereby specifying the `inline-start` and `inline-end` edge of its grid area.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column)
   */
  public var gridColumn: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-row` property
   *
   * It specifies a grid item’s size and location within the grid row
   * by contributing a line, a span, or nothing (automatic) to its grid placement,
   * thereby specifying the `inline-start` and `inline-end` edge of its grid area.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row)
   */
  public var gridRow: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-auto-flow` property
   *
   * It controls how the auto-placement algorithm works,
   * specifying exactly how auto-placed items get flowed into the grid.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
   */
  public var gridAutoFlow: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-auto-columns` property.
   *
   * It specifies the size of an implicitly-created grid column track or pattern of tracks.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
   */
  public var gridAutoColumns: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-auto-rows` property.
   *
   * It specifies the size of an implicitly-created grid row track or pattern of tracks.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
   */
  public var gridAutoRows: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-template-columns` property
   *
   * It defines the line names and track sizing functions of the grid columns.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
   */
  public var gridTemplateColumns: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-template-rows` property.
   *
   * It defines the line names and track sizing functions of the grid rows.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows)
   */
  public var gridTemplateRows: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-template-areas` property.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
   */
  public var gridTemplateAreas: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `grid-areas` property.
   *
   * It specifies a grid item’s size and location within a grid by
   * contributing a line, a span, or nothing (automatic)
   * to its grid placement, thereby specifying the edges of its grid area.
   *
   * @see [Mozilla Docs](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area)
   */
  public var gridArea: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val grid: Parser
public external val gridParser: Parser
