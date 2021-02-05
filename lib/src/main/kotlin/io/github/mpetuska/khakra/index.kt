package io.github.mpetuska.khakra

import react.*

@DslMarker
public annotation class KhakraDSL

public typealias Builder<T> = T.() -> Unit

public inline fun <PROPS : RProps> RBuilder.KhakraComponent(
  rClass: RClass<PROPS>,
  noinline props: Builder<PROPS>,
  crossinline block: Builder<RElementBuilder<PROPS>>,
): ReactElement = rClass {
  attrs(props)
  block()
}

public operator fun <T> Any.set(key: String, value: T) {
  asDynamic()[key] = value
}

public operator fun <T> Any.get(key: String): T = asDynamic()[key].unsafeCast<T>()
