@file:JsModule("@chakra-ui/styled-system/dist/esm/core/types")
package khakra.styledSystem.core

import kotlinext.js.*


public external interface Props : Record<String, Any> {
  public var theme: Record<String, Any>?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface StyleFunction {
  public operator fun invoke(value: Any, scale: Any, props: Props): Record<String, Any>?
  public var scale: Any?
    get() = definedExternally
    set(value) = definedExternally
  public var defaults: Any?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface Parser : Record<String, Any> {
  public operator fun invoke(props: Record<String, Any>): Record<String, Any>
  public var config: PropConfig
  public var propNames: Array<String>
  public var cache: Map<String, Any>
}

public external interface Scale

public external interface PropConfig {
  public var property: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var properties: Array<String>?
    get() = definedExternally
    set(value) = definedExternally
  public var scale: String?
    get() = definedExternally
    set(value) = definedExternally
  public var defaultScale: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var transform: ((value: Any, scale: Any, props: Props) -> Any)?
    get() = definedExternally
    set(value) = definedExternally
  public var processResult: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface Config : Record<String, dynamic>
