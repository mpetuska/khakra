@file:JsModule("@chakra-ui/icon/dist/esm/icon")

package com.github.mpetuska.khakra.icon

import com.github.mpetuska.khakra.SVGAttributes
import com.github.mpetuska.khakra.system.ChakraProps
import com.github.mpetuska.khakra.system.ComponentWithAs

public external interface IconProps : ChakraProps, SVGAttributes

public external val Icon: ComponentWithAs<IconProps>
