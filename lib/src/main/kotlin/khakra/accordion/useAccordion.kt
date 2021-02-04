@file:JsModule("@chakra-ui/accordion/dist/esm/use-accordion")

package khakra.accordion

import react.*

public external interface UseAccordionProps : RProps {
  /**
   * If `true`, multiple accordion items can be expanded at once.
   */
  public var allowMultiple: Boolean?
  
  /**
   * If `true`, any expanded accordion item can be collapsed again.
   */
  public var allowToggle: Boolean?
  
  /**
   * The index(es) of the expanded accordion item
   */
  public var index: ExpandedIndex?
  
  /**
   * The initial index(es) of the expanded accordion item
   */
  public var defaultIndex: ExpandedIndex?
  
  /**
   * The callback invoked when accordion items are expanded or collapsed.
   */
  public var onChange: ((expandedIndex: ExpandedIndex) -> Unit)?
}

public external interface GetAccordionItemProps : RProps {
  public var isOpen: Boolean
  public var onChange: (isOpen: Boolean) -> Unit
}

public external interface UseAccordionReturn : UseAccordionReturnBase {
  public var htmlProps: dynamic
}

public external interface UseAccordionReturnBase {
  public var index: dynamic
  public var setIndex: (dynamic) -> Unit
  public var getAccordionItemProps: (idx: Int?) -> GetAccordionItemProps
  public var focusedIndex: dynamic
  public var setFocusedIndex: (dynamic) -> Unit
  public var domContext: dynamic
}

/**
 * useAccordion hook provides all the state and focus management logic
 * for accordion items.
 */
public external fun useAccordion(props: UseAccordionProps): UseAccordionReturn

public external interface AccordionContext : UseAccordionReturnBase {
  public var reduceMotion: Boolean
}

public external val AccordionProvider: dynamic
public external val useAccordionContext: dynamic

public external interface UseAccordionItemProps : RProps {
  /**
   * If `true`, the accordion item will be disabled.
   */
  public var isDisabled: Boolean?
  
  /**
   * If `true`, the accordion item will be focusable.
   */
  public var isFocusable: Boolean?
  
  /**
   * A unique id for the accordion item.
   */
  public var id: String?
}

/**
 * useAccordionItem
 *
 * React hook that provides the open/close functionality
 * for an accordion item and its children
 */
public external fun useAccordionItem(props: UseAccordionItemProps): UseAccordionItemReturn

public external interface UseAccordionItemReturn: UseAccordionItemReturnBase {
  public val htmlProps: dynamic
}

public external interface UseAccordionItemReturnBase {
  public val isOpen: Boolean
  public val isDisabled: Boolean?
  public val isFocusable: Boolean?
  public val onOpen: () -> Unit
  public val onClose: () -> Unit
  public val getButtonProps: dynamic
  public val getPanelProps: dynamic
}
