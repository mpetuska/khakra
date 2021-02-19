package com.github.mpetuska.khakra.focusLock

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.FocusLock(
  noinline props: Builder<FocusLockProps> = {},
  crossinline block: Builder<RElementBuilder<FocusLockProps>> = {},
): ReactElement = KhakraComponent(FocusLock, props, block)
