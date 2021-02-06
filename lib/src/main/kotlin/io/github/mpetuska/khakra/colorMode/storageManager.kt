@file:JsModule("@chakra-ui/color-mode/dist/esm/storage-manager")

package io.github.mpetuska.khakra.colorMode

public external val storageKey: String

public external interface StorageManager {
  /**
   * type: `"light" | "dark"`
   */
  public fun get(init: String?): String?

  /**
   * type: `"light" | "dark"`
   */
  public fun set(value: String)

  /**
   * type: `"cookie" | "localStorage"`
   */
  public var type: String
}

/**
 * Simple object to handle read-write to localStorage
 */
public external val localStorageManager: StorageManager

/**
 * Simple object to handle read-write to cookies
 */
public external fun cookieStorageManager(cookies: String = definedExternally): StorageManager
