@file:JsModule("@chakra-ui/hooks/dist/esm/use-latest-ref")

package com.github.mpetuska.khakra.hooks

import React.MutableRefObject

/**
 * React hook to persist any value between renders,
 * but keeps it up-to-date if it changes.
 *
 * @param value the value or function to persist
 * @deprecated `useLatestRef` will be removed in a future version.
 */
public external fun <T> useLatestRef(value: T): MutableRefObject<T>
