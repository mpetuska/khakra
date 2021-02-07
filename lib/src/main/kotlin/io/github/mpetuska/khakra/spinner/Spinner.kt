@file:JsModule("@chakra-ui/spinner/dist/esm/spinner")

package io.github.mpetuska.khakra.spinner

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface SpinnerOptions {

  /**
   * The color of the empty area in the spinner
   */
  public var emptyColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The color of the spinner
   */
  public var color: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The thickness of the spinner
   * @example
   * ```jsx
   * <Spinner thickness="4px"/>
   * ```
   */
  public var thickness: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The speed of the spinner.
   * @example
   * ```jsx
   * <Spinner speed="0.2s"/>
   * ```
   */
  public var speed: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * For accessibility, it is important to add a fallback loading text.
   * This text will be visible to screen readers.
   */
  public var label: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface SpinnerProps : HTMLChakraProps, SpinnerOptions, ThemingProps {
  /**
   * The color of the spinner
   */
  override var color: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Spinner is used to indicate the loading state of a page or a component,
 * It renders a `div` by default.
 *
 * @see Docs https://chakra-ui.com/docs/feedback/spinner
 */
public external val Spinner: ComponentWithAs<SpinnerProps>
