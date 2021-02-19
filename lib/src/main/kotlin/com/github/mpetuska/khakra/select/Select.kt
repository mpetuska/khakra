@file:JsModule("@chakra-ui/select/dist/esm/select")

package com.github.mpetuska.khakra.select

import com.github.mpetuska.khakra.formControl.FormControlOptions
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RClass

public external interface SelectFieldProps : HTMLChakraProps {
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val SelectField: ComponentWithAs<SelectFieldProps>

public external interface SelectOptions : HTMLChakraProps, FormControlOptions {
  /**
   * The border color when the select is focused. Use color keys in `theme.colors`
   * @example
   * focusBorderColor = "blue.500"
   */
  public var focusBorderColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The border color when the select is invalid. Use color keys in `theme.colors`
   * @example
   * errorBorderColor = "red.500"
   */
  public var errorBorderColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the select element will span the full width of its parent
   *
   * @deprecated
   * This component defaults to 100% width,
   * please use the props `maxWidth` or `width` to configure
   */
  public var isFullWidth: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The placeholder for the select. We render an `<option/>` element that has
   * empty value.
   *
   * ```jsx
   * <option value="">{placeholder}</option>
   * ```
   */
  public var placeholder: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The size (width and height) of the icon
   */
  public var iconSize: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The color of the icon
   */
  public var iconColor: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface SelectProps : SelectFieldProps, ThemingProps, SelectOptions {
  /**
   * Props to forward to the root `div` element
   */
  public var rootProps: HTMLChakraProps?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The icon element to use in the select
   *
   * type: `React.ReactElement`
   */
  public var icon: dynamic
    get() = definedExternally
    set(value) = definedExternally
  override var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React component used to select one item from a list of options.
 */
public external val Select: ComponentWithAs<SelectProps>

public external val DefaultIcon: RClass<dynamic>
