@file:JsModule("@chakra-ui/live-region/dist/esm/live-region")

package com.github.mpetuska.khakra.liveRegion

import org.w3c.dom.HTMLElement

public external interface LiveRegionOptions {
  /**
   * A unique id for the created live region element
   */
  public var id: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The desired value of the role attribute
   * @default "status"
   *
   * type: `"status" | "alert" | "log"`
   */
  public var role: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The node to append the live region node to
   */
  public var parentNode: HTMLElement?
    get() = definedExternally
    set(value) = definedExternally
}

public open external class LiveRegion(options: LiveRegionOptions = definedExternally) {
  public open var region: HTMLElement?
  public open var options: Any
  public open var parentNode: HTMLElement
  public open fun speak(message: String)
  public open fun destroy()
  public open fun clear()
}
