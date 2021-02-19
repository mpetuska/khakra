@file:JsModule("@chakra-ui/styled-system/dist/esm/config/list")

package com.github.mpetuska.khakra.styledSystem.config

import com.github.mpetuska.khakra.styledSystem.core.Parser
import react.RProps

public external interface ListProps : RProps {
  public var listStyleType: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `list-style-position` property
   */
  public var listStylePosition: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `list-style-position` property
   */
  public var listStylePos: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `list-style-image` property
   */
  public var listStyleImage: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The CSS `list-style-image` property
   */
  public var listStyleImg: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val list: Parser
public external val listParser: Parser
