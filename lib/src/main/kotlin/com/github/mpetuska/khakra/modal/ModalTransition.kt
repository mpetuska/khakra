@file:JsModule("@chakra-ui/modal/dist/esm/modal-transition")

package com.github.mpetuska.khakra.modal

import com.github.mpetuska.khakra.system.ChakraProps
import react.RClass

public external interface ModalTransitionProps : ChakraProps {
  /**
   * type: `"slideInBottom" | "slideInRight" | "scale" | "none"`
   */
  public var preset: String
}

public external val ModalTransition: RClass<ModalTransitionProps>
