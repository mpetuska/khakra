@file:JsModule("@chakra-ui/layout/dist/esm/text")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface TextProps : HTMLChakraProps, ThemingProps {
  /**
   * The CSS `text-align` property
   * @type SystemProps["textAlign"]
   */
  public var align: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `text-decoration` property
   * @type SystemProps["textDecoration"]
   */
  public var decoration: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `text-transform` property
   * @type SystemProps["textTransform"]
   */
  public var casing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Used to render texts or paragraphs.
 *
 * @see Docs https://chakra-ui.com/docs/typography/text
 */
public external val Text: ComponentWithAs<TextProps>
