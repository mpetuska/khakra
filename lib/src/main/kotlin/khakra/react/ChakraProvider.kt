@file:JsModule("@chakra-ui/react/dist/esm/chakra-provider")
package khakra.react

import khakra.*
import react.*

public external interface ChakraProviderProps: RProps {
  /**
   * a theme. if omitted, uses the default theme provided by chakra
   */
  public var theme: Map<String, dynamic>?
  /**
   * Common z-index to use for `Portal`
   *
   * @default undefined
   */
  public var portalZIndex: Int?
  /**
   * If `true`, `CSSReset` component will be mounted to help
   * you reset browser styles
   *
   * @default true
   */
  public var resetCSS: Boolean?
  /**
   * manager to persist a users color mode preference in
   *
   * omit if you don't render server-side
   * for SSR: choose `cookieStorageManager`
   *
   * @default localStorageManager
   */
  public var  colorModeManager: StorageManager?
  public var children: dynamic
}

/**
 * The global provider that must be added to make all Chakra components
 * work correctly
 */
public external val ChakraProvider: RClass<ChakraProviderProps>
