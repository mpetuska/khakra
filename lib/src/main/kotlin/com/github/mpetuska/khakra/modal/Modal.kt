@file:JsModule("@chakra-ui/modal/dist/esm/modal")

package com.github.mpetuska.khakra.modal

import React.RefObject
import com.github.mpetuska.khakra.PortalPropsBase
import com.github.mpetuska.khakra.closeButton.CloseButtonProps
import com.github.mpetuska.khakra.focusLock.FocusLockProps
import com.github.mpetuska.khakra.system.ChakraProps
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import com.github.mpetuska.khakra.utils.FocusableElement
import react.RClass
import react.RProps
import react.RProvider

public external interface ModalOptions : FocusLockProps {
  /**
   * If `false`, focus lock will be disabled completely.
   *
   * This is useful in situations where you still need to interact with
   * other surrounding elements.
   *
   * 🚨Warning: We don't recommend doing this because it hurts the
   * accessibility of the modal, based on WAI-ARIA specifications.
   *
   * @default true
   */
  public var trapFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the modal will autofocus the first enabled and interactive
   * element within the `ModalContent`
   *
   * @default true
   */
  public override var autoFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `ref` of element to receive focus when the modal opens.
   */
  public override var initialFocusRef: RefObject<FocusableElement>?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `ref` of element to receive focus when the modal closes.
   */
  public override var finalFocusRef: RefObject<FocusableElement>?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the modal will return focus to the element that triggered it when it closes.
   * @default true
   */
  public var returnFocusOnClose: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, scrolling will be disabled on the `body` when the modal opens.
   *  @default true
   */
  public var blockScrollOnMount: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Handle zoom/pinch gestures on iOS devices when scroll locking is enabled.
   * Defaults to `false`.
   */
  public var allowPinchZoom: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, a `padding-right` will be applied to the body element
   * that's equal to the width of the scrollbar.
   *
   * This can help prevent some unpleasant flickering effect
   * and content adjustment when the modal opens
   */
  public var preserveScrollBarGap: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ModalProps : UseModalProps, ModalOptions, ThemingProps {
  /**
   *  If `true`, the modal will be centered on screen.
   * @default false
   */
  public var isCentered: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Where scroll behavior should originate.
   * - If set to `inside`, scroll only occurs within the `ModalBody`.
   * - If set to `outside`, the entire `ModalContent` will scroll within the viewport.
   *
   * @default "outside"
   *
   * type: `"inside" | "outside"`
   */
  public var scrollBehavior: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Props to be forwarded to the portal component
   */
  public var portalProps: PortalPropsBase?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The transition that should be used for the modal
   *
   * type: `"slideInBottom" | "slideInRight" | "scale" | "none"`
   */
  public var motionPreset: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ModalContext : ModalOptions, UseModalReturn {
  /**
   * The transition that should be used for the modal
   *
   * type: `"slideInBottom" | "slideInRight" | "scale" | "none"`
   */
  public var motionPreset: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external val ModalContextProvider: RProvider<ModalContext>

public external fun useModalContext(): ModalContext

/**
 * Modal provides context, theming, and accessibility properties
 * to all other modal components.
 *
 * It doesn't render any DOM node.
 */
public external val Modal: RClass<ModalProps>

public external interface ModalContentProps : HTMLChakraProps {
  /**
   * The props to forward to the modal's content wrapper
   */
  public var containerProps: HTMLChakraProps?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * ModalContent is used to group modal's content. It has all the
 * necessary `aria-*` properties to indicate that it is a modal
 */
public external val ModalContent: ComponentWithAs<ModalContentProps>

public external interface ModalFocusScopeProps : RProps {
  /**
   * @type React.ReactElement
   */
  public var children: dynamic
}

public external val ModalFocusScope: RClass<ModalFocusScopeProps>

public external interface ModalOverlayProps : ChakraProps {
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * ModalOverlay renders a backdrop behind the modal. It is
 * also used as a wrapper for the modal content for better positioning.
 *
 * @see Docs https://chakra-ui.com/docs/overlay/modal
 */
public external val ModalOverlay: ComponentWithAs<ModalOverlayProps>

public external interface ModalHeaderProps : HTMLChakraProps

/**
 * ModalHeader
 *
 * React component that houses the title of the modal.
 *
 * @see Docs https://chakra-ui.com/docs/components/modal
 */
public external val ModalHeader: ComponentWithAs<ModalHeaderProps>

public external interface ModalBodyProps : HTMLChakraProps

/**
 * ModalBody
 *
 * React component that houses the main content of the modal.
 *
 * @see Docs https://chakra-ui.com/docs/components/modal
 */
public external val ModalBody: ComponentWithAs<ModalBodyProps>

public external interface ModalFooterProps : HTMLChakraProps

/**
 * ModalFooter houses the action buttons of the modal.
 * @see Docs https://chakra-ui.com/docs/components/modal
 */
public external val ModalFooter: ComponentWithAs<ModalFooterProps>

/**
 * ModalCloseButton is used closes the modal.
 *
 * You don't need to pass the `onClick` to it, it reads the
 * `onClose` action from the modal context.
 */
public external val ModalCloseButton: ComponentWithAs<CloseButtonProps>
