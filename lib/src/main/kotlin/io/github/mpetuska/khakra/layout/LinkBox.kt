@file:JsModule("@chakra-ui/layout/dist/esm/link-box")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface LinkOverlayProps : HTMLChakraProps, ThemingProps {
  /**
   *  If `true`, the link will open in new tab
   */
  public var isExternal: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val LinkOverlay: ComponentWithAs<LinkOverlayProps>

public external interface LinkBoxProps : HTMLChakraProps

/**
 * `LinkBox` is used to wrap content areas within a link while ensuring semantic html
 *
 * @see Docs https://www.chakra-ui.com/docs/link-overlay
 * @see Resources https://www.sarasoueidan.com/blog/nested-links
 */
public external val LinkBox: ComponentWithAs<LinkBoxProps>
