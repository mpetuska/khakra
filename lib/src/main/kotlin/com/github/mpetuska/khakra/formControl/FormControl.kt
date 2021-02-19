@file:JsModule("@chakra-ui/form-control/dist/esm/form-control")

package com.github.mpetuska.khakra.formControl

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RContext

public external interface FormControlOptions {
  /**
   * If `true`, the form control will be required. This has 2 side effects:
   * - The `FormLabel` will show a required indicator
   * - The form element (e.g, Input) will have `aria-required` set to `true`
   */
  public var isRequired: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the form control will be disabled. This has 2 side effects:
   * - The `FormLabel` will have `data-disabled` attribute
   * - The form element (e.g, Input) will be disabled
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the form control will be invalid. This has 2 side effects:
   * - The `FormLabel` and `FormErrorIcon` will have `data-invalid` set to `true`
   * - The form element (e.g, Input) will have `aria-invalid` set to `true`
   */
  public var isInvalid: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the form control will be readonly
   */
  public var isReadOnly: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface FormControlContext : FormControlOptions {
  /**
   * The label text used to inform users as to what information is
   * requested for a text field.
   */
  public var label: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The custom `id` to use for the form control. This is passed directly to the form element (e.g, Input).
   * - The form element (e.g Input) gets the `id`
   * - The form label id: `form-label-${id}`
   * - The form error text id: `form-error-text-${id}`
   * - The form helper text id: `form-helper-text-${id}`
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun useFormControlContext(): RContext<FormControlContext>

public external interface FormControlProps : FormControlOptions, HTMLChakraProps, ThemingProps

/**
 * FormControl provides context such as
 * `isInvalid`, `isDisabled`, and `isRequired` to form elements.
 *
 * This is commonly used in form elements such as `input`,
 * `select`, `textarea`, etc.
 */
public external val FormControl: ComponentWithAs<FormControlProps>

public external interface HelpTextProps : HTMLChakraProps

/**
 * FormHelperText
 *
 * Assistive component that conveys additional guidance
 * about the field, such as how it will be used and what
 * types in values should be provided.
 */
public external val FormHelperText: ComponentWithAs<HelpTextProps>
