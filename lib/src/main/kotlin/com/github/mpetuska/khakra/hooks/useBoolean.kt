package com.github.mpetuska.khakra.hooks

import react.RDependenciesArray

public interface UseBooleanReturn {
  public val value: Boolean
  public val on: () -> Unit
  public val off: () -> Unit
  public val toggle: () -> Unit

  public operator fun component1(): Boolean = value
  public operator fun component2(): () -> Unit = on
  public operator fun component3(): () -> Unit = off
  public operator fun component4(): () -> Unit = toggle
}

private fun RDependenciesArray.build() = object : UseBooleanReturn {
  override val value: Boolean = this@build[0].unsafeCast<Boolean>()
  override val on: () -> Unit = this@build[1].on.unsafeCast<() -> Unit>()
  override val off: () -> Unit = this@build[1].off.unsafeCast<() -> Unit>()
  override val toggle: () -> Unit = this@build[1].toggle.unsafeCast<() -> Unit>()
}

@JsModule("@chakra-ui/hooks/dist/esm/use-boolean")
@JsName("useBoolean")
private external fun exUseBoolean(initialState: dynamic = definedExternally): RDependenciesArray

/**
 * React hook to manage boolean (on - off) states
 *
 * @param initialState the initial boolean state value
 */
public fun useBoolean(initialState: Boolean = false): UseBooleanReturn = exUseBoolean(initialState).build()

/**
 * React hook to manage boolean (on - off) states
 *
 * @param initialState the initial boolean state value
 */
public fun useBoolean(initialState: () -> Boolean): UseBooleanReturn = exUseBoolean(initialState).build()
