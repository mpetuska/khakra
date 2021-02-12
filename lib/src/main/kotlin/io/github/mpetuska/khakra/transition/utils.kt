@file:JsModule("@chakra-ui/transition/dist/esm/__utils")

package io.github.mpetuska.khakra.transition

import kotlinext.js.Record

public external interface MotionVariants : Record<String, dynamic>

public external object EASINGS {
  public val ease: Array<Number>
  public val easeIn: Array<Number>
  public val easeOut: Array<Number>
  public val easeInOut: Array<Number>
}
