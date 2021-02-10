@file:JsModule("@chakra-ui/input/dist/esm/input-group")

package io.github.mpetuska.khakra.input

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface InputGroupProps : HTMLChakraProps, ThemingProps

public external val InputGroup: ComponentWithAs<InputGroupProps>
