@file:JsModule("@chakra-ui/number-input/dist/esm/number-input")

package com.github.mpetuska.khakra.numberInput

import com.github.mpetuska.khakra.system.ChakraComponent
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RProps

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

  /**
   * If `true`, the input element will span the full width of its parent
   *
   * @deprecated
   * This component defaults to 100% width,
   * please use the props `maxWidth` or `width` to configure
   */
  public var isFullWidth: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface NumberInputProps : UseNumberInputProps, ThemingProps, InputOptions, HTMLChakraProps

/**
 * NumberInput
 *
 * React component that provides context and logic to all
 * number input sub-components.
 *
 * It renders a `div` by default.
 *
 * @see Docs http://chakra-ui.com/numberinput
 */
public external val NumberInput: ComponentWithAs<NumberInputProps>

public external interface NumberInputStepperProps : HTMLChakraProps

/**
 * NumberInputStepper
 *
 * React component used to group the increment and decrement
 * button spinners.
 *
 * It renders a `div` by default.
 *
 * @see Docs http://chakra-ui.com/components/number-input
 */
public external val NumberInputStepper: ComponentWithAs<NumberInputStepperProps>

public external interface NumberInputFieldProps : HTMLChakraProps

/**
 * NumberInputField
 *
 * React component that represents the actual `input` field
 * where users can type to edit numeric values.
 *
 * It renders an `input` by default and ensures only numeric
 * values can be typed.
 *
 * @see Docs http://chakra-ui.com/numberinput
 */
public external val NumberInputField: ComponentWithAs<NumberInputFieldProps>

public external val StyledStepper: ChakraComponent<RProps>

public external interface NumberDecrementStepperProps : HTMLChakraProps

/**
 * NumberDecrementStepper
 *
 * React component used to decrement the number input's value
 *
 * It renders a `div` with `role=button` by default
 */
public external val NumberDecrementStepper: ComponentWithAs<NumberDecrementStepperProps>

public external interface NumberIncrementStepperProps : HTMLChakraProps

/**
 * NumberIncrementStepper
 *
 * React component used to increment the number input's value
 *
 * It renders a `div` with `role=button` by default
 */
public external val NumberIncrementStepper: ComponentWithAs<NumberIncrementStepperProps>
