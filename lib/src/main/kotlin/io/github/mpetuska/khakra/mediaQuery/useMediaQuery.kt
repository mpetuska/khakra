@file:JsModule("@chakra-ui/media-query/dist/esm/use-media-query")

package io.github.mpetuska.khakra.mediaQuery

/**
 * React hook that tracks state of a CSS media query
 *
 * @param query the media query to match
 */
public external fun useMediaQuery(query: String): Array<Boolean>

/**
 * React hook that tracks state of a CSS media query
 *
 * @param query the media query to match
 */
public external fun useMediaQuery(query: Array<String>): Array<Boolean>
