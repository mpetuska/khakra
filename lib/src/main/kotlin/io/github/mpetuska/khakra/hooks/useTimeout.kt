@file:JsModule("@chakra-ui/hooks/dist/esm/use-timeout")

package io.github.mpetuska.khakra.hooks

/**
 * React hook that provides a declarative `setTimeout`
 *
 * @param callback the callback to run after specified delay
 * @param delay the delay (in ms)
 */
public external fun useTimeout(callback: (args: Any) -> Unit, delay: Number?)
