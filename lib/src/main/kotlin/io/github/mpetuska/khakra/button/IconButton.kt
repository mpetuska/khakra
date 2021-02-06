@file:JsModule("@chakra-ui/button/dist/esm/icon-button")

package io.github.mpetuska.khakra.button

import io.github.mpetuska.khakra.system.ComponentWithAs
import react.ReactElement

public external interface BaseButtonProps : ButtonPropsBase {}

public external interface IconButtonProps : BaseButtonProps {
  /**
   * The icon to be used in the button.
   * @type React.ReactElement
   */
  public var icon: ReactElement?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the button will be perfectly round. Else, it'll be slightly round
   */
  public var isRound: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val IconButton: ComponentWithAs<IconButtonProps>
