@file:JsModule("@chakra-ui/transition/dist/esm/collapse")

package io.github.mpetuska.khakra.transition

import react.RClass
import react.RProps

public external interface CollapseOptions {
  /**
   * If `true`, the opacity of the content will be animated
   * @default true
   */
  public var animateOpacity: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the element will unmount when `in={false}` and animation is done
   */
  public var unmountOnExit: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the content will be expanded
   */
  public var `in`: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The height you want the content in its collapsed state.
   * @default 0
   *
   * type: `number | string`
   */
  public var startingHeight: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The height you want the content in its expanded state.
   * @default "auto"
   *
   * type: `number | string`
   */
  public var endingHeight: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface CollapseProps : CollapseOptions, RProps

public external val Collapse: RClass<CollapseProps>
