@file:JsModule("@chakra-ui/menu/dist/esm/use-menu")

package io.github.mpetuska.khakra.menu

import React.RefObject
import io.github.mpetuska.khakra.descendant.DescendantContext
import io.github.mpetuska.khakra.hooks.UseDisclosureProps
import io.github.mpetuska.khakra.popper.UsePopperProps
import io.github.mpetuska.khakra.popper.UsePopperReturn
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import react.RDispatch
import react.RProvider
import react.ReactElement

public external val MenuProvider: RProvider<UseMenuReturn>

public external fun useMenuContext(): UseMenuReturn

public external interface UseMenuProps : UsePopperProps, UseDisclosureProps {
  /**
   * If `true`, the menu will close when a menu item is
   * clicked
   *
   * @default true
   */
  public var closeOnSelect: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the menu will close when you click outside
   * the menu list
   *
   * @default true
   */
  public var closeOnBlur: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the first enabled menu item will receive focus and be selected
   * when the menu opens.
   *
   * @default true
   */
  public var autoSelect: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Performance 🚀:
   * If `true`, the MenuItem rendering will be deferred
   * until the menu is open.
   */
  public var isLazy: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React Hook to manage a menu
 *
 * It provides the logic and will be used with react context
 * to propagate its return value to all children
 */
public external fun useMenu(props: UseMenuProps): UseMenuReturn

public external interface UseMenuReturn {
  public var openAndFocusMenu: () -> Unit
  public var openAndFocusFirstItem: () -> Unit
  public var openAndFocusLastItem: () -> Unit
  public var onTransitionEnd: () -> Unit
  public var domContext: DescendantContext<HTMLDivElement>
  public var popper: UsePopperReturn
  public var buttonId: String
  public var menuId: String
  public var forceUpdate: (() -> Unit)?
  public var orientation: String
  public var isOpen: Boolean
  public var onToggle: () -> Unit
  public var onOpen: () -> Unit
  public var onClose: () -> Unit
  public var menuRef: RefObject<HTMLDivElement>
  public var buttonRef: RefObject<HTMLButtonElement>
  public var focusedIndex: Number
  public var closeOnSelect: Boolean
  public var closeOnBlur: Boolean
  public var autoSelect: Boolean
  public var setFocusedIndex: RDispatch<dynamic /* Number | (prevState: Number) -> Number */>
  public var isLazy: Boolean?
}

/**
 * type: `Omit<React.HTMLAttributes<Element>, "color">`
 */
public external interface UseMenuButtonProps

/**
 * React Hook to manage a menu button.
 *
 * The assumption here is that the `useMenu` hook is used
 * in a component higher up the tree, and its return value
 * is passed as `context` to this hook.
 */
public external fun useMenuButton(
  props: UseMenuButtonProps,
  externalRef: RefObject<Any>? = definedExternally
): dynamic

/**
 * type: `Omit<React.HTMLAttributes<Element>, "color"> {}`
 */
public external interface UseMenuListProps

/**
 * React Hook to manage a menu list.
 *
 * The assumption here is that the `useMenu` hook is used
 * in a component higher up the tree, and its return value
 * is passed as `context` to this hook.
 */
public external fun useMenuList(props: UseMenuListProps, ref: RefObject<Any>? = definedExternally): dynamic

public external fun useMenuPositioner(props: Any = definedExternally): dynamic

/**
 * type: `Omit<HTMLAttributes<Element>, "color">`
 */
public external interface UseMenuItemProps {
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var isFocusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun useMenuItem(props: UseMenuItemProps, externalRef: RefObject<Any>? = definedExternally): dynamic /* `T$44` | `T$45` */

public external interface UseMenuOptionOptions {
  public var value: String?
    get() = definedExternally
    set(value) = definedExternally
  public var isChecked: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  public var type: String? /* "radio" | "checkbox" */
    get() = definedExternally
    set(value) = definedExternally
  public var children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseMenuOptionProps : UseMenuItemProps, UseMenuOptionOptions

public external fun useMenuOption(props: UseMenuOptionProps, externalRef: RefObject<Any>? = definedExternally): dynamic /* `T$46` | `T$47` */

public external interface UseMenuOptionGroupProps {
  public var value: dynamic /* String? | Array<String>? */
    get() = definedExternally
    set(value) = definedExternally
  public var defaultValue: dynamic /* String? | Array<String>? */
    get() = definedExternally
    set(value) = definedExternally
  public var type: String? /* "radio" | "checkbox" */
    get() = definedExternally
    set(value) = definedExternally
  public var onChange: ((value: dynamic /* String | Array<String> */) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  public var children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseMenuOptionGroupReturn {
  public var children: Array<ReactElement>
}

public external fun useMenuOptionGroup(props: UseMenuOptionGroupProps): UseMenuOptionGroupReturn

public external interface UseMenuStateReturn {
  public var isOpen: Boolean
  public var onClose: () -> Unit
}

public external fun useMenuState(): UseMenuStateReturn
