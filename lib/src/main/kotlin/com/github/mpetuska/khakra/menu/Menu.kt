@file:JsModule("@chakra-ui/menu/dist/esm/menu")

package com.github.mpetuska.khakra.menu

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RClass
import react.ReactElement

public external interface MenuProps : UseMenuProps, ThemingProps {
  public var children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? | ((props: `T$0`) -> dynamic)? */
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Menu provides context, state, and focus management
 * to its sub-components. It doesn't render any DOM node.
 */
public external val Menu: RClass<MenuProps>

public external interface MenuButtonProps : HTMLChakraProps

/**
 * The trigger for the menu list. Must be a direct child of `Menu`.
 */
public external val MenuButton: ComponentWithAs<MenuButtonProps>

public external interface MenuListProps : HTMLChakraProps {
  public var rootProps: HTMLChakraProps?
    get() = definedExternally
    set(value) = definedExternally
}

public external val MenuList: ComponentWithAs<MenuListProps>

public external interface StyledMenuItemProps : HTMLChakraProps

public external interface MenuItemOptions : UseMenuItemProps {

  /**
   * The icon to render before the menu item's label.
   * @type React.ReactElement
   */
  public var icon: ReactElement?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The spacing between the icon and menu item's label.
   * @type SystemProps["mr"]
   */
  public var iconSpacing: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Right-aligned label text content, useful for displaying hotkeys.
   */
  public var command: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The spacing between the command and menu item's label.
   * @type SystemProps["ml"]
   */
  public var commandSpacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface MenuItemProps : HTMLChakraProps, MenuItemOptions

public external val MenuItem: ComponentWithAs<MenuItemProps>

public external interface MenuItemOptionProps : UseMenuOptionOptions, MenuItemProps

public external var MenuItemOption: ComponentWithAs<MenuItemOptionProps>

public external interface MenuOptionGroupProps : UseMenuOptionGroupProps, MenuGroupProps

public external var MenuOptionGroup: RClass<MenuOptionGroupProps>

public external interface MenuGroupProps : HTMLChakraProps

public external var MenuGroup: ComponentWithAs<MenuGroupProps>

public external interface MenuCommandProps : HTMLChakraProps

public external var MenuCommand: ComponentWithAs<MenuCommandProps>

public external var MenuIcon: RClass<HTMLChakraProps>

public external interface MenuDividerProps : HTMLChakraProps

public external var MenuDivider: RClass<MenuDividerProps>
