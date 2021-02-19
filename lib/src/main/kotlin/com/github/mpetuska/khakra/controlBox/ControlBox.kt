@file:JsModule("@chakra-ui/control-box/dist/esm/control-box")

package com.github.mpetuska.khakra.controlBox

import com.github.mpetuska.khakra.system.HTMLChakraProps
import react.RClass

public external interface ControlBoxOptions {
  /**
   * type: `"checkbox" | "radio"`
   */
  public var type: String?
    get() = definedExternally
    set(value) = definedExternally
  public var _hover: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _invalid: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _disabled: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _focus: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _checked: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _child: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _checkedAndChild: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _checkedAndDisabled: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _checkedAndFocus: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var _checkedAndHover: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface BaseControlProps : HTMLChakraProps

public external interface ControlBoxProps : BaseControlProps, ControlBoxOptions

public external val ControlBox: RClass<ControlBoxProps>
