@file:JsModule("@chakra-ui/system/dist/esm/system.types")
package khakra.system

import khakra.styledSystem.*
import kotlinext.js.*
import react.*


public external interface ThemingProps {
  public var variant: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var size: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var colorScheme: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var orientation: String?
    get() = definedExternally
    set(value) = definedExternally
  public var styleConfig: Record<String, Any>?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ChakraProps : SystemProps {
  /**
   * apply layer styles defined in `theme.layerStyles`
   */
  public var layerStyle: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * apply typography styles defined in `theme.textStyles`
   */
  public var textStyle: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * Reference styles from any component or key in the theme.
   *
   * @example
   * ```jsx
   * <Box apply="styles.h3">This is a div</Box>
   * ```
   *
   * This will apply styles defined in `theme.styles.h3`
   */
  public var apply: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * if `true`, it'll render an ellipsis when the text exceeds the width of the viewport or maxWidth set.
   */
  public var isTruncated: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * Used to truncate text at a specific number of lines
   */
  public var noOfLines: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * Used for internal css management
   * @private
   */
  public var __css: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * Used to pass theme-aware style props.
   * NB: This is the public API for user-land
   */
  public var sx: dynamic
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The emotion's css style object
   */
  public var css: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external interface As : ReactElement

public external interface ComponentWithAs<P: RProps>: RClass<P> {
  public operator fun invoke(props: dynamic): ReactElement
  public var propTypes: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var contextTypes: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ChakraComponent<P: RProps> : ComponentWithAs<P>
