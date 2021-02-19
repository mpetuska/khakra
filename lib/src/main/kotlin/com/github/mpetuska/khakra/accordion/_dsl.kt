package com.github.mpetuska.khakra.accordion

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.icon.IconProps
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.RProviderProps
import react.ReactElement

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

@KhakraDSL
public inline fun RBuilder.AccordionProvider(
  noinline props: Builder<RProviderProps<AccordionContext>> = {},
  crossinline block: Builder<RElementBuilder<RProviderProps<AccordionContext>>> = {},
): ReactElement = KhakraComponent(AccordionProvider, props, block)
