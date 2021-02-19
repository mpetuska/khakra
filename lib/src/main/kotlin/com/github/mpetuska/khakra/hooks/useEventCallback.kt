@file:JsModule("@chakra-ui/hooks/dist/esm/use-event-callback")

package com.github.mpetuska.khakra.hooks

/**
 * React hook for performant `useCallbacks`
 *
 * @see https://github.com/facebook/react/issues/14099#issuecomment-440013892
 *
 * @deprecated Use `useCallbackRef` instead. `useEventCallback` will be removed
 * in a future version.
 */
public external fun <E> useEventCallback(callback: (event: E, args: Any) -> Unit): (event: E, args: Any) -> Unit
