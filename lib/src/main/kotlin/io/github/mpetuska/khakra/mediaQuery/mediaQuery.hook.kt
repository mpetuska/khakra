@file:JsModule("@chakra-ui/media-query/dist/esm/media-query.hook")

package io.github.mpetuska.khakra.mediaQuery


/**
 * React hook used to get the user's animation preference.
 */
public external fun usePrefersReducedMotion(): Boolean

/**
 * React hook for getting the user's color mode preference.
 *
 * type: `"dark" | "light"`
 */
public external fun useColorModePreference(): String?
