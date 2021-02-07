@file:JsModule("@chakra-ui/switch/dist/esm/switch")

package io.github.mpetuska.khakra.switch

import io.github.mpetuska.khakra.checkbox.UseCheckboxPropsBase
import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface SwitchProps : UseCheckboxPropsBase, HTMLChakraProps, ThemingProps

public external val Switch: ComponentWithAs<SwitchProps>
