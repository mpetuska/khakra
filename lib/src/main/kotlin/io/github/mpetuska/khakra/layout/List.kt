@file:JsModule("@chakra-ui/layout/dist/esm/list")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface ListOptions {
  /**
   * Short hand prop for `listStyleType`
   * @type SystemProps["listStyleType"]
   */
  public var styleType: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Short hand prop for `listStylePosition`
   * @type SystemProps["listStylePosition"]
   */
  public var stylePosition: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The space between each list item
   * @type SystemProps["margin"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ListProps : HTMLChakraProps, ThemingProps, ListOptions

/**
 * List is used to display list items, it renders a `<ul>` by default.
 *
 * @see Docs https://chakra-ui.com/docs/data-display/list
 */
public external val List: ComponentWithAs<ListProps>
public external val OrderedList: ComponentWithAs<ListProps>
public external val UnorderedList: ComponentWithAs<ListProps>

public external interface ListItemProps : HTMLChakraProps

/**
 * ListItem
 *
 * Used to render a list item
 */
public external val ListItem: ComponentWithAs<ListItemProps>

/**
 * ListIcon
 *
 * Used to render an icon beside the list item text
 */
public external val ListIcon: ComponentWithAs<IconProps>
