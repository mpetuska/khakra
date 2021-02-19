@file:JsModule("@chakra-ui/layout/dist/esm/kbd")

package com.github.mpetuska.khakra.layout

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface KbdProps : HTMLChakraProps, ThemingProps

/**
 * Semantic component to render a keyboard shortcut
 * within an application.
 *
 * @example
 *
 * ```jsx
 * <Kbd>⌘ + T</Kbd>
 * ```
 *
 * @see Docs https://chakra-ui.com/docs/data-display/kbd
 */
public external val Kbd: ComponentWithAs<KbdProps>
