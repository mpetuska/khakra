@file:JsModule("react")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "PackageDirectoryMismatch", "PackageDirectoryMismatch", "PackageName")

package React

import org.w3c.dom.events.EventTarget
import org.w3c.dom.events.KeyboardEvent as NativeKeyboardEvent

public external interface RefObject<T> {
  public var current: T?
}

public external interface MutableRefObject<T> {
  public var current: T
}

public external interface BaseSyntheticEvent<E, C, T> {
  public var nativeEvent: E
  public var currentTarget: C
  public var target: T
  public var bubbles: Boolean
  public var cancelable: Boolean
  public var defaultPrevented: Boolean
  public var eventPhase: Number
  public var isTrusted: Boolean
  public fun preventDefault()
  public fun isDefaultPrevented(): Boolean
  public fun stopPropagation()
  public fun isPropagationStopped(): Boolean
  public fun persist()
  public var timeStamp: Number
  public var type: String
}

public external interface SyntheticEvent<T, E> : BaseSyntheticEvent<E, EventTarget /* EventTarget & T */, EventTarget>

public external interface KeyboardEvent<T> : SyntheticEvent<T, NativeKeyboardEvent> {
  public var altKey: Boolean
  public var charCode: Number
  public var ctrlKey: Boolean
  public var code: String
  public fun getModifierState(key: String): Boolean
  public var key: String
  public var keyCode: Number
  public var locale: String
  public var location: Number
  public var metaKey: Boolean
  public var repeat: Boolean
  public var shiftKey: Boolean
  public var which: Number
}
