@file:JsModule("@chakra-ui/tag/dist/esm/tag")

package io.github.mpetuska.khakra.tag

import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps
import react.RClass

public external interface TagProps : HTMLChakraProps, ThemingProps

/**
 * The tag component is used to label or categorize UI elements.
 * To style the tag globally, change the styles in `theme.components.Tag`
 * @see Docs https://chakra-ui.com/docs/data-display/tag
 */
public external val Tag: ComponentWithAs<TagProps>

public external interface TagLabelProps : HTMLChakraProps

public external val TagLabel: ComponentWithAs<TagLabelProps>

public external val TagLeftIcon: ComponentWithAs<IconProps>

public external val TagRightIcon: ComponentWithAs<IconProps>

public external interface TagCloseButtonProps : HTMLChakraProps {
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * TagCloseButton is used to close "remove" the tag
 * @see Docs https://chakra-ui.com/docs/components/tag
 */
public external val TagCloseButton: RClass<TagCloseButtonProps>

