package com.github.mpetuska.khakra.transition

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Collapse(
  noinline props: Builder<CollapseProps> = {},
  crossinline block: Builder<RElementBuilder<CollapseProps>> = {},
): ReactElement = KhakraComponent(Collapse, props, block)

@KhakraDSL
public inline fun RBuilder.Fade(
  noinline props: Builder<FadeProps> = {},
  crossinline block: Builder<RElementBuilder<FadeProps>> = {},
): ReactElement = KhakraComponent(Fade, props, block)

@KhakraDSL
public inline fun RBuilder.ScaleFade(
  noinline props: Builder<ScaleFadeProps> = {},
  crossinline block: Builder<RElementBuilder<ScaleFadeProps>> = {},
): ReactElement = KhakraComponent(ScaleFade, props, block)

@KhakraDSL
public inline fun RBuilder.Slide(
  noinline props: Builder<SlideProps> = {},
  crossinline block: Builder<RElementBuilder<SlideProps>> = {},
): ReactElement = KhakraComponent(Slide, props, block)

@KhakraDSL
public inline fun RBuilder.SlideFade(
  noinline props: Builder<SlideFadeProps> = {},
  crossinline block: Builder<RElementBuilder<SlideFadeProps>> = {},
): ReactElement = KhakraComponent(SlideFade, props, block)
