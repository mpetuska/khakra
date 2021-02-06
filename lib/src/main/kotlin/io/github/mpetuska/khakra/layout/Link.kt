@file:JsModule("@chakra-ui/layout/dist/esm/link")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface LinkProps : HTMLChakraProps, ThemingProps {
  /**
   *  If `true`, the link will open in new tab
   */
  public var isExternal: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Links are accessible elements used primarily for navigation.
 *
 * It integrates well with other routing libraries like
 * React Router, Reach Router and Next.js Link.
 *
 * @example
 *
 * ```jsx
 * <Link as={ReactRouterLink} to="/home">Home</Link>
 * ```
 *
 * @see Docs https://chakra-ui.com/docs/layout/link
 */
public external val Link: ComponentWithAs<LinkProps>
