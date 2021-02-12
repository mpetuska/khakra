@file:JsModule("@chakra-ui/transition/dist/esm/fade")

package io.github.mpetuska.khakra.transition

import react.RClass
import react.RProps

public external val fadeConfig: dynamic

public external interface FadeProps : RProps {
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

public external val Fade: RClass<FadeProps>
