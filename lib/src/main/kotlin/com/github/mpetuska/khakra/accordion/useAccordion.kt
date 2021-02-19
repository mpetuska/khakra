@file:JsModule("@chakra-ui/accordion/dist/esm/use-accordion")

package com.github.mpetuska.khakra.accordion

import com.github.mpetuska.khakra.descendant.DescendantContext
import org.w3c.dom.HTMLElement
import react.RDispatch
import react.RProps
import react.RProvider
import react.RRef

public external interface UseAccordionProps : RProps {
  /**
   * If `true`, multiple accordion items can be expanded at once.
   */
  public var allowMultiple: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, any expanded accordion item can be collapsed again.
   */
  public var allowToggle: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The index(es) of the expanded accordion item
   *
   * type: `number | number[]`
   */
  public var index: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial index(es) of the expanded accordion item
   *
   * type: `number | number[]`
   */
  public var defaultIndex: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The callback invoked when accordion items are expanded or collapsed.
   */
  public var onChange: ((expandedIndex: dynamic /* number | number[] */) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * useAccordion hook provides all the state and focus management logic
 * for accordion items.
 */
public external fun useAccordion(props: UseAccordionProps): UseAccordionReturn

public external interface UseAccordionReturn : UseAccordionReturnBase {
  public var htmlProps: Any
}

public external interface UseAccordionReturnBase {
  /**
   * type: `number | number[]`
   */
  public var index: dynamic
  public var setIndex: RDispatch<dynamic /* number | number[] */>
  public var getAccordionItemProps: (idx: Int?) -> GetAccordionItemProps
  public var focusedIndex: Int
  public var setFocusedIndex: RDispatch<Int>
  public var domContext: DescendantContext<HTMLElement>
}

public external interface GetAccordionItemProps : RProps {
  public var isOpen: Boolean
  public var onChange: (isOpen: Boolean) -> Unit
}

public external interface AccordionContext : UseAccordionReturnBase {
  public var reduceMotion: Boolean
}

public external val AccordionProvider: RProvider<AccordionContext>
public external val useAccordionContext: () -> AccordionContext

public external interface UseAccordionItemProps : RProps {
  /**
   * If `true`, the accordion item will be disabled.
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the accordion item will be focusable.
   */
  public var isFocusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * A unique id for the accordion item.
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * useAccordionItem
 *
 * React hook that provides the open/close functionality
 * for an accordion item and its children
 */
public external fun useAccordionItem(props: UseAccordionItemProps): UseAccordionItemReturn

public external interface UseAccordionItemReturn : UseAccordionItemReturnBase {
  public val htmlProps: Any
}

public external interface UseAccordionItemReturnBase {
  public val isOpen: Boolean
  public val isDisabled: Boolean?
  public val isFocusable: Boolean?
  public val onOpen: () -> Unit
  public val onClose: () -> Unit
  public val getButtonProps: (props: dynamic, ref: RRef?) -> dynamic
  public val getPanelProps: (props: dynamic, ref: RRef?) -> dynamic
}
