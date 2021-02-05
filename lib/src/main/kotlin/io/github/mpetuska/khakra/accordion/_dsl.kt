package io.github.mpetuska.khakra.accordion

import io.github.mpetuska.khakra.icon.*
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.KhakraDSL
import react.*

@KhakraDSL
public inline fun RBuilder.Accordion(
  noinline props: Builder<AccordionProps> = {},
  crossinline block: Builder<RElementBuilder<AccordionProps>> = {},
): ReactElement = KhakraComponent(Accordion, props, block)

@KhakraDSL
public inline fun RBuilder.AccordionItem(
  noinline props: Builder<AccordionItemProps> = {},
  crossinline block: Builder<RElementBuilder<AccordionItemProps>> = {},
): ReactElement = KhakraComponent(AccordionItem, props, block)

@KhakraDSL
public inline fun RBuilder.AccordionButton(
  noinline props: Builder<AccordionButtonProps> = {},
  crossinline block: Builder<RElementBuilder<AccordionButtonProps>> = {},
): ReactElement = KhakraComponent(AccordionButton, props, block)

@KhakraDSL
public inline fun RBuilder.AccordionPanel(
  noinline props: Builder<AccordionPanelProps> = {},
  crossinline block: Builder<RElementBuilder<AccordionPanelProps>> = {},
): ReactElement = KhakraComponent(AccordionPanel, props, block)

@KhakraDSL
public inline fun RBuilder.AccordionIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(AccordionIcon, props, block)
