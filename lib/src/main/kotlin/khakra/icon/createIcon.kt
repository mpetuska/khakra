@file:JsModule("@chakra-ui/icon/dist/esm/create-icon")

package khakra.icon

import khakra.system.*

public external interface CreateIconOptions {
  /**
   * The icon `svg` viewBox
   * @default "0 0 24 24"
   */
  public var viewBox: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The `svg` path or group element
   * @type React.ReactElement | React.ReactElement[]
   */
  public var path: dynamic // React.ReactElement | React.ReactElement[]
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * If the has a single path, simply copy the path's `d` attribute
   */
  public var d: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The display name useful in the dev tools
   */
  public var displayName: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * Default props automatically passed to the component; overwriteable
   */
  public var defaultProps: IconProps?
    get() = definedExternally
    set(value) = definedExternally
}

public external fun createIcon(options: CreateIconOptions): ComponentWithAs<IconProps>
