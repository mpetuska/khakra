@file:JsModule("@chakra-ui/hooks/dist/esm/use-disclosure")

package io.github.mpetuska.khakra.hooks

public external interface UseDisclosureProps {
  public var isOpen: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var defaultIsOpen: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public val onClose: (() -> Unit)?
  public val onOpen: (() -> Unit)?
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseDisclosureReturn {
  public var isOpen: Boolean
  public var onOpen: () -> Unit
  public var onClose: () -> Unit
  public var onToggle: () -> Unit
  public var isControlled: Boolean
  public var getButtonProps: (props: Any) -> Any
  public var getDisclosureProps: (props: Any) -> Any
}

public external fun useDisclosure(props: UseDisclosureProps = definedExternally): UseDisclosureReturn
