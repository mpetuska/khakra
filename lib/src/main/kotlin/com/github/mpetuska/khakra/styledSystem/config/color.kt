@file:JsModule("@chakra-ui/styled-system/dist/esm/config/color")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

public external interface ColorProps : RProps {
  /**
   * The CSS `color` property
   */
  public var textColor: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `color` property
   */
  public var color: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `fill` property for icon svgs and paths
   */
  public var fill: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `stroke` property for icon svgs and paths
   */
  public var stroke: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `opacity` property
   */
  public var opacity: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val color: Parser
public external val colorParser: Parser
