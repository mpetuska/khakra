package com.github.mpetuska.khakra.tooltip

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import com.github.mpetuska.khakra.kt.get
import com.github.mpetuska.khakra.kt.set
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

/**
 * The accessible, human friendly label to use for
 * screen readers.
 *
 * If passed, tooltip will show the content `label`
 * but expose only `aria-label` to assistive technologies
 */
public var TooltipProps.ariaLabel: String?
  get() = this["aria-label"]
  set(value) {
    this["aria-label"] = value
  }

@KhakraDSL
public inline fun RBuilder.Tooltip(
  noinline props: Builder<TooltipProps> = {},
  crossinline block: Builder<RElementBuilder<TooltipProps>> = {},
): ReactElement = KhakraComponent(Tooltip, props, block)
