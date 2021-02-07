@file:JsModule("@chakra-ui/slider/dist/esm/slider")

package io.github.mpetuska.khakra.slider

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps
import react.RProvider

public external interface SliderContext : UseSliderReturnBase

public external val SliderProvider: RProvider<SliderContext>

public external fun useSliderContext(): SliderContext

public external interface SliderProps : ThemingProps, UseSliderProps, HTMLChakraProps {
  /**
   * orientation of the slider
   * @default "horizontal"
   *
   * type: `"horizontal" | "vertical"`
   */
  override var orientation: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * The Slider is used to allow users to make selections from a range of values.
 * It provides context and functionality for all slider components
 *
 * @see Docs     https://chakra-ui.com/docs/form/slider
 * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices/#slider
 */
public external val Slider: ComponentWithAs<SliderProps>

public external interface SliderThumbProps : HTMLChakraProps

/**
 * Slider component that acts as the handle used to select predefined
 * values by dragging its handle along the track
 */
public external val SliderThumb: ComponentWithAs<SliderThumbProps>

public external interface SliderTrackProps : HTMLChakraProps

public external val SliderTrack: ComponentWithAs<SliderTrackProps>

public external interface SliderInnerTrackProps : HTMLChakraProps

public external val SliderFilledTrack: ComponentWithAs<SliderInnerTrackProps>

public external interface SliderMarkProps : HTMLChakraProps

/**
 * SliderMark is used to provide names for specific Slider
 * values by defining labels or markers along the track.
 *
 * @see Docs https://chakra-ui.com/docs/components/slider
 */
public external val SliderMark: ComponentWithAs<SliderMarkProps>
