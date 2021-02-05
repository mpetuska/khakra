@file:JsModule("@chakra-ui/styled-system/dist/esm/config/shadow")

package io.github.mpetuska.khakra.styledSystem.config

import io.github.mpetuska.khakra.styledSystem.core.*
import react.*


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
