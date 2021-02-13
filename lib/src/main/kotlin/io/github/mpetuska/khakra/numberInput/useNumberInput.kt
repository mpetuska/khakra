@file:JsModule("@chakra-ui/number-input/dist/esm/use-number-input")

package io.github.mpetuska.khakra.numberInput

import io.github.mpetuska.khakra.counter.UseCounterProps
import io.github.mpetuska.khakra.input.InputProps

public external interface UseNumberInputProps : UseCounterProps {
  /**
   * If `true`, the input will be focused as you increment
   * or decrement the value with the stepper
   *
   * @default true
   */
  public var focusInputOnChange: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * This controls the value update when you blur out of the input.
   * - If `true` and the value is greater than `max`, the value will be reset to `max`
   * - Else, the value remains the same.
   *
   * @default true
   */
  public var clampValueOnBlur: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * This is used to format the value so that screen readers
   * can speak out a more human-friendly value.
   *
   * It is used to set the `aria-valuetext` property of the input
   *
   * type: `string | number`
   */
  public var getAriaValueText: ((value: dynamic) -> String)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the input will be in readonly mode
   */
  public var isReadOnly: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the input will have `aria-invalid` set to `true`
   */
  public var isInvalid: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the input will be disabled
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `id` to use for the number input field.
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The pattern used to check the <input> element's value against on form submission.
   *
   * @default
   * "[0-9]*(.[0-9]+)?"
   */
  public var pattern: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Hints at the type of data that might be entered by the user. It also determines
   * the type of keyboard shown to the user on mobile devices
   *
   * @default "decimal"
   *
   * type: `"none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"`
   */
  public var inputMode: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the input's value will change based on mouse wheel
   */
  public var allowMouseWheel: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The HTML `name` attribute used for forms
   */
  public var name: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseNumberInputReturnHtmlProps {
  /**
   * type: `string | number`
   */
  public var defaultValue: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `string | number`
   */
  public var value: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React hook that implements the WAI-ARIA Spin Button widget
 * and used to create numeric input fields.
 *
 * It returns prop getters you can use to build your own
 * custom number inputs.
 *
 * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.1/#spinbutton
 * @see Docs     https://www.chakra-ui.com/useNumberInput
 * @see WHATWG   https://html.spec.whatwg.org/multipage/input.html#number-state-(type=number)
 */
public external fun useNumberInput(props: UseNumberInputProps = definedExternally): UseNumberInputReturn

public external interface UseNumberInputReturn {
  /**
   * type: `string | number`
   */
  public val value: dynamic
  public val valueAsNumber: Number
  public val isFocused: Boolean
  public val isDisabled: Boolean?
  public val isReadOnly: Boolean?
  public fun getIncrementButtonProps(
    props: dynamic = definedExternally,
    ref: dynamic = definedExternally
  ): NumberIncrementStepperProps

  public fun getDecrementButtonProps(
    props: dynamic = definedExternally,
    ref: dynamic = definedExternally
  ): NumberDecrementStepperProps

  public fun getInputProps(
    props: dynamic = definedExternally,
    ref: dynamic = definedExternally
  ): InputProps

  public val htmlProps: UseNumberInputReturnHtmlProps
}
