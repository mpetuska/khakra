@file:JsModule("@chakra-ui/hooks/dist/esm/use-shortcut")

package com.github.mpetuska.khakra.hooks

import React.KeyboardEvent
import org.w3c.dom.Element

public external interface UseShortcutProps {
  public var timeout: Number?
    get() = definedExternally
    set(value) = definedExternally
  public var preventDefault: ((event: KeyboardEvent<Element>) -> Boolean)?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React hook that provides an enhanced keydown handler,
 * that's used for key navigation within menus, select dropdowns.
 */
public external fun useShortcut(props: UseShortcutProps = definedExternally): (fn: (keysSoFar: String) -> Unit) -> (event: KeyboardEvent<Element>) -> Unit
