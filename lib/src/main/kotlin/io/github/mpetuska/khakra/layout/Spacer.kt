@file:JsModule("@chakra-ui/layout/dist/esm/spacer")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ChakraComponent
import io.github.mpetuska.khakra.system.HTMLChakraProps

public external interface SpacerProps : HTMLChakraProps

/**
 * A flexible flex spacer that expands along the major axis of its containing flex layout.
 * It renders a `div` by default, and takes up any available space.
 *
 * @see Docs https://chakra-ui.com/docs/layout/flex#using-the-spacer
 */
public external val Spacer: ChakraComponent<SpacerProps>
