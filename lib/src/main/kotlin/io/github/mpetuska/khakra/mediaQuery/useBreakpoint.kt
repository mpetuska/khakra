@file:JsModule("@chakra-ui/media-query/dist/esm/use-breakpoint")

package io.github.mpetuska.khakra.mediaQuery

public external interface Breakpoint {
  public var breakpoint: String
  public var maxWidth: String?
    get() = definedExternally
    set(value) = definedExternally
  public var minWidth: String
}

/**
 * React hook used to get the current responsive media breakpoint.
 *
 * @param defaultBreakpoint default breakpoint name
 * (in non-window environments like SSR)
 *
 * For SSR, you can use a package like [is-mobile](https://github.com/kaimallea/isMobile)
 * to get the default breakpoint value from the user-agent
 */
public external fun useBreakpoint(defaultBreakpoint: String = definedExternally): String?
