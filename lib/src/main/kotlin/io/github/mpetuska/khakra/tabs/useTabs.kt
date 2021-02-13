@file:JsModule("@chakra-ui/tabs/dist/esm/use-tabs")

package io.github.mpetuska.khakra.tabs

import io.github.mpetuska.khakra.clickable.UseClickableProps
import io.github.mpetuska.khakra.clickable.UseClickableReturn
import io.github.mpetuska.khakra.descendant.DescendantContext
import kotlinext.js.Record
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import react.RDispatch
import react.RProps
import react.RProvider
import react.RReadableRef

public external interface UseTabsProps : RProps {
  /**
   * The orientation of the tab list.
   *
   * type: `"vertical" | "horizontal"`
   */
  public var orientation: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the tabs will be manually activated and
   * display its panel by pressing Space or Enter.
   *
   * If `false`, the tabs will be automatically activated
   * and their panel is displayed when they receive focus.
   */
  public var isManual: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback when the index (controlled or un-controlled) changes.
   */
  public var onChange: ((index: Int) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The index of the selected tab (in controlled mode)
   */
  public var index: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial index of the selected tab (in uncontrolled mode)
   */
  public var defaultIndex: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The id of the tab
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Performance 🚀:
   * If `true`, the TabPanel rendering will be deferred
   * until it is open.
   */
  public var isLazy: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Tabs hooks that provides all the states, and accessibility
 * helpers to keep all things working properly.
 *
 * Its returned object will be passed unto a Context Provider
 * so all child components can read from it.
 * There is no document link yet
 * @see Docs https://chakra-ui.com/docs/components/useTabs
 */
public external fun useTabs(props: UseTabsProps): UseTabsReturn

public external interface UseTabsReturnHtmlProps {
  public val id: String?
}

public external interface UseTabsContext {
  public val id: String
  public val selectedIndex: Int
  public val focusedIndex: Int
  public val setSelectedIndex: RDispatch<Int>
  public val setFocusedIndex: RDispatch<Int>
  public val isManual: Boolean
  public val isLazy: Boolean

  /**
   * type: `"vertical" | "horizontal"`
   */
  public val orientation: String
  public val enabledDomContext: dynamic
  public val domContext: DescendantContext<HTMLElement>
}

public external interface UseTabsReturn : UseTabsContext {
  public val htmlProps: UseTabsReturnHtmlProps
}

public external val TabsProvider: RProvider<UseTabsContext>
public external fun useTabsContext(): UseTabsContext

public external interface UseTabListProps : RProps {
  /**
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `React.KeyboardEvent<Element>`
   */
  public var onKeyDown: ((event: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  public var ref: RReadableRef<Any>?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Tabs hook to manage multiple tab buttons,
 * and ensures only one tab is selected per time.
 *
 * @param props props object for the tablist
 */
public external fun <P : UseTabListProps> useTabList(props: P): UseTabListReturn

public external interface UseTabListReturn : UseTabListProps {
  public val role: String?
}

public external interface UseTabOptions {
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally
  public var isSelected: String?
    get() = definedExternally
    set(value) = definedExternally
  public var panelId: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the `Tab` won't be toggleable
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseTabProps : UseClickableProps, UseTabOptions {
  /**
   * If `true`, the `Tab` won't be toggleable
   */
  public override var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Tabs hook to manage each tab button.
 *
 * A tab can be disabled and focusable, or both,
 * hence the use of `useClickable` to handle this scenario
 */
public external fun <P : UseTabProps> useTab(props: P): UseTabReturn

public external interface UseTabReturn : UseClickableReturn {
  public val id: String
  public val tabIndex: Int
  public val type: String

  /**
   * type: `React.KeyboardEvent<Element>`
   */
  public val onFocus: ((event: dynamic) -> Unit)?
}

public external interface UseTabPanelsProps {
  /**
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Tabs hook for managing the visibility of multiple tab panels.
 *
 * Since only one panel can be show at a time, we use `cloneElement`
 * to inject `selected` panel to each TabPanel.
 *
 * It returns a cloned version of its children with
 * all functionality included.
 */
public external fun <P : UseTabPanelsProps> useTabPanels(props: P): P

/**
 * Tabs hook for managing the visible/hidden states
 * of the tab panel.
 *
 * @param props props object for the tab panel
 */
public external fun useTabPanel(props: Record<String, Any>): UseTabPanelReturn

public external interface UseTabPanelReturn : Record<String, Any> {
  /**
   * Puts the tabpanel in the page `Tab` sequence.
   */
  public val tabIndex: Int
  public val children: Any?
  public val role: String
  public val hidden: Boolean
  public val id: Any
}

/**
 * Tabs hook to show an animated indicators that
 * follows the active tab.
 *
 * The way we do it is by measuring the DOM Rect (or dimensions)
 * of the active tab, and return that as CSS style for
 * the indicator.
 *
 * type: `React.CSSProperties`
 */
public external fun useTabIndicator(): dynamic
