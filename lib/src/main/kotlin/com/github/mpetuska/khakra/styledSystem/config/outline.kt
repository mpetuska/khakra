@file:JsModule("@chakra-ui/styled-system/dist/esm/config/outline")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

public external interface OutlineProps : RProps {
  /**
   * The CSS `outline` property
   */
  public var outline: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `outline-offset` property
   */
  public var outlineOffset: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `outline-color` property
   */
  public var outlineColor: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val outline: Parser
public external val outlineParser: Parser
