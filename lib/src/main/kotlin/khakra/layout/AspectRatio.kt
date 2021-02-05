@file:JsModule("@chakra-ui/layout/dist/aspect-ratio")

package khakra.layout

import khakra.system.*
import react.*

public external interface AspectRatioOptions {
  /**
   * The aspect ratio of the Box. Common values are:
   *
   * `21/9`, `16/9`, `9/16`, `4/3`, `1.85/1`
   */
  public var ratio: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface AspectRatioProps : HTMLChakraProps, AspectRatioOptions


/**
 * React component used to cropping media (videos, images and maps)
 * to a desired aspect ratio.
 *
 * @see Docs https://chakra-ui.com/docs/layout/aspect-ratio
 */
public external val AspectRatio: ComponentWithAs<AspectRatioProps>
