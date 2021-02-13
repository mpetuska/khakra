package io.github.mpetuska.khakra.modal

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.closeButton.CloseButtonProps
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProviderProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.AlertDialog(
  noinline props: Builder<AlertDialogProps> = {},
  crossinline block: Builder<RElementBuilder<AlertDialogProps>> = {},
): ReactElement = KhakraComponent(AlertDialog, props, block)

@KhakraDSL
public inline fun RBuilder.AlertDialogContent(
  noinline props: Builder<ModalContentProps> = {},
  crossinline block: Builder<RElementBuilder<ModalContentProps>> = {},
): ReactElement = KhakraComponent(AlertDialogContent, props, block)

@KhakraDSL
public inline fun RBuilder.Drawer(
  noinline props: Builder<DrawerProps> = {},
  crossinline block: Builder<RElementBuilder<DrawerProps>> = {},
): ReactElement = KhakraComponent(Drawer, props, block)

@KhakraDSL
public inline fun RBuilder.DrawerContent(
  noinline props: Builder<DrawerContentProps> = {},
  crossinline block: Builder<RElementBuilder<DrawerContentProps>> = {},
): ReactElement = KhakraComponent(DrawerContent, props, block)

@KhakraDSL
public inline fun RBuilder.ModalContextProvider(
  noinline props: Builder<RProviderProps<ModalContext>> = {},
  crossinline block: Builder<RElementBuilder<RProviderProps<ModalContext>>> = {},
): ReactElement = KhakraComponent(ModalContextProvider, props, block)

@KhakraDSL
public inline fun RBuilder.Modal(
  noinline props: Builder<ModalProps> = {},
  crossinline block: Builder<RElementBuilder<ModalProps>> = {},
): ReactElement = KhakraComponent(Modal, props, block)

@KhakraDSL
public inline fun RBuilder.ModalContent(
  noinline props: Builder<ModalContentProps> = {},
  crossinline block: Builder<RElementBuilder<ModalContentProps>> = {},
): ReactElement = KhakraComponent(ModalContent, props, block)

@KhakraDSL
public inline fun RBuilder.ModalFocusScope(
  noinline props: Builder<ModalFocusScopeProps> = {},
  crossinline block: Builder<RElementBuilder<ModalFocusScopeProps>> = {},
): ReactElement = KhakraComponent(ModalFocusScope, props, block)

@KhakraDSL
public inline fun RBuilder.ModalOverlay(
  noinline props: Builder<ModalOverlayProps> = {},
  crossinline block: Builder<RElementBuilder<ModalOverlayProps>> = {},
): ReactElement = KhakraComponent(ModalOverlay, props, block)

@KhakraDSL
public inline fun RBuilder.ModalHeader(
  noinline props: Builder<ModalHeaderProps> = {},
  crossinline block: Builder<RElementBuilder<ModalHeaderProps>> = {},
): ReactElement = KhakraComponent(ModalHeader, props, block)

@KhakraDSL
public inline fun RBuilder.ModalBody(
  noinline props: Builder<ModalBodyProps> = {},
  crossinline block: Builder<RElementBuilder<ModalBodyProps>> = {},
): ReactElement = KhakraComponent(ModalBody, props, block)

@KhakraDSL
public inline fun RBuilder.ModalFooter(
  noinline props: Builder<ModalFooterProps> = {},
  crossinline block: Builder<RElementBuilder<ModalFooterProps>> = {},
): ReactElement = KhakraComponent(ModalFooter, props, block)

@KhakraDSL
public inline fun RBuilder.ModalCloseButton(
  noinline props: Builder<CloseButtonProps> = {},
  crossinline block: Builder<RElementBuilder<CloseButtonProps>> = {},
): ReactElement = KhakraComponent(ModalCloseButton, props, block)

@KhakraDSL
public inline fun RBuilder.ModalTransition(
  noinline props: Builder<ModalTransitionProps> = {},
  crossinline block: Builder<RElementBuilder<ModalTransitionProps>> = {},
): ReactElement = KhakraComponent(ModalTransition, props, block)
