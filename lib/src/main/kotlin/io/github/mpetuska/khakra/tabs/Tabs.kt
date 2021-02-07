@file:JsModule("@chakra-ui/tabs/dist/esm/tabs")

package io.github.mpetuska.khakra.tabs

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface TabsOptions {
  /**
   * If `true`, tabs will stretch to width of the tablist.
   */
  public var isFitted: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The alignment of the tabs
   *
   * type: `"start" | "end" | "center"`
   */
  public var align: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface TabsProps : UseTabsProps, ThemingProps, HTMLChakraProps, TabsOptions {
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The orientation of the tab list.
   *
   * type: `"vertical" | "horizontal"`
   */
  override var orientation: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Tabs
 *
 * Provides context and logic for all tabs components. It doesn't render
 * any DOM node.
 */
public external val Tabs: ComponentWithAs<TabsProps>

public external interface TabProps : UseTabOptions, HTMLChakraProps

/**
 * Tab button used to activate a specific tab panel. It renders a `button`,
 * and is responsible for automatic and manual selection modes.
 */
public external val Tab: ComponentWithAs<TabProps>

public external interface TabListProps : UseTabListProps, HTMLChakraProps

/**
 * TabList is used to manage a list of tab buttons. It renders a `div` by default,
 * and is responsible the keyboard interaction between tabs.
 */
public external val TabList: ComponentWithAs<TabListProps>

public external interface TabPanelProps : HTMLChakraProps

/**
 * TabPanel
 * Used to render the content for a specific tab.
 */
public external val TabPanel: ComponentWithAs<TabPanelProps>

public external interface TabPanelsProps : HTMLChakraProps

/**
 * TabPanel
 *
 * Used to manage the rendering of multiple tab panels. It uses
 * `cloneElement` to hide/show tab panels.
 *
 * It renders a `div` by default.
 */
public external val TabPanels: ComponentWithAs<TabPanelsProps>

public external interface TabIndicatorProps : HTMLChakraProps

/**
 * TabIndicator
 *
 * Used to render an active tab indicator that animates between
 * selected tabs.
 */
public external val TabIndicator: ComponentWithAs<TabIndicatorProps>
