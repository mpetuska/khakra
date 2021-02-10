@file:JsModule("@chakra-ui/form-control/dist/esm/use-form-control")

package io.github.mpetuska.khakra.formControl

import org.w3c.dom.HTMLElement

public external interface UseFormControlProps<T : HTMLElement> : FormControlOptions {
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `React.FocusEvent<T>`
   */
  public var onFocus: ((event: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `React.FocusEvent<T>`
   */
  public var onBlur: ((event: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  public var disabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var readOnly: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var required: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React hook that provides the props that should be spread on to
 * input fields (`input`, `select`, `textarea`, etc.).
 *
 * It provides a convenient way to control a form fields, validation
 * and helper text.
 */
public external fun <T : HTMLElement> useFormControl(
  props: UseFormControlProps<T>,
): UseFormControlReturn

public external interface UseFormControlReturn {
  public val id: String
  public val disabled: Boolean
  public val readOnly: Boolean
  public val required: Boolean

  /**
   * type: `React.FocusEvent<T>`
   */
  public val onFocus: (event: dynamic) -> Unit

  /**
   * type: `React.FocusEvent<T>`
   */
  public val onBlur: (event: dynamic) -> Unit
}
