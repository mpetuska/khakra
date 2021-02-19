@file:JsModule("@chakra-ui/hooks/dist/esm/use-outside-click")

package com.github.mpetuska.khakra.hooks

import React.RefObject
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event

public external interface UseOutsideClickOptions {
  public var ref: RefObject<HTMLElement>
  public var handler: (e: Event) -> Unit
}

/**
 * Example, used in components like Dialogs and Popovers so they can close
 * when a user clicks outside them.
 */
public external fun useOutsideClick(props: UseOutsideClickOptions)
