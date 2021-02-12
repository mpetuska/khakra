@file:JsModule("@chakra-ui/transition/dist/esm/slide-fade")

package io.github.mpetuska.khakra.transition

import react.RClass
import react.RProps

public external val slideFadeConfig: dynamic

public external interface SlideFadeProps : RProps {
  /**
   * The offset on the horizontal or `x` axis
   * @default 0
   *
   * type: `string | number`
   */
  public var offsetX: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The offset on the vertical or `y` axis
   * @default 8
   *
   * type: `string | number`
   */
  public var offsetY: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the element will be transitioned back to the offset when it leaves.
   * Otherwise, it'll only fade out
   * @default true
   */
  public var reverse: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the element will unmount when `in={false}` and animation is done
   */
  public var unmountOnExit: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the content will animate in
   */
  public var `in`: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val SlideFade: RClass<SlideFadeProps>
