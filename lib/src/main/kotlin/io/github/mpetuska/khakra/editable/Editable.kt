@file:JsModule("@chakra-ui/editable/dist/esm/editable")

package io.github.mpetuska.khakra.editable

import io.github.mpetuska.khakra.system.ComponentWithAs
import io.github.mpetuska.khakra.system.HTMLChakraProps
import io.github.mpetuska.khakra.system.ThemingProps

public external interface EditableProps : HTMLChakraProps, ThemingProps, UseEditableReturnHandles

/**
 * Editable
 *
 * The wrapper that provides context and logic for all editable
 * components. It renders a `div`
 */
public external val Editable: ComponentWithAs<EditableProps>

public external interface EditablePreviewProps : HTMLChakraProps

/**
 * EditablePreview
 *
 * The `span` used to display the final value, in the `preview` mode
 */
public external val EditablePreview: ComponentWithAs<EditablePreviewProps>

public external interface EditableInputProps : HTMLChakraProps

/**
 * EditableInput
 *
 * The input used in the `edit` mode
 */
public external val EditableInput: ComponentWithAs<EditableInputProps>

/**
 * React hook use to gain access to the editable state and actions.
 */
public external fun useEditableState(): UseEditableStateReturn

public external interface UseEditableStateReturn {
  public val isEditing: Boolean
  public val onSubmit: () -> Unit
  public val onCancel: () -> Unit
  public val onEdit: () -> Unit
  public val isDisabled: Boolean?
}

/**
 * React hook use to create controls for the editable component
 */
public external fun useEditableControls(): UseEditableControlsReturn

public external interface UseEditableControlsReturn : UseEditableReturnGetters, UseEditableReturnEditing
