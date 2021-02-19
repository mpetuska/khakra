@file:JsModule("@chakra-ui/input/dist/esm/input-group")

package com.github.mpetuska.khakra.input

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface InputGroupProps : HTMLChakraProps, ThemingProps

public external val InputGroup: ComponentWithAs<InputGroupProps>
