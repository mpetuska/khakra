@file:JsModule("@chakra-ui/styled-system/dist/esm/config/transition")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

public external interface TransitionProps : RProps {
  /**
   * The CSS `transition` property
   */
  public var transition: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `transition-property` property
   */
  public var transitionProperty: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `transition-timing-function` property
   */
  public var transitionTimingFunction: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `transition-duration` property
   */
  public var transitionDuration: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val transition: Parser
public external val transitionParser: Parser
