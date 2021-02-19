@file:JsModule("@chakra-ui/color-mode/dist/esm/color-mode.utils")

package com.github.mpetuska.khakra.colorMode

/**
 * Function to add/remove class from `body` based on color mode
 */
public external fun syncBodyClassName(isDark: Boolean)

public external interface Queries {
  public val light: String
  public val dark: String
}

public external val queries: Queries

public external val lightQuery: String

public external val darkQuery: String

/**
 * type: `"light" | "dark"`
 */
public external fun getColorScheme(fallback: String = definedExternally): String

/**
 * Adds system os color mode listener, and run the callback
 * once preference changes
 */
public external fun addListener(fn: Function<Any?>): () -> Unit

/**
 * type: `"light" | "dark"`
 */
public external interface Root {
  public fun get(): String
  public fun set(mode: String)
}

public external val root: Root
