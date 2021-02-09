@file:JsModule("@chakra-ui/color-mode/dist/esm/color-mode-provider")

package io.github.mpetuska.khakra.colorMode

import react.RClass
import react.RContext
import react.RProps

public external interface ColorModeOptions {
  /**
   * type: `"light" | "dark"`
   */
  public var initialColorMode: String?
    get() = definedExternally
    set(value) = definedExternally
  public var useSystemColorMode: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ColorModeContextType {
  /**
   * type: `"light" | "dark"`
   */
  public var colorMode: String?
    get() = definedExternally
    set(value) = definedExternally
  public var toggleColorMode: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  public var setColorMode: ((value: Any) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
}

public external val ColorModeContext: RContext<ColorModeContextType>

/**
 * React hook that reads from `ColorModeProvider` context
 * Returns the color mode and function to toggle it
 */
public external fun useColorMode(): ColorModeContextType

public external interface ColorModeProviderProps : RProps {
  public var value: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * type: `React.ReactNode`
   */
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var options: ColorModeOptions?
    get() = definedExternally
    set(value) = definedExternally
  public var colorModeManager: StorageManager?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Provides context for the color mode based on config in `theme`
 * Returns the color mode and function to toggle the color mode
 */
public external val ColorModeProvider: RClass<ColorModeProviderProps>

/**
 * Locks the color mode to `dark`, without any way to change it.
 */
public external val DarkMode: RClass<RProps>

/**
 * Locks the color mode to `light` without any way to change it.
 */
public external val LightMode: RClass<RProps>


/**
 * Change value based on color mode.
 *
 * @param light the light mode value
 * @param dark the dark mode value
 *
 * @example
 *
 * ```js
 * const Icon = useColorModeValue(MoonIcon, SunIcon)
 * ```
 *
 * type: `TLight | TDark`
 */
public external fun <TLight, TDark> useColorModeValue(
light: TLight,
dark: TDark,
): dynamic
