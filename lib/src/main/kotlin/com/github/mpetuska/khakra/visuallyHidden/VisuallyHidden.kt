@file:JsModule("@chakra-ui/visually-hidden/dist/esm/visually-hidden")

package com.github.mpetuska.khakra.visuallyHidden

import com.github.mpetuska.khakra.system.ChakraComponent
import react.RProps

/**
 * Styles to visually hide an element
 * but make it accessible to screen-readers
 */
public external val visuallyHiddenStyle: String

/**
 * Visually hidden component used to hide
 * elements on screen
 */
public external val VisuallyHidden: ChakraComponent<RProps>

/**
 * Visually hidden input component for designing
 * custom input components using the html `input`
 * as a proxy
 */
public external val VisuallyHiddenInput: ChakraComponent<RProps>
