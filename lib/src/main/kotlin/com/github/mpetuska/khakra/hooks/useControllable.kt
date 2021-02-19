package com.github.mpetuska.khakra.hooks

import react.RDependenciesArray
import react.RSetState
import react.RStateDelegate

public external interface UseControllableStateProps<T> {
  /**
   * The value to used in controlled mode
   */
  public var value: T?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial value to be used, in uncontrolled mode
   *
   * type: `T | (() => T)`
   */
  public var defaultValue: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The callback fired when the value changes
   */
  public var onChange: ((value: T) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The component name (for warnings)
   */
  public var name: String?
    get() = definedExternally
    set(value) = definedExternally
}

public interface UseControllableStateReturn<T> {
  public val value: T
  public val updateValue: T
}

@JsModule("@chakra-ui/hooks/dist/esm/use-controllable")
@JsName("useControllableState")
private external fun <T> exUseControllableState(init: UseControllableStateProps<T>): RDependenciesArray

/**
 * Creates a constant value over the lifecycle of a component.
 *
 * Even if `useMemo` is provided an empty array as its final argument, it doesn't offer
 * a guarantee that it won't re-run for performance reasons later on. By using `useConstant`
 * you can ensure that initialisers don't execute twice or more.
 */
public fun <T> useControllableState(props: UseControllableStateProps<T>): RStateDelegate<T> {
  val (state, setState) = exUseControllableState(props)
  return RStateDelegate(state as T, setState as RSetState<T>)
}

/**
 * Creates a constant value over the lifecycle of a component.
 *
 * Even if `useMemo` is provided an empty array as its final argument, it doesn't offer
 * a guarantee that it won't re-run for performance reasons later on. By using `useConstant`
 * you can ensure that initialisers don't execute twice or more.
 */
public fun <T> useControllableState(
  value: T? = null,
  defaultValue: T? = null,
  onChange: ((value: T) -> Unit)? = null,
  name: String? = null,
): RStateDelegate<T> = useControllableState(object : UseControllableStateProps<T> {
  override var value: T? = value
  override var defaultValue: dynamic = defaultValue
  override var onChange: ((value: T) -> Unit)? = onChange
  override var name: String? = name
})

/**
 * Creates a constant value over the lifecycle of a component.
 *
 * Even if `useMemo` is provided an empty array as its final argument, it doesn't offer
 * a guarantee that it won't re-run for performance reasons later on. By using `useConstant`
 * you can ensure that initialisers don't execute twice or more.
 */
public fun <T> useControllableState(
  value: T? = null,
  defaultValue: (() -> T)? = null,
  onChange: ((value: T) -> Unit)? = null,
  name: String? = null,
): RStateDelegate<T> = useControllableState(object : UseControllableStateProps<T> {
  override var value: T? = value
  override var defaultValue: dynamic = defaultValue
  override var onChange: ((value: T) -> Unit)? = onChange
  override var name: String? = name
})
