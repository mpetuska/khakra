@file:JsModule("@chakra-ui/hooks/dist/esm/use-clipboard")

package com.github.mpetuska.khakra.hooks

public external interface UseClipboardReturn {
  public val value: String
  public val onCopy: () -> Unit
  public val hasCopied: Boolean
}

/**
 * React hook to copy content to clipboard
 *
 * @param text the text or value to copy
 * @param timeout delay (in ms) to switch back to initial state once copied.
 */
public external fun useClipboard(text: String, timeout: Long = definedExternally): UseClipboardReturn
