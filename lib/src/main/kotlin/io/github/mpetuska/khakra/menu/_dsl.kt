package io.github.mpetuska.khakra.menu

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.system.HTMLChakraProps
import react.RBuilder
import react.RElementBuilder
import react.RProviderProps
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Menu(
  noinline props: Builder<MenuProps> = {},
  crossinline block: Builder<RElementBuilder<MenuProps>> = {},
): ReactElement = KhakraComponent(Menu, props, block)

@KhakraDSL
public inline fun RBuilder.MenuButton(
  noinline props: Builder<MenuButtonProps> = {},
  crossinline block: Builder<RElementBuilder<MenuButtonProps>> = {},
): ReactElement = KhakraComponent(MenuButton, props, block)

@KhakraDSL
public inline fun RBuilder.MenuList(
  noinline props: Builder<MenuListProps> = {},
  crossinline block: Builder<RElementBuilder<MenuListProps>> = {},
): ReactElement = KhakraComponent(MenuList, props, block)

@KhakraDSL
public inline fun RBuilder.MenuItem(
  noinline props: Builder<MenuItemProps> = {},
  crossinline block: Builder<RElementBuilder<MenuItemProps>> = {},
): ReactElement = KhakraComponent(MenuItem, props, block)

@KhakraDSL
public inline fun RBuilder.MenuItemOption(
  noinline props: Builder<MenuItemOptionProps> = {},
  crossinline block: Builder<RElementBuilder<MenuItemOptionProps>> = {},
): ReactElement = KhakraComponent(MenuItemOption, props, block)

@KhakraDSL
public inline fun RBuilder.MenuOptionGroup(
  noinline props: Builder<MenuOptionGroupProps> = {},
  crossinline block: Builder<RElementBuilder<MenuOptionGroupProps>> = {},
): ReactElement = KhakraComponent(MenuOptionGroup, props, block)

@KhakraDSL
public inline fun RBuilder.MenuGroup(
  noinline props: Builder<MenuGroupProps> = {},
  crossinline block: Builder<RElementBuilder<MenuGroupProps>> = {},
): ReactElement = KhakraComponent(MenuGroup, props, block)

@KhakraDSL
public inline fun RBuilder.MenuCommand(
  noinline props: Builder<MenuCommandProps> = {},
  crossinline block: Builder<RElementBuilder<MenuCommandProps>> = {},
): ReactElement = KhakraComponent(MenuCommand, props, block)

@KhakraDSL
public inline fun RBuilder.MenuIcon(
  noinline props: Builder<HTMLChakraProps> = {},
  crossinline block: Builder<RElementBuilder<HTMLChakraProps>> = {},
): ReactElement = KhakraComponent(MenuIcon, props, block)

@KhakraDSL
public inline fun RBuilder.MenuDivider(
  noinline props: Builder<MenuDividerProps> = {},
  crossinline block: Builder<RElementBuilder<MenuDividerProps>> = {},
): ReactElement = KhakraComponent(MenuDivider, props, block)

@KhakraDSL
public inline fun RBuilder.MenuProvider(
  noinline props: Builder<RProviderProps<UseMenuReturn>> = {},
  crossinline block: Builder<RElementBuilder<RProviderProps<UseMenuReturn>>> = {},
): ReactElement = KhakraComponent(MenuProvider, props, block)
