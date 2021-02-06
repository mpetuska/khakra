@file:JsModule("@chakra-ui/layout/dist/esm/divider")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface DividerProps : HTMLChakraProps, ThemingProps {
  /**
   * type: `"horizontal" | "vertical"`
   */
  public override var orientation: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Layout component used to visually separate content in a list or group.
 * It display a thin horizontal or vertical line, and renders a `hr` tag.
 *
 * @see Docs https://chakra-ui.com/docs/data-display/divider
 */
public external val Divider: ComponentWithAs<DividerProps>
