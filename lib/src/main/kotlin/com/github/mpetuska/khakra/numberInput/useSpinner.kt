@file:JsModule("@chakra-ui/number-input/dist/esm/use-spinner")

package com.github.mpetuska.khakra.numberInput

/**
 * React hook used in the number input to spin its
 * value on long press of the spin buttons
 *
 * @param increment the function to increment
 * @param decrement the function to decrement
 */
public external fun useSpinner(increment: Function<Any>, decrement: Function<Any>): UseSpinnerReturn

public external interface UseSpinnerReturn {
  public fun up()
  public fun down()
  public fun stop()
}
