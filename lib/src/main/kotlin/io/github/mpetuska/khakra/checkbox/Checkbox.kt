@file:JsModule("@chakra-ui/checkbox/dist/esm/checkbox")

package io.github.mpetuska.khakra.checkbox

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

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
