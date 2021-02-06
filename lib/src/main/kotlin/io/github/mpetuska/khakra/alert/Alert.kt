@file:JsModule("@chakra-ui/alert/dist/esm/alert")

package io.github.mpetuska.khakra.alert

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps
import react.RClass

public external interface AlertOptions {
  /**
   * The status of the alert
   *
   * type: `"success" | "warning" | "error" | "info"`
   */
  public var status: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface AlertProps
  : HTMLChakraProps,
  AlertOptions,
  ThemingProps

/**
 * Alert is used to communicate the state or status of a
 * page, feature or action
 */
public external val Alert: ComponentWithAs<AlertProps>

public external interface AlertTitleProps : HTMLChakraProps

public external val AlertTitle: ComponentWithAs<AlertTitleProps>

public external interface AlertDescriptionProps : HTMLChakraProps

public external val AlertDescription: ComponentWithAs<AlertDescriptionProps>

public external interface AlertIconProps : HTMLChakraProps

public external val AlertIcon: RClass<AlertDescriptionProps>
