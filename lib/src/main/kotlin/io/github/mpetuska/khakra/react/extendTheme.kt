@file:JsModule("@chakra-ui/react/dist/esm/extend-theme")

package io.github.mpetuska.khakra.react

import io.github.mpetuska.khakra.theme.ChakraTheme

/**
 * Function to override or customize the Chakra UI theme conveniently
 * @param overrides - Your custom theme object overrides
 * @param baseTheme - theme to customize
 *
 * type: `BaseTheme & Overrides`
 */
public external fun <BaseTheme : ChakraTheme> extendTheme(overrides: dynamic, baseTheme: BaseTheme = definedExternally): dynamic
