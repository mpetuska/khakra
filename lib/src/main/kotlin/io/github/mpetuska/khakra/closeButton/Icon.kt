@file:JsModule("@chakra-ui/close-button/dist/esm/close-button")

package io.github.mpetuska.khakra.closeButton

import io.github.mpetuska.khakra.*
import io.github.mpetuska.khakra.system.*

public external interface CloseButtonProps : HTMLChakraProps, ThemingProps


/**
 * A button with a close icon.
 *
 * It is used to handle the close functionality in feedback and overlay components
 * like Alerts, Toasts, Drawers and Modals.
 */
public external val CloseButton: ComponentWithAs<CloseButtonProps>
