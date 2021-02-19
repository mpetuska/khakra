@file:JsModule("@chakra-ui/checkbox/dist/esm/checkbox")

package com.github.mpetuska.khakra.checkbox

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface StyledControlProps : HTMLChakraProps

public external interface BaseInputProps {
  public var checked: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * FocusEventHandler<HTMLInputElement>
   */
  public var onBlur: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface CheckboxProps : StyledControlProps,
  BaseInputProps,
  ThemingProps,
  UseCheckboxProps

public external val Checkbox: ComponentWithAs<CheckboxProps>
