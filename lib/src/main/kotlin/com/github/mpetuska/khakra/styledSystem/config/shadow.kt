@file:JsModule("@chakra-ui/styled-system/dist/esm/config/shadow")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

/**
 * Types for box and text shadow properties
 */
public external interface ShadowProps : RProps {
  /**
   * The `box-shadow` property
   */
  public var boxShadow: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `box-shadow` property
   */
  public var shadow: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The `text-shadow` property
   */
  public var textShadow: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val shadow: Parser
public external val shadowParser: Parser
