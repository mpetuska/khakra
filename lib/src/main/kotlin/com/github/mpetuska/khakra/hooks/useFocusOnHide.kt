@file:JsModule("@chakra-ui/hooks/dist/esm/use-focus-on-hide")

package com.github.mpetuska.khakra.hooks

import React.RefObject
import com.github.mpetuska.khakra.utils.FocusableElement
import org.w3c.dom.HTMLElement

public external interface UseFocusOnHideOptions {
  public var focusRef: RefObject<FocusableElement>
  public var shouldFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var visible: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Popover hook to manage the focus when the popover closes or hides.
 *
 * We either want to return focus back to the popover trigger or
 * let focus proceed normally if user moved to another interactive
 * element in the viewport.
 */
public external fun useFocusOnHide(containerRef: RefObject<HTMLElement>, options: UseFocusOnHideOptions)
