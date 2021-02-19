@file:JsModule("@chakra-ui/media-query/dist/esm/media-query")

package com.github.mpetuska.khakra.mediaQuery

import react.RClass
import react.RProps

public external var Hide: RClass<ShowProps>

public external interface ShowProps : RProps {
  public var breakpoint: String?
    get() = definedExternally
    set(value) = definedExternally
  public var below: String?
    get() = definedExternally
    set(value) = definedExternally
  public var above: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external var Show: RClass<ShowProps>

public external interface UseQueryProps {
  public var breakpoint: String?
    get() = definedExternally
    set(value) = definedExternally
  public var below: String?
    get() = definedExternally
    set(value) = definedExternally
  public var above: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun useQuery(props: UseQueryProps): String
