package io.github.mpetuska.khakra.breadcrumb

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.BreadcrumbSeparator(
  noinline props: Builder<BreadcrumbSeparatorProps> = {},
  crossinline block: Builder<RElementBuilder<BreadcrumbSeparatorProps>> = {},
): ReactElement = KhakraComponent(BreadcrumbSeparator, props, block)

@KhakraDSL
public inline fun RBuilder.BreadcrumbLink(
  noinline props: Builder<BreadcrumbLinkProps> = {},
  crossinline block: Builder<RElementBuilder<BreadcrumbLinkProps>> = {},
): ReactElement = KhakraComponent(BreadcrumbLink, props, block)

@KhakraDSL
public inline fun RBuilder.BreadcrumbItem(
  noinline props: Builder<BreadcrumbItemProps> = {},
  crossinline block: Builder<RElementBuilder<BreadcrumbItemProps>> = {},
): ReactElement = KhakraComponent(BreadcrumbItem, props, block)

@KhakraDSL
public inline fun RBuilder.Breadcrumb(
  noinline props: Builder<BreadcrumbProps> = {},
  crossinline block: Builder<RElementBuilder<BreadcrumbProps>> = {},
): ReactElement = KhakraComponent(Breadcrumb, props, block)
