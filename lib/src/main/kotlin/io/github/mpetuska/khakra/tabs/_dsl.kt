package io.github.mpetuska.khakra.tabs

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.kt.get
import react.RBuilder
import react.RElementBuilder
import react.RProviderProps
import react.ReactElement

/**
 * type: `"vertical" | "horizontal"`
 */
public val UseTabListReturn.ariaOrientation: String
  get() = this["aria-orientation"]

public val UseTabReturn.ariaSelected: Boolean
  get() = this["aria-selected"]

public val UseTabReturn.ariaControls: String
  get() = this["aria-controls"]

@KhakraDSL
public inline fun RBuilder.Tabs(
  noinline props: Builder<TabsProps> = {},
  crossinline block: Builder<RElementBuilder<TabsProps>> = {},
): ReactElement = KhakraComponent(Tabs, props, block)

@KhakraDSL
public inline fun RBuilder.Tab(
  noinline props: Builder<TabProps> = {},
  crossinline block: Builder<RElementBuilder<TabProps>> = {},
): ReactElement = KhakraComponent(Tab, props, block)

@KhakraDSL
public inline fun RBuilder.TabList(
  noinline props: Builder<TabListProps> = {},
  crossinline block: Builder<RElementBuilder<TabListProps>> = {},
): ReactElement = KhakraComponent(TabList, props, block)

@KhakraDSL
public inline fun RBuilder.TabPanel(
  noinline props: Builder<TabPanelProps> = {},
  crossinline block: Builder<RElementBuilder<TabPanelProps>> = {},
): ReactElement = KhakraComponent(TabPanel, props, block)

@KhakraDSL
public inline fun RBuilder.TabPanels(
  noinline props: Builder<TabPanelsProps> = {},
  crossinline block: Builder<RElementBuilder<TabPanelsProps>> = {},
): ReactElement = KhakraComponent(TabPanels, props, block)

@KhakraDSL
public inline fun RBuilder.TabIndicator(
  noinline props: Builder<TabIndicatorProps> = {},
  crossinline block: Builder<RElementBuilder<TabIndicatorProps>> = {},
): ReactElement = KhakraComponent(TabIndicator, props, block)

@KhakraDSL
public inline fun RBuilder.TabsProvider(
  noinline props: Builder<RProviderProps<UseTabsContext>> = {},
  crossinline block: Builder<RElementBuilder<RProviderProps<UseTabsContext>>> = {},
): ReactElement = KhakraComponent(TabsProvider, props, block)
