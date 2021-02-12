@file:JsModule("@chakra-ui/modal/dist/esm/modal-manager")

package io.github.mpetuska.khakra.modal

import react.RReadableRef

/**
 * Proper state management for nested modals.
 * Simplified, but inspired by material-ui's ModalManager class.
 */
public external class ModalManager {
  public var modals: Array<Any>
  public fun add(modal: Any)
  public fun remove(modal: Any)
  public fun isTopModal(modal: Any): Boolean
}

public external val manager: ModalManager

public external fun useModalManager(
  ref: RReadableRef<Any>,
  isOpen: Boolean = definedExternally,
)
