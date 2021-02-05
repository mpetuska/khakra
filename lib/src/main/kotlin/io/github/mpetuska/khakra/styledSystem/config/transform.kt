@file:JsModule("@chakra-ui/styled-system/dist/esm/config/transform")

package io.github.mpetuska.khakra.styledSystem.config

import io.github.mpetuska.khakra.styledSystem.core.*
import react.*

public external interface TransformProps : RProps {
  /**
   * The CSS `transform` property
   */
  public var transform: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The CSS `transform-origin` property
   */
  public var transformOrigin: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val transform: Parser
public external val transformParser: Parser
