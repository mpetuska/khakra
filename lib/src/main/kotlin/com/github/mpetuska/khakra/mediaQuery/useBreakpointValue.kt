@file:JsModule("@chakra-ui/media-query/dist/esm/use-breakpoint-value")

package com.github.mpetuska.khakra.mediaQuery

import kotlinext.js.Record

/**
 * React hook for getting the value for the current breakpoint from the
 * provided responsive values object.
 *
 * @example
 * const width = useBreakpointValue({ base: '150px', md: '250px' })
 */
public external fun <T : Any> useBreakpointValue(values: Record<String, T>): T?

/**
 * React hook for getting the value for the current breakpoint from the
 * provided responsive values object.
 *
 * @example
 * const width = useBreakpointValue({ base: '150px', md: '250px' })
 */
public external fun <T : Any> useBreakpointValue(values: Array<T>): T?
