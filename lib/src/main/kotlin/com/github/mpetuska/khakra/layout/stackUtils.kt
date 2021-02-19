@file:JsModule("@chakra-ui/layout/dist/esm/stack.utils")

package com.github.mpetuska.khakra.layout

import kotlinext.js.Record

/**
 * If we ever run into SSR issues with this, check this post to find a fix for it:
 * @see https://medium.com/@emmenko/patching-lobotomized-owl-selector-for-emotion-ssr-5a582a3c424c
 */
public external val selector: String

public external interface GetStackStylesOptions {
  public var spacing: dynamic
  public var direction: dynamic
}

public external interface GetStackStylesReturn : Record<String, Any> {
  public var flexDirection: dynamic
}

public external fun getStackStyles(options: GetStackStylesOptions): GetStackStylesReturn

/**
 * Actually returns an object with a single property: '&'
 *
 * ```javascript
 * {
 *  "&": any
 * }
 * ```
 */
public external fun getDividerStyles(options: GetStackStylesOptions): Record<String, Any>
