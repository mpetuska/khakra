@file:JsModule("@chakra-ui/pin-input/dist/esm/pin-input")

package com.github.mpetuska.khakra.pinInput

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RClass

public external interface InputOptions {
  /**
   * The border color when the input is focused. Use color keys in `theme.colors`
   * @example
   * focusBorderColor = "blue.500"
   */
  public var focusBorderColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The border color when the input is invalid. Use color keys in `theme.colors`
   * @example
   * errorBorderColor = "red.500"
   */
  public var errorBorderColor: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface PinInputProps : UsePinInputProps, ThemingProps, InputOptions {
  /**
   * The children of the pin input component
   *
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val PinInput: RClass<PinInputProps>

public external interface PinInputFieldProps : HTMLChakraProps

public external val PinInputField: ComponentWithAs<PinInputFieldProps>
