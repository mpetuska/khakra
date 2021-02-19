@file:JsModule("@chakra-ui/popover/dist/esm/use-popover")

package com.github.mpetuska.khakra.popover

import React.RefObject
import com.github.mpetuska.khakra.utils.FocusableElement
import react.RDispatch

public external object TRIGGER {
  public var click: String /* "click" */
  public var hover: String /* "hover" */
}

public external interface UsePopoverProps {
  /**
   * The html `id` attribute of the popover.
   * If not provided, we generate a unique id.
   *
   * This `id` is also used to auto-generate the `aria-labelledby`
   * and `aria-decribedby` attributes that points to the `PopoverHeader` and `PopoverBody`
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the popover will be opened in controlled mode.
   */
  public var isOpen: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the popover will be initially opened.
   */
  public var defaultIsOpen: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `ref` of the element that should receive focus when the popover opens.
   */
  public var initialFocusRef: RefObject<FocusableElement>?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, focus will be returned to the element that triggers the popover
   * when it closes
   */
  public var returnFocusOnClose: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, focus will be transferred to the first interactive element
   * when the popover opens
   */
  public var autoFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The gap (in pixels) to apply between the popover and the target.
   * Used by `popper.js`
   */
  public var gutter: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The placement of the popover
   */
  public var placement: dynamic /* "auto" | "auto-start" | "auto-end" | Any? | "top-start" | "top-end" | "bottom-start" | "bottom-end" | "right-start" | "right-end" | "left-start" | "left-end" */
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The flip of the popover
   */
  public var flip: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the popover will close when you blur out it by
   * clicking outside or tabbing out
   */
  public var closeOnBlur: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the popover will close when you hit the `Esc` key
   */
  public var closeOnEsc: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback fired when the popover opens
   */
  public var onOpen: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback fired when the popover closes
   */
  public var onClose: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The size of the popover arrow
   */
  public var arrowSize: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `box-shadow` of the popover arrow
   */
  public var arrowShadowColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The Popper.js modifiers to use.
   */
  public var modifiers: Array<dynamic>?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The interaction that triggers the popover.
   *
   * `hover` - means the popover will open when you hover with mouse or
   * focus with keyboard on the popover trigger
   *
   * `click` - means the popover will open on click or
   * press `Enter` to `Space` on keyboard
   */
  public var trigger: String?
    get() = definedExternally
    set(value) = definedExternally
  public var openDelay: Number?
    get() = definedExternally
    set(value) = definedExternally
  public var closeDelay: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Performance 🚀:
   * If `true`, the PopoverContent rendering will be deferred
   * until the popover is open.
   */
  public var isLazy: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UsePopoverReturn {
  public val forceUpdate: (() -> Unit)?
  public val isOpen: Boolean
  public fun onClose()
  public val headerId: String
  public val hasHeader: Boolean
  public val setHasHeader: RDispatch<Boolean>
  public val bodyId: String
  public val hasBody: Boolean
  public val setHasBody: RDispatch<Boolean>
  public fun onTransitionEnd()
  public fun getArrowProps(props: dynamic = definedExternally, ref: dynamic = definedExternally): dynamic
  public fun getArrowPositionerProps(props: dynamic = definedExternally, ref: dynamic = definedExternally): dynamic
  public fun getPopoverPositionerProps(props: dynamic = definedExternally, ref: dynamic = definedExternally): dynamic
  public fun getPopoverProps(props: dynamic = definedExternally, ref: dynamic = definedExternally): dynamic
  public fun getTriggerProps(props: dynamic = definedExternally, ref: dynamic = definedExternally): dynamic
}

public external fun usePopover(props: UsePopoverProps = definedExternally): UsePopoverReturn
