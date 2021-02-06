@file:JsModule("@chakra-ui/layout/dist/esm/heading")

package io.github.mpetuska.khakra.layout

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface HeadingProps : HTMLChakraProps, ThemingProps

public external val Heading: ComponentWithAs<HeadingProps>
