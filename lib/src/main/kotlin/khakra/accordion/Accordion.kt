@file:JsModule("@chakra-ui/accordion/dist/esm/accordion")
package khakra.accordion

import khakra.*
import kotlinx.html.*
import react.*

public external interface AccordionProps : UseAccordionProps, AccordionChakraHtml, ThemingProps {
  /**
   * If `true`, height animation and transitions will be disabled.
   */
  public var reduceMotion: Boolean?
}

/**
 * The wrapper that provides context and focus management
 * for all accordion items.
 *
 * It wraps all accordion items in a `div` for better grouping.
 * @see Docs https://chakra-ui.com/docs/components/accordion
 */
public external val Accordion: RClass<AccordionProps>

public external interface AccordionItemProps : UseAccordionItemProps {
  public var children: dynamic
}

/**
 * AccordionItem is a single accordion that provides the open-close
 * behavior when the accordion button is clicked.
 *
 * It also provides context for the accordion button and panel.
 */
public external val AccordionItem: RClass<AccordionItemProps>


/**
 * React hook to get the state and actions of an accordion item
 */
public external fun useAccordionItemState(): UseAccordionItemReturnBase

public external interface AccordionButtonProps : RProps

/**
 * AccordionButton is used expands and collapses an accordion item.
 * It must be a child of `AccordionItem`.
 *
 * Note 🚨: Each accordion button must be wrapped in an heading tag,
 * that is appropriate for the information architecture of the page.
 */
public external val AccordionButton: RClass<AccordionButtonProps>

public external interface AccordionPanelProps : RProps

/**
 * Accordion panel that holds the content for each accordion.
 * It shows and hides based on the state login from the `AccordionItem`.
 *
 * It uses the `Collapse` component to animate its height.
 */
public external val AccordionPanel: RClass<AccordionPanelProps>

/**
 * AccordionIcon that gives a visual cue of the open/close state of the accordion item.
 * It rotates `180deg` based on the open/close state.
 */
public external val AccordionIcon: RClass<IconProps>
