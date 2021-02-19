@file:JsModule("@chakra-ui/close-button/dist/esm/close-button")

package com.github.mpetuska.khakra.closeButton

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps

public external interface CloseButtonProps : HTMLChakraProps, ThemingProps

/**
 * A button with a close icon.
 *
 * It is used to handle the close functionality in feedback and overlay components
 * like Alerts, Toasts, Drawers and Modals.
 */
public external val CloseButton: ComponentWithAs<CloseButtonProps>
