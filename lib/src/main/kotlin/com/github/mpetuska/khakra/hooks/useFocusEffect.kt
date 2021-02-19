@file:JsModule("@chakra-ui/hooks/dist/esm/use-focus-effect")

package com.github.mpetuska.khakra.hooks

import React.RefObject
import org.w3c.dom.HTMLElement

public external interface UseFocusEffectOptions {
  public var shouldFocus: Boolean
  public var preventScroll: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun <T : HTMLElement> useFocusEffect(ref: RefObject<T>, options: UseFocusEffectOptions)
