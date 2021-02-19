@file:JsModule("@chakra-ui/slider/dist/esm/use-slider")

package com.github.mpetuska.khakra.slider

public external interface UseSliderProps {
  /**
   * The minimum allowed value of the slider. Cannot be greater than max.
   * @default 0
   */
  public var min: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The maximum allowed value of the slider. Cannot be less than min.
   * @default 100
   */
  public var max: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The step in which increments/decrements have to be made
   * @default 1
   */
  public var step: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The value of the slider in controlled mode
   */
  public var value: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial value of the slider in uncontrolled mode
   */
  public var defaultValue: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * orientation of the slider
   * @default "horizontal"
   *
   * type: `"horizontal" | "vertical"`
   */
  public var orientation: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the value will be incremented or decremented in reverse.
   */
  public var isReversed: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * function gets called whenever the user starts dragging the slider handle
   */
  public var onChangeStart: ((value: Int) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * function gets called whenever the user stops dragging the slider handle.
   */
  public var onChangeEnd: ((value: Int) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * function gets called whenever the slider handle is being dragged or clicked
   */
  public var onChange: ((value: Int) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The base `id` to use for the slider and its components
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The name attribute of the hidden `input` field.
   * This is particularly useful in forms
   */
  public var name: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the slider will be disabled
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the slider will be in `read-only` state
   */
  public var isReadOnly: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Function that returns the `aria-valuetext` for screen readers.
   * It is mostly used to generate a more human-readable
   * representation of the value for assistive technologies
   */
  public var getAriaValueText: ((value: Int) -> String)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `false`, the slider handle will not capture focus when value changes.
   * @default true
   */
  public var focusThumbOnChange: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React hook that implements an accessible range slider.
 *
 * It is an alternative to `<input type="range" />`, and returns
 * prop getters for the component parts
 *
 * @see Docs     https://chakra-ui.com/docs/form/slider
 * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.1/#slider
 */

public external fun useSlider(props: UseSliderProps): UseSliderReturn

public external interface UseSliderReturnActions {
  public fun stepUp(step: Int = definedExternally)
  public fun stepDown(step: Int = definedExternally)
  public fun reset()
  public fun stepTo(value: Int)
}

public external interface UseSliderReturnState {
  public val value: Int
  public val isFocused: Boolean
  public val isDragging: Boolean
}

public external interface UseSliderReturnBase {
  public val state: UseSliderReturnState
  public val actions: UseSliderReturnActions
  public fun getTrackProps(props: Any = definedExternally, forwardedRef: Any? = definedExternally): dynamic
  public fun getInnerTrackProps(props: Any = definedExternally, forwardedRef: Any? = definedExternally): dynamic
  public fun getThumbProps(props: Any = definedExternally, forwardedRef: Any? = definedExternally): dynamic
  public fun getMarkerProps(props: Any = definedExternally, forwardedRef: Any? = definedExternally): dynamic
}

public external interface UseSliderReturn : UseSliderReturnBase {
  public fun getRootProps(props: Any = definedExternally, forwardedRef: Any? = definedExternally): dynamic
  public fun getInputProps(props: Any = definedExternally, forwardedRef: Any? = definedExternally): dynamic
}
