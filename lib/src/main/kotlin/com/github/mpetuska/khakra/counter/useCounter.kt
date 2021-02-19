@file:JsModule("@chakra-ui/counter/dist/esm/use-counter")

package com.github.mpetuska.khakra.counter

public external interface UseCounterProps {
  /**
   * The callback fired when the value changes
   */
  public var onChange: ((valueAsString: String, valueAsNumber: Int) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The number of decimal points used to round the value
   */
  public var precision: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial value of the counter. Should be less than `max` and greater than `min`
   *
   * type: `string | number`
   */
  public var defaultValue: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The value of the counter. Should be less than `max` and greater than `min`
   *
   * type: `string | number`
   */
  public var value: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The step used to increment or decrement the value
   * @default 1
   */
  public var step: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The minimum value of the counter
   * @default -Infinity
   */
  public var min: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The maximum value of the counter
   * @default Infinity
   */
  public var max: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * This controls the value update behavior in general.
   *
   * - If `true` and you use the stepper or up/down arrow keys,
   *  the value will not exceed the `max` or go lower than `min`
   *
   * - If `false`, the value will be allowed to go out of range.
   *
   * @default true
   */
  public var keepWithinRange: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun useCounter(props: UseCounterProps = definedExternally): UseCounterReturn

public external interface UseCounterReturn {
  public var isOutOfRange: Boolean
  public var isAtMax: Boolean
  public var isAtMin: Boolean
  public var precision: Int

  /**
   * type: `string | number`
   */
  public var value: dynamic
  public var valueAsNumber: Int

  /**
   * type: `string | number`
   */
  public fun update(next: dynamic)
  public fun reset()
  public fun increment(step: Any = definedExternally)
  public fun decrement(step: Any = definedExternally)
  public fun clamp(value: Number): String

  /**
   * type: `string | number`
   */
  public fun cast(value: dynamic)
}

