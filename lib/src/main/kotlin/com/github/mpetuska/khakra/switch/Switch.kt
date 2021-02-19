@file:JsModule("@chakra-ui/switch/dist/esm/switch")

package com.github.mpetuska.khakra.switch

import com.github.mpetuska.khakra.checkbox.UseCheckboxPropsBase
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface SwitchProps : UseCheckboxPropsBase, HTMLChakraProps, ThemingProps

public external val Switch: ComponentWithAs<SwitchProps>
