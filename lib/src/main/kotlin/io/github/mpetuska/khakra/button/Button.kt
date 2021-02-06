@file:JsModule("@chakra-ui/button/dist/esm/button")

package io.github.mpetuska.khakra.button

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps
import react.RClass
import react.ReactElement

public external interface ButtonOptionsBase {
  /**
   * If `true`, the button will show a spinner.
   */
  public var isLoading: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the button will be styled in its active state.
   */
  public var isActive: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the button will be disabled.
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The html button type to use.
   *
   * type: `"button" | "reset" | "submit"`
   */
  public var type: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Replace the spinner component when `isLoading` is set to `true`
   * @type React.ReactElement
   */
  public var spinner: ReactElement?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ButtonOptions {
  /**
   * The space between the button icon and label.
   * @type SystemProps["marginRight"]
   */
  public var iconSpacing: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The label to show in the button when `isLoading` is true
   * If no text is passed, it only shows the spinner
   */
  public var loadingText: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If added, the button will show an icon after the button's label.
   * @type React.ReactElement
   */
  public var rightIcon: ReactElement?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the button will take up the full width of its container.
   */
  public var isFullWidth: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If added, the button will show an icon before the button's label.
   * @type React.ReactElement
   */
  public var leftIcon: ReactElement?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ButtonPropsBase : HTMLChakraProps, ButtonOptionsBase, ThemingProps

public external interface ButtonProps : ButtonPropsBase, ButtonOptions

public external val Button: ComponentWithAs<ButtonProps>

public external val ButtonIcon: RClass<HTMLChakraProps>

public external interface ButtonSpinnerProps : HTMLChakraProps {
  public var label: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * @type SystemProps["margin"]
   */
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val ButtonSpinner: RClass<ButtonSpinnerProps>
