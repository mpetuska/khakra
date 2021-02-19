@file:JsModule("@chakra-ui/button/dist/esm/button-group")

package com.github.mpetuska.khakra.button

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface ButtonGroupProps : HTMLChakraProps, ThemingProps {
  /**
   * If `true`, the borderRadius of button that are direct children will be altered
   * to look flushed together
   */
  public var isAttached: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, all wrapped button will be disabled
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The spacing between the buttons
   * @default '0.5rem'
   * @type SystemProps["marginRight"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val ButtonGroup: ComponentWithAs<ButtonGroupProps>
