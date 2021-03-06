@file:JsModule("@chakra-ui/layout/dist/esm/badge")

package com.github.mpetuska.khakra.layout

import com.github.mpetuska.khakra.system.*
import react.*

public external interface BadgeProps : HTMLChakraProps, ThemingProps

/**
 * React component used to cropping media (videos, images and maps)
 * to a desired aspect ratio.
 *
 * @see Docs https://chakra-ui.com/docs/layout/aspect-ratio
 */
public external val Badge: ComponentWithAs<BadgeProps>
