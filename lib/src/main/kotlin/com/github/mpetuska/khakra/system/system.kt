@file:JsModule("@chakra-ui/system/dist/esm/system")

package com.github.mpetuska.khakra.system

import com.github.mpetuska.khakra.styledSystem.StyleProps

public external interface HTMLChakraProps : StyleProps, ChakraProps {
  public var `as`: dynamic
    get() = definedExternally
    set(value) = definedExternally
}
