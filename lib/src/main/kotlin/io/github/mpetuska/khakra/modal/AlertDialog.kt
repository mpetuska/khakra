@file:JsModule("@chakra-ui/modal/dist/esm/drawer")

package io.github.mpetuska.khakra.modal

import io.github.mpetuska.khakra.system.ComponentWithAs
import react.RClass

public external interface AlertDialogProps : ModalProps {
  public var leastDestructiveRef: Any
}

public external val AlertDialog: RClass<AlertDialogProps>

public external val AlertDialogContent: ComponentWithAs<ModalContentProps>
