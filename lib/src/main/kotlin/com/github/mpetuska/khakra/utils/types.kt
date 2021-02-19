@file:JsModule("@chakra-ui/utils/dist/esm/types")

package com.github.mpetuska.khakra.utils

import org.w3c.dom.HTMLElement
import react.RProps

public external interface PropGetter<T : HTMLElement, P : RProps> {
  public operator fun invoke(
    props: dynamic = definedExternally,
    ref: dynamic = definedExternally
  ): dynamic
}
