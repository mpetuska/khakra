@file:JsModule("@chakra-ui/checkbox/dist/esm/use-checkbox")

package io.github.mpetuska.khakra.checkbox

import io.github.mpetuska.khakra.system.*

public external interface UseCheckboxProps {
  /**
   * If `true`, the checkbox will be checked.
   * You'll need to pass `onChange` to update its value (since it is now controlled)
   */
  public var isChecked: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox will be indeterminate.
   * This only affects the icon shown inside checkbox
   * and does not modify the isChecked property.
   */
  public var isIndeterminate: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox will be disabled
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true` and `isDisabled` is passed, the checkbox will
   * remain tabbable but not interactive
   */
  public var isFocusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox will be readonly
   */
  public var isReadOnly: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox is marked as invalid.
   * Changes style of unchecked state.
   */
  public var isInvalid: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox input is marked as required,
   * and `required` attribute will be added
   */
  public var isRequired: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox will be initially checked.
   * @deprecated Please use the `defaultChecked` prop, which mirrors default
   * React checkbox behavior.
   */
  public var defaultIsChecked: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the checkbox will be initially checked.
   */
  public var defaultChecked: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The callback invoked when the checked state of the `Checkbox` changes..
   *
   * type: `ChangeEvent<HTMLInputElement>`
   */
  public var onChange: ((event: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The name of the input field in a checkbox
   * (Useful for form submission).
   */
  public var name: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The value to be used in the checkbox input.
   * This is the value that will be returned on form submission.
   *
   * type: `string | number`
   */
  public var value: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * id assigned to input
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseCheckboxReturnState {
  public val isInvalid: Boolean?
  public val isFocused: Boolean
  public val isChecked: Boolean
  public val isActive: Boolean
  public val isHovered: Boolean
  public val isIndeterminate: Boolean?
  public val isDisabled: Boolean?
  public val isReadOnly: Boolean?
  public val isRequired: Boolean?
}

public external interface UseCheckboxReturn {
  public val state: UseCheckboxReturnState
  public fun getCheckboxProps(props: Any?, forwardedRef: Any? = definedExternally): dynamic
  public fun getInputProps(props: Any?, forwardedRef: Any? = definedExternally): dynamic
  public fun getLabelProps(props: Any?, forwardedRef: Any? = definedExternally): dynamic
  public val htmlProps: dynamic
}

/**
 * useCheckbox that provides all the state and focus management logic
 * for a checkbox. It is consumed by the `Checkbox` component
 *
 * @see Docs https://chakra-ui.com/docs/form/checkbox#hooks
 */
public external fun useCheckbox(props: UseCheckboxProps): UseCheckboxReturn
