@file:JsModule("@chakra-ui/hooks/dist/esm/use-focus-on-show")

package com.github.mpetuska.khakra.hooks

import React.RefObject
import com.github.mpetuska.khakra.utils.FocusableElement
import org.w3c.dom.HTMLElement

public external interface UseFocusOnShowOptions {
  public var visible: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var shouldFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var preventScroll: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var focusRef: RefObject<FocusableElement>?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun <T : HTMLElement> useFocusOnShow(target: RefObject<T>, options: UseFocusOnShowOptions = definedExternally)

public external fun <T : HTMLElement> useFocusOnShow(target: RefObject<T>)

public external fun <T : HTMLElement> useFocusOnShow(target: T, options: UseFocusOnShowOptions = definedExternally)

public external fun <T : HTMLElement> useFocusOnShow(target: T)
