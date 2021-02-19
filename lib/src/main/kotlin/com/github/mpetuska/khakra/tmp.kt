package com.github.mpetuska.khakra

import react.RProps

public external interface SVGAttributes : RProps
public external interface PortalPropsBase : RProps
public external interface PortalProps : PortalPropsBase {
  public var containerRef: dynamic
  public var appendToParentPortal: dynamic
}

