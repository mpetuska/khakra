@file:JsModule("@chakra-ui/form-control/dist/esm/form-error")

package com.github.mpetuska.khakra.formControl

import com.github.mpetuska.khakra.icon.IconProps
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

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
