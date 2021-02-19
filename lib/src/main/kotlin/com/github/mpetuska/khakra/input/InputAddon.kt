@file:JsModule("@chakra-ui/input/dist/esm/input-addon")

package com.github.mpetuska.khakra.input

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps

public external interface InputAddonProps : HTMLChakraProps {
  /**
   * type: `"left" | "right"`
   */
  public var placement: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * InputAddon
 *
 * Element to append or prepend to an input
 */
public external val InputAddon: ComponentWithAs<InputAddonProps>

/**
 * InputLeftAddon
 *
 * Element to append to the left of an input
 */
public external val InputLeftAddon: ComponentWithAs<InputAddonProps>

/**
 * InputRightAddon
 *
 * Element to append to the right of an input
 */
public external val InputRightAddon: ComponentWithAs<InputAddonProps>
