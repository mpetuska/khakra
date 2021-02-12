@file:JsModule("@chakra-ui/modal/dist/esm/drawer")

package io.github.mpetuska.khakra.modal

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import react.RClass

public external interface DrawerProps : ModalProps {
  /**
   * The placement of the drawer
   *
   * type: `"bottom" | "top" | "left" | "right"`
   */
  public var placement: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true` and drawer's placement is `top` or `bottom`,
   * the drawer will occupy the viewport height (100vh)
   */
  public var isFullHeight: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val Drawer: RClass<DrawerProps>

public external interface DrawerContentProps : HTMLChakraProps

/**
 * ModalContent is used to group modal's content. It has all the
 * necessary `aria-*` properties to indicate that it is a modal
 */
public external val DrawerContent: ComponentWithAs<DrawerContentProps>
