package khakra

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

public operator fun Any.set(key: String, value: dynamic) {
  asDynamic()[key] = value
}

@Suppress("UnsafeCastFromDynamic")
public operator fun Any.get(key: String): Any? = asDynamic()[key]
