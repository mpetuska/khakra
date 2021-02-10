package io.github.mpetuska.khakra.formControl

import io.github.mpetuska.khakra.KhakraDSL
import io.github.mpetuska.khakra.icon.IconProps
import io.github.mpetuska.khakra.kt.Builder
import io.github.mpetuska.khakra.kt.KhakraComponent
import io.github.mpetuska.khakra.kt.get
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

public val UseFormControlReturn.ariaInvalid: Boolean
  get() = this["aria-invalid"] ?: false
public val UseFormControlReturn.ariaRequired: Boolean
  get() = this["aria-required"] ?: false
public val UseFormControlReturn.ariaReadonly: Boolean
  get() = this["aria-readonly"] ?: false
public val UseFormControlReturn.ariaDescribedBy: String?
  get() = this["aria-describedby"]

public val UseFieldLabelReturn.dataFocus: Boolean
  get() = this["data-focus"] ?: false
public val UseFieldLabelReturn.dataDisabled: Boolean
  get() = this["data-disabled"] ?: false
public val UseFieldLabelReturn.dataInvalid: Boolean
  get() = this["data-invalid"] ?: false
public val UseFieldLabelReturn.dataReadonly: Boolean
  get() = this["data-readonly"] ?: false

@KhakraDSL
public inline fun RBuilder.FormControl(
  noinline props: Builder<FormControlProps> = {},
  crossinline block: Builder<RElementBuilder<FormControlProps>> = {},
): ReactElement = KhakraComponent(FormControl, props, block)

@KhakraDSL
public inline fun RBuilder.FormHelperText(
  noinline props: Builder<HelpTextProps> = {},
  crossinline block: Builder<RElementBuilder<HelpTextProps>> = {},
): ReactElement = KhakraComponent(FormHelperText, props, block)

@KhakraDSL
public inline fun RBuilder.FormErrorMessage(
  noinline props: Builder<FormErrorMessageProps> = {},
  crossinline block: Builder<RElementBuilder<FormErrorMessageProps>> = {},
): ReactElement = KhakraComponent(FormErrorMessage, props, block)

@KhakraDSL
public inline fun RBuilder.FormErrorIcon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(FormErrorIcon, props, block)

@KhakraDSL
public inline fun RBuilder.FormLabel(
  noinline props: Builder<FormLabelProps> = {},
  crossinline block: Builder<RElementBuilder<FormLabelProps>> = {},
): ReactElement = KhakraComponent(FormLabel, props, block)

@KhakraDSL
public inline fun RBuilder.RequiredIndicator(
  noinline props: Builder<RequiredIndicatorProps> = {},
  crossinline block: Builder<RElementBuilder<RequiredIndicatorProps>> = {},
): ReactElement = KhakraComponent(RequiredIndicator, props, block)
