package io.github.mpetuska.khakra.slider

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.kt.get
import io.github.mpetuska.khakra.kt.set
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

/**
 * The static string to use used for `aria-valuetext`
 */
public var UseSliderProps.ariaValueText: String?
  get() = this["aria-valuetext"]
  set(value) {
    this["aria-valuetext"] = value
  }

/**
 * The static string to use used for `aria-label`
 * if no visible label is used.
 */
public var UseSliderProps.ariaLabel: String?
  get() = this["aria-label"]
  set(value) {
    this["aria-label"] = value
  }

/**
 * The static string `aria-labelledby` that points to the
 * ID of the element that serves as label for the slider
 */
public var UseSliderProps.ariaLabelledBy: String?
  get() = this["aria-labelledby"]
  set(value) {
    this["aria-labelledby"] = value
  }

@KhakraDSL
public inline fun RBuilder.Slider(
  noinline props: Builder<SliderProps> = {},
  crossinline block: Builder<RElementBuilder<SliderProps>> = {},
): ReactElement = KhakraComponent(Slider, props, block)

@KhakraDSL
public inline fun RBuilder.SliderThumb(
  noinline props: Builder<SliderThumbProps> = {},
  crossinline block: Builder<RElementBuilder<SliderThumbProps>> = {},
): ReactElement = KhakraComponent(SliderThumb, props, block)

@KhakraDSL
public inline fun RBuilder.SliderTrack(
  noinline props: Builder<SliderTrackProps> = {},
  crossinline block: Builder<RElementBuilder<SliderTrackProps>> = {},
): ReactElement = KhakraComponent(SliderTrack, props, block)

@KhakraDSL
public inline fun RBuilder.SliderFilledTrack(
  noinline props: Builder<SliderInnerTrackProps> = {},
  crossinline block: Builder<RElementBuilder<SliderInnerTrackProps>> = {},
): ReactElement = KhakraComponent(SliderFilledTrack, props, block)

@KhakraDSL
public inline fun RBuilder.SliderMark(
  noinline props: Builder<SliderMarkProps> = {},
  crossinline block: Builder<RElementBuilder<SliderMarkProps>> = {},
): ReactElement = KhakraComponent(SliderMark, props, block)
