@file:JsModule("@chakra-ui/modal/dist/esm/use-modal")

package com.github.mpetuska.khakra.modal

import React.RefObject
import org.w3c.dom.HTMLElement
import react.RDispatch

public external interface UseModalProps {
  /**
   * If `true`, the modal will be open.
   */
  public var isOpen: Boolean

  /**
   * The `id` of the modal
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback invoked to close the modal.
   */
  public var onClose: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the modal will close when the overlay is clicked
   * @default true
   */
  public var closeOnOverlayClick: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the modal will close when the `Esc` key is pressed
   * @default true
   */
  public var closeOnEsc: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback fired when the overlay is clicked.
   */
  public var onOverlayClick: (() -> Unit)?

  /**
   * Callback fired when the escape key is pressed and focus is within modal
   */
  public var onEsc: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * A11y: If `true`, the siblings of the `modal` will have `aria-hidden`
   * set to `true` so that screen readers can only see the `modal`.
   *
   * This is commonly known as making the other elements **inert**
   *
   *  @default true
   */
  public var useInert: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun useModal(props: UseModalProps): UseModalReturn

public external interface UseModalReturn {
  public val isOpen: Boolean
  public val onClose: () -> Unit
  public val headerId: String
  public val bodyId: String
  public val setBodyMounted: RDispatch<Boolean>
  public val setHeaderMounted: RDispatch<Boolean>
  public val dialogRef: RefObject<HTMLElement>
  public val overlayRef: RefObject<HTMLElement>
  public fun getDialogProps(
    props: dynamic = kotlin.js.definedExternally,
    ref: dynamic = kotlin.js.definedExternally
  ): dynamic

  public fun getDialogContainerProps(
    props: dynamic = kotlin.js.definedExternally,
    ref: dynamic = kotlin.js.definedExternally
  ): dynamic
}

/**
 * Modal hook to polyfill `aria-modal`.
 *
 * It applies `aria-hidden` to elements behind the modal
 * to indicate that they're `inert`.
 *
 * @param ref React ref of the node
 * @param shouldHide whether `aria-hidden` should be applied
 */
public external fun useAriaHidden(ref: RefObject<HTMLElement>, shouldHide: Boolean)
