@file:JsModule("@chakra-ui/icon/dist/esm/icon")

package io.github.mpetuska.khakra.icon

import io.github.mpetuska.khakra.SVGAttributes
import io.github.mpetuska.khakra.system.ChakraProps
import io.github.mpetuska.khakra.system.ComponentWithAs

public external interface IconProps : ChakraProps, SVGAttributes

public external val Icon: ComponentWithAs<IconProps>
