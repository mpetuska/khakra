@file:JsModule("@chakra-ui/media-query/dist/esm/create-media-query")

package io.github.mpetuska.khakra.mediaQuery

@JsName("default")
public external fun createMediaQueries(breakpoints: Array<String>): Array<MediaQuery>

public external interface MediaQuery {
  public val breakpoint: String
  public val maxWidth: String?
  public val minWidth: String
  public val query: String
}
