@file:JsModule("@chakra-ui/styled-system/dist/esm/config/position")

package khakra.styledSystem.config

import khakra.styledSystem.core.*
import react.*


/**
 * Types for position CSS properties
 */
public external interface PositionProps : RProps {
  /**
   * The CSS `z-index` property
   */
  public var zIndex: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `top` property
   */
  public var top: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var insetBlockStart: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `right` property
   */
  public var right: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * When the direction is `ltr`, `insetInlineEnd` is equivalent to `right`.
   * When the direction is `rtl`, `insetInlineEnd` is equivalent to `left`.
   */
  public var insetInlineEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * When the direction is `ltr`, `insetEnd` is equivalent to `right`.
   * When the direction is `rtl`, `insetEnd` is equivalent to `left`.
   */
  public var insetEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `bottom` property
   */
  public var bottom: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var insetBlockEnd: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `left` property
   */
  public var left: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var insetInlineStart: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * When the direction is `start`, `end` is equivalent to `left`.
   * When the direction is `start`, `end` is equivalent to `right`.
   */
  public var insetStart: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `left`, `right`, `top`, `bottom` property
   */
  public var inset: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `left`, and `right` property
   */
  public var insetX: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `top`, and `bottom` property
   */
  public var insetY: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `position` property
   */
  public var pos: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `position` property
   */
  public var position: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var insetInline: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var insetBlock: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val position: Parser
public external val positionParser: Parser
