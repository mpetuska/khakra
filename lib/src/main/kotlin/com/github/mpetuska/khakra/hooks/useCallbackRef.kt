@file:JsModule("@chakra-ui/hooks/dist/esm/use-callback-ref")

package com.github.mpetuska.khakra.hooks

/**
 * React hook to persist any value between renders,
 * but keeps it up-to-date if it changes.
 *
 * @param value the value or function to persist
 */
public external fun <T : Function<Any?>> useCallbackRef(fn: T?): T
