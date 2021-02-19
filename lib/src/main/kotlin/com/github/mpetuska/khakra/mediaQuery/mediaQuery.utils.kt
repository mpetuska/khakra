@file:JsModule("@chakra-ui/media-query/dist/esm/media-query.utils")

package com.github.mpetuska.khakra.mediaQuery

import kotlinext.js.Record

public external fun <T : Any> getClosestValue(
  values: Record<String, T>,
  breakpoint: String,
  breakpoints: Array<String> = definedExternally,
): T?
