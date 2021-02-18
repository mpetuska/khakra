@file:JsModule("@chakra-ui/tooltip/dist/esm/use-tooltip")

package io.github.mpetuska.khakra.tooltip

import io.github.mpetuska.khakra.popper.UsePopperProps

public external interface UseTooltipProps : UsePopperProps {
  /**
   * Delay (in ms) before showing the tooltip
   * @default 0ms
   */
  public var openDelay: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Delay (in ms) before hiding the tooltip
   * @default 0ms
   */
  public var closeDelay: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tooltip will hide on click
   */
  public var closeOnClick: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tooltip will hide while the mouse
   * is down
   */
  public var closeOnMouseDown: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback to run when the tooltip shows
   */
  public var onOpen: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback to run when the tooltip hides
   */
  public var onClose: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The Popper.js placement of the tooltip
   */
  public var placement: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Custom `id` to use in place of `uuid`
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tooltip will be shown (in controlled mode)
   */
  public var isOpen: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tooltip will be initially shown
   */
  public var defaultIsOpen: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseTooltipReturn {
  public val isOpen: Boolean
  public fun show()
  public fun hide()
  public fun getTriggerProps(props: dynamic = definedExternally, _ref: dynamic = definedExternally): dynamic
  public fun getTooltipProps(props: dynamic = definedExternally, _ref: dynamic = definedExternally): dynamic
  public fun getTooltipPositionerProps(props: dynamic = definedExternally, _ref: dynamic = definedExternally): dynamic
  public val transformOrigin: Any
  public val placement: dynamic
  public fun getArrowWrapperProps(props: dynamic = definedExternally, _ref: dynamic = definedExternally): dynamic
  public fun getArrowProps(props: dynamic = definedExternally, _ref: dynamic = definedExternally): dynamic
}

public external fun useTooltip(props: UseTooltipProps = definedExternally): UseTooltipReturn
