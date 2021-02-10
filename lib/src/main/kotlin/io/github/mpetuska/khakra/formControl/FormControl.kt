@file:JsModule("@chakra-ui/form-control/dist/esm/form-control")

package io.github.mpetuska.khakra.formControl

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface FormControlOptions

public external interface FormControlProps : FormControlOptions, HTMLChakraProps, ThemingProps

public external val FormControl: ComponentWithAs<FormControlProps>
