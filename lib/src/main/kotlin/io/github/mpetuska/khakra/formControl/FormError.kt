@file:JsModule("@chakra-ui/form-control/dist/esm/form-error")

package io.github.mpetuska.khakra.formControl

import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface FormErrorMessageProps : HTMLChakraProps, ThemingProps

/**
 * Used to provide feedback about an invalid input,
 * and suggest clear instructions on how to fix it.
 */
public external val FormErrorMessage: ComponentWithAs<FormErrorMessageProps>

/**
 * Used as the visual indicator that a field is invalid or
 * a field has incorrect values.
 */
public external val FormErrorIcon: ComponentWithAs<IconProps>
