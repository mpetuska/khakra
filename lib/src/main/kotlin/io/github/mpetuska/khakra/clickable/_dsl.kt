package io.github.mpetuska.khakra.clickable

public val UseClickableReturn.dataActive: Boolean
  get() = asDynamic()["data-active"].unsafeCast<String>().toBoolean()

public val UseClickableReturn.ariaDisabled: Boolean
  get() = asDynamic()["aria-disabled"].unsafeCast<String?>()?.toBoolean() ?: false
