@file:JsModule("@chakra-ui/transition/dist/esm/scale-fade")

package com.github.mpetuska.khakra.transition

import react.RClass
import react.RProps

public external val scaleFadeConfig: dynamic

public external interface ScaleFadeProps : RProps {
  /**
   * The initial scale of the element
   * @default 0.95
   */
  public var initialScale: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the element will transition back to exit state
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
   * Show the component; triggers the enter or exit states
   */
  public var `in`: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val ScaleFade: RClass<ScaleFadeProps>
