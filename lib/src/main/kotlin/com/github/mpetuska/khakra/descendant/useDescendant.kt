@file:JsModule("@chakra-ui/descendant/dist/esm/use-descendant")

package com.github.mpetuska.khakra.descendant

import org.w3c.dom.HTMLElement
import react.RProps

public external interface Descendant<T : HTMLElement> {
  public var element: T?
    get() = definedExternally
    set(value) = definedExternally
  public var index: Int?
    get() = definedExternally
    set(value) = definedExternally
  public var disabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var focusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface DescendantContext<T : HTMLElement> {
  public val descendants: Array<Descendant<T>>
  public fun register(descendant: Descendant<T>)
  public fun unregister(element: T)
}

public external interface UseDescendantProps<T : HTMLElement> : RProps, Descendant<T> {
  public var context: DescendantContext<T>?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun <T : HTMLElement> useDescendant(props: UseDescendantProps<T>): Int

public external fun <T : HTMLElement> useDescendants(): DescendantContext<T>
