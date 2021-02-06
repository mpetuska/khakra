@file:JsModule("@chakra-ui/checkbox/dist/esm/checkbox-group")

package io.github.mpetuska.khakra.checkbox

import io.github.mpetuska.khakra.system.ThemingProps
import react.RClass

public external interface CheckboxGroupProps : UseCheckboxGroupProps, ThemingProps {
  /**
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface CheckboxGroupContext : UseCheckboxGroupReturnBase, ThemingProps

public external val useCheckboxGroupContext: () -> CheckboxGroupContext

/**
 * Used for multiple checkboxes which are bound in one group,
 * and it indicates whether one or more options are selected.
 *
 * @see Docs https://chakra-ui.com/docs/form/checkbox
 */
public external val CheckboxGroup: RClass<CheckboxGroupProps>
