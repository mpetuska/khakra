@file:JsModule("@chakra-ui/color-mode/dist/esm/color-mode-script")

package com.github.mpetuska.khakra.colorMode

import react.RClass
import react.RProps

public external interface ColorModeScriptProps : RProps {
  /**
   * type: `"light" | "dark" | "system"`
   */
  public var initialColorMode: String?
}

/**
 * Script to add to the root of your application when using localStorage,
 * to help prevent flash of color mode that can happen during page load.
 */
public external val ColorModeScript: RClass<ColorModeScriptProps>
