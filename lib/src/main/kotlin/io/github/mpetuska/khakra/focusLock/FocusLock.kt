@file:JsModule("@chakra-ui/focus-lock/dist/esm/index")

package io.github.mpetuska.khakra.focusLock

import react.RClass
import react.RProps

public external interface FocusLockProps : RProps {
  /**
   * `ref` of the element to receive focus initially
   *
   * type: `React.RefObject<FocusableElement>`
   */
  public var initialFocusRef: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * `ref` of the element to return focus to when `FocusLock`
   * unmounts
   *
   * type: `React.RefObject<FocusableElement>`
   */
  public var finalFocusRef: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `ref` of the wrapper for which the focus-lock wraps
   *
   * type: `React.RefObject<HTMLElement>`
   */
  public var contentRef: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, focus will be restored to the element that
   * triggered the `FocusLock` once it unmounts
   */
  public var restoreFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The component to render
   *
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, focus trapping will be disabled
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the first focuable element within the `children`
   * will ne auto-focused once `FocusLock` mounts
   */
  public var autoFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, disables text selections inside, and outside focus lock.
   * @default `false`
   */
  public var persistentFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Enables aggressive focus capturing within iframes.
   * - If `true`: keep focus in the lock, no matter where lock is active
   * - If `false`:  allows focus to move outside of iframe
   */
  public var lockFocusAcrossFrames: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val FocusLock: RClass<FocusLockProps>
