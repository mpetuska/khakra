@file:JsModule("@chakra-ui/pin-input/dist/esm/use-pin-input")

package io.github.mpetuska.khakra.pinInput

import io.github.mpetuska.khakra.descendant.DescendantContext
import io.github.mpetuska.khakra.input.InputProps
import org.w3c.dom.HTMLInputElement
import react.RProvider
import react.RReadableRef

public external interface PinInputContext : UsePinInputReturn {
  /**
   * Sets the pin input component to the disabled state
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Sets the pin input component to the invalid state
   */
  public var isInvalid: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val PinInputProvider: RProvider<PinInputContext>
public external fun usePinInputContext(): PinInputContext

public external interface UsePinInputProps {
  /**
   * If `true`, the pin input receives focus on mount
   */
  public var autoFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The value of the the pin input. This is the value
   * that will be returned when the pin input is filled
   */
  public var value: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The default value of the pin input
   */
  public var defaultValue: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Function called on input change
   */
  public var onChange: ((value: String) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Function called when all inputs have valid values
   */
  public var onComplete: ((value: String) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The placeholder for the pin input
   */
  public var placeholder: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, focus will move automatically to the next input once filled
   * @default true
   */
  public var manageFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the pin input component signals to its fields that they should
   * use `autocomplete="one-time-code"`.
   */
  public var otp: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The top-level id string that will be applied to the input fields.
   * The index of the input will be appended to this top-level id.
   *
   * @example
   * if id="foo", the first input will have `foo-0`
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the pin input component is put in the disabled state
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the pin input component is put in the invalid state
   */
  public var isInvalid: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The type of values the pin-input should allow
   *
   * type: `"alphanumeric" | "number"`
   */
  public var type: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the input's value will be masked just like `type=password`
   */
  public var mask: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface GetInputProps : InputProps {
  public var index: Int?
    get() = definedExternally
    set(value) = definedExternally
  public var disabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var focusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun usePinInput(props: UsePinInputProps = definedExternally): UsePinInputReturn

public external interface UsePinInputReturn {
  public fun getInputProps(props: GetInputProps): InputProps
  public val id: String
  public val domContext: DescendantContext<HTMLInputElement>
  public val values: Array<String>
  public fun setValue(value: String, index: Int)
  public fun setValues(value: Array<String>)
  public fun setValues(value: (prevState: Array<String>) -> Array<String>)
  public val clear: () -> Unit
}

public external interface UsePinInputFieldProps : InputProps {
  public var ref: RReadableRef<HTMLInputElement>?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun usePinInputField(
  props: UsePinInputFieldProps = definedExternally,
  forwardedRef: RReadableRef<Any> = definedExternally
): InputProps
