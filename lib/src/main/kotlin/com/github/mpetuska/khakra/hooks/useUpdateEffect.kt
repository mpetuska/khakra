@file:JsModule("@chakra-ui/hooks/dist/esm/use-update-effect")

package com.github.mpetuska.khakra.hooks

import kotlinext.js.ReadonlyArray

/**
 * React effect hook that invokes only on update.
 * It doesn't invoke on mount
 */
public external fun useUpdateEffect(effect: () -> Unit, deps: ReadonlyArray<Any?> = definedExternally)

/**
 * React effect hook that invokes only on update.
 * It doesn't invoke on mount
 */
public external fun useUpdateEffect(effect: () -> (() -> Unit), deps: ReadonlyArray<Any?> = definedExternally)
