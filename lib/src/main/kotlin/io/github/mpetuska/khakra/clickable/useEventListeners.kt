@file:JsModule("@chakra-ui/clickable/dist/esm/use-event-listeners")

package io.github.mpetuska.khakra.clickable

import org.w3c.dom.Document
import org.w3c.dom.events.EventTarget

public external interface EventListeners {
  /**
   * type:type: `keyof DocumentEventMap`
   *
   * type:ev: `DocumentEventMap[type]`
   *
   * type:options: `boolean | AddEventListenerOptions | undefined`
   */
  public fun add(
    el: EventTarget,
    type: dynamic,
    listener: (`this`: Document, ev: dynamic) -> Any,
    options: dynamic,
  )

  /**
   * type:listener: `EventListenerOrEventListenerObject`
   *
   * type:options: `boolean | AddEventListenerOptions | undefined`
   */
  public fun add(
    el: EventTarget,
    type: String,
    listener: dynamic,
    options: dynamic,
  )

  /**
   * type:type: `keyof DocumentEventMap`
   *
   * type:ev: `DocumentEventMap[type]`
   *
   * type:options: `boolean | AddEventListenerOptions | undefined`
   */
  public fun remove(
    el: EventTarget,
    type: dynamic,
    listener: (`this`: Document, ev: dynamic) -> Any,
    options: dynamic,
  )

  /**
   * type:listener: `EventListenerOrEventListenerObject`
   *
   * type:options: `boolean | AddEventListenerOptions | undefined`
   */
  public fun remove(
    el: EventTarget,
    type: String,
    listener: dynamic,
    options: dynamic,
  )
}

public external fun useEventListeners(): EventListeners
