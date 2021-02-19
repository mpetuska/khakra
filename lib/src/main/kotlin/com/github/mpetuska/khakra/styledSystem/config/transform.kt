@file:JsModule("@chakra-ui/styled-system/dist/esm/config/transform")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

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
