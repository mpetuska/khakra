@file:JsModule("@chakra-ui/layout/dist/esm/code")

package com.github.mpetuska.khakra.layout

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface CodeProps : HTMLChakraProps, ThemingProps

/**
 * React component to render inline code snippets.
 *
 * @see Docs https://chakra-ui.com/docs/data-display/code
 */
public external val Code: ComponentWithAs<CodeProps>
