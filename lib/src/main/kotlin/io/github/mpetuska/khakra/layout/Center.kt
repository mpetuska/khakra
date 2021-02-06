@file:JsModule("@chakra-ui/layout/dist/esm/center")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.*
import react.*

public external interface CenterProps : HTMLChakraProps

/**
 * React component used to horizontally and vertically center its child.
 * It uses the popular `display: flex` centering technique.
 *
 * @see Docs https://chakra-ui.com/docs/layout/center
 */
public external val Center: ChakraComponent<CenterProps>

public external interface AbsoluteCenterProps : HTMLChakraProps {
  /**
   * type: `"horizontal" | "vertical" | "both"`
   */
  public var axis: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React component used to horizontally and vertically center an element
 * relative to its parent dimensions.
 *
 * It uses the `position: absolute` strategy.
 *
 * @see Docs https://chakra-ui.com/docs/layout/center
 * @see WebDev https://web.dev/centering-in-css/#5.-pop-and-plop
 */
public external val AbsoluteCenter: ComponentWithAs<AbsoluteCenterProps>
