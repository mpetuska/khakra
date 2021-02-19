@file:JsModule("@chakra-ui/input/dist/esm/input")

package com.github.mpetuska.khakra.input

import com.github.mpetuska.khakra.formControl.FormControlOptions
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

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
   *  please use the props `maxWidth` or `width` to configure
   */
  public var isFullWidth: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface InputProps : HTMLChakraProps, InputOptions, ThemingProps, FormControlOptions {
  public override var size: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Input
 *
 * Element that allows users enter single valued data.
 */
public external val Input: ComponentWithAs<InputProps>
