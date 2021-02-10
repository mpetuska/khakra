@file:JsModule("@chakra-ui/form-control/dist/esm/form-label")

package io.github.mpetuska.khakra.formControl

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps
import kotlinext.js.Record

public external fun useFieldLabel(props: Record<String, Any>): UseFieldLabelReturn

public external interface UseFieldLabelReturn : Record<String, Any> {
  public val id: Any?
  public val htmlFor: Any?
}

public external interface FormLabelProps : HTMLChakraProps, ThemingProps {
  /**
   * type: `React.ReactElement`
   */
  public var requiredIndicator: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Used to enhance the usability of form controls.
 *
 * It is used to inform users as to what information
 * is requested for a form field.
 *
 * ♿️ Accessibility: Every form field should have a form label.
 */
public external val FormLabel: ComponentWithAs<FormLabelProps>

public external interface RequiredIndicatorProps : HTMLChakraProps

/**
 * Used to show a "required" text or an asterisks (*) to indicate that
 * a field is required.
 */
public external val RequiredIndicator: ComponentWithAs<RequiredIndicatorProps>
