@file:JsModule("@chakra-ui/breadcrumb/dist/esm/breadcrumb")

package com.github.mpetuska.khakra.breadcrumb

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface BreadcrumbSeparatorProps : HTMLChakraProps {
  /**
   * @type SystemProps["mx"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React component that separates each breadcrumb link
 */
public external val BreadcrumbSeparator: ComponentWithAs<BreadcrumbSeparatorProps>

public external interface BreadcrumbLinkProps : HTMLChakraProps {
  public var isCurrentPage: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Breadcrumb link.
 *
 * It renders a `span` when it matches the current link. Otherwise,
 * it renders an anchor tag.
 */
public external val BreadcrumbLink: ComponentWithAs<BreadcrumbLinkProps>

public external interface BreadcrumbItemOptions : BreadcrumbOptions {
  public var isCurrentPage: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  public var isLastChild: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface BreadcrumbItemProps : BreadcrumbItemOptions, HTMLChakraProps

public external val BreadcrumbItem: ComponentWithAs<BreadcrumbItemProps>

public external interface BreadcrumbOptions {
  /**
   * The visual separator between each breadcrumb item
   * type: `string | React.ReactElement`
   */
  public var separator: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The left and right margin applied to the separator
   * @type SystemProps["mx"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface BreadcrumbProps : HTMLChakraProps, BreadcrumbOptions, ThemingProps

/**
 * Breadcrumb is used to render a breadcrumb navigation landmark.
 * It renders a `nav` element with `aria-label` set to `Breadcrumb`
 *
 * @see Docs https://chakra-ui.com/docs/components/breadcrumbs
 */
public external val Breadcrumb: ComponentWithAs<BreadcrumbProps>
