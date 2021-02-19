@file:JsModule("@chakra-ui/react/dist/esm/chakra-provider")

package com.github.mpetuska.khakra.react

import com.github.mpetuska.khakra.colorMode.StorageManager
import kotlinext.js.Record
import react.RClass
import react.RProps

public external interface ChakraProviderProps : RProps {
  /**
   * a theme. if omitted, uses the default theme provided by chakra
   */
  public var theme: Record<String, Any>?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Common z-index to use for `Portal`
   *
   * @default undefined
   */
  public var portalZIndex: Int?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, `CSSReset` component will be mounted to help
   * you reset browser styles
   *
   * @default true
   */
  public var resetCSS: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * manager to persist a users color mode preference in
   *
   * omit if you don't render server-side
   * for SSR: choose `cookieStorageManager`
   *
   * @default localStorageManager
   */
  public var colorModeManager: StorageManager?
    get() = definedExternally
    set(value) = definedExternally
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * The global provider that must be added to make all Chakra components
 * work correctly
 */
public external val ChakraProvider: RClass<ChakraProviderProps>
