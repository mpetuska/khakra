@file:JsModule("@chakra-ui/textarea/dist/esm/textarea")

package io.github.mpetuska.khakra.textarea

import io.github.mpetuska.khakra.formControl.FormControlOptions
import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface TextareaOptions {
  /**
   * The border color when the textarea is focused. Use color keys in `theme.colors`
   * @example
   * focusBorderColor = "blue.500"
   */
  public var focusBorderColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The border color when the textarea is invalid. Use color keys in `theme.colors`
   * @example
   * errorBorderColor = "red.500"
   */
  public var errorBorderColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the textarea element will span the full width of its parent
   *
   * @deprecated
   * This component defaults to 100% width,
   * please use the props `maxWidth` or `width` to configure
   */
  public var isFullWidth: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface TextareaProps : HTMLChakraProps, TextareaOptions, FormControlOptions, ThemingProps

/**
 * Textarea is used to enter an amount of text that's longer than a single line
 * @see Docs https://chakra-ui.com/docs/form/textarea
 */
public external val Textarea: ComponentWithAs<TextareaProps>
