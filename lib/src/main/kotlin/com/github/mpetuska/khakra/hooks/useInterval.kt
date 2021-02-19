@file:JsModule("@chakra-ui/hooks/dist/esm/use-interval")

package com.github.mpetuska.khakra.hooks

/**
 * React Hook that provides a declarative `setInterval`
 *
 * @param callback the callback to execute at interval
 * @param delay the `setInterval` delay (in ms)
 */
public external fun useInterval(callback: () -> Unit, delay: Number?)
