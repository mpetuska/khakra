@file:JsModule("@chakra-ui/editable/dist/esm/use-editable")

package com.github.mpetuska.khakra.editable

public external interface UseEditableProps {
  /**
   * The value of the Editable in both edit & preview mode
   */
  public var value: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The initial value of the Editable in both edit & preview mode
   */
  public var defaultValue: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the Editable will be disabled.
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the Editable will start with edit mode by default.
   */
  public var startWithEditView: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the read only view, has a `tabIndex` set to `0`
   * so it can recieve focus via the keyboard or click.
   * @default true
   */
  public var isPreviewFocusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, it'll update the value onBlur and turn off the edit mode.
   * @default true
   */
  public var submitOnBlur: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback invoked when user changes input.
   */
  public var onChange: ((nextValue: String) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback invoked when user cancels input with the `Esc` key.
   * It provides the last confirmed value as argument.
   */
  public var onCancel: ((previousValue: String) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback invoked when user confirms value with `enter` key or by blurring input.
   */
  public var onSubmit: ((nextValue: String) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Callback invoked once the user enters edit mode.
   */
  public var onEdit: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, the input's text will be highlighted on focus.
   * @default true
   */
  public var selectAllOnFocus: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The placeholder text when the value is empty.
   */
  public var placeholder: String?
    get() = definedExternally
    set(value) = definedExternally
}

/**
 * React hook for managing the inline renaming of some text.
 *
 * @see Docs https://chakra-ui.com/docs/editable
 */
public external fun useEditable(props: UseEditableProps = definedExternally): UseEditableReturn

public external interface UseEditableReturnEditing {
  public var isEditing: Boolean
}

public external interface UseEditableReturnHandles : UseEditableReturnEditing {
  public var onSubmit: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  public var onCancel: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  public var onEdit: (() -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseEditableReturnGetters {
  public fun getEditButtonProps(props: Any = definedExternally, ref: Any? = definedExternally): dynamic
  public fun getCancelButtonProps(props: Any = definedExternally, ref: Any? = definedExternally): dynamic
  public fun getSubmitButtonProps(props: Any = definedExternally, ref: Any? = definedExternally): dynamic
}

public external interface UseEditableReturnBase : UseEditableReturnHandles, UseEditableReturnGetters {
  public var isDisabled: Boolean?
  public var isValueEmpty: Boolean
  public var value: String
  public fun getPreviewProps(props: Any = definedExternally, ref: Any? = definedExternally): dynamic
  public fun getInputProps(props: Any = definedExternally, ref: Any? = definedExternally): dynamic
}

public external interface UseEditableReturn : UseEditableReturnBase {
  public val htmlProps: dynamic
}
