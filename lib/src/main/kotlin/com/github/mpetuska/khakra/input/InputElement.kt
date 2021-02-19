@file:JsModule("@chakra-ui/input/dist/esm/input-element")

package com.github.mpetuska.khakra.input

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps

public external interface InputElementProps : HTMLChakraProps {
  /**
   * type: `"left" | "right"`
   */
  public var placement: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external val InputLeftElement: ComponentWithAs<InputElementProps>

public external val InputRightElement: ComponentWithAs<InputElementProps>
