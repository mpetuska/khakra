@file:JsModule("@chakra-ui/popover/dist/esm/popover")

package com.github.mpetuska.khakra.popover

import com.github.mpetuska.khakra.closeButton.CloseButtonProps
import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RClass
import react.RProps

public external interface PopoverContext : UsePopoverReturn

public external fun usePopoverContext(): PopoverContext

public external interface PopoverProps : UsePopoverProps, ThemingProps {
  public var children: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * Popover is used to bring attention to specific user interface elements,
 * typically to suggest an action or to guide users through a new experience.
 */
public external val Popover: RClass<PopoverProps>

/**
 * PopoverTrigger opens the popover's content. It must be an interactive element
 * such as `button` or `a`.
 */
public external val PopoverTrigger: RClass<RProps>

public external interface PopoverContentProps : HTMLChakraProps

public external val PopoverContent: ComponentWithAs<PopoverContentProps>

public external interface PopoverHeaderProps : HTMLChakraProps

/**
 * PopoverHeader is the accessible header or label
 * for the popover's content and it is first announced by screenreaders.
 */
public external val PopoverHeader: ComponentWithAs<PopoverHeaderProps>

public external interface PopoverBodyProps : HTMLChakraProps

/**
 * PopoverBody is the main content area for the popover. Should contain
 * at least one interactive element.
 */
public external val PopoverBody: ComponentWithAs<PopoverHeaderProps>

public external interface PopoverFooterProps : HTMLChakraProps

public external val PopoverFooter: RClass<PopoverFooterProps>

public external val PopoverCloseButton: RClass<CloseButtonProps>

public external interface PopoverArrowProps : HTMLChakraProps

public external val PopoverArrow: RClass<PopoverArrowProps>
