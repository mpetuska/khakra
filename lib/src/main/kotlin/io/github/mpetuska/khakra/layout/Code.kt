@file:JsModule("@chakra-ui/layout/dist/esm/code")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface CodeProps : HTMLChakraProps, ThemingProps

/**
 * React component to render inline code snippets.
 *
 * @see Docs https://chakra-ui.com/docs/data-display/code
 */
public external val Code: ComponentWithAs<CodeProps>
