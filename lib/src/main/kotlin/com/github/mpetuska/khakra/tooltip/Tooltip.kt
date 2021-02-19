@file:JsModule("@chakra-ui/tooltip/dist/esm/tooltip")

package com.github.mpetuska.khakra.tooltip

import com.github.mpetuska.khakra.PortalProps
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import kotlinext.js.Record

public external interface TooltipProps : HTMLChakraProps, ThemingProps, UseTooltipProps, Record<String, String> {
  /**
   * The react component to use as the
   * trigger for the tooltip
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The label of the tooltip
   */
  public var label: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tooltip will wrap its children
   * in a `<span/>` with `tabIndex=0`
   */
  public var shouldWrapChildren: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tooltip will show an arrow tip
   */
  public var hasArrow: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Props to be forwarded to the portal component
   */
  public var portalProps: PortalProps?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Tooltips display informative text when users hover, focus on, or tap an element.
 *
 * @see Docs     https://chakra-ui.com/components/tooltip
 * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices/#tooltip
 */
public external val Tooltip: ComponentWithAs<TooltipProps>
