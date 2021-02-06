@file:JsModule("@chakra-ui/clickable/dist/esm/use-clickable")

package io.github.mpetuska.khakra.clickable

import org.w3c.dom.HTMLElement
import react.RReadableRef

public external interface UseClickableProps {
  /**
   * If `true`, the element will be disabled.
   * It will set the `disabled` HTML attribute
   */
  public var isDisabled: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true` and isDisabled, the element will
   * have only `aria-disabled` set to `true`
   */
  public var isFocusable: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Whether or not trigger click on pressing `Enter`.
   */
  public var clickOnEnter: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Whether or not trigger click on pressing `Space`.
   */
  public var clickOnSpace: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The ref for the element
   */
  public var ref: RReadableRef<HTMLElement>?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface UseClickableReturn {
  public val ref: ((value: Any) -> Unit)
  public val role: String
  public val tabindex: Int?

  /**
   * type: `React.MouseEvent<HTMLElement>`
   */
  public val onClick: (event: dynamic) -> Unit

  /**
   * type: `React.MouseEvent<HTMLElement>`
   */
  public val onMouseDown: (event: dynamic) -> Unit

  /**
   * type: `React.MouseEvent<HTMLElement>`
   */
  public val onMouseUp: (event: dynamic) -> Unit

  /**
   * type: `React.MouseEvent<HTMLElement>`
   */
  public val onMouseOver: (event: dynamic) -> Unit

  /**
   * type: `React.MouseEvent<HTMLElement>`
   */
  public val onMouseLeave: (event: dynamic) -> Unit

  /**
   * type: `React.KeyboardEvent<HTMLElement>`
   */
  public val onKeyUp: (event: dynamic) -> Unit

  /**
   * type: `React.KeyboardEvent<HTMLElement>`
   */
  public val onKeyDown: (event: dynamic) -> Unit
}

/**
 * useClickable implements all the interactions of a native `button`
 * component with support for making it focusable even if it is disabled.
 *
 * It can be used with both native button elements or other elements (like `div`).
 */
public external fun useClickable(props: UseClickableProps = definedExternally): UseClickableReturn
