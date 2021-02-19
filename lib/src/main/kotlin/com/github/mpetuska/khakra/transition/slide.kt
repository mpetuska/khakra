@file:JsModule("@chakra-ui/transition/dist/esm/slide")

package com.github.mpetuska.khakra.transition

import react.RClass
import react.RProps

public external interface SlideOptions {
  public var unmountOnExit: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `"bottom" | "top" | "left" | "right"`
   */
  public var direction: String?
    get() = definedExternally
    set(value) = definedExternally
  public var `in`: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface SlideProps : SlideOptions, RProps

public external val Slide: RClass<SlideProps>
