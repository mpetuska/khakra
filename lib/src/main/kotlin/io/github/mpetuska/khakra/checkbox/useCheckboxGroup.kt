@file:JsModule("@chakra-ui/checkbox/dist/esm/use-checkbox-group")

package io.github.mpetuska.khakra.checkbox

import kotlinext.js.Record

public external interface UseCheckboxGroupProps {
  /**
   * The value of the checkbox group
   *
   * type: `StringOrNumber[]`
   */
  public var value: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial value of the checkbox group
   *
   * type: `StringOrNumber[]`
   */
  public var defaultValue: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The callback fired when any children Checkbox is checked or unchecked
   *
   * type: `StringOrNumber[]`
   */
  public var onChange: ((value: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, input elements will receive
   * `checked` attribute instead of `isChecked`.
   *
   * This assumes, you're using native radio inputs
   */
  public var isNative: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface GetCheckboxPropsReturn : Record<String, Any> {
  /**
   * type: `EventOrValue`
   */
  public val onChange: (nextState: dynamic) -> Unit
}

public external interface UseCheckboxGroupReturnBase {
  /**
   * type: `StringOrNumber[]`
   */
  public val value: dynamic

  /**
   * type: `EventOrValue`
   */
  public val onChange: (nextState: dynamic) -> Unit
}

public external interface UseCheckboxGroupReturn : UseCheckboxGroupReturnBase {
  /**
   * type: `EventOrValue`
   */
  public val setValue: (nextState: dynamic) -> Unit
  public fun getCheckboxProps(props: Record<String, Any>): GetCheckboxPropsReturn
  public fun getCheckboxProps(): GetCheckboxPropsReturn
}

/**
 * React hook that provides all the state management logic
 * for a group of checkboxes.
 *
 * It is consumed by the `CheckboxGroup` component
 */
public external fun useCheckboxGroup(props: UseCheckboxProps): UseCheckboxGroupReturn
