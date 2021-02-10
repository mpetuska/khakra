package io.github.mpetuska.khakra.liveRegion

import io.github.mpetuska.khakra.kt.get
import io.github.mpetuska.khakra.kt.set

/**
 * Used to mark a part of the page as "live" so that updates will
 * be communicated to users by screen readers.
 *
 * - If set to `polite`: tells assistive technology to alert the user
 * to this change when it has finished whatever it is currently doing
 *
 * - If set to `assertive`: tells assistive technology to interrupt whatever
 * it is doing and alert the user to this change immediately
 *
 * @default "polite".
 */
public var LiveRegionOptions.ariaLive: String?
  get() = this["aria-live"]
  set(value) {
    this["aria-live"] = value
  }

/**
 * Indicates what types of changes should be presented to the user.
 * @default "all"
 *
 * type: `"additions" | "additions removals" | "additions text" | "all" | "removals" | "removals additions" | "removals text" | "text" | "text additions" | "text removals"`
 */
public var LiveRegionOptions.ariaRelevant: String?
  get() = this["aria-relevant"]
  set(value) {
    this["aria-relevant"] = value
  }

/**
 * Indicates whether the entire region should be
 * considered as a whole when communicating updates
 *
 * @default true
 */
public var LiveRegionOptions.ariaAtomic: Boolean?
  get() = this["aria-atomic"]
  set(value) {
    this["aria-atomic"] = value
  }

