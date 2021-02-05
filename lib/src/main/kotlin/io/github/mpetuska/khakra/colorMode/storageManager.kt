@file:JsModule("@chakra-ui/color-mode/dist/esm/storage-manager")

package io.github.mpetuska.khakra.colorMode

public external val storageKey: String

public external interface StorageManager {
  public fun get(init: ColorMode?): ColorMode?
  public fun set(value: ColorMode)
  public var type: StorageManagerType
}

/**
 * Simple object to handle read-write to localStorage
 */
public external val localStorageManager: StorageManager

/**
 * Simple object to handle read-write to cookies
 */
public external fun cookieStorageManager(cookies: String = definedExternally): StorageManager
