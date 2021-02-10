@file:JsModule("css-box-model")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "PackageDirectoryMismatch")

package css_box_model

import org.w3c.dom.Element
import org.w3c.dom.css.CSSStyleDeclaration

public external interface Position {
  public var x: Number
  public var y: Number
}

public external interface Rect {
  public var top: Number
  public var right: Number
  public var bottom: Number
  public var left: Number
  public var width: Number
  public var height: Number
  public var x: Number
  public var y: Number
  public var center: Position
}

public external interface BoxModel {
  public var marginBox: Rect
  public var borderBox: Rect
  public var paddingBox: Rect
  public var contentBox: Rect
  public var border: Spacing
  public var padding: Spacing
  public var margin: Spacing
}

public external interface Spacing {
  public var top: Number
  public var right: Number
  public var bottom: Number
  public var left: Number
}

public external var getRect: (__0: Spacing) -> Rect

public external var expand: (target: Spacing, expandBy: Spacing) -> Spacing

public external var shrink: (target: Spacing, shrinkBy: Spacing) -> Spacing

public external interface CreateBoxArgs {
  public var borderBox: dynamic /* ClientRect | DOMRect | Rect | Spacing */
    get() = definedExternally
    set(value) = definedExternally
  public var margin: Spacing?
    get() = definedExternally
    set(value) = definedExternally
  public var border: Spacing?
    get() = definedExternally
    set(value) = definedExternally
  public var padding: Spacing?
    get() = definedExternally
    set(value) = definedExternally
}

public external var createBox: (boxArgs: CreateBoxArgs) -> BoxModel

public external var offset: (original: BoxModel, change: Position) -> BoxModel

public external var withScroll: (original: BoxModel, scroll: Position) -> BoxModel

public external var calculateBox: (borderBox: dynamic /* ClientRect | DOMRect | Rect | Spacing */, styles: CSSStyleDeclaration) -> BoxModel

public external var getBox: (el: Element) -> BoxModel
