@file:JsModule("@chakra-ui/layout/dist/esm/container")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface ContainerProps : HTMLChakraProps, ThemingProps {
  /**
   * If `true`, container will center its children
   * regardless of their width.
   */
  public var centerContent: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Layout component used to wrap app or website content
 *
 * It sets `margin-left` and `margin-right` to `auto`,
 * to keep its content centered.
 *
 * It also sets a default max-width of `60ch` (60 characters).
 */
public external val Container: ComponentWithAs<ContainerProps>
